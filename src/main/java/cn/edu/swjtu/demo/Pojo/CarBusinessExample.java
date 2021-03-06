package cn.edu.swjtu.demo.Pojo;

import java.util.ArrayList;
import java.util.List;

public class CarBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarBusinessExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andHaopingIsNull() {
            addCriterion("haoping is null");
            return (Criteria) this;
        }

        public Criteria andHaopingIsNotNull() {
            addCriterion("haoping is not null");
            return (Criteria) this;
        }

        public Criteria andHaopingEqualTo(Double value) {
            addCriterion("haoping =", value, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingNotEqualTo(Double value) {
            addCriterion("haoping <>", value, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingGreaterThan(Double value) {
            addCriterion("haoping >", value, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingGreaterThanOrEqualTo(Double value) {
            addCriterion("haoping >=", value, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingLessThan(Double value) {
            addCriterion("haoping <", value, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingLessThanOrEqualTo(Double value) {
            addCriterion("haoping <=", value, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingIn(List<Double> values) {
            addCriterion("haoping in", values, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingNotIn(List<Double> values) {
            addCriterion("haoping not in", values, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingBetween(Double value1, Double value2) {
            addCriterion("haoping between", value1, value2, "haoping");
            return (Criteria) this;
        }

        public Criteria andHaopingNotBetween(Double value1, Double value2) {
            addCriterion("haoping not between", value1, value2, "haoping");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNull() {
            addCriterion("dizhi is null");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNotNull() {
            addCriterion("dizhi is not null");
            return (Criteria) this;
        }

        public Criteria andDizhiEqualTo(String value) {
            addCriterion("dizhi =", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotEqualTo(String value) {
            addCriterion("dizhi <>", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThan(String value) {
            addCriterion("dizhi >", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThanOrEqualTo(String value) {
            addCriterion("dizhi >=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThan(String value) {
            addCriterion("dizhi <", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThanOrEqualTo(String value) {
            addCriterion("dizhi <=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLike(String value) {
            addCriterion("dizhi like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotLike(String value) {
            addCriterion("dizhi not like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiIn(List<String> values) {
            addCriterion("dizhi in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotIn(List<String> values) {
            addCriterion("dizhi not in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiBetween(String value1, String value2) {
            addCriterion("dizhi between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotBetween(String value1, String value2) {
            addCriterion("dizhi not between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andHuiyuanIsNull() {
            addCriterion("huiyuan is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanIsNotNull() {
            addCriterion("huiyuan is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanEqualTo(String value) {
            addCriterion("huiyuan =", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotEqualTo(String value) {
            addCriterion("huiyuan <>", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanGreaterThan(String value) {
            addCriterion("huiyuan >", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("huiyuan >=", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanLessThan(String value) {
            addCriterion("huiyuan <", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanLessThanOrEqualTo(String value) {
            addCriterion("huiyuan <=", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanLike(String value) {
            addCriterion("huiyuan like", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotLike(String value) {
            addCriterion("huiyuan not like", value, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanIn(List<String> values) {
            addCriterion("huiyuan in", values, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotIn(List<String> values) {
            addCriterion("huiyuan not in", values, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanBetween(String value1, String value2) {
            addCriterion("huiyuan between", value1, value2, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuanNotBetween(String value1, String value2) {
            addCriterion("huiyuan not between", value1, value2, "huiyuan");
            return (Criteria) this;
        }

        public Criteria andZaishouIsNull() {
            addCriterion("zaishou is null");
            return (Criteria) this;
        }

        public Criteria andZaishouIsNotNull() {
            addCriterion("zaishou is not null");
            return (Criteria) this;
        }

        public Criteria andZaishouEqualTo(Integer value) {
            addCriterion("zaishou =", value, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouNotEqualTo(Integer value) {
            addCriterion("zaishou <>", value, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouGreaterThan(Integer value) {
            addCriterion("zaishou >", value, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouGreaterThanOrEqualTo(Integer value) {
            addCriterion("zaishou >=", value, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouLessThan(Integer value) {
            addCriterion("zaishou <", value, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouLessThanOrEqualTo(Integer value) {
            addCriterion("zaishou <=", value, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouIn(List<Integer> values) {
            addCriterion("zaishou in", values, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouNotIn(List<Integer> values) {
            addCriterion("zaishou not in", values, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouBetween(Integer value1, Integer value2) {
            addCriterion("zaishou between", value1, value2, "zaishou");
            return (Criteria) this;
        }

        public Criteria andZaishouNotBetween(Integer value1, Integer value2) {
            addCriterion("zaishou not between", value1, value2, "zaishou");
            return (Criteria) this;
        }

        public Criteria andYishouIsNull() {
            addCriterion("yishou is null");
            return (Criteria) this;
        }

        public Criteria andYishouIsNotNull() {
            addCriterion("yishou is not null");
            return (Criteria) this;
        }

        public Criteria andYishouEqualTo(Integer value) {
            addCriterion("yishou =", value, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouNotEqualTo(Integer value) {
            addCriterion("yishou <>", value, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouGreaterThan(Integer value) {
            addCriterion("yishou >", value, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouGreaterThanOrEqualTo(Integer value) {
            addCriterion("yishou >=", value, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouLessThan(Integer value) {
            addCriterion("yishou <", value, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouLessThanOrEqualTo(Integer value) {
            addCriterion("yishou <=", value, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouIn(List<Integer> values) {
            addCriterion("yishou in", values, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouNotIn(List<Integer> values) {
            addCriterion("yishou not in", values, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouBetween(Integer value1, Integer value2) {
            addCriterion("yishou between", value1, value2, "yishou");
            return (Criteria) this;
        }

        public Criteria andYishouNotBetween(Integer value1, Integer value2) {
            addCriterion("yishou not between", value1, value2, "yishou");
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