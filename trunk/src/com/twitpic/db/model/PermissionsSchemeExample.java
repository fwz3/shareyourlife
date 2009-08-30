package com.twitpic.db.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermissionsSchemeExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public PermissionsSchemeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    protected PermissionsSchemeExample(PermissionsSchemeExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
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
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table permissions_scheme
     *
     * @ibatorgenerated Sun Aug 30 15:33:51 CST 2009
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

        public Criteria andIdPermissionsIsNull() {
            addCriterion("id_permissions is null");
            return this;
        }

        public Criteria andIdPermissionsIsNotNull() {
            addCriterion("id_permissions is not null");
            return this;
        }

        public Criteria andIdPermissionsEqualTo(Long value) {
            addCriterion("id_permissions =", value, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsNotEqualTo(Long value) {
            addCriterion("id_permissions <>", value, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsGreaterThan(Long value) {
            addCriterion("id_permissions >", value, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsGreaterThanOrEqualTo(Long value) {
            addCriterion("id_permissions >=", value, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsLessThan(Long value) {
            addCriterion("id_permissions <", value, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsLessThanOrEqualTo(Long value) {
            addCriterion("id_permissions <=", value, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsIn(List<Long> values) {
            addCriterion("id_permissions in", values, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsNotIn(List<Long> values) {
            addCriterion("id_permissions not in", values, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsBetween(Long value1, Long value2) {
            addCriterion("id_permissions between", value1, value2, "idPermissions");
            return this;
        }

        public Criteria andIdPermissionsNotBetween(Long value1, Long value2) {
            addCriterion("id_permissions not between", value1, value2, "idPermissions");
            return this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return this;
        }

        public Criteria andDestTypeIsNull() {
            addCriterion("dest_type is null");
            return this;
        }

        public Criteria andDestTypeIsNotNull() {
            addCriterion("dest_type is not null");
            return this;
        }

        public Criteria andDestTypeEqualTo(String value) {
            addCriterion("dest_type =", value, "destType");
            return this;
        }

        public Criteria andDestTypeNotEqualTo(String value) {
            addCriterion("dest_type <>", value, "destType");
            return this;
        }

        public Criteria andDestTypeGreaterThan(String value) {
            addCriterion("dest_type >", value, "destType");
            return this;
        }

        public Criteria andDestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dest_type >=", value, "destType");
            return this;
        }

        public Criteria andDestTypeLessThan(String value) {
            addCriterion("dest_type <", value, "destType");
            return this;
        }

        public Criteria andDestTypeLessThanOrEqualTo(String value) {
            addCriterion("dest_type <=", value, "destType");
            return this;
        }

        public Criteria andDestTypeLike(String value) {
            addCriterion("dest_type like", value, "destType");
            return this;
        }

        public Criteria andDestTypeNotLike(String value) {
            addCriterion("dest_type not like", value, "destType");
            return this;
        }

        public Criteria andDestTypeIn(List<String> values) {
            addCriterion("dest_type in", values, "destType");
            return this;
        }

        public Criteria andDestTypeNotIn(List<String> values) {
            addCriterion("dest_type not in", values, "destType");
            return this;
        }

        public Criteria andDestTypeBetween(String value1, String value2) {
            addCriterion("dest_type between", value1, value2, "destType");
            return this;
        }

        public Criteria andDestTypeNotBetween(String value1, String value2) {
            addCriterion("dest_type not between", value1, value2, "destType");
            return this;
        }

        public Criteria andDestValueIsNull() {
            addCriterion("dest_value is null");
            return this;
        }

        public Criteria andDestValueIsNotNull() {
            addCriterion("dest_value is not null");
            return this;
        }

        public Criteria andDestValueEqualTo(String value) {
            addCriterion("dest_value =", value, "destValue");
            return this;
        }

        public Criteria andDestValueNotEqualTo(String value) {
            addCriterion("dest_value <>", value, "destValue");
            return this;
        }

        public Criteria andDestValueGreaterThan(String value) {
            addCriterion("dest_value >", value, "destValue");
            return this;
        }

        public Criteria andDestValueGreaterThanOrEqualTo(String value) {
            addCriterion("dest_value >=", value, "destValue");
            return this;
        }

        public Criteria andDestValueLessThan(String value) {
            addCriterion("dest_value <", value, "destValue");
            return this;
        }

        public Criteria andDestValueLessThanOrEqualTo(String value) {
            addCriterion("dest_value <=", value, "destValue");
            return this;
        }

        public Criteria andDestValueLike(String value) {
            addCriterion("dest_value like", value, "destValue");
            return this;
        }

        public Criteria andDestValueNotLike(String value) {
            addCriterion("dest_value not like", value, "destValue");
            return this;
        }

        public Criteria andDestValueIn(List<String> values) {
            addCriterion("dest_value in", values, "destValue");
            return this;
        }

        public Criteria andDestValueNotIn(List<String> values) {
            addCriterion("dest_value not in", values, "destValue");
            return this;
        }

        public Criteria andDestValueBetween(String value1, String value2) {
            addCriterion("dest_value between", value1, value2, "destValue");
            return this;
        }

        public Criteria andDestValueNotBetween(String value1, String value2) {
            addCriterion("dest_value not between", value1, value2, "destValue");
            return this;
        }
    }
}