package cn.dingd.dd.common.entity;

import java.util.ArrayList;
import java.util.List;

public class CarSeriesExample {
    /**
     * car_series
     */
    protected String orderByClause;

    /**
     * car_series
     */
    protected boolean distinct;

    /**
     * car_series
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public CarSeriesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * car_series 2018-06-19
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andSeriesIdEqualTo(String value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(String value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(String value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(String value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(String value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(String value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLike(String value) {
            addCriterion("series_id like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotLike(String value) {
            addCriterion("series_id not like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<String> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<String> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(String value1, String value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(String value1, String value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIsNull() {
            addCriterion("brands_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIsNotNull() {
            addCriterion("brands_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsIdEqualTo(String value) {
            addCriterion("brands_id =", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotEqualTo(String value) {
            addCriterion("brands_id <>", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdGreaterThan(String value) {
            addCriterion("brands_id >", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdGreaterThanOrEqualTo(String value) {
            addCriterion("brands_id >=", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLessThan(String value) {
            addCriterion("brands_id <", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLessThanOrEqualTo(String value) {
            addCriterion("brands_id <=", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLike(String value) {
            addCriterion("brands_id like", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotLike(String value) {
            addCriterion("brands_id not like", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIn(List<String> values) {
            addCriterion("brands_id in", values, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotIn(List<String> values) {
            addCriterion("brands_id not in", values, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdBetween(String value1, String value2) {
            addCriterion("brands_id between", value1, value2, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotBetween(String value1, String value2) {
            addCriterion("brands_id not between", value1, value2, "brandsId");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNull() {
            addCriterion("series_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("series_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("series_name =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("series_name <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("series_name >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_name >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("series_name <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("series_name <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("series_name like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("series_name not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("series_name in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("series_name not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("series_name between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("series_name not between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyIsNull() {
            addCriterion("guide_money is null");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyIsNotNull() {
            addCriterion("guide_money is not null");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyEqualTo(String value) {
            addCriterion("guide_money =", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyNotEqualTo(String value) {
            addCriterion("guide_money <>", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyGreaterThan(String value) {
            addCriterion("guide_money >", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("guide_money >=", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyLessThan(String value) {
            addCriterion("guide_money <", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyLessThanOrEqualTo(String value) {
            addCriterion("guide_money <=", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyLike(String value) {
            addCriterion("guide_money like", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyNotLike(String value) {
            addCriterion("guide_money not like", value, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyIn(List<String> values) {
            addCriterion("guide_money in", values, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyNotIn(List<String> values) {
            addCriterion("guide_money not in", values, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyBetween(String value1, String value2) {
            addCriterion("guide_money between", value1, value2, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andGuideMoneyNotBetween(String value1, String value2) {
            addCriterion("guide_money not between", value1, value2, "guideMoney");
            return (Criteria) this;
        }

        public Criteria andSeriesImgIsNull() {
            addCriterion("series_img is null");
            return (Criteria) this;
        }

        public Criteria andSeriesImgIsNotNull() {
            addCriterion("series_img is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesImgEqualTo(String value) {
            addCriterion("series_img =", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgNotEqualTo(String value) {
            addCriterion("series_img <>", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgGreaterThan(String value) {
            addCriterion("series_img >", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgGreaterThanOrEqualTo(String value) {
            addCriterion("series_img >=", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgLessThan(String value) {
            addCriterion("series_img <", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgLessThanOrEqualTo(String value) {
            addCriterion("series_img <=", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgLike(String value) {
            addCriterion("series_img like", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgNotLike(String value) {
            addCriterion("series_img not like", value, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgIn(List<String> values) {
            addCriterion("series_img in", values, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgNotIn(List<String> values) {
            addCriterion("series_img not in", values, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgBetween(String value1, String value2) {
            addCriterion("series_img between", value1, value2, "seriesImg");
            return (Criteria) this;
        }

        public Criteria andSeriesImgNotBetween(String value1, String value2) {
            addCriterion("series_img not between", value1, value2, "seriesImg");
            return (Criteria) this;
        }
    }

    /**
     * car_series
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * car_series 2018-06-19
     */
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