package com.seymour.jsocialbackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_followers")
public class UserFollowerId {

	@Id
	@Column(name="users_followers_id")
	private int usersFollowersId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="followed_user_id")
	private int followedUserId;

	public UserFollowerId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserFollowerId(int usersFollowersId, int userId, int followedUserId) {
		super();
		this.usersFollowersId = usersFollowersId;
		this.userId = userId;
		this.followedUserId = followedUserId;
	}

	public int getUsersFollowersId() {
		return usersFollowersId;
	}

	public void setUsersFollowersId(int usersFollowersId) {
		this.usersFollowersId = usersFollowersId;
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
		result = prime * result + followedUserId;
		result = prime * result + userId;
		result = prime * result + usersFollowersId;
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
		UserFollowerId other = (UserFollowerId) obj;
		if (followedUserId != other.followedUserId)
			return false;
		if (userId != other.userId)
			return false;
		if (usersFollowersId != other.usersFollowersId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserFollowerId [usersFollowersId=" + usersFollowersId + ", userId=" + userId + ", followedUserId="
				+ followedUserId + "]";
	}
	
	
}
