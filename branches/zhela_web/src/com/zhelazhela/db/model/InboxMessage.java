package com.zhelazhela.db.model;

import java.util.Date;

public class InboxMessage {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Long id;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.reply_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Long replyId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.send_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Long sendId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.from_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Long fromId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.user_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Long userId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.subject
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private String subject;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.message_type
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Integer messageType;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.message_status
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private String messageStatus;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.parameters
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private String parameters;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.message
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private String message;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.update_time
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Date updateTime;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column inbox_message.is_deleted
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	private Boolean isDeleted;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.id
	 * @return  the value of inbox_message.id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.id
	 * @param id  the value for inbox_message.id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.reply_id
	 * @return  the value of inbox_message.reply_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Long getReplyId() {
		return replyId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.reply_id
	 * @param replyId  the value for inbox_message.reply_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setReplyId(Long replyId) {
		this.replyId = replyId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.send_id
	 * @return  the value of inbox_message.send_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Long getSendId() {
		return sendId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.send_id
	 * @param sendId  the value for inbox_message.send_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setSendId(Long sendId) {
		this.sendId = sendId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.from_id
	 * @return  the value of inbox_message.from_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Long getFromId() {
		return fromId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.from_id
	 * @param fromId  the value for inbox_message.from_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.user_id
	 * @return  the value of inbox_message.user_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.user_id
	 * @param userId  the value for inbox_message.user_id
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.subject
	 * @return  the value of inbox_message.subject
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.subject
	 * @param subject  the value for inbox_message.subject
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.message_type
	 * @return  the value of inbox_message.message_type
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Integer getMessageType() {
		return messageType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.message_type
	 * @param messageType  the value for inbox_message.message_type
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.message_status
	 * @return  the value of inbox_message.message_status
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public String getMessageStatus() {
		return messageStatus;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.message_status
	 * @param messageStatus  the value for inbox_message.message_status
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.parameters
	 * @return  the value of inbox_message.parameters
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public String getParameters() {
		return parameters;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.parameters
	 * @param parameters  the value for inbox_message.parameters
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.message
	 * @return  the value of inbox_message.message
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.message
	 * @param message  the value for inbox_message.message
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.update_time
	 * @return  the value of inbox_message.update_time
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.update_time
	 * @param updateTime  the value for inbox_message.update_time
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column inbox_message.is_deleted
	 * @return  the value of inbox_message.is_deleted
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column inbox_message.is_deleted
	 * @param isDeleted  the value for inbox_message.is_deleted
	 * @ibatorgenerated  Fri Mar 12 21:58:31 CST 2010
	 */
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}