package com.zhelazhela.db.dao;

import com.zhelazhela.db.model.BlogQa;
import com.zhelazhela.db.model.BlogQaExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class BlogQaDAOImpl extends SqlMapClientDaoSupport implements BlogQaDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public BlogQaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int countByExample(BlogQaExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("blog_qa.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int deleteByExample(BlogQaExample example) {
        int rows = getSqlMapClientTemplate().delete("blog_qa.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int deleteByPrimaryKey(Long id) {
        BlogQa key = new BlogQa();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("blog_qa.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public void insert(BlogQa record) {
        getSqlMapClientTemplate().insert("blog_qa.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public void insertSelective(BlogQa record) {
        getSqlMapClientTemplate().insert("blog_qa.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<BlogQa> selectByExample(BlogQaExample example) {
        List<BlogQa> list = getSqlMapClientTemplate().queryForList("blog_qa.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public BlogQa selectByPrimaryKey(Long id) {
        BlogQa key = new BlogQa();
        key.setId(id);
        BlogQa record = (BlogQa) getSqlMapClientTemplate().queryForObject("blog_qa.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int updateByExampleSelective(BlogQa record, BlogQaExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("blog_qa.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int updateByExample(BlogQa record, BlogQaExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("blog_qa.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int updateByPrimaryKeySelective(BlogQa record) {
        int rows = getSqlMapClientTemplate().update("blog_qa.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    public int updateByPrimaryKey(BlogQa record) {
        int rows = getSqlMapClientTemplate().update("blog_qa.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table blog_qa
     *
     * @ibatorgenerated Sun Jan 31 12:38:51 CST 2010
     */
    private static class UpdateByExampleParms extends BlogQaExample {
        private Object record;

        public UpdateByExampleParms(Object record, BlogQaExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}