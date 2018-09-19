package org.ldxx.bean;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(String value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(String value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(String value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(String value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(String value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLike(String value) {
            addCriterion("e_id like", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotLike(String value) {
            addCriterion("e_id not like", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<String> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<String> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(String value1, String value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(String value1, String value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEManIsNull() {
            addCriterion("e_man is null");
            return (Criteria) this;
        }

        public Criteria andEManIsNotNull() {
            addCriterion("e_man is not null");
            return (Criteria) this;
        }

        public Criteria andEManEqualTo(String value) {
            addCriterion("e_man =", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManNotEqualTo(String value) {
            addCriterion("e_man <>", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManGreaterThan(String value) {
            addCriterion("e_man >", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManGreaterThanOrEqualTo(String value) {
            addCriterion("e_man >=", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManLessThan(String value) {
            addCriterion("e_man <", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManLessThanOrEqualTo(String value) {
            addCriterion("e_man <=", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManLike(String value) {
            addCriterion("e_man like", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManNotLike(String value) {
            addCriterion("e_man not like", value, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManIn(List<String> values) {
            addCriterion("e_man in", values, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManNotIn(List<String> values) {
            addCriterion("e_man not in", values, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManBetween(String value1, String value2) {
            addCriterion("e_man between", value1, value2, "eMan");
            return (Criteria) this;
        }

        public Criteria andEManNotBetween(String value1, String value2) {
            addCriterion("e_man not between", value1, value2, "eMan");
            return (Criteria) this;
        }

        public Criteria andETelIsNull() {
            addCriterion("e_tel is null");
            return (Criteria) this;
        }

        public Criteria andETelIsNotNull() {
            addCriterion("e_tel is not null");
            return (Criteria) this;
        }

        public Criteria andETelEqualTo(String value) {
            addCriterion("e_tel =", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotEqualTo(String value) {
            addCriterion("e_tel <>", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelGreaterThan(String value) {
            addCriterion("e_tel >", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelGreaterThanOrEqualTo(String value) {
            addCriterion("e_tel >=", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelLessThan(String value) {
            addCriterion("e_tel <", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelLessThanOrEqualTo(String value) {
            addCriterion("e_tel <=", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelLike(String value) {
            addCriterion("e_tel like", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotLike(String value) {
            addCriterion("e_tel not like", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelIn(List<String> values) {
            addCriterion("e_tel in", values, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotIn(List<String> values) {
            addCriterion("e_tel not in", values, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelBetween(String value1, String value2) {
            addCriterion("e_tel between", value1, value2, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotBetween(String value1, String value2) {
            addCriterion("e_tel not between", value1, value2, "eTel");
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