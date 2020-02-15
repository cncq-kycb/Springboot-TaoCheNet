package cn.edu.swjtu.demo.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFavoriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFavoriteExample() {
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

        public Criteria andCookieidIsNull() {
            addCriterion("cookieid is null");
            return (Criteria) this;
        }

        public Criteria andCookieidIsNotNull() {
            addCriterion("cookieid is not null");
            return (Criteria) this;
        }

        public Criteria andCookieidEqualTo(String value) {
            addCriterion("cookieid =", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidNotEqualTo(String value) {
            addCriterion("cookieid <>", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidGreaterThan(String value) {
            addCriterion("cookieid >", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidGreaterThanOrEqualTo(String value) {
            addCriterion("cookieid >=", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidLessThan(String value) {
            addCriterion("cookieid <", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidLessThanOrEqualTo(String value) {
            addCriterion("cookieid <=", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidLike(String value) {
            addCriterion("cookieid like", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidNotLike(String value) {
            addCriterion("cookieid not like", value, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidIn(List<String> values) {
            addCriterion("cookieid in", values, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidNotIn(List<String> values) {
            addCriterion("cookieid not in", values, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidBetween(String value1, String value2) {
            addCriterion("cookieid between", value1, value2, "cookieid");
            return (Criteria) this;
        }

        public Criteria andCookieidNotBetween(String value1, String value2) {
            addCriterion("cookieid not between", value1, value2, "cookieid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdIsNull() {
            addCriterion("favorite_id is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdIsNotNull() {
            addCriterion("favorite_id is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdEqualTo(Long value) {
            addCriterion("favorite_id =", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdNotEqualTo(Long value) {
            addCriterion("favorite_id <>", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdGreaterThan(Long value) {
            addCriterion("favorite_id >", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("favorite_id >=", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdLessThan(Long value) {
            addCriterion("favorite_id <", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdLessThanOrEqualTo(Long value) {
            addCriterion("favorite_id <=", value, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdIn(List<Long> values) {
            addCriterion("favorite_id in", values, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdNotIn(List<Long> values) {
            addCriterion("favorite_id not in", values, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdBetween(Long value1, Long value2) {
            addCriterion("favorite_id between", value1, value2, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteIdNotBetween(Long value1, Long value2) {
            addCriterion("favorite_id not between", value1, value2, "favoriteId");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeIsNull() {
            addCriterion("favorite_time is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeIsNotNull() {
            addCriterion("favorite_time is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeEqualTo(Date value) {
            addCriterion("favorite_time =", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeNotEqualTo(Date value) {
            addCriterion("favorite_time <>", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeGreaterThan(Date value) {
            addCriterion("favorite_time >", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("favorite_time >=", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeLessThan(Date value) {
            addCriterion("favorite_time <", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeLessThanOrEqualTo(Date value) {
            addCriterion("favorite_time <=", value, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeIn(List<Date> values) {
            addCriterion("favorite_time in", values, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeNotIn(List<Date> values) {
            addCriterion("favorite_time not in", values, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeBetween(Date value1, Date value2) {
            addCriterion("favorite_time between", value1, value2, "favoriteTime");
            return (Criteria) this;
        }

        public Criteria andFavoriteTimeNotBetween(Date value1, Date value2) {
            addCriterion("favorite_time not between", value1, value2, "favoriteTime");
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