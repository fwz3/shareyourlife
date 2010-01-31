package com.zhelazhela.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogDetailExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public BlogDetailExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	protected BlogDetailExample(BlogDetailExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table blog_detail
	 * @ibatorgenerated  Wed Jan 27 11:07:17 CST 2010
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

		public Criteria andPublishedIsNull() {
			addCriterion("published is null");
			return this;
		}

		public Criteria andPublishedIsNotNull() {
			addCriterion("published is not null");
			return this;
		}

		public Criteria andPublishedEqualTo(Boolean value) {
			addCriterion("published =", value, "published");
			return this;
		}

		public Criteria andPublishedNotEqualTo(Boolean value) {
			addCriterion("published <>", value, "published");
			return this;
		}

		public Criteria andPublishedGreaterThan(Boolean value) {
			addCriterion("published >", value, "published");
			return this;
		}

		public Criteria andPublishedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("published >=", value, "published");
			return this;
		}

		public Criteria andPublishedLessThan(Boolean value) {
			addCriterion("published <", value, "published");
			return this;
		}

		public Criteria andPublishedLessThanOrEqualTo(Boolean value) {
			addCriterion("published <=", value, "published");
			return this;
		}

		public Criteria andPublishedIn(List<Boolean> values) {
			addCriterion("published in", values, "published");
			return this;
		}

		public Criteria andPublishedNotIn(List<Boolean> values) {
			addCriterion("published not in", values, "published");
			return this;
		}

		public Criteria andPublishedBetween(Boolean value1, Boolean value2) {
			addCriterion("published between", value1, value2, "published");
			return this;
		}

		public Criteria andPublishedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("published not between", value1, value2, "published");
			return this;
		}

		public Criteria andStaticedIsNull() {
			addCriterion("staticed is null");
			return this;
		}

		public Criteria andStaticedIsNotNull() {
			addCriterion("staticed is not null");
			return this;
		}

		public Criteria andStaticedEqualTo(Boolean value) {
			addCriterion("staticed =", value, "staticed");
			return this;
		}

		public Criteria andStaticedNotEqualTo(Boolean value) {
			addCriterion("staticed <>", value, "staticed");
			return this;
		}

		public Criteria andStaticedGreaterThan(Boolean value) {
			addCriterion("staticed >", value, "staticed");
			return this;
		}

		public Criteria andStaticedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("staticed >=", value, "staticed");
			return this;
		}

		public Criteria andStaticedLessThan(Boolean value) {
			addCriterion("staticed <", value, "staticed");
			return this;
		}

		public Criteria andStaticedLessThanOrEqualTo(Boolean value) {
			addCriterion("staticed <=", value, "staticed");
			return this;
		}

		public Criteria andStaticedIn(List<Boolean> values) {
			addCriterion("staticed in", values, "staticed");
			return this;
		}

		public Criteria andStaticedNotIn(List<Boolean> values) {
			addCriterion("staticed not in", values, "staticed");
			return this;
		}

		public Criteria andStaticedBetween(Boolean value1, Boolean value2) {
			addCriterion("staticed between", value1, value2, "staticed");
			return this;
		}

		public Criteria andStaticedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("staticed not between", value1, value2, "staticed");
			return this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2,
					"updateTime");
			return this;
		}

		public Criteria andCategoryIsNull() {
			addCriterion("category is null");
			return this;
		}

		public Criteria andCategoryIsNotNull() {
			addCriterion("category is not null");
			return this;
		}

		public Criteria andCategoryEqualTo(String value) {
			addCriterion("category =", value, "category");
			return this;
		}

		public Criteria andCategoryNotEqualTo(String value) {
			addCriterion("category <>", value, "category");
			return this;
		}

		public Criteria andCategoryGreaterThan(String value) {
			addCriterion("category >", value, "category");
			return this;
		}

		public Criteria andCategoryGreaterThanOrEqualTo(String value) {
			addCriterion("category >=", value, "category");
			return this;
		}

		public Criteria andCategoryLessThan(String value) {
			addCriterion("category <", value, "category");
			return this;
		}

		public Criteria andCategoryLessThanOrEqualTo(String value) {
			addCriterion("category <=", value, "category");
			return this;
		}

		public Criteria andCategoryLike(String value) {
			addCriterion("category like", value, "category");
			return this;
		}

		public Criteria andCategoryNotLike(String value) {
			addCriterion("category not like", value, "category");
			return this;
		}

		public Criteria andCategoryIn(List<String> values) {
			addCriterion("category in", values, "category");
			return this;
		}

		public Criteria andCategoryNotIn(List<String> values) {
			addCriterion("category not in", values, "category");
			return this;
		}

		public Criteria andCategoryBetween(String value1, String value2) {
			addCriterion("category between", value1, value2, "category");
			return this;
		}

		public Criteria andCategoryNotBetween(String value1, String value2) {
			addCriterion("category not between", value1, value2, "category");
			return this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return this;
		}

		public Criteria andReviewIsNull() {
			addCriterion("review is null");
			return this;
		}

		public Criteria andReviewIsNotNull() {
			addCriterion("review is not null");
			return this;
		}

		public Criteria andReviewEqualTo(String value) {
			addCriterion("review =", value, "review");
			return this;
		}

		public Criteria andReviewNotEqualTo(String value) {
			addCriterion("review <>", value, "review");
			return this;
		}

		public Criteria andReviewGreaterThan(String value) {
			addCriterion("review >", value, "review");
			return this;
		}

		public Criteria andReviewGreaterThanOrEqualTo(String value) {
			addCriterion("review >=", value, "review");
			return this;
		}

		public Criteria andReviewLessThan(String value) {
			addCriterion("review <", value, "review");
			return this;
		}

		public Criteria andReviewLessThanOrEqualTo(String value) {
			addCriterion("review <=", value, "review");
			return this;
		}

		public Criteria andReviewLike(String value) {
			addCriterion("review like", value, "review");
			return this;
		}

		public Criteria andReviewNotLike(String value) {
			addCriterion("review not like", value, "review");
			return this;
		}

		public Criteria andReviewIn(List<String> values) {
			addCriterion("review in", values, "review");
			return this;
		}

		public Criteria andReviewNotIn(List<String> values) {
			addCriterion("review not in", values, "review");
			return this;
		}

		public Criteria andReviewBetween(String value1, String value2) {
			addCriterion("review between", value1, value2, "review");
			return this;
		}

		public Criteria andReviewNotBetween(String value1, String value2) {
			addCriterion("review not between", value1, value2, "review");
			return this;
		}
	}
}