package com.twitpic.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FollowExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public FollowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    protected FollowExample(FollowExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table follows
     *
     * @ibatorgenerated Tue Sep 08 17:33:31 CST 2009
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andFollowIsNull() {
            addCriterion("follow is null");
            return this;
        }

        public Criteria andFollowIsNotNull() {
            addCriterion("follow is not null");
            return this;
        }

        public Criteria andFollowEqualTo(String value) {
            addCriterion("follow =", value, "follow");
            return this;
        }

        public Criteria andFollowNotEqualTo(String value) {
            addCriterion("follow <>", value, "follow");
            return this;
        }

        public Criteria andFollowGreaterThan(String value) {
            addCriterion("follow >", value, "follow");
            return this;
        }

        public Criteria andFollowGreaterThanOrEqualTo(String value) {
            addCriterion("follow >=", value, "follow");
            return this;
        }

        public Criteria andFollowLessThan(String value) {
            addCriterion("follow <", value, "follow");
            return this;
        }

        public Criteria andFollowLessThanOrEqualTo(String value) {
            addCriterion("follow <=", value, "follow");
            return this;
        }

        public Criteria andFollowLike(String value) {
            addCriterion("follow like", value, "follow");
            return this;
        }

        public Criteria andFollowNotLike(String value) {
            addCriterion("follow not like", value, "follow");
            return this;
        }

        public Criteria andFollowIn(List<String> values) {
            addCriterion("follow in", values, "follow");
            return this;
        }

        public Criteria andFollowNotIn(List<String> values) {
            addCriterion("follow not in", values, "follow");
            return this;
        }

        public Criteria andFollowBetween(String value1, String value2) {
            addCriterion("follow between", value1, value2, "follow");
            return this;
        }

        public Criteria andFollowNotBetween(String value1, String value2) {
            addCriterion("follow not between", value1, value2, "follow");
            return this;
        }

        public Criteria andFollowedIsNull() {
            addCriterion("followed is null");
            return this;
        }

        public Criteria andFollowedIsNotNull() {
            addCriterion("followed is not null");
            return this;
        }

        public Criteria andFollowedEqualTo(String value) {
            addCriterion("followed =", value, "followed");
            return this;
        }

        public Criteria andFollowedNotEqualTo(String value) {
            addCriterion("followed <>", value, "followed");
            return this;
        }

        public Criteria andFollowedGreaterThan(String value) {
            addCriterion("followed >", value, "followed");
            return this;
        }

        public Criteria andFollowedGreaterThanOrEqualTo(String value) {
            addCriterion("followed >=", value, "followed");
            return this;
        }

        public Criteria andFollowedLessThan(String value) {
            addCriterion("followed <", value, "followed");
            return this;
        }

        public Criteria andFollowedLessThanOrEqualTo(String value) {
            addCriterion("followed <=", value, "followed");
            return this;
        }

        public Criteria andFollowedLike(String value) {
            addCriterion("followed like", value, "followed");
            return this;
        }

        public Criteria andFollowedNotLike(String value) {
            addCriterion("followed not like", value, "followed");
            return this;
        }

        public Criteria andFollowedIn(List<String> values) {
            addCriterion("followed in", values, "followed");
            return this;
        }

        public Criteria andFollowedNotIn(List<String> values) {
            addCriterion("followed not in", values, "followed");
            return this;
        }

        public Criteria andFollowedBetween(String value1, String value2) {
            addCriterion("followed between", value1, value2, "followed");
            return this;
        }

        public Criteria andFollowedNotBetween(String value1, String value2) {
            addCriterion("followed not between", value1, value2, "followed");
            return this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
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
            addCriterion("update_time not between", value1, value2, "updateTime");
            return this;
        }
    }
}