package com.twitpic.db.model;

import java.util.Date;

public class Comments extends BaseModel{
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column comments.id
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private Long id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column comments.account
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private String account;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column comments.comment_time
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private Date commentTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column comments.comment
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private String comment;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column comments.id
     *
     * @return the value of comments.id
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column comments.id
     *
     * @param id the value for comments.id
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column comments.account
     *
     * @return the value of comments.account
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column comments.account
     *
     * @param account the value for comments.account
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column comments.comment_time
     *
     * @return the value of comments.comment_time
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column comments.comment_time
     *
     * @param commentTime the value for comments.comment_time
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column comments.comment
     *
     * @return the value of comments.comment
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column comments.comment
     *
     * @param comment the value for comments.comment
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}