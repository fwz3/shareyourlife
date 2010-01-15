package com.zhelazhela.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerchandiseCategoryExample {
	
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public MerchandiseCategoryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	protected MerchandiseCategoryExample(MerchandiseCategoryExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table merchandise_category
	 * @ibatorgenerated  Fri Dec 25 12:43:45 CST 2009
	 */
	public static class Criteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andFatherIsNull() {
			addCriterion("father is null");
			return this;
		}

		public Criteria andFatherIsNotNull() {
			addCriterion("father is not null");
			return this;
		}

		public Criteria andFatherEqualTo(Long value) {
			addCriterion("father =", value, "father");
			return this;
		}

		public Criteria andFatherNotEqualTo(Long value) {
			addCriterion("father <>", value, "father");
			return this;
		}

		public Criteria andFatherGreaterThan(Long value) {
			addCriterion("father >", value, "father");
			return this;
		}

		public Criteria andFatherGreaterThanOrEqualTo(Long value) {
			addCriterion("father >=", value, "father");
			return this;
		}

		public Criteria andFatherLessThan(Long value) {
			addCriterion("father <", value, "father");
			return this;
		}

		public Criteria andFatherLessThanOrEqualTo(Long value) {
			addCriterion("father <=", value, "father");
			return this;
		}

		public Criteria andFatherIn(List<Long> values) {
			addCriterion("father in", values, "father");
			return this;
		}

		public Criteria andFatherNotIn(List<Long> values) {
			addCriterion("father not in", values, "father");
			return this;
		}

		public Criteria andFatherBetween(Long value1, Long value2) {
			addCriterion("father between", value1, value2, "father");
			return this;
		}

		public Criteria andFatherNotBetween(Long value1, Long value2) {
			addCriterion("father not between", value1, value2, "father");
			return this;
		}

		public Criteria andChildIsNull() {
			addCriterion("child is null");
			return this;
		}

		public Criteria andChildIsNotNull() {
			addCriterion("child is not null");
			return this;
		}

		public Criteria andChildEqualTo(Long value) {
			addCriterion("child =", value, "child");
			return this;
		}

		public Criteria andChildNotEqualTo(Long value) {
			addCriterion("child <>", value, "child");
			return this;
		}

		public Criteria andChildGreaterThan(Long value) {
			addCriterion("child >", value, "child");
			return this;
		}

		public Criteria andChildGreaterThanOrEqualTo(Long value) {
			addCriterion("child >=", value, "child");
			return this;
		}

		public Criteria andChildLessThan(Long value) {
			addCriterion("child <", value, "child");
			return this;
		}

		public Criteria andChildLessThanOrEqualTo(Long value) {
			addCriterion("child <=", value, "child");
			return this;
		}

		public Criteria andChildIn(List<Long> values) {
			addCriterion("child in", values, "child");
			return this;
		}

		public Criteria andChildNotIn(List<Long> values) {
			addCriterion("child not in", values, "child");
			return this;
		}

		public Criteria andChildBetween(Long value1, Long value2) {
			addCriterion("child between", value1, value2, "child");
			return this;
		}

		public Criteria andChildNotBetween(Long value1, Long value2) {
			addCriterion("child not between", value1, value2, "child");
			return this;
		}

		public Criteria andIsSystemIsNull() {
			addCriterion("is_system is null");
			return this;
		}

		public Criteria andIsSystemIsNotNull() {
			addCriterion("is_system is not null");
			return this;
		}

		public Criteria andIsSystemEqualTo(Boolean value) {
			addCriterion("is_system =", value, "isSystem");
			return this;
		}

		public Criteria andIsSystemNotEqualTo(Boolean value) {
			addCriterion("is_system <>", value, "isSystem");
			return this;
		}

		public Criteria andIsSystemGreaterThan(Boolean value) {
			addCriterion("is_system >", value, "isSystem");
			return this;
		}

		public Criteria andIsSystemGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_system >=", value, "isSystem");
			return this;
		}

		public Criteria andIsSystemLessThan(Boolean value) {
			addCriterion("is_system <", value, "isSystem");
			return this;
		}

		public Criteria andIsSystemLessThanOrEqualTo(Boolean value) {
			addCriterion("is_system <=", value, "isSystem");
			return this;
		}

		public Criteria andIsSystemIn(List<Boolean> values) {
			addCriterion("is_system in", values, "isSystem");
			return this;
		}

		public Criteria andIsSystemNotIn(List<Boolean> values) {
			addCriterion("is_system not in", values, "isSystem");
			return this;
		}

		public Criteria andIsSystemBetween(Boolean value1, Boolean value2) {
			addCriterion("is_system between", value1, value2, "isSystem");
			return this;
		}

		public Criteria andIsSystemNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_system not between", value1, value2, "isSystem");
			return this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2,
					"description");
			return this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return this;
		}

		public Criteria andAddTimeEqualTo(Date value) {
			addCriterion("add_time =", value, "addTime");
			return this;
		}

		public Criteria andAddTimeNotEqualTo(Date value) {
			addCriterion("add_time <>", value, "addTime");
			return this;
		}

		public Criteria andAddTimeGreaterThan(Date value) {
			addCriterion("add_time >", value, "addTime");
			return this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("add_time >=", value, "addTime");
			return this;
		}

		public Criteria andAddTimeLessThan(Date value) {
			addCriterion("add_time <", value, "addTime");
			return this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Date value) {
			addCriterion("add_time <=", value, "addTime");
			return this;
		}

		public Criteria andAddTimeIn(List<Date> values) {
			addCriterion("add_time in", values, "addTime");
			return this;
		}

		public Criteria andAddTimeNotIn(List<Date> values) {
			addCriterion("add_time not in", values, "addTime");
			return this;
		}

		public Criteria andAddTimeBetween(Date value1, Date value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return this;
		}

		public Criteria andAddTimeNotBetween(Date value1, Date value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return this;
		}
	}

	private String limit;

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
}