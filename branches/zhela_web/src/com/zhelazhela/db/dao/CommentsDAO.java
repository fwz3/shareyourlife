package com.zhelazhela.db.dao;

import com.zhelazhela.db.model.Comments;
import com.zhelazhela.db.model.CommentsExample;
import java.util.List;

public interface CommentsDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int countByExample(CommentsExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int deleteByExample(CommentsExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    void insert(Comments record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    void insertSelective(Comments record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    List<Comments> selectByExample(CommentsExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    Comments selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int updateByExampleSelective(Comments record, CommentsExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int updateByExample(Comments record, CommentsExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int updateByPrimaryKeySelective(Comments record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comments
     *
     * @ibatorgenerated Fri Dec 18 11:08:41 CST 2009
     */
    int updateByPrimaryKey(Comments record);
    
    long insertSelectiveReturnId(Comments record);
   
}