package cn.edu.swjtu.demo.Pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionViewExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andUserCookieidIsNull() {
            addCriterion("user_cookieid is null");
            return (Criteria) this;
        }

        public Criteria andUserCookieidIsNotNull() {
            addCriterion("user_cookieid is not null");
            return (Criteria) this;
        }

        public Criteria andUserCookieidEqualTo(String value) {
            addCriterion("user_cookieid =", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidNotEqualTo(String value) {
            addCriterion("user_cookieid <>", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidGreaterThan(String value) {
            addCriterion("user_cookieid >", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidGreaterThanOrEqualTo(String value) {
            addCriterion("user_cookieid >=", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidLessThan(String value) {
            addCriterion("user_cookieid <", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidLessThanOrEqualTo(String value) {
            addCriterion("user_cookieid <=", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidLike(String value) {
            addCriterion("user_cookieid like", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidNotLike(String value) {
            addCriterion("user_cookieid not like", value, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidIn(List<String> values) {
            addCriterion("user_cookieid in", values, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidNotIn(List<String> values) {
            addCriterion("user_cookieid not in", values, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidBetween(String value1, String value2) {
            addCriterion("user_cookieid between", value1, value2, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andUserCookieidNotBetween(String value1, String value2) {
            addCriterion("user_cookieid not between", value1, value2, "userCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidIsNull() {
            addCriterion("business_cookieid is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidIsNotNull() {
            addCriterion("business_cookieid is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidEqualTo(String value) {
            addCriterion("business_cookieid =", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidNotEqualTo(String value) {
            addCriterion("business_cookieid <>", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidGreaterThan(String value) {
            addCriterion("business_cookieid >", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidGreaterThanOrEqualTo(String value) {
            addCriterion("business_cookieid >=", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidLessThan(String value) {
            addCriterion("business_cookieid <", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidLessThanOrEqualTo(String value) {
            addCriterion("business_cookieid <=", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidLike(String value) {
            addCriterion("business_cookieid like", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidNotLike(String value) {
            addCriterion("business_cookieid not like", value, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidIn(List<String> values) {
            addCriterion("business_cookieid in", values, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidNotIn(List<String> values) {
            addCriterion("business_cookieid not in", values, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidBetween(String value1, String value2) {
            addCriterion("business_cookieid between", value1, value2, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andBusinessCookieidNotBetween(String value1, String value2) {
            addCriterion("business_cookieid not between", value1, value2, "businessCookieid");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNull() {
            addCriterion("transaction_status is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNotNull() {
            addCriterion("transaction_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusEqualTo(Integer value) {
            addCriterion("transaction_status =", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotEqualTo(Integer value) {
            addCriterion("transaction_status <>", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThan(Integer value) {
            addCriterion("transaction_status >", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_status >=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThan(Integer value) {
            addCriterion("transaction_status <", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_status <=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIn(List<Integer> values) {
            addCriterion("transaction_status in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotIn(List<Integer> values) {
            addCriterion("transaction_status not in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusBetween(Integer value1, Integer value2) {
            addCriterion("transaction_status between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_status not between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNull() {
            addCriterion("transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(Integer value) {
            addCriterion("transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(Integer value) {
            addCriterion("transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(Integer value) {
            addCriterion("transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(Integer value) {
            addCriterion("transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<Integer> values) {
            addCriterion("transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<Integer> values) {
            addCriterion("transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(Integer value1, Integer value2) {
            addCriterion("transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_type not between", value1, value2, "transactionType");
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