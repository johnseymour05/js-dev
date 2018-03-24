package com.seymour.jsocialbackend.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {

	@Id
	@SequenceGenerator(name = "POST_SEQ", sequenceName = "POST_SEQ")
	@GeneratedValue(generator = "POST_SEQ", strategy = GenerationType.AUTO)
	@Column(name="post_id")
	private int postId;
	@Column(name="user_id")
	private int userId;
	@Column(name="post_content")
	private String postContent;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Comment> comments;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int postId, int userId, String postContent, Set<Comment> comments) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.postContent = postContent;
		this.comments = comments;
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

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", postContent=" + postContent + ", comments="
				+ comments + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
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
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
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
	
	
	
}
