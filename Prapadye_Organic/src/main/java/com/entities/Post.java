package com.entities;

import java.sql.Timestamp;
import java.util.Objects;

public class Post {
  private int pid;
  private String pTitle;
  private String pContent;
  private String pBreed;
  private String pPic;
  private Timestamp pDate;
  private int catId;
  private int userId;
public Post() {
	super();
	// TODO Auto-generated constructor stub
}
public Post(int pid, String pTitle, String pContent, String pBreed, String pPic, Timestamp pDate, int catId,
		int userId) {
	super();
	this.pid = pid;
	this.pTitle = pTitle;
	this.pContent = pContent;
	this.pBreed = pBreed;
	this.pPic = pPic;
	this.pDate = pDate;
	this.catId = catId;
	this.userId = userId;
}
public Post(String pTitle, String pContent, String pBreed, String pPic, Timestamp pDate, int catId, int userId) {
	super();
	this.pTitle = pTitle;
	this.pContent = pContent;
	this.pBreed = pBreed;
	this.pPic = pPic;
	this.pDate = pDate;
	this.catId = catId;
	this.userId = userId;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getpTitle() {
	return pTitle;
}
public void setpTitle(String pTitle) {
	this.pTitle = pTitle;
}
public String getpContent() {
	return pContent;
}
public void setpContent(String pContent) {
	this.pContent = pContent;
}
public String getpBreed() {
	return pBreed;
}
public void setpBreed(String pBreed) {
	this.pBreed = pBreed;
}
public String getpPic() {
	return pPic;
}
public void setpPic(String pPic) {
	this.pPic = pPic;
}
public Timestamp getpDate() {
	return pDate;
}
public void setpDate(Timestamp pDate) {
	this.pDate = pDate;
}
public int getCatId() {
	return catId;
}
public void setCatId(int catId) {
	this.catId = catId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
@Override
public String toString() {
	return "Post [pid=" + pid + ", pTitle=" + pTitle + ", pContent=" + pContent + ", pBreed=" + pBreed + ", pPic="
			+ pPic + ", pDate=" + pDate + ", catId=" + catId + ", userId=" + userId + "]";
}

  
}
