package com.twitpic.db.model;

import java.util.Date;

public class Group {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column groups.id
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column groups.account
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    private String account;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column groups.name
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column groups.create_time
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    private Date createTime;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column groups.id
     *
     * @return the value of groups.id
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column groups.id
     *
     * @param id the value for groups.id
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column groups.account
     *
     * @return the value of groups.account
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column groups.account
     *
     * @param account the value for groups.account
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column groups.name
     *
     * @return the value of groups.name
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column groups.name
     *
     * @param name the value for groups.name
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column groups.create_time
     *
     * @return the value of groups.create_time
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column groups.create_time
     *
     * @param createTime the value for groups.create_time
     *
     * @ibatorgenerated Tue Sep 08 17:06:31 CST 2009
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}