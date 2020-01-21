package cn.edu.swjtu.demo.Pojo;

import java.util.ArrayList;
import java.util.List;

public class UserPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPermissionExample() {
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

        public Criteria andUserPermissionIdIsNull() {
            addCriterion("user_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdIsNotNull() {
            addCriterion("user_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdEqualTo(Long value) {
            addCriterion("user_permission_id =", value, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdNotEqualTo(Long value) {
            addCriterion("user_permission_id <>", value, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdGreaterThan(Long value) {
            addCriterion("user_permission_id >", value, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_permission_id >=", value, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdLessThan(Long value) {
            addCriterion("user_permission_id <", value, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("user_permission_id <=", value, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdIn(List<Long> values) {
            addCriterion("user_permission_id in", values, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdNotIn(List<Long> values) {
            addCriterion("user_permission_id not in", values, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdBetween(Long value1, Long value2) {
            addCriterion("user_permission_id between", value1, value2, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("user_permission_id not between", value1, value2, "userPermissionId");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameIsNull() {
            addCriterion("user_permission_name is null");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameIsNotNull() {
            addCriterion("user_permission_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameEqualTo(String value) {
            addCriterion("user_permission_name =", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameNotEqualTo(String value) {
            addCriterion("user_permission_name <>", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameGreaterThan(String value) {
            addCriterion("user_permission_name >", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_permission_name >=", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameLessThan(String value) {
            addCriterion("user_permission_name <", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("user_permission_name <=", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameLike(String value) {
            addCriterion("user_permission_name like", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameNotLike(String value) {
            addCriterion("user_permission_name not like", value, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameIn(List<String> values) {
            addCriterion("user_permission_name in", values, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameNotIn(List<String> values) {
            addCriterion("user_permission_name not in", values, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameBetween(String value1, String value2) {
            addCriterion("user_permission_name between", value1, value2, "userPermissionName");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNameNotBetween(String value1, String value2) {
            addCriterion("user_permission_name not between", value1, value2, "userPermissionName");
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