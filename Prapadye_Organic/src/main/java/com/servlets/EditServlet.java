package com.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.UserDao;
import com.entities.Message;
import com.entities.User;
import com.helper.DBConnection;
import com.helper.Helper;

/**
 * Servlet implementation class EditServlet
 */
@MultipartConfig
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            /* TODO output your page here. You may use following sample code. */
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet EditServlet</title>");
	            out.println("</head>");
	            out.println("<body>");

//	            fetch all data
	            String userEmail = request.getParameter("user_email");
	            String userName = request.getParameter("user_name");
	            String userPassword = request.getParameter("user_password");
	            String userAbout = request.getParameter("user_about");
	            Part part = request.getPart("image");

	            String imageName = part.getSubmittedFileName();

	            //get the user from the session...
	            HttpSession s = request.getSession();
	            User user = (User) s.getAttribute("currentUser");
	            user.setEmail(userEmail);
	            user.setName(userName);
	            user.setPassword(userPassword);
	            user.setAbout(userAbout);
	            String oldFile = user.getProfile();

	            user.setProfile(imageName);

	            //update database....
	            UserDao userDao = new UserDao(DBConnection.getConn());

	            boolean ans = userDao.updateUser(user);
	            if (ans) {

	                @SuppressWarnings("deprecation")
					String path = request.getRealPath("/") + "pics" + File.separator + user.getProfile();

	                //start of photo work
	                //delete code
	                @SuppressWarnings("deprecation")
					String pathOldFile = request.getRealPath("/") + "pics" + File.separator + oldFile;

	                if (!oldFile.equals("default.png")) {
	                    Helper.deleteFile(pathOldFile);
	                }

	                if (Helper.saveFile(part.getInputStream(), path)) {
	                    out.println("Profile updated...");
	                    Message msg = new Message("Profile details updated...", "success", "alert-success");
	                    s.setAttribute("msg", msg);

	                } else {
	                    //////////////
	                    Message msg = new Message("Something went wrong..", "error", "alert-danger");
	                    s.setAttribute("msg", msg);
	                }

	                //end of phots work
	            } else {
	                out.println("not updated..");
	                Message msg = new Message("Something went wrong..", "error", "alert-danger");
	                s.setAttribute("msg", msg);

	            }

	            response.sendRedirect("profile.jsp");

	            out.println("</body>");
	            out.println("</html>");
	        }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
