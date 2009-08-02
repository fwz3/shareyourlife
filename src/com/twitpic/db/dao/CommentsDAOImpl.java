package com.twitpic.db.dao;

import com.twitpic.db.model.Comments;
import com.twitpic.db.model.CommentsExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class CommentsDAOImpl extends SqlMapClientDaoSupport implements CommentsDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public CommentsDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public void insert(Comments record) {
        getSqlMapClientTemplate().insert("comments.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int updateByPrimaryKeyWithoutBLOBs(Comments record) {
        int rows = getSqlMapClientTemplate().update("comments.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int updateByPrimaryKeyWithBLOBs(Comments record) {
        int rows = getSqlMapClientTemplate().update("comments.abatorgenerated_updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int updateByPrimaryKeySelective(Comments record) {
        int rows = getSqlMapClientTemplate().update("comments.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    @SuppressWarnings("unchecked")
    public List<Comments> selectByExampleWithoutBLOBs(CommentsExample example) {
        List<Comments> list = (List<Comments>) getSqlMapClientTemplate().queryForList("comments.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    @SuppressWarnings("unchecked")
    public List<Comments> selectByExampleWithBLOBs(CommentsExample example) {
        List<Comments> list = (List<Comments>) getSqlMapClientTemplate().queryForList("comments.abatorgenerated_selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public Comments selectByPrimaryKey(Long id) {
        Comments key = new Comments();
        key.setId(id);
        Comments record = (Comments) getSqlMapClientTemplate().queryForObject("comments.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int deleteByExample(CommentsExample example) {
        int rows = getSqlMapClientTemplate().delete("comments.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int deleteByPrimaryKey(Long id) {
        Comments key = new Comments();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("comments.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int countByExample(CommentsExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("comments.abatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int updateByExampleSelective(Comments record, CommentsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("comments.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int updateByExampleWithBLOBs(Comments record, CommentsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("comments.abatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    public int updateByExampleWithoutBLOBs(Comments record, CommentsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("comments.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table comments
     *
     * @abatorgenerated Sun Aug 02 17:41:31 CST 2009
     */
    private static class UpdateByExampleParms extends CommentsExample {
        private Object record;

        public UpdateByExampleParms(Object record, CommentsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}