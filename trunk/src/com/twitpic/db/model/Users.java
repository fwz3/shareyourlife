package com.twitpic.db.model;

import java.util.Date;

public class Users extends BaseModel{
	
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.account
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private String account;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.name
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private String name;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.email
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private String email;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.password
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private String password;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.status
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private Integer status;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.activity_code
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private String activityCode;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column users.reg_time
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	private Date regTime;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.account
	 * @return  the value of users.account
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.account
	 * @param account  the value for users.account
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.name
	 * @return  the value of users.name
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.name
	 * @param name  the value for users.name
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.email
	 * @return  the value of users.email
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.email
	 * @param email  the value for users.email
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.password
	 * @return  the value of users.password
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.password
	 * @param password  the value for users.password
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.status
	 * @return  the value of users.status
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.status
	 * @param status  the value for users.status
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.activity_code
	 * @return  the value of users.activity_code
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.activity_code
	 * @param activityCode  the value for users.activity_code
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column users.reg_time
	 * @return  the value of users.reg_time
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column users.reg_time
	 * @param regTime  the value for users.reg_time
	 * @abatorgenerated  Sun Aug 02 21:24:11 CST 2009
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public static final int STATUS_EMAIL_NOTVALID = 0; 
	
	public static final int STATUS_VALID  = 1;
	
	public static final int STATUS_CLOSED = 2;
}