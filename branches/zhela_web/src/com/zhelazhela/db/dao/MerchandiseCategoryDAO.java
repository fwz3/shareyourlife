package com.zhelazhela.db.dao;

import com.zhelazhela.db.model.MerchandiseCategory;
import com.zhelazhela.db.model.MerchandiseCategoryExample;
import java.util.List;

public interface MerchandiseCategoryDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int countByExample(MerchandiseCategoryExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int deleteByExample(MerchandiseCategoryExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	void insert(MerchandiseCategory record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	void insertSelective(MerchandiseCategory record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	List<MerchandiseCategory> selectByExample(MerchandiseCategoryExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	MerchandiseCategory selectByPrimaryKey(Long id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int updateByExampleSelective(MerchandiseCategory record,
			MerchandiseCategoryExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int updateByExample(MerchandiseCategory record,
			MerchandiseCategoryExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int updateByPrimaryKeySelective(MerchandiseCategory record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	int updateByPrimaryKey(MerchandiseCategory record);
	
	long insertSelectiveReturnId(MerchandiseCategory record);
}