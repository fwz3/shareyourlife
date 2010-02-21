package com.zhelazhela.db.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsPriceExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public GoodsPriceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	protected GoodsPriceExample(GoodsPriceExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table goods_price
	 * @ibatorgenerated  Sun Feb 14 23:42:49 CST 2010
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

		public Criteria andGoodIdIsNull() {
			addCriterion("good_id is null");
			return this;
		}

		public Criteria andGoodIdIsNotNull() {
			addCriterion("good_id is not null");
			return this;
		}

		public Criteria andGoodIdEqualTo(Long value) {
			addCriterion("good_id =", value, "goodId");
			return this;
		}

		public Criteria andGoodIdNotEqualTo(Long value) {
			addCriterion("good_id <>", value, "goodId");
			return this;
		}

		public Criteria andGoodIdGreaterThan(Long value) {
			addCriterion("good_id >", value, "goodId");
			return this;
		}

		public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
			addCriterion("good_id >=", value, "goodId");
			return this;
		}

		public Criteria andGoodIdLessThan(Long value) {
			addCriterion("good_id <", value, "goodId");
			return this;
		}

		public Criteria andGoodIdLessThanOrEqualTo(Long value) {
			addCriterion("good_id <=", value, "goodId");
			return this;
		}

		public Criteria andGoodIdIn(List<Long> values) {
			addCriterion("good_id in", values, "goodId");
			return this;
		}

		public Criteria andGoodIdNotIn(List<Long> values) {
			addCriterion("good_id not in", values, "goodId");
			return this;
		}

		public Criteria andGoodIdBetween(Long value1, Long value2) {
			addCriterion("good_id between", value1, value2, "goodId");
			return this;
		}

		public Criteria andGoodIdNotBetween(Long value1, Long value2) {
			addCriterion("good_id not between", value1, value2, "goodId");
			return this;
		}

		public Criteria andSnIsNull() {
			addCriterion("SN is null");
			return this;
		}

		public Criteria andSnIsNotNull() {
			addCriterion("SN is not null");
			return this;
		}

		public Criteria andSnEqualTo(String value) {
			addCriterion("SN =", value, "sn");
			return this;
		}

		public Criteria andSnNotEqualTo(String value) {
			addCriterion("SN <>", value, "sn");
			return this;
		}

		public Criteria andSnGreaterThan(String value) {
			addCriterion("SN >", value, "sn");
			return this;
		}

		public Criteria andSnGreaterThanOrEqualTo(String value) {
			addCriterion("SN >=", value, "sn");
			return this;
		}

		public Criteria andSnLessThan(String value) {
			addCriterion("SN <", value, "sn");
			return this;
		}

		public Criteria andSnLessThanOrEqualTo(String value) {
			addCriterion("SN <=", value, "sn");
			return this;
		}

		public Criteria andSnLike(String value) {
			addCriterion("SN like", value, "sn");
			return this;
		}

		public Criteria andSnNotLike(String value) {
			addCriterion("SN not like", value, "sn");
			return this;
		}

		public Criteria andSnIn(List<String> values) {
			addCriterion("SN in", values, "sn");
			return this;
		}

		public Criteria andSnNotIn(List<String> values) {
			addCriterion("SN not in", values, "sn");
			return this;
		}

		public Criteria andSnBetween(String value1, String value2) {
			addCriterion("SN between", value1, value2, "sn");
			return this;
		}

		public Criteria andSnNotBetween(String value1, String value2) {
			addCriterion("SN not between", value1, value2, "sn");
			return this;
		}

		public Criteria andProvideUserIdIsNull() {
			addCriterion("provide_user_id is null");
			return this;
		}

		public Criteria andProvideUserIdIsNotNull() {
			addCriterion("provide_user_id is not null");
			return this;
		}

		public Criteria andProvideUserIdEqualTo(Long value) {
			addCriterion("provide_user_id =", value, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdNotEqualTo(Long value) {
			addCriterion("provide_user_id <>", value, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdGreaterThan(Long value) {
			addCriterion("provide_user_id >", value, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("provide_user_id >=", value, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdLessThan(Long value) {
			addCriterion("provide_user_id <", value, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdLessThanOrEqualTo(Long value) {
			addCriterion("provide_user_id <=", value, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdIn(List<Long> values) {
			addCriterion("provide_user_id in", values, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdNotIn(List<Long> values) {
			addCriterion("provide_user_id not in", values, "provideUserId");
			return this;
		}

		public Criteria andProvideUserIdBetween(Long value1, Long value2) {
			addCriterion("provide_user_id between", value1, value2,
					"provideUserId");
			return this;
		}

		public Criteria andProvideUserIdNotBetween(Long value1, Long value2) {
			addCriterion("provide_user_id not between", value1, value2,
					"provideUserId");
			return this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return this;
		}

		public Criteria andPriceEqualTo(Float value) {
			addCriterion("price =", value, "price");
			return this;
		}

		public Criteria andPriceNotEqualTo(Float value) {
			addCriterion("price <>", value, "price");
			return this;
		}

		public Criteria andPriceGreaterThan(Float value) {
			addCriterion("price >", value, "price");
			return this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(Float value) {
			addCriterion("price >=", value, "price");
			return this;
		}

		public Criteria andPriceLessThan(Float value) {
			addCriterion("price <", value, "price");
			return this;
		}

		public Criteria andPriceLessThanOrEqualTo(Float value) {
			addCriterion("price <=", value, "price");
			return this;
		}

		public Criteria andPriceIn(List<Float> values) {
			addCriterion("price in", values, "price");
			return this;
		}

		public Criteria andPriceNotIn(List<Float> values) {
			addCriterion("price not in", values, "price");
			return this;
		}

		public Criteria andPriceBetween(Float value1, Float value2) {
			addCriterion("price between", value1, value2, "price");
			return this;
		}

		public Criteria andPriceNotBetween(Float value1, Float value2) {
			addCriterion("price not between", value1, value2, "price");
			return this;
		}

		public Criteria andTopicIsNull() {
			addCriterion("topic is null");
			return this;
		}

		public Criteria andTopicIsNotNull() {
			addCriterion("topic is not null");
			return this;
		}

		public Criteria andTopicEqualTo(String value) {
			addCriterion("topic =", value, "topic");
			return this;
		}

		public Criteria andTopicNotEqualTo(String value) {
			addCriterion("topic <>", value, "topic");
			return this;
		}

		public Criteria andTopicGreaterThan(String value) {
			addCriterion("topic >", value, "topic");
			return this;
		}

		public Criteria andTopicGreaterThanOrEqualTo(String value) {
			addCriterion("topic >=", value, "topic");
			return this;
		}

		public Criteria andTopicLessThan(String value) {
			addCriterion("topic <", value, "topic");
			return this;
		}

		public Criteria andTopicLessThanOrEqualTo(String value) {
			addCriterion("topic <=", value, "topic");
			return this;
		}

		public Criteria andTopicLike(String value) {
			addCriterion("topic like", value, "topic");
			return this;
		}

		public Criteria andTopicNotLike(String value) {
			addCriterion("topic not like", value, "topic");
			return this;
		}

		public Criteria andTopicIn(List<String> values) {
			addCriterion("topic in", values, "topic");
			return this;
		}

		public Criteria andTopicNotIn(List<String> values) {
			addCriterion("topic not in", values, "topic");
			return this;
		}

		public Criteria andTopicBetween(String value1, String value2) {
			addCriterion("topic between", value1, value2, "topic");
			return this;
		}

		public Criteria andTopicNotBetween(String value1, String value2) {
			addCriterion("topic not between", value1, value2, "topic");
			return this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return this;
		}
	}
}