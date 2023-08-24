package com.herb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PriceRankingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceRankingExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andNewpriceIsNull() {
            addCriterion("newprice is null");
            return (Criteria) this;
        }

        public Criteria andNewpriceIsNotNull() {
            addCriterion("newprice is not null");
            return (Criteria) this;
        }

        public Criteria andNewpriceEqualTo(BigDecimal value) {
            addCriterion("newprice =", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotEqualTo(BigDecimal value) {
            addCriterion("newprice <>", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceGreaterThan(BigDecimal value) {
            addCriterion("newprice >", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("newprice >=", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLessThan(BigDecimal value) {
            addCriterion("newprice <", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("newprice <=", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceIn(List<BigDecimal> values) {
            addCriterion("newprice in", values, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotIn(List<BigDecimal> values) {
            addCriterion("newprice not in", values, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("newprice between", value1, value2, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("newprice not between", value1, value2, "newprice");
            return (Criteria) this;
        }

        public Criteria andWpricefloatIsNull() {
            addCriterion("wpricefloat is null");
            return (Criteria) this;
        }

        public Criteria andWpricefloatIsNotNull() {
            addCriterion("wpricefloat is not null");
            return (Criteria) this;
        }

        public Criteria andWpricefloatEqualTo(BigDecimal value) {
            addCriterion("wpricefloat =", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotEqualTo(BigDecimal value) {
            addCriterion("wpricefloat <>", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatGreaterThan(BigDecimal value) {
            addCriterion("wpricefloat >", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wpricefloat >=", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatLessThan(BigDecimal value) {
            addCriterion("wpricefloat <", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wpricefloat <=", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatIn(List<BigDecimal> values) {
            addCriterion("wpricefloat in", values, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotIn(List<BigDecimal> values) {
            addCriterion("wpricefloat not in", values, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wpricefloat between", value1, value2, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wpricefloat not between", value1, value2, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatIsNull() {
            addCriterion("ypricefloat is null");
            return (Criteria) this;
        }

        public Criteria andYpricefloatIsNotNull() {
            addCriterion("ypricefloat is not null");
            return (Criteria) this;
        }

        public Criteria andYpricefloatEqualTo(BigDecimal value) {
            addCriterion("ypricefloat =", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotEqualTo(BigDecimal value) {
            addCriterion("ypricefloat <>", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatGreaterThan(BigDecimal value) {
            addCriterion("ypricefloat >", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ypricefloat >=", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatLessThan(BigDecimal value) {
            addCriterion("ypricefloat <", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ypricefloat <=", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatIn(List<BigDecimal> values) {
            addCriterion("ypricefloat in", values, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotIn(List<BigDecimal> values) {
            addCriterion("ypricefloat not in", values, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ypricefloat between", value1, value2, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ypricefloat not between", value1, value2, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatIsNull() {
            addCriterion("jpricefloat is null");
            return (Criteria) this;
        }

        public Criteria andJpricefloatIsNotNull() {
            addCriterion("jpricefloat is not null");
            return (Criteria) this;
        }

        public Criteria andJpricefloatEqualTo(BigDecimal value) {
            addCriterion("jpricefloat =", value, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatNotEqualTo(BigDecimal value) {
            addCriterion("jpricefloat <>", value, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatGreaterThan(BigDecimal value) {
            addCriterion("jpricefloat >", value, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jpricefloat >=", value, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatLessThan(BigDecimal value) {
            addCriterion("jpricefloat <", value, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jpricefloat <=", value, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatIn(List<BigDecimal> values) {
            addCriterion("jpricefloat in", values, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatNotIn(List<BigDecimal> values) {
            addCriterion("jpricefloat not in", values, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jpricefloat between", value1, value2, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andJpricefloatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jpricefloat not between", value1, value2, "jpricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatIsNull() {
            addCriterion("npricefloat is null");
            return (Criteria) this;
        }

        public Criteria andNpricefloatIsNotNull() {
            addCriterion("npricefloat is not null");
            return (Criteria) this;
        }

        public Criteria andNpricefloatEqualTo(BigDecimal value) {
            addCriterion("npricefloat =", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotEqualTo(BigDecimal value) {
            addCriterion("npricefloat <>", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatGreaterThan(BigDecimal value) {
            addCriterion("npricefloat >", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("npricefloat >=", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatLessThan(BigDecimal value) {
            addCriterion("npricefloat <", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("npricefloat <=", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatIn(List<BigDecimal> values) {
            addCriterion("npricefloat in", values, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotIn(List<BigDecimal> values) {
            addCriterion("npricefloat not in", values, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("npricefloat between", value1, value2, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("npricefloat not between", value1, value2, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNull() {
            addCriterion("newdate is null");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNotNull() {
            addCriterion("newdate is not null");
            return (Criteria) this;
        }

        public Criteria andNewdateEqualTo(Date value) {
            addCriterionForJDBCDate("newdate =", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("newdate <>", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThan(Date value) {
            addCriterionForJDBCDate("newdate >", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newdate >=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThan(Date value) {
            addCriterionForJDBCDate("newdate <", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newdate <=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateIn(List<Date> values) {
            addCriterionForJDBCDate("newdate in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("newdate not in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newdate between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newdate not between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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