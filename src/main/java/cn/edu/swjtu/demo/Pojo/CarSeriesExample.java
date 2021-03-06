package cn.edu.swjtu.demo.Pojo;

import java.util.ArrayList;
import java.util.List;

public class CarSeriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarSeriesExample() {
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

        public Criteria andCxidIsNull() {
            addCriterion("cxid is null");
            return (Criteria) this;
        }

        public Criteria andCxidIsNotNull() {
            addCriterion("cxid is not null");
            return (Criteria) this;
        }

        public Criteria andCxidEqualTo(Integer value) {
            addCriterion("cxid =", value, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidNotEqualTo(Integer value) {
            addCriterion("cxid <>", value, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidGreaterThan(Integer value) {
            addCriterion("cxid >", value, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cxid >=", value, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidLessThan(Integer value) {
            addCriterion("cxid <", value, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidLessThanOrEqualTo(Integer value) {
            addCriterion("cxid <=", value, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidIn(List<Integer> values) {
            addCriterion("cxid in", values, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidNotIn(List<Integer> values) {
            addCriterion("cxid not in", values, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidBetween(Integer value1, Integer value2) {
            addCriterion("cxid between", value1, value2, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxidNotBetween(Integer value1, Integer value2) {
            addCriterion("cxid not between", value1, value2, "cxid");
            return (Criteria) this;
        }

        public Criteria andCxnameIsNull() {
            addCriterion("cxname is null");
            return (Criteria) this;
        }

        public Criteria andCxnameIsNotNull() {
            addCriterion("cxname is not null");
            return (Criteria) this;
        }

        public Criteria andCxnameEqualTo(String value) {
            addCriterion("cxname =", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameNotEqualTo(String value) {
            addCriterion("cxname <>", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameGreaterThan(String value) {
            addCriterion("cxname >", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameGreaterThanOrEqualTo(String value) {
            addCriterion("cxname >=", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameLessThan(String value) {
            addCriterion("cxname <", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameLessThanOrEqualTo(String value) {
            addCriterion("cxname <=", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameLike(String value) {
            addCriterion("cxname like", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameNotLike(String value) {
            addCriterion("cxname not like", value, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameIn(List<String> values) {
            addCriterion("cxname in", values, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameNotIn(List<String> values) {
            addCriterion("cxname not in", values, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameBetween(String value1, String value2) {
            addCriterion("cxname between", value1, value2, "cxname");
            return (Criteria) this;
        }

        public Criteria andCxnameNotBetween(String value1, String value2) {
            addCriterion("cxname not between", value1, value2, "cxname");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNull() {
            addCriterion("sort_num is null");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNotNull() {
            addCriterion("sort_num is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumEqualTo(Integer value) {
            addCriterion("sort_num =", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotEqualTo(Integer value) {
            addCriterion("sort_num <>", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThan(Integer value) {
            addCriterion("sort_num >", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_num >=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThan(Integer value) {
            addCriterion("sort_num <", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThanOrEqualTo(Integer value) {
            addCriterion("sort_num <=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumIn(List<Integer> values) {
            addCriterion("sort_num in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotIn(List<Integer> values) {
            addCriterion("sort_num not in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumBetween(Integer value1, Integer value2) {
            addCriterion("sort_num between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_num not between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
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