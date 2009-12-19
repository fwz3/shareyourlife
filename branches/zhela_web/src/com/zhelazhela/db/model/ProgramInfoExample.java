package com.zhelazhela.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramInfoExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public ProgramInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	protected ProgramInfoExample(ProgramInfoExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table program_info
	 * @ibatorgenerated  Fri Dec 18 11:08:41 CST 2009
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

		public Criteria andShortIsNull() {
			addCriterion("short is null");
			return this;
		}

		public Criteria andShortIsNotNull() {
			addCriterion("short is not null");
			return this;
		}

		public Criteria andShortEqualTo(String value) {
			addCriterion("short =", value, "short");
			return this;
		}

		public Criteria andShortNotEqualTo(String value) {
			addCriterion("short <>", value, "short");
			return this;
		}

		public Criteria andShortGreaterThan(String value) {
			addCriterion("short >", value, "short");
			return this;
		}

		public Criteria andShortGreaterThanOrEqualTo(String value) {
			addCriterion("short >=", value, "short");
			return this;
		}

		public Criteria andShortLessThan(String value) {
			addCriterion("short <", value, "short");
			return this;
		}

		public Criteria andShortLessThanOrEqualTo(String value) {
			addCriterion("short <=", value, "short");
			return this;
		}

		public Criteria andShortLike(String value) {
			addCriterion("short like", value, "short");
			return this;
		}

		public Criteria andShortNotLike(String value) {
			addCriterion("short not like", value, "short");
			return this;
		}

		public Criteria andShortIn(List<String> values) {
			addCriterion("short in", values, "short");
			return this;
		}

		public Criteria andShortNotIn(List<String> values) {
			addCriterion("short not in", values, "short");
			return this;
		}

		public Criteria andShortBetween(String value1, String value2) {
			addCriterion("short between", value1, value2, "short");
			return this;
		}

		public Criteria andShortNotBetween(String value1, String value2) {
			addCriterion("short not between", value1, value2, "short");
			return this;
		}

		public Criteria andWebsiteIsNull() {
			addCriterion("website is null");
			return this;
		}

		public Criteria andWebsiteIsNotNull() {
			addCriterion("website is not null");
			return this;
		}

		public Criteria andWebsiteEqualTo(String value) {
			addCriterion("website =", value, "website");
			return this;
		}

		public Criteria andWebsiteNotEqualTo(String value) {
			addCriterion("website <>", value, "website");
			return this;
		}

		public Criteria andWebsiteGreaterThan(String value) {
			addCriterion("website >", value, "website");
			return this;
		}

		public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
			addCriterion("website >=", value, "website");
			return this;
		}

		public Criteria andWebsiteLessThan(String value) {
			addCriterion("website <", value, "website");
			return this;
		}

		public Criteria andWebsiteLessThanOrEqualTo(String value) {
			addCriterion("website <=", value, "website");
			return this;
		}

		public Criteria andWebsiteLike(String value) {
			addCriterion("website like", value, "website");
			return this;
		}

		public Criteria andWebsiteNotLike(String value) {
			addCriterion("website not like", value, "website");
			return this;
		}

		public Criteria andWebsiteIn(List<String> values) {
			addCriterion("website in", values, "website");
			return this;
		}

		public Criteria andWebsiteNotIn(List<String> values) {
			addCriterion("website not in", values, "website");
			return this;
		}

		public Criteria andWebsiteBetween(String value1, String value2) {
			addCriterion("website between", value1, value2, "website");
			return this;
		}

		public Criteria andWebsiteNotBetween(String value1, String value2) {
			addCriterion("website not between", value1, value2, "website");
			return this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return this;
		}

		public Criteria andLogIsNull() {
			addCriterion("log is null");
			return this;
		}

		public Criteria andLogIsNotNull() {
			addCriterion("log is not null");
			return this;
		}

		public Criteria andLogEqualTo(String value) {
			addCriterion("log =", value, "log");
			return this;
		}

		public Criteria andLogNotEqualTo(String value) {
			addCriterion("log <>", value, "log");
			return this;
		}

		public Criteria andLogGreaterThan(String value) {
			addCriterion("log >", value, "log");
			return this;
		}

		public Criteria andLogGreaterThanOrEqualTo(String value) {
			addCriterion("log >=", value, "log");
			return this;
		}

		public Criteria andLogLessThan(String value) {
			addCriterion("log <", value, "log");
			return this;
		}

		public Criteria andLogLessThanOrEqualTo(String value) {
			addCriterion("log <=", value, "log");
			return this;
		}

		public Criteria andLogLike(String value) {
			addCriterion("log like", value, "log");
			return this;
		}

		public Criteria andLogNotLike(String value) {
			addCriterion("log not like", value, "log");
			return this;
		}

		public Criteria andLogIn(List<String> values) {
			addCriterion("log in", values, "log");
			return this;
		}

		public Criteria andLogNotIn(List<String> values) {
			addCriterion("log not in", values, "log");
			return this;
		}

		public Criteria andLogBetween(String value1, String value2) {
			addCriterion("log between", value1, value2, "log");
			return this;
		}

		public Criteria andLogNotBetween(String value1, String value2) {
			addCriterion("log not between", value1, value2, "log");
			return this;
		}

		public Criteria andRegDateIsNull() {
			addCriterion("reg_date is null");
			return this;
		}

		public Criteria andRegDateIsNotNull() {
			addCriterion("reg_date is not null");
			return this;
		}

		public Criteria andRegDateEqualTo(Date value) {
			addCriterion("reg_date =", value, "regDate");
			return this;
		}

		public Criteria andRegDateNotEqualTo(Date value) {
			addCriterion("reg_date <>", value, "regDate");
			return this;
		}

		public Criteria andRegDateGreaterThan(Date value) {
			addCriterion("reg_date >", value, "regDate");
			return this;
		}

		public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
			addCriterion("reg_date >=", value, "regDate");
			return this;
		}

		public Criteria andRegDateLessThan(Date value) {
			addCriterion("reg_date <", value, "regDate");
			return this;
		}

		public Criteria andRegDateLessThanOrEqualTo(Date value) {
			addCriterion("reg_date <=", value, "regDate");
			return this;
		}

		public Criteria andRegDateIn(List<Date> values) {
			addCriterion("reg_date in", values, "regDate");
			return this;
		}

		public Criteria andRegDateNotIn(List<Date> values) {
			addCriterion("reg_date not in", values, "regDate");
			return this;
		}

		public Criteria andRegDateBetween(Date value1, Date value2) {
			addCriterion("reg_date between", value1, value2, "regDate");
			return this;
		}

		public Criteria andRegDateNotBetween(Date value1, Date value2) {
			addCriterion("reg_date not between", value1, value2, "regDate");
			return this;
		}
	}
}