package egovframework.com.dev.service;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EDevUser implements Serializable {
	
	/**
	 * 사용자 아이디
	 */
	private String userId = "";
	
	/**
	 * 사용자 명
	 */
	private String userName = "";
	
	/**
	 * 사용자 나이
	 */
	private int userAge = 0;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userAge
	 */
	public int getUserAge() {
		return userAge;
	}

	/**
	 * @param userAge the userAge to set
	 */
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
}