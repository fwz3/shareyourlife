package com.zhela.cloudblog.model.ourservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhela.cloudblog.model.DefaultExample;

public class CommentExample extends DefaultExample{
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    protected CommentExample(CommentExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
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
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table comment
     *
     * @ibatorgenerated Mon Nov 29 14:02:02 CST 2010
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

        public Criteria andServiceBindCodeIsNull() {
            addCriterion("service_bind_code is null");
            return this;
        }

        public Criteria andServiceBindCodeIsNotNull() {
            addCriterion("service_bind_code is not null");
            return this;
        }

        public Criteria andServiceBindCodeEqualTo(String value) {
            addCriterion("service_bind_code =", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeNotEqualTo(String value) {
            addCriterion("service_bind_code <>", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeGreaterThan(String value) {
            addCriterion("service_bind_code >", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_bind_code >=", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeLessThan(String value) {
            addCriterion("service_bind_code <", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeLessThanOrEqualTo(String value) {
            addCriterion("service_bind_code <=", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeLike(String value) {
            addCriterion("service_bind_code like", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeNotLike(String value) {
            addCriterion("service_bind_code not like", value, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeIn(List<String> values) {
            addCriterion("service_bind_code in", values, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeNotIn(List<String> values) {
            addCriterion("service_bind_code not in", values, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeBetween(String value1, String value2) {
            addCriterion("service_bind_code between", value1, value2, "serviceBindCode");
            return this;
        }

        public Criteria andServiceBindCodeNotBetween(String value1, String value2) {
            addCriterion("service_bind_code not between", value1, value2, "serviceBindCode");
            return this;
        }

        public Criteria andWebUrlIsNull() {
            addCriterion("web_url is null");
            return this;
        }

        public Criteria andWebUrlIsNotNull() {
            addCriterion("web_url is not null");
            return this;
        }

        public Criteria andWebUrlEqualTo(String value) {
            addCriterion("web_url =", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlNotEqualTo(String value) {
            addCriterion("web_url <>", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlGreaterThan(String value) {
            addCriterion("web_url >", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlGreaterThanOrEqualTo(String value) {
            addCriterion("web_url >=", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlLessThan(String value) {
            addCriterion("web_url <", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlLessThanOrEqualTo(String value) {
            addCriterion("web_url <=", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlLike(String value) {
            addCriterion("web_url like", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlNotLike(String value) {
            addCriterion("web_url not like", value, "webUrl");
            return this;
        }

        public Criteria andWebUrlIn(List<String> values) {
            addCriterion("web_url in", values, "webUrl");
            return this;
        }

        public Criteria andWebUrlNotIn(List<String> values) {
            addCriterion("web_url not in", values, "webUrl");
            return this;
        }

        public Criteria andWebUrlBetween(String value1, String value2) {
            addCriterion("web_url between", value1, value2, "webUrl");
            return this;
        }

        public Criteria andWebUrlNotBetween(String value1, String value2) {
            addCriterion("web_url not between", value1, value2, "webUrl");
            return this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserHeaderIsNull() {
            addCriterion("user_header is null");
            return this;
        }

        public Criteria andUserHeaderIsNotNull() {
            addCriterion("user_header is not null");
            return this;
        }

        public Criteria andUserHeaderEqualTo(String value) {
            addCriterion("user_header =", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderNotEqualTo(String value) {
            addCriterion("user_header <>", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderGreaterThan(String value) {
            addCriterion("user_header >", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("user_header >=", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderLessThan(String value) {
            addCriterion("user_header <", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderLessThanOrEqualTo(String value) {
            addCriterion("user_header <=", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderLike(String value) {
            addCriterion("user_header like", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderNotLike(String value) {
            addCriterion("user_header not like", value, "userHeader");
            return this;
        }

        public Criteria andUserHeaderIn(List<String> values) {
            addCriterion("user_header in", values, "userHeader");
            return this;
        }

        public Criteria andUserHeaderNotIn(List<String> values) {
            addCriterion("user_header not in", values, "userHeader");
            return this;
        }

        public Criteria andUserHeaderBetween(String value1, String value2) {
            addCriterion("user_header between", value1, value2, "userHeader");
            return this;
        }

        public Criteria andUserHeaderNotBetween(String value1, String value2) {
            addCriterion("user_header not between", value1, value2, "userHeader");
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