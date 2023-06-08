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

import com.dao.PostDao;
import com.entities.Post;
import com.entities.User;
import com.helper.DBConnection;
import com.helper.Helper;

/**
 * Servlet implementation class AddPostServlet
 */
@MultipartConfig
@WebServlet("/AddPostServlet")
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPostServlet() {
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

	            int cid = Integer.parseInt(request.getParameter("cid"));
	            String pTitle = request.getParameter("pTitle");
	            String pContent = request.getParameter("pContent");
	            String pBreed = request.getParameter("pBreed");
	            Part part = request.getPart("pic");
//            getting currentuser id
	            HttpSession session = request.getSession();
	            User user = (User) session.getAttribute("currentUser");

//	            out.println("your post title is " + pTitle);
//	            out.println(part.getSubmittedFileName());
	            Post p = new Post(pTitle, pContent, pBreed, part.getSubmittedFileName(), null, cid, user.getId());
	            PostDao dao = new PostDao(DBConnection.getConn());
	            if (dao.savePost(p)) {

	            	 @SuppressWarnings("deprecation")
					String path = request.getRealPath("/") + "blog_pics" + File.separator + part.getSubmittedFileName();
	                Helper.saveFile(part.getInputStream(), path);
	                out.println("done");
	            } else {
	                out.println("error");
	            }

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
