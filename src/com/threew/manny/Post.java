package com.threew.manny;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	protected String title;
	protected String body;
	protected Date created;
	protected ArrayList<Comment> comments;
	
	public Post() {
		
	}
	
	public Post(String title, String body, Date created, ArrayList<Comment> comments) {
		this.title = title;
		this.body = body;
		this.created = created;
		this.comments = comments;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the comments
	 */
	public ArrayList<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	
}
