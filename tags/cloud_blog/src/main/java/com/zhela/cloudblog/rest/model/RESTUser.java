package com.zhela.cloudblog.rest.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="user")
public class RESTUser {
	private String id;
	private String account;
	private String name;
	private String authorization;
	private RESTImage header;
	private String gender;
	private long friendsCount;
	private long befriendsCount;
	private long tweetCount;
	private String webSite;
	private int relation;
	private RESTAddress stayAddress;
	private RESTAddress currentAddress;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public RESTImage getHeader() {
		return header;
	}
	public void setHeader(RESTImage header) {
		this.header = header;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(long friendsCount) {
		this.friendsCount = friendsCount;
	}
	public long getBefriendsCount() {
		return befriendsCount;
	}
	public void setBefriendsCount(long befriendsCount) {
		this.befriendsCount = befriendsCount;
	}
	public long getTweetCount() {
		return tweetCount;
	}
	public void setTweetCount(long tweetCount) {
		this.tweetCount = tweetCount;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public int getRelation() {
		return relation;
	}
	public void setRelation(int relation) {
		this.relation = relation;
	}
	public RESTAddress getStayAddress() {
		return stayAddress;
	}
	public void setStayAddress(RESTAddress stayAddress) {
		this.stayAddress = stayAddress;
	}
	public RESTAddress getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(RESTAddress currentAddress) {
		this.currentAddress = currentAddress;
	}
	
	
}
