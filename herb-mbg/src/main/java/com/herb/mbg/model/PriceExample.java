package com.herb.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceExample() {
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

        public Criteria andHerbIdIsNull() {
            addCriterion("herb_id is null");
            return (Criteria) this;
        }

        public Criteria andHerbIdIsNotNull() {
            addCriterion("herb_id is not null");
            return (Criteria) this;
        }

        public Criteria andHerbIdEqualTo(Long value) {
            addCriterion("herb_id =", value, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdNotEqualTo(Long value) {
            addCriterion("herb_id <>", value, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdGreaterThan(Long value) {
            addCriterion("herb_id >", value, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("herb_id >=", value, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdLessThan(Long value) {
            addCriterion("herb_id <", value, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdLessThanOrEqualTo(Long value) {
            addCriterion("herb_id <=", value, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdIn(List<Long> values) {
            addCriterion("herb_id in", values, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdNotIn(List<Long> values) {
            addCriterion("herb_id not in", values, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdBetween(Long value1, Long value2) {
            addCriterion("herb_id between", value1, value2, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbIdNotBetween(Long value1, Long value2) {
            addCriterion("herb_id not between", value1, value2, "herbId");
            return (Criteria) this;
        }

        public Criteria andHerbNameIsNull() {
            addCriterion("herb_name is null");
            return (Criteria) this;
        }

        public Criteria andHerbNameIsNotNull() {
            addCriterion("herb_name is not null");
            return (Criteria) this;
        }

        public Criteria andHerbNameEqualTo(Long value) {
            addCriterion("herb_name =", value, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameNotEqualTo(Long value) {
            addCriterion("herb_name <>", value, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameGreaterThan(Long value) {
            addCriterion("herb_name >", value, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameGreaterThanOrEqualTo(Long value) {
            addCriterion("herb_name >=", value, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameLessThan(Long value) {
            addCriterion("herb_name <", value, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameLessThanOrEqualTo(Long value) {
            addCriterion("herb_name <=", value, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameIn(List<Long> values) {
            addCriterion("herb_name in", values, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameNotIn(List<Long> values) {
            addCriterion("herb_name not in", values, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameBetween(Long value1, Long value2) {
            addCriterion("herb_name between", value1, value2, "herbName");
            return (Criteria) this;
        }

        public Criteria andHerbNameNotBetween(Long value1, Long value2) {
            addCriterion("herb_name not between", value1, value2, "herbName");
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

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andMeasureunitIsNull() {
            addCriterion("measureunit is null");
            return (Criteria) this;
        }

        public Criteria andMeasureunitIsNotNull() {
            addCriterion("measureunit is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureunitEqualTo(String value) {
            addCriterion("measureunit =", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitNotEqualTo(String value) {
            addCriterion("measureunit <>", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitGreaterThan(String value) {
            addCriterion("measureunit >", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitGreaterThanOrEqualTo(String value) {
            addCriterion("measureunit >=", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitLessThan(String value) {
            addCriterion("measureunit <", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitLessThanOrEqualTo(String value) {
            addCriterion("measureunit <=", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitLike(String value) {
            addCriterion("measureunit like", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitNotLike(String value) {
            addCriterion("measureunit not like", value, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitIn(List<String> values) {
            addCriterion("measureunit in", values, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitNotIn(List<String> values) {
            addCriterion("measureunit not in", values, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitBetween(String value1, String value2) {
            addCriterion("measureunit between", value1, value2, "measureunit");
            return (Criteria) this;
        }

        public Criteria andMeasureunitNotBetween(String value1, String value2) {
            addCriterion("measureunit not between", value1, value2, "measureunit");
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

        public Criteria andNewpriceEqualTo(String value) {
            addCriterion("newprice =", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotEqualTo(String value) {
            addCriterion("newprice <>", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceGreaterThan(String value) {
            addCriterion("newprice >", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceGreaterThanOrEqualTo(String value) {
            addCriterion("newprice >=", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLessThan(String value) {
            addCriterion("newprice <", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLessThanOrEqualTo(String value) {
            addCriterion("newprice <=", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLike(String value) {
            addCriterion("newprice like", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotLike(String value) {
            addCriterion("newprice not like", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceIn(List<String> values) {
            addCriterion("newprice in", values, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotIn(List<String> values) {
            addCriterion("newprice not in", values, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceBetween(String value1, String value2) {
            addCriterion("newprice between", value1, value2, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotBetween(String value1, String value2) {
            addCriterion("newprice not between", value1, value2, "newprice");
            return (Criteria) this;
        }

        public Criteria andWpriceIsNull() {
            addCriterion("wprice is null");
            return (Criteria) this;
        }

        public Criteria andWpriceIsNotNull() {
            addCriterion("wprice is not null");
            return (Criteria) this;
        }

        public Criteria andWpriceEqualTo(String value) {
            addCriterion("wprice =", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceNotEqualTo(String value) {
            addCriterion("wprice <>", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceGreaterThan(String value) {
            addCriterion("wprice >", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceGreaterThanOrEqualTo(String value) {
            addCriterion("wprice >=", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceLessThan(String value) {
            addCriterion("wprice <", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceLessThanOrEqualTo(String value) {
            addCriterion("wprice <=", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceLike(String value) {
            addCriterion("wprice like", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceNotLike(String value) {
            addCriterion("wprice not like", value, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceIn(List<String> values) {
            addCriterion("wprice in", values, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceNotIn(List<String> values) {
            addCriterion("wprice not in", values, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceBetween(String value1, String value2) {
            addCriterion("wprice between", value1, value2, "wprice");
            return (Criteria) this;
        }

        public Criteria andWpriceNotBetween(String value1, String value2) {
            addCriterion("wprice not between", value1, value2, "wprice");
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

        public Criteria andWpricefloatEqualTo(String value) {
            addCriterion("wpricefloat =", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotEqualTo(String value) {
            addCriterion("wpricefloat <>", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatGreaterThan(String value) {
            addCriterion("wpricefloat >", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatGreaterThanOrEqualTo(String value) {
            addCriterion("wpricefloat >=", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatLessThan(String value) {
            addCriterion("wpricefloat <", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatLessThanOrEqualTo(String value) {
            addCriterion("wpricefloat <=", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatLike(String value) {
            addCriterion("wpricefloat like", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotLike(String value) {
            addCriterion("wpricefloat not like", value, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatIn(List<String> values) {
            addCriterion("wpricefloat in", values, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotIn(List<String> values) {
            addCriterion("wpricefloat not in", values, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatBetween(String value1, String value2) {
            addCriterion("wpricefloat between", value1, value2, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andWpricefloatNotBetween(String value1, String value2) {
            addCriterion("wpricefloat not between", value1, value2, "wpricefloat");
            return (Criteria) this;
        }

        public Criteria andYpriceIsNull() {
            addCriterion("yprice is null");
            return (Criteria) this;
        }

        public Criteria andYpriceIsNotNull() {
            addCriterion("yprice is not null");
            return (Criteria) this;
        }

        public Criteria andYpriceEqualTo(String value) {
            addCriterion("yprice =", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceNotEqualTo(String value) {
            addCriterion("yprice <>", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceGreaterThan(String value) {
            addCriterion("yprice >", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceGreaterThanOrEqualTo(String value) {
            addCriterion("yprice >=", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceLessThan(String value) {
            addCriterion("yprice <", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceLessThanOrEqualTo(String value) {
            addCriterion("yprice <=", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceLike(String value) {
            addCriterion("yprice like", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceNotLike(String value) {
            addCriterion("yprice not like", value, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceIn(List<String> values) {
            addCriterion("yprice in", values, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceNotIn(List<String> values) {
            addCriterion("yprice not in", values, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceBetween(String value1, String value2) {
            addCriterion("yprice between", value1, value2, "yprice");
            return (Criteria) this;
        }

        public Criteria andYpriceNotBetween(String value1, String value2) {
            addCriterion("yprice not between", value1, value2, "yprice");
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

        public Criteria andYpricefloatEqualTo(String value) {
            addCriterion("ypricefloat =", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotEqualTo(String value) {
            addCriterion("ypricefloat <>", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatGreaterThan(String value) {
            addCriterion("ypricefloat >", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatGreaterThanOrEqualTo(String value) {
            addCriterion("ypricefloat >=", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatLessThan(String value) {
            addCriterion("ypricefloat <", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatLessThanOrEqualTo(String value) {
            addCriterion("ypricefloat <=", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatLike(String value) {
            addCriterion("ypricefloat like", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotLike(String value) {
            addCriterion("ypricefloat not like", value, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatIn(List<String> values) {
            addCriterion("ypricefloat in", values, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotIn(List<String> values) {
            addCriterion("ypricefloat not in", values, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatBetween(String value1, String value2) {
            addCriterion("ypricefloat between", value1, value2, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andYpricefloatNotBetween(String value1, String value2) {
            addCriterion("ypricefloat not between", value1, value2, "ypricefloat");
            return (Criteria) this;
        }

        public Criteria andNpriceIsNull() {
            addCriterion("nprice is null");
            return (Criteria) this;
        }

        public Criteria andNpriceIsNotNull() {
            addCriterion("nprice is not null");
            return (Criteria) this;
        }

        public Criteria andNpriceEqualTo(String value) {
            addCriterion("nprice =", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceNotEqualTo(String value) {
            addCriterion("nprice <>", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceGreaterThan(String value) {
            addCriterion("nprice >", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceGreaterThanOrEqualTo(String value) {
            addCriterion("nprice >=", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceLessThan(String value) {
            addCriterion("nprice <", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceLessThanOrEqualTo(String value) {
            addCriterion("nprice <=", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceLike(String value) {
            addCriterion("nprice like", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceNotLike(String value) {
            addCriterion("nprice not like", value, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceIn(List<String> values) {
            addCriterion("nprice in", values, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceNotIn(List<String> values) {
            addCriterion("nprice not in", values, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceBetween(String value1, String value2) {
            addCriterion("nprice between", value1, value2, "nprice");
            return (Criteria) this;
        }

        public Criteria andNpriceNotBetween(String value1, String value2) {
            addCriterion("nprice not between", value1, value2, "nprice");
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

        public Criteria andNpricefloatEqualTo(String value) {
            addCriterion("npricefloat =", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotEqualTo(String value) {
            addCriterion("npricefloat <>", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatGreaterThan(String value) {
            addCriterion("npricefloat >", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatGreaterThanOrEqualTo(String value) {
            addCriterion("npricefloat >=", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatLessThan(String value) {
            addCriterion("npricefloat <", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatLessThanOrEqualTo(String value) {
            addCriterion("npricefloat <=", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatLike(String value) {
            addCriterion("npricefloat like", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotLike(String value) {
            addCriterion("npricefloat not like", value, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatIn(List<String> values) {
            addCriterion("npricefloat in", values, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotIn(List<String> values) {
            addCriterion("npricefloat not in", values, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatBetween(String value1, String value2) {
            addCriterion("npricefloat between", value1, value2, "npricefloat");
            return (Criteria) this;
        }

        public Criteria andNpricefloatNotBetween(String value1, String value2) {
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