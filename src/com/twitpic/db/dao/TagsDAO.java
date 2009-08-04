package com.twitpic.db.dao;

import com.twitpic.db.model.Tags;
import com.twitpic.db.model.TagsExample;
import java.util.List;

public interface TagsDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    void insert(Tags record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int updateByPrimaryKey(Tags record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int updateByPrimaryKeySelective(Tags record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    List<Tags> selectByExample(TagsExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    Tags selectByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int deleteByExample(TagsExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int countByExample(TagsExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int updateByExampleSelective(Tags record, TagsExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table tags
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    int updateByExample(Tags record, TagsExample example);
}