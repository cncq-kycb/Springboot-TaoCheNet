package cn.edu.swjtu.demo.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
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

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLichengIsNull() {
            addCriterion("licheng is null");
            return (Criteria) this;
        }

        public Criteria andLichengIsNotNull() {
            addCriterion("licheng is not null");
            return (Criteria) this;
        }

        public Criteria andLichengEqualTo(Integer value) {
            addCriterion("licheng =", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotEqualTo(Integer value) {
            addCriterion("licheng <>", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengGreaterThan(Integer value) {
            addCriterion("licheng >", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengGreaterThanOrEqualTo(Integer value) {
            addCriterion("licheng >=", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengLessThan(Integer value) {
            addCriterion("licheng <", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengLessThanOrEqualTo(Integer value) {
            addCriterion("licheng <=", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengIn(List<Integer> values) {
            addCriterion("licheng in", values, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotIn(List<Integer> values) {
            addCriterion("licheng not in", values, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengBetween(Integer value1, Integer value2) {
            addCriterion("licheng between", value1, value2, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotBetween(Integer value1, Integer value2) {
            addCriterion("licheng not between", value1, value2, "licheng");
            return (Criteria) this;
        }

        public Criteria andShangpaiIsNull() {
            addCriterion("shangpai is null");
            return (Criteria) this;
        }

        public Criteria andShangpaiIsNotNull() {
            addCriterion("shangpai is not null");
            return (Criteria) this;
        }

        public Criteria andShangpaiEqualTo(Date value) {
            addCriterionForJDBCDate("shangpai =", value, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiNotEqualTo(Date value) {
            addCriterionForJDBCDate("shangpai <>", value, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiGreaterThan(Date value) {
            addCriterionForJDBCDate("shangpai >", value, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangpai >=", value, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiLessThan(Date value) {
            addCriterionForJDBCDate("shangpai <", value, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangpai <=", value, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiIn(List<Date> values) {
            addCriterionForJDBCDate("shangpai in", values, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiNotIn(List<Date> values) {
            addCriterionForJDBCDate("shangpai not in", values, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangpai between", value1, value2, "shangpai");
            return (Criteria) this;
        }

        public Criteria andShangpaiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangpai not between", value1, value2, "shangpai");
            return (Criteria) this;
        }

        public Criteria andPailiangIsNull() {
            addCriterion("pailiang is null");
            return (Criteria) this;
        }

        public Criteria andPailiangIsNotNull() {
            addCriterion("pailiang is not null");
            return (Criteria) this;
        }

        public Criteria andPailiangEqualTo(String value) {
            addCriterion("pailiang =", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotEqualTo(String value) {
            addCriterion("pailiang <>", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangGreaterThan(String value) {
            addCriterion("pailiang >", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangGreaterThanOrEqualTo(String value) {
            addCriterion("pailiang >=", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangLessThan(String value) {
            addCriterion("pailiang <", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangLessThanOrEqualTo(String value) {
            addCriterion("pailiang <=", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangLike(String value) {
            addCriterion("pailiang like", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotLike(String value) {
            addCriterion("pailiang not like", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangIn(List<String> values) {
            addCriterion("pailiang in", values, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotIn(List<String> values) {
            addCriterion("pailiang not in", values, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangBetween(String value1, String value2) {
            addCriterion("pailiang between", value1, value2, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotBetween(String value1, String value2) {
            addCriterion("pailiang not between", value1, value2, "pailiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIsNull() {
            addCriterion("biansuxiang is null");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIsNotNull() {
            addCriterion("biansuxiang is not null");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangEqualTo(String value) {
            addCriterion("biansuxiang =", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotEqualTo(String value) {
            addCriterion("biansuxiang <>", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangGreaterThan(String value) {
            addCriterion("biansuxiang >", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangGreaterThanOrEqualTo(String value) {
            addCriterion("biansuxiang >=", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLessThan(String value) {
            addCriterion("biansuxiang <", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLessThanOrEqualTo(String value) {
            addCriterion("biansuxiang <=", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLike(String value) {
            addCriterion("biansuxiang like", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotLike(String value) {
            addCriterion("biansuxiang not like", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIn(List<String> values) {
            addCriterion("biansuxiang in", values, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotIn(List<String> values) {
            addCriterion("biansuxiang not in", values, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangBetween(String value1, String value2) {
            addCriterion("biansuxiang between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotBetween(String value1, String value2) {
            addCriterion("biansuxiang not between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andPaifangIsNull() {
            addCriterion("paifang is null");
            return (Criteria) this;
        }

        public Criteria andPaifangIsNotNull() {
            addCriterion("paifang is not null");
            return (Criteria) this;
        }

        public Criteria andPaifangEqualTo(String value) {
            addCriterion("paifang =", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangNotEqualTo(String value) {
            addCriterion("paifang <>", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangGreaterThan(String value) {
            addCriterion("paifang >", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangGreaterThanOrEqualTo(String value) {
            addCriterion("paifang >=", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangLessThan(String value) {
            addCriterion("paifang <", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangLessThanOrEqualTo(String value) {
            addCriterion("paifang <=", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangLike(String value) {
            addCriterion("paifang like", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangNotLike(String value) {
            addCriterion("paifang not like", value, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangIn(List<String> values) {
            addCriterion("paifang in", values, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangNotIn(List<String> values) {
            addCriterion("paifang not in", values, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangBetween(String value1, String value2) {
            addCriterion("paifang between", value1, value2, "paifang");
            return (Criteria) this;
        }

        public Criteria andPaifangNotBetween(String value1, String value2) {
            addCriterion("paifang not between", value1, value2, "paifang");
            return (Criteria) this;
        }

        public Criteria andXiangzhiIsNull() {
            addCriterion("xiangzhi is null");
            return (Criteria) this;
        }

        public Criteria andXiangzhiIsNotNull() {
            addCriterion("xiangzhi is not null");
            return (Criteria) this;
        }

        public Criteria andXiangzhiEqualTo(String value) {
            addCriterion("xiangzhi =", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiNotEqualTo(String value) {
            addCriterion("xiangzhi <>", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiGreaterThan(String value) {
            addCriterion("xiangzhi >", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("xiangzhi >=", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiLessThan(String value) {
            addCriterion("xiangzhi <", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiLessThanOrEqualTo(String value) {
            addCriterion("xiangzhi <=", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiLike(String value) {
            addCriterion("xiangzhi like", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiNotLike(String value) {
            addCriterion("xiangzhi not like", value, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiIn(List<String> values) {
            addCriterion("xiangzhi in", values, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiNotIn(List<String> values) {
            addCriterion("xiangzhi not in", values, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiBetween(String value1, String value2) {
            addCriterion("xiangzhi between", value1, value2, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andXiangzhiNotBetween(String value1, String value2) {
            addCriterion("xiangzhi not between", value1, value2, "xiangzhi");
            return (Criteria) this;
        }

        public Criteria andBaiyangIsNull() {
            addCriterion("baiyang is null");
            return (Criteria) this;
        }

        public Criteria andBaiyangIsNotNull() {
            addCriterion("baiyang is not null");
            return (Criteria) this;
        }

        public Criteria andBaiyangEqualTo(String value) {
            addCriterion("baiyang =", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangNotEqualTo(String value) {
            addCriterion("baiyang <>", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangGreaterThan(String value) {
            addCriterion("baiyang >", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangGreaterThanOrEqualTo(String value) {
            addCriterion("baiyang >=", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangLessThan(String value) {
            addCriterion("baiyang <", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangLessThanOrEqualTo(String value) {
            addCriterion("baiyang <=", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangLike(String value) {
            addCriterion("baiyang like", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangNotLike(String value) {
            addCriterion("baiyang not like", value, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangIn(List<String> values) {
            addCriterion("baiyang in", values, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangNotIn(List<String> values) {
            addCriterion("baiyang not in", values, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangBetween(String value1, String value2) {
            addCriterion("baiyang between", value1, value2, "baiyang");
            return (Criteria) this;
        }

        public Criteria andBaiyangNotBetween(String value1, String value2) {
            addCriterion("baiyang not between", value1, value2, "baiyang");
            return (Criteria) this;
        }

        public Criteria andNianjianIsNull() {
            addCriterion("nianjian is null");
            return (Criteria) this;
        }

        public Criteria andNianjianIsNotNull() {
            addCriterion("nianjian is not null");
            return (Criteria) this;
        }

        public Criteria andNianjianEqualTo(Date value) {
            addCriterionForJDBCDate("nianjian =", value, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianNotEqualTo(Date value) {
            addCriterionForJDBCDate("nianjian <>", value, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianGreaterThan(Date value) {
            addCriterionForJDBCDate("nianjian >", value, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nianjian >=", value, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianLessThan(Date value) {
            addCriterionForJDBCDate("nianjian <", value, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nianjian <=", value, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianIn(List<Date> values) {
            addCriterionForJDBCDate("nianjian in", values, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianNotIn(List<Date> values) {
            addCriterionForJDBCDate("nianjian not in", values, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nianjian between", value1, value2, "nianjian");
            return (Criteria) this;
        }

        public Criteria andNianjianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nianjian not between", value1, value2, "nianjian");
            return (Criteria) this;
        }

        public Criteria andShangyexianIsNull() {
            addCriterion("shangyexian is null");
            return (Criteria) this;
        }

        public Criteria andShangyexianIsNotNull() {
            addCriterion("shangyexian is not null");
            return (Criteria) this;
        }

        public Criteria andShangyexianEqualTo(Date value) {
            addCriterionForJDBCDate("shangyexian =", value, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianNotEqualTo(Date value) {
            addCriterionForJDBCDate("shangyexian <>", value, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianGreaterThan(Date value) {
            addCriterionForJDBCDate("shangyexian >", value, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangyexian >=", value, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianLessThan(Date value) {
            addCriterionForJDBCDate("shangyexian <", value, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shangyexian <=", value, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianIn(List<Date> values) {
            addCriterionForJDBCDate("shangyexian in", values, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianNotIn(List<Date> values) {
            addCriterionForJDBCDate("shangyexian not in", values, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangyexian between", value1, value2, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andShangyexianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shangyexian not between", value1, value2, "shangyexian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianIsNull() {
            addCriterion("jiaoqiangxian is null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianIsNotNull() {
            addCriterion("jiaoqiangxian is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangxian =", value, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianNotEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangxian <>", value, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianGreaterThan(Date value) {
            addCriterionForJDBCDate("jiaoqiangxian >", value, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangxian >=", value, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianLessThan(Date value) {
            addCriterionForJDBCDate("jiaoqiangxian <", value, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiaoqiangxian <=", value, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianIn(List<Date> values) {
            addCriterionForJDBCDate("jiaoqiangxian in", values, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianNotIn(List<Date> values) {
            addCriterionForJDBCDate("jiaoqiangxian not in", values, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiaoqiangxian between", value1, value2, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andJiaoqiangxianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiaoqiangxian not between", value1, value2, "jiaoqiangxian");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andDangweiIsNull() {
            addCriterion("dangwei is null");
            return (Criteria) this;
        }

        public Criteria andDangweiIsNotNull() {
            addCriterion("dangwei is not null");
            return (Criteria) this;
        }

        public Criteria andDangweiEqualTo(String value) {
            addCriterion("dangwei =", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiNotEqualTo(String value) {
            addCriterion("dangwei <>", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiGreaterThan(String value) {
            addCriterion("dangwei >", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiGreaterThanOrEqualTo(String value) {
            addCriterion("dangwei >=", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiLessThan(String value) {
            addCriterion("dangwei <", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiLessThanOrEqualTo(String value) {
            addCriterion("dangwei <=", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiLike(String value) {
            addCriterion("dangwei like", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiNotLike(String value) {
            addCriterion("dangwei not like", value, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiIn(List<String> values) {
            addCriterion("dangwei in", values, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiNotIn(List<String> values) {
            addCriterion("dangwei not in", values, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiBetween(String value1, String value2) {
            addCriterion("dangwei between", value1, value2, "dangwei");
            return (Criteria) this;
        }

        public Criteria andDangweiNotBetween(String value1, String value2) {
            addCriterion("dangwei not between", value1, value2, "dangwei");
            return (Criteria) this;
        }

        public Criteria andGangshuIsNull() {
            addCriterion("gangshu is null");
            return (Criteria) this;
        }

        public Criteria andGangshuIsNotNull() {
            addCriterion("gangshu is not null");
            return (Criteria) this;
        }

        public Criteria andGangshuEqualTo(String value) {
            addCriterion("gangshu =", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuNotEqualTo(String value) {
            addCriterion("gangshu <>", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuGreaterThan(String value) {
            addCriterion("gangshu >", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuGreaterThanOrEqualTo(String value) {
            addCriterion("gangshu >=", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuLessThan(String value) {
            addCriterion("gangshu <", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuLessThanOrEqualTo(String value) {
            addCriterion("gangshu <=", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuLike(String value) {
            addCriterion("gangshu like", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuNotLike(String value) {
            addCriterion("gangshu not like", value, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuIn(List<String> values) {
            addCriterion("gangshu in", values, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuNotIn(List<String> values) {
            addCriterion("gangshu not in", values, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuBetween(String value1, String value2) {
            addCriterion("gangshu between", value1, value2, "gangshu");
            return (Criteria) this;
        }

        public Criteria andGangshuNotBetween(String value1, String value2) {
            addCriterion("gangshu not between", value1, value2, "gangshu");
            return (Criteria) this;
        }

        public Criteria andQudongIsNull() {
            addCriterion("qudong is null");
            return (Criteria) this;
        }

        public Criteria andQudongIsNotNull() {
            addCriterion("qudong is not null");
            return (Criteria) this;
        }

        public Criteria andQudongEqualTo(String value) {
            addCriterion("qudong =", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongNotEqualTo(String value) {
            addCriterion("qudong <>", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongGreaterThan(String value) {
            addCriterion("qudong >", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongGreaterThanOrEqualTo(String value) {
            addCriterion("qudong >=", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongLessThan(String value) {
            addCriterion("qudong <", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongLessThanOrEqualTo(String value) {
            addCriterion("qudong <=", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongLike(String value) {
            addCriterion("qudong like", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongNotLike(String value) {
            addCriterion("qudong not like", value, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongIn(List<String> values) {
            addCriterion("qudong in", values, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongNotIn(List<String> values) {
            addCriterion("qudong not in", values, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongBetween(String value1, String value2) {
            addCriterion("qudong between", value1, value2, "qudong");
            return (Criteria) this;
        }

        public Criteria andQudongNotBetween(String value1, String value2) {
            addCriterion("qudong not between", value1, value2, "qudong");
            return (Criteria) this;
        }

        public Criteria andGonglvIsNull() {
            addCriterion("gonglv is null");
            return (Criteria) this;
        }

        public Criteria andGonglvIsNotNull() {
            addCriterion("gonglv is not null");
            return (Criteria) this;
        }

        public Criteria andGonglvEqualTo(String value) {
            addCriterion("gonglv =", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvNotEqualTo(String value) {
            addCriterion("gonglv <>", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvGreaterThan(String value) {
            addCriterion("gonglv >", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvGreaterThanOrEqualTo(String value) {
            addCriterion("gonglv >=", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvLessThan(String value) {
            addCriterion("gonglv <", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvLessThanOrEqualTo(String value) {
            addCriterion("gonglv <=", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvLike(String value) {
            addCriterion("gonglv like", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvNotLike(String value) {
            addCriterion("gonglv not like", value, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvIn(List<String> values) {
            addCriterion("gonglv in", values, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvNotIn(List<String> values) {
            addCriterion("gonglv not in", values, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvBetween(String value1, String value2) {
            addCriterion("gonglv between", value1, value2, "gonglv");
            return (Criteria) this;
        }

        public Criteria andGonglvNotBetween(String value1, String value2) {
            addCriterion("gonglv not between", value1, value2, "gonglv");
            return (Criteria) this;
        }

        public Criteria andYouhaoIsNull() {
            addCriterion("youhao is null");
            return (Criteria) this;
        }

        public Criteria andYouhaoIsNotNull() {
            addCriterion("youhao is not null");
            return (Criteria) this;
        }

        public Criteria andYouhaoEqualTo(String value) {
            addCriterion("youhao =", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotEqualTo(String value) {
            addCriterion("youhao <>", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoGreaterThan(String value) {
            addCriterion("youhao >", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoGreaterThanOrEqualTo(String value) {
            addCriterion("youhao >=", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoLessThan(String value) {
            addCriterion("youhao <", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoLessThanOrEqualTo(String value) {
            addCriterion("youhao <=", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoLike(String value) {
            addCriterion("youhao like", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotLike(String value) {
            addCriterion("youhao not like", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoIn(List<String> values) {
            addCriterion("youhao in", values, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotIn(List<String> values) {
            addCriterion("youhao not in", values, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoBetween(String value1, String value2) {
            addCriterion("youhao between", value1, value2, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotBetween(String value1, String value2) {
            addCriterion("youhao not between", value1, value2, "youhao");
            return (Criteria) this;
        }

        public Criteria andJingqiIsNull() {
            addCriterion("jingqi is null");
            return (Criteria) this;
        }

        public Criteria andJingqiIsNotNull() {
            addCriterion("jingqi is not null");
            return (Criteria) this;
        }

        public Criteria andJingqiEqualTo(String value) {
            addCriterion("jingqi =", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiNotEqualTo(String value) {
            addCriterion("jingqi <>", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiGreaterThan(String value) {
            addCriterion("jingqi >", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiGreaterThanOrEqualTo(String value) {
            addCriterion("jingqi >=", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiLessThan(String value) {
            addCriterion("jingqi <", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiLessThanOrEqualTo(String value) {
            addCriterion("jingqi <=", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiLike(String value) {
            addCriterion("jingqi like", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiNotLike(String value) {
            addCriterion("jingqi not like", value, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiIn(List<String> values) {
            addCriterion("jingqi in", values, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiNotIn(List<String> values) {
            addCriterion("jingqi not in", values, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiBetween(String value1, String value2) {
            addCriterion("jingqi between", value1, value2, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJingqiNotBetween(String value1, String value2) {
            addCriterion("jingqi not between", value1, value2, "jingqi");
            return (Criteria) this;
        }

        public Criteria andJiegouIsNull() {
            addCriterion("jiegou is null");
            return (Criteria) this;
        }

        public Criteria andJiegouIsNotNull() {
            addCriterion("jiegou is not null");
            return (Criteria) this;
        }

        public Criteria andJiegouEqualTo(String value) {
            addCriterion("jiegou =", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotEqualTo(String value) {
            addCriterion("jiegou <>", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouGreaterThan(String value) {
            addCriterion("jiegou >", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouGreaterThanOrEqualTo(String value) {
            addCriterion("jiegou >=", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouLessThan(String value) {
            addCriterion("jiegou <", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouLessThanOrEqualTo(String value) {
            addCriterion("jiegou <=", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouLike(String value) {
            addCriterion("jiegou like", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotLike(String value) {
            addCriterion("jiegou not like", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouIn(List<String> values) {
            addCriterion("jiegou in", values, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotIn(List<String> values) {
            addCriterion("jiegou not in", values, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouBetween(String value1, String value2) {
            addCriterion("jiegou between", value1, value2, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotBetween(String value1, String value2) {
            addCriterion("jiegou not between", value1, value2, "jiegou");
            return (Criteria) this;
        }

        public Criteria andLiangdianIsNull() {
            addCriterion("liangdian is null");
            return (Criteria) this;
        }

        public Criteria andLiangdianIsNotNull() {
            addCriterion("liangdian is not null");
            return (Criteria) this;
        }

        public Criteria andLiangdianEqualTo(String value) {
            addCriterion("liangdian =", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianNotEqualTo(String value) {
            addCriterion("liangdian <>", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianGreaterThan(String value) {
            addCriterion("liangdian >", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianGreaterThanOrEqualTo(String value) {
            addCriterion("liangdian >=", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianLessThan(String value) {
            addCriterion("liangdian <", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianLessThanOrEqualTo(String value) {
            addCriterion("liangdian <=", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianLike(String value) {
            addCriterion("liangdian like", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianNotLike(String value) {
            addCriterion("liangdian not like", value, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianIn(List<String> values) {
            addCriterion("liangdian in", values, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianNotIn(List<String> values) {
            addCriterion("liangdian not in", values, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianBetween(String value1, String value2) {
            addCriterion("liangdian between", value1, value2, "liangdian");
            return (Criteria) this;
        }

        public Criteria andLiangdianNotBetween(String value1, String value2) {
            addCriterion("liangdian not between", value1, value2, "liangdian");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(Integer value) {
            addCriterion("classify_id =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(Integer value) {
            addCriterion("classify_id <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(Integer value) {
            addCriterion("classify_id >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_id >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(Integer value) {
            addCriterion("classify_id <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("classify_id <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<Integer> values) {
            addCriterion("classify_id in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<Integer> values) {
            addCriterion("classify_id not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("classify_id between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_id not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Integer value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Integer value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Integer value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Integer value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Integer> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Integer> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Integer value1, Integer value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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