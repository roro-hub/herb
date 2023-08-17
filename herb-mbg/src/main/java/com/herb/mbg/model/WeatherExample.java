package com.herb.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeatherExample() {
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

        public Criteria andRainfallIsNull() {
            addCriterion("rainfall is null");
            return (Criteria) this;
        }

        public Criteria andRainfallIsNotNull() {
            addCriterion("rainfall is not null");
            return (Criteria) this;
        }

        public Criteria andRainfallEqualTo(String value) {
            addCriterion("rainfall =", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotEqualTo(String value) {
            addCriterion("rainfall <>", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallGreaterThan(String value) {
            addCriterion("rainfall >", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallGreaterThanOrEqualTo(String value) {
            addCriterion("rainfall >=", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLessThan(String value) {
            addCriterion("rainfall <", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLessThanOrEqualTo(String value) {
            addCriterion("rainfall <=", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLike(String value) {
            addCriterion("rainfall like", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotLike(String value) {
            addCriterion("rainfall not like", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallIn(List<String> values) {
            addCriterion("rainfall in", values, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotIn(List<String> values) {
            addCriterion("rainfall not in", values, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallBetween(String value1, String value2) {
            addCriterion("rainfall between", value1, value2, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotBetween(String value1, String value2) {
            addCriterion("rainfall not between", value1, value2, "rainfall");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(String value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(String value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(String value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(String value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(String value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLike(String value) {
            addCriterion("humidity like", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotLike(String value) {
            addCriterion("humidity not like", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<String> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<String> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(String value1, String value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(String value1, String value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureIsNull() {
            addCriterion("dew_temperature is null");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureIsNotNull() {
            addCriterion("dew_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureEqualTo(String value) {
            addCriterion("dew_temperature =", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureNotEqualTo(String value) {
            addCriterion("dew_temperature <>", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureGreaterThan(String value) {
            addCriterion("dew_temperature >", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("dew_temperature >=", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureLessThan(String value) {
            addCriterion("dew_temperature <", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureLessThanOrEqualTo(String value) {
            addCriterion("dew_temperature <=", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureLike(String value) {
            addCriterion("dew_temperature like", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureNotLike(String value) {
            addCriterion("dew_temperature not like", value, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureIn(List<String> values) {
            addCriterion("dew_temperature in", values, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureNotIn(List<String> values) {
            addCriterion("dew_temperature not in", values, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureBetween(String value1, String value2) {
            addCriterion("dew_temperature between", value1, value2, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andDewTemperatureNotBetween(String value1, String value2) {
            addCriterion("dew_temperature not between", value1, value2, "dewTemperature");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIsNull() {
            addCriterion("light_intensity is null");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIsNotNull() {
            addCriterion("light_intensity is not null");
            return (Criteria) this;
        }

        public Criteria andLightIntensityEqualTo(String value) {
            addCriterion("light_intensity =", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotEqualTo(String value) {
            addCriterion("light_intensity <>", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityGreaterThan(String value) {
            addCriterion("light_intensity >", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityGreaterThanOrEqualTo(String value) {
            addCriterion("light_intensity >=", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLessThan(String value) {
            addCriterion("light_intensity <", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLessThanOrEqualTo(String value) {
            addCriterion("light_intensity <=", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLike(String value) {
            addCriterion("light_intensity like", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotLike(String value) {
            addCriterion("light_intensity not like", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIn(List<String> values) {
            addCriterion("light_intensity in", values, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotIn(List<String> values) {
            addCriterion("light_intensity not in", values, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityBetween(String value1, String value2) {
            addCriterion("light_intensity between", value1, value2, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotBetween(String value1, String value2) {
            addCriterion("light_intensity not between", value1, value2, "lightIntensity");
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