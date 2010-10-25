package com.zhela.cloudblog.model.users;

import java.util.Date;

public class ProviderUser extends ProviderUserKey {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.users_account
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	private String usersAccount;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.status
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	private Integer status;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.token
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	private String token;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.token_secret
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	private String tokenSecret;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.token_more
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	private String tokenMore;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.update_time
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	private Date updateTime;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.users_account
	 * @return  the value of provider_user.users_account
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public String getUsersAccount() {
		return usersAccount;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.users_account
	 * @param usersAccount  the value for provider_user.users_account
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public void setUsersAccount(String usersAccount) {
		this.usersAccount = usersAccount;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.status
	 * @return  the value of provider_user.status
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.status
	 * @param status  the value for provider_user.status
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.token
	 * @return  the value of provider_user.token
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public String getToken() {
		return token;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.token
	 * @param token  the value for provider_user.token
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.token_secret
	 * @return  the value of provider_user.token_secret
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public String getTokenSecret() {
		return tokenSecret;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.token_secret
	 * @param tokenSecret  the value for provider_user.token_secret
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.token_more
	 * @return  the value of provider_user.token_more
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public String getTokenMore() {
		return tokenMore;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.token_more
	 * @param tokenMore  the value for provider_user.token_more
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public void setTokenMore(String tokenMore) {
		this.tokenMore = tokenMore;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.update_time
	 * @return  the value of provider_user.update_time
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.update_time
	 * @param updateTime  the value for provider_user.update_time
	 * @ibatorgenerated  Mon Oct 25 16:01:43 CST 2010
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}