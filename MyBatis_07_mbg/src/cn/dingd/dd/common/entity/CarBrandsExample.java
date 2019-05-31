package cn.dingd.dd.common.entity;

import java.util.ArrayList;
import java.util.List;

public class CarBrandsExample {
    /**
     * car_brands
     */
    protected String orderByClause;

    /**
     * car_brands
     */
    protected boolean distinct;

    /**
     * car_brands
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public CarBrandsExample() {
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
     * car_brands 2018-06-19
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

        public Criteria andBrandsHeadIsNull() {
            addCriterion("brands_head is null");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadIsNotNull() {
            addCriterion("brands_head is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadEqualTo(String value) {
            addCriterion("brands_head =", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadNotEqualTo(String value) {
            addCriterion("brands_head <>", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadGreaterThan(String value) {
            addCriterion("brands_head >", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadGreaterThanOrEqualTo(String value) {
            addCriterion("brands_head >=", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadLessThan(String value) {
            addCriterion("brands_head <", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadLessThanOrEqualTo(String value) {
            addCriterion("brands_head <=", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadLike(String value) {
            addCriterion("brands_head like", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadNotLike(String value) {
            addCriterion("brands_head not like", value, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadIn(List<String> values) {
            addCriterion("brands_head in", values, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadNotIn(List<String> values) {
            addCriterion("brands_head not in", values, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadBetween(String value1, String value2) {
            addCriterion("brands_head between", value1, value2, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsHeadNotBetween(String value1, String value2) {
            addCriterion("brands_head not between", value1, value2, "brandsHead");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIsNull() {
            addCriterion("brands_Id is null");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIsNotNull() {
            addCriterion("brands_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsIdEqualTo(String value) {
            addCriterion("brands_Id =", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotEqualTo(String value) {
            addCriterion("brands_Id <>", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdGreaterThan(String value) {
            addCriterion("brands_Id >", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdGreaterThanOrEqualTo(String value) {
            addCriterion("brands_Id >=", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLessThan(String value) {
            addCriterion("brands_Id <", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLessThanOrEqualTo(String value) {
            addCriterion("brands_Id <=", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdLike(String value) {
            addCriterion("brands_Id like", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotLike(String value) {
            addCriterion("brands_Id not like", value, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdIn(List<String> values) {
            addCriterion("brands_Id in", values, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotIn(List<String> values) {
            addCriterion("brands_Id not in", values, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdBetween(String value1, String value2) {
            addCriterion("brands_Id between", value1, value2, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsIdNotBetween(String value1, String value2) {
            addCriterion("brands_Id not between", value1, value2, "brandsId");
            return (Criteria) this;
        }

        public Criteria andBrandsNameIsNull() {
            addCriterion("brands_Name is null");
            return (Criteria) this;
        }

        public Criteria andBrandsNameIsNotNull() {
            addCriterion("brands_Name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsNameEqualTo(String value) {
            addCriterion("brands_Name =", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameNotEqualTo(String value) {
            addCriterion("brands_Name <>", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameGreaterThan(String value) {
            addCriterion("brands_Name >", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameGreaterThanOrEqualTo(String value) {
            addCriterion("brands_Name >=", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameLessThan(String value) {
            addCriterion("brands_Name <", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameLessThanOrEqualTo(String value) {
            addCriterion("brands_Name <=", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameLike(String value) {
            addCriterion("brands_Name like", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameNotLike(String value) {
            addCriterion("brands_Name not like", value, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameIn(List<String> values) {
            addCriterion("brands_Name in", values, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameNotIn(List<String> values) {
            addCriterion("brands_Name not in", values, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameBetween(String value1, String value2) {
            addCriterion("brands_Name between", value1, value2, "brandsName");
            return (Criteria) this;
        }

        public Criteria andBrandsNameNotBetween(String value1, String value2) {
            addCriterion("brands_Name not between", value1, value2, "brandsName");
            return (Criteria) this;
        }

        public Criteria andLogoImgeIsNull() {
            addCriterion("Logo_Imge is null");
            return (Criteria) this;
        }

        public Criteria andLogoImgeIsNotNull() {
            addCriterion("Logo_Imge is not null");
            return (Criteria) this;
        }

        public Criteria andLogoImgeEqualTo(String value) {
            addCriterion("Logo_Imge =", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeNotEqualTo(String value) {
            addCriterion("Logo_Imge <>", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeGreaterThan(String value) {
            addCriterion("Logo_Imge >", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeGreaterThanOrEqualTo(String value) {
            addCriterion("Logo_Imge >=", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeLessThan(String value) {
            addCriterion("Logo_Imge <", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeLessThanOrEqualTo(String value) {
            addCriterion("Logo_Imge <=", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeLike(String value) {
            addCriterion("Logo_Imge like", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeNotLike(String value) {
            addCriterion("Logo_Imge not like", value, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeIn(List<String> values) {
            addCriterion("Logo_Imge in", values, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeNotIn(List<String> values) {
            addCriterion("Logo_Imge not in", values, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeBetween(String value1, String value2) {
            addCriterion("Logo_Imge between", value1, value2, "logoImge");
            return (Criteria) this;
        }

        public Criteria andLogoImgeNotBetween(String value1, String value2) {
            addCriterion("Logo_Imge not between", value1, value2, "logoImge");
            return (Criteria) this;
        }
    }

    /**
     * car_brands
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * car_brands 2018-06-19
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