package com.seymour.jsocialbackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {

	@Id
	@Column(name="post_id")
	private int postId;
	@Column(name="user_id")
	private int userId;
	@Column(name="post_content")
	private String postContent;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int postId, int userId, String postContent) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.postContent = postContent;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postContent == null) ? 0 : postContent.hashCode());
		result = prime * result + postId;
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (postContent == null) {
			if (other.postContent != null)
				return false;
		} else if (!postContent.equals(other.postContent))
			return false;
		if (postId != other.postId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", postContent=" + postContent + "]";
	}
	
	
}
