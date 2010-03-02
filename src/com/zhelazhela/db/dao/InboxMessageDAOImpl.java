package com.zhelazhela.db.dao;

import com.zhelazhela.db.model.InboxMessage;
import com.zhelazhela.db.model.InboxMessageExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class InboxMessageDAOImpl extends SqlMapClientDaoSupport implements InboxMessageDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public InboxMessageDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int countByExample(InboxMessageExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"inbox_message.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int deleteByExample(InboxMessageExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"inbox_message.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int deleteByPrimaryKey(Long id) {
		InboxMessage key = new InboxMessage();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"inbox_message.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public void insert(InboxMessage record) {
		getSqlMapClientTemplate().insert(
				"inbox_message.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public void insertSelective(InboxMessage record) {
		getSqlMapClientTemplate().insert(
				"inbox_message.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	@SuppressWarnings("unchecked")
	public List<InboxMessage> selectByExample(InboxMessageExample example) {
		List<InboxMessage> list = getSqlMapClientTemplate().queryForList(
				"inbox_message.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public InboxMessage selectByPrimaryKey(Long id) {
		InboxMessage key = new InboxMessage();
		key.setId(id);
		InboxMessage record = (InboxMessage) getSqlMapClientTemplate()
				.queryForObject(
						"inbox_message.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int updateByExampleSelective(InboxMessage record,
			InboxMessageExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate()
				.update(
						"inbox_message.ibatorgenerated_updateByExampleSelective",
						parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int updateByExample(InboxMessage record, InboxMessageExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"inbox_message.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int updateByPrimaryKeySelective(InboxMessage record) {
		int rows = getSqlMapClientTemplate().update(
				"inbox_message.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	public int updateByPrimaryKey(InboxMessage record) {
		int rows = getSqlMapClientTemplate().update(
				"inbox_message.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table inbox_message
	 * @ibatorgenerated  Mon Mar 01 15:23:21 CST 2010
	 */
	private static class UpdateByExampleParms extends InboxMessageExample {
		private Object record;

		public UpdateByExampleParms(Object record, InboxMessageExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}