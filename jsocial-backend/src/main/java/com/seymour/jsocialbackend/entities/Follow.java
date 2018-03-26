package com.seymour.jsocialbackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="follows")
public class Follow {

	@Id
	@SequenceGenerator(name = "FOLLOW_SEQ", sequenceName = "FOLLOW_SEQ")
	@GeneratedValue(generator = "FOLLOW_SEQ", strategy = GenerationType.AUTO)
	@Column(name="follow_id")
	private int followId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="followed_user_id")
	private int followedUserId;

	public Follow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Follow(int followId, int userId, int followedUserId) {
		super();
		this.followId = followId;
		this.userId = userId;
		this.followedUserId = followedUserId;
	}

	public int getFollowId() {
		return followId;
	}

	public void setFollowId(int followId) {
		this.followId = followId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFollowedUserId() {
		return followedUserId;
	}

	public void setFollowedUserId(int followedUserId) {
		this.followedUserId = followedUserId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + followId;
		result = prime * result + followedUserId;
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
		Follow other = (Follow) obj;
		if (followId != other.followId)
			return false;
		if (followedUserId != other.followedUserId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Follow [followId=" + followId + ", userId=" + userId + ", followedUserId=" + followedUserId + "]";
	}
	
}
