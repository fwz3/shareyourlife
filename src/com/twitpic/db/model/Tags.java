package com.twitpic.db.model;

import java.util.Date;

public class Tags  extends BaseModel{
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column tags.id
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private Long id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column tags.name
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private String name;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column tags.description
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private String description;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column tags.account
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private String account;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column tags.status
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private Integer status;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column tags.create_time
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private Date createTime;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column tags.id
     *
     * @return the value of tags.id
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column tags.id
     *
     * @param id the value for tags.id
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column tags.name
     *
     * @return the value of tags.name
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column tags.name
     *
     * @param name the value for tags.name
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column tags.description
     *
     * @return the value of tags.description
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column tags.description
     *
     * @param description the value for tags.description
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column tags.account
     *
     * @return the value of tags.account
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column tags.account
     *
     * @param account the value for tags.account
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column tags.status
     *
     * @return the value of tags.status
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column tags.status
     *
     * @param status the value for tags.status
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column tags.create_time
     *
     * @return the value of tags.create_time
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column tags.create_time
     *
     * @param createTime the value for tags.create_time
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public static final int STATUS_SYSTEM = 0;
    
    public static final int STATUS_USER = 1;
}