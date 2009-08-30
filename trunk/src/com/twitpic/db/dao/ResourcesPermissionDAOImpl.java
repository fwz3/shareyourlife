package com.twitpic.db.dao;

import com.twitpic.db.model.ResourcesPermission;
import com.twitpic.db.model.ResourcesPermissionExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ResourcesPermissionDAOImpl extends SqlMapClientDaoSupport implements ResourcesPermissionDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public ResourcesPermissionDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int countByExample(ResourcesPermissionExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("resources_permission.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int deleteByExample(ResourcesPermissionExample example) {
        int rows = getSqlMapClientTemplate().delete("resources_permission.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int deleteByPrimaryKey(Integer id) {
        ResourcesPermission key = new ResourcesPermission();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("resources_permission.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public void insert(ResourcesPermission record) {
        getSqlMapClientTemplate().insert("resources_permission.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public void insertSelective(ResourcesPermission record) {
        getSqlMapClientTemplate().insert("resources_permission.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    @SuppressWarnings("unchecked")
    public List<ResourcesPermission> selectByExample(ResourcesPermissionExample example) {
        List<ResourcesPermission> list = getSqlMapClientTemplate().queryForList("resources_permission.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public ResourcesPermission selectByPrimaryKey(Integer id) {
        ResourcesPermission key = new ResourcesPermission();
        key.setId(id);
        ResourcesPermission record = (ResourcesPermission) getSqlMapClientTemplate().queryForObject("resources_permission.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int updateByExampleSelective(ResourcesPermission record, ResourcesPermissionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("resources_permission.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int updateByExample(ResourcesPermission record, ResourcesPermissionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("resources_permission.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int updateByPrimaryKeySelective(ResourcesPermission record) {
        int rows = getSqlMapClientTemplate().update("resources_permission.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public int updateByPrimaryKey(ResourcesPermission record) {
        int rows = getSqlMapClientTemplate().update("resources_permission.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table resources_permission
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    private static class UpdateByExampleParms extends ResourcesPermissionExample {
        private Object record;

        public UpdateByExampleParms(Object record, ResourcesPermissionExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}