package com.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddresscodeIsNull() {
            addCriterion("addressCode is null");
            return (Criteria) this;
        }

        public Criteria andAddresscodeIsNotNull() {
            addCriterion("addressCode is not null");
            return (Criteria) this;
        }

        public Criteria andAddresscodeEqualTo(String value) {
            addCriterion("addressCode =", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotEqualTo(String value) {
            addCriterion("addressCode <>", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeGreaterThan(String value) {
            addCriterion("addressCode >", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeGreaterThanOrEqualTo(String value) {
            addCriterion("addressCode >=", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeLessThan(String value) {
            addCriterion("addressCode <", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeLessThanOrEqualTo(String value) {
            addCriterion("addressCode <=", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeLike(String value) {
            addCriterion("addressCode like", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotLike(String value) {
            addCriterion("addressCode not like", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeIn(List<String> values) {
            addCriterion("addressCode in", values, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotIn(List<String> values) {
            addCriterion("addressCode not in", values, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeBetween(String value1, String value2) {
            addCriterion("addressCode between", value1, value2, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotBetween(String value1, String value2) {
            addCriterion("addressCode not between", value1, value2, "addresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeIsNull() {
            addCriterion("parentAddressCode is null");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeIsNotNull() {
            addCriterion("parentAddressCode is not null");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeEqualTo(String value) {
            addCriterion("parentAddressCode =", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeNotEqualTo(String value) {
            addCriterion("parentAddressCode <>", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeGreaterThan(String value) {
            addCriterion("parentAddressCode >", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeGreaterThanOrEqualTo(String value) {
            addCriterion("parentAddressCode >=", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeLessThan(String value) {
            addCriterion("parentAddressCode <", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeLessThanOrEqualTo(String value) {
            addCriterion("parentAddressCode <=", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeLike(String value) {
            addCriterion("parentAddressCode like", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeNotLike(String value) {
            addCriterion("parentAddressCode not like", value, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeIn(List<String> values) {
            addCriterion("parentAddressCode in", values, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeNotIn(List<String> values) {
            addCriterion("parentAddressCode not in", values, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeBetween(String value1, String value2) {
            addCriterion("parentAddressCode between", value1, value2, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andParentaddresscodeNotBetween(String value1, String value2) {
            addCriterion("parentAddressCode not between", value1, value2, "parentaddresscode");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIsNull() {
            addCriterion("roomTypeId is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIsNotNull() {
            addCriterion("roomTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidEqualTo(String value) {
            addCriterion("roomTypeId =", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotEqualTo(String value) {
            addCriterion("roomTypeId <>", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidGreaterThan(String value) {
            addCriterion("roomTypeId >", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("roomTypeId >=", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLessThan(String value) {
            addCriterion("roomTypeId <", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLessThanOrEqualTo(String value) {
            addCriterion("roomTypeId <=", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLike(String value) {
            addCriterion("roomTypeId like", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotLike(String value) {
            addCriterion("roomTypeId not like", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIn(List<String> values) {
            addCriterion("roomTypeId in", values, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotIn(List<String> values) {
            addCriterion("roomTypeId not in", values, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidBetween(String value1, String value2) {
            addCriterion("roomTypeId between", value1, value2, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotBetween(String value1, String value2) {
            addCriterion("roomTypeId not between", value1, value2, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andAddressnameIsNull() {
            addCriterion("addressName is null");
            return (Criteria) this;
        }

        public Criteria andAddressnameIsNotNull() {
            addCriterion("addressName is not null");
            return (Criteria) this;
        }

        public Criteria andAddressnameEqualTo(String value) {
            addCriterion("addressName =", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameNotEqualTo(String value) {
            addCriterion("addressName <>", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameGreaterThan(String value) {
            addCriterion("addressName >", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameGreaterThanOrEqualTo(String value) {
            addCriterion("addressName >=", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameLessThan(String value) {
            addCriterion("addressName <", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameLessThanOrEqualTo(String value) {
            addCriterion("addressName <=", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameLike(String value) {
            addCriterion("addressName like", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameNotLike(String value) {
            addCriterion("addressName not like", value, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameIn(List<String> values) {
            addCriterion("addressName in", values, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameNotIn(List<String> values) {
            addCriterion("addressName not in", values, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameBetween(String value1, String value2) {
            addCriterion("addressName between", value1, value2, "addressname");
            return (Criteria) this;
        }

        public Criteria andAddressnameNotBetween(String value1, String value2) {
            addCriterion("addressName not between", value1, value2, "addressname");
            return (Criteria) this;
        }

        public Criteria andBennumIsNull() {
            addCriterion("benNum is null");
            return (Criteria) this;
        }

        public Criteria andBennumIsNotNull() {
            addCriterion("benNum is not null");
            return (Criteria) this;
        }

        public Criteria andBennumEqualTo(Integer value) {
            addCriterion("benNum =", value, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumNotEqualTo(Integer value) {
            addCriterion("benNum <>", value, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumGreaterThan(Integer value) {
            addCriterion("benNum >", value, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumGreaterThanOrEqualTo(Integer value) {
            addCriterion("benNum >=", value, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumLessThan(Integer value) {
            addCriterion("benNum <", value, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumLessThanOrEqualTo(Integer value) {
            addCriterion("benNum <=", value, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumIn(List<Integer> values) {
            addCriterion("benNum in", values, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumNotIn(List<Integer> values) {
            addCriterion("benNum not in", values, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumBetween(Integer value1, Integer value2) {
            addCriterion("benNum between", value1, value2, "bennum");
            return (Criteria) this;
        }

        public Criteria andBennumNotBetween(Integer value1, Integer value2) {
            addCriterion("benNum not between", value1, value2, "bennum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}