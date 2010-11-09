package com.zhela.cloudblog.model.users;

public class ProviderUserKey {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.account
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	private String account;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.provider_account
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	private String providerAccount;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column provider_user.provider_id
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	private Long providerId;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.account
	 * @return  the value of provider_user.account
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.account
	 * @param account  the value for provider_user.account
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.provider_account
	 * @return  the value of provider_user.provider_account
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	public String getProviderAccount() {
		return providerAccount;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.provider_account
	 * @param providerAccount  the value for provider_user.provider_account
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	public void setProviderAccount(String providerAccount) {
		this.providerAccount = providerAccount;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column provider_user.provider_id
	 * @return  the value of provider_user.provider_id
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	public Long getProviderId() {
		return providerId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column provider_user.provider_id
	 * @param providerId  the value for provider_user.provider_id
	 * @ibatorgenerated  Mon Oct 25 21:54:16 CST 2010
	 */
	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ProviderUserKey){
			ProviderUserKey puk = (ProviderUserKey)obj;
			return puk.getAccount().equals(this.account)&&puk.getProviderAccount().equals(this.providerAccount)&&puk.getProviderId().equals(this.providerId);
		}
		return false;
	}
	
	
}