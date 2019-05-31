package cn.dingd.dd.common.entity;

import java.util.ArrayList;
import java.util.List;

public class CarModelsExample {
    /**
     * car_models
     */
    protected String orderByClause;

    /**
     * car_models
     */
    protected boolean distinct;

    /**
     * car_models
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-06-19
     */
    public CarModelsExample() {
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
     * car_models 2018-06-19
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

        public Criteria andC1IsNull() {
            addCriterion("C1 is null");
            return (Criteria) this;
        }

        public Criteria andC1IsNotNull() {
            addCriterion("C1 is not null");
            return (Criteria) this;
        }

        public Criteria andC1EqualTo(String value) {
            addCriterion("C1 =", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotEqualTo(String value) {
            addCriterion("C1 <>", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1GreaterThan(String value) {
            addCriterion("C1 >", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1GreaterThanOrEqualTo(String value) {
            addCriterion("C1 >=", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1LessThan(String value) {
            addCriterion("C1 <", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1LessThanOrEqualTo(String value) {
            addCriterion("C1 <=", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1Like(String value) {
            addCriterion("C1 like", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotLike(String value) {
            addCriterion("C1 not like", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1In(List<String> values) {
            addCriterion("C1 in", values, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotIn(List<String> values) {
            addCriterion("C1 not in", values, "c1");
            return (Criteria) this;
        }

        public Criteria andC1Between(String value1, String value2) {
            addCriterion("C1 between", value1, value2, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotBetween(String value1, String value2) {
            addCriterion("C1 not between", value1, value2, "c1");
            return (Criteria) this;
        }

        public Criteria andC2IsNull() {
            addCriterion("C2 is null");
            return (Criteria) this;
        }

        public Criteria andC2IsNotNull() {
            addCriterion("C2 is not null");
            return (Criteria) this;
        }

        public Criteria andC2EqualTo(String value) {
            addCriterion("C2 =", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotEqualTo(String value) {
            addCriterion("C2 <>", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2GreaterThan(String value) {
            addCriterion("C2 >", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2GreaterThanOrEqualTo(String value) {
            addCriterion("C2 >=", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2LessThan(String value) {
            addCriterion("C2 <", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2LessThanOrEqualTo(String value) {
            addCriterion("C2 <=", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2Like(String value) {
            addCriterion("C2 like", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotLike(String value) {
            addCriterion("C2 not like", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2In(List<String> values) {
            addCriterion("C2 in", values, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotIn(List<String> values) {
            addCriterion("C2 not in", values, "c2");
            return (Criteria) this;
        }

        public Criteria andC2Between(String value1, String value2) {
            addCriterion("C2 between", value1, value2, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotBetween(String value1, String value2) {
            addCriterion("C2 not between", value1, value2, "c2");
            return (Criteria) this;
        }

        public Criteria andC3IsNull() {
            addCriterion("C3 is null");
            return (Criteria) this;
        }

        public Criteria andC3IsNotNull() {
            addCriterion("C3 is not null");
            return (Criteria) this;
        }

        public Criteria andC3EqualTo(String value) {
            addCriterion("C3 =", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotEqualTo(String value) {
            addCriterion("C3 <>", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThan(String value) {
            addCriterion("C3 >", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThanOrEqualTo(String value) {
            addCriterion("C3 >=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThan(String value) {
            addCriterion("C3 <", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThanOrEqualTo(String value) {
            addCriterion("C3 <=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3Like(String value) {
            addCriterion("C3 like", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotLike(String value) {
            addCriterion("C3 not like", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3In(List<String> values) {
            addCriterion("C3 in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotIn(List<String> values) {
            addCriterion("C3 not in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3Between(String value1, String value2) {
            addCriterion("C3 between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotBetween(String value1, String value2) {
            addCriterion("C3 not between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC4IsNull() {
            addCriterion("C4 is null");
            return (Criteria) this;
        }

        public Criteria andC4IsNotNull() {
            addCriterion("C4 is not null");
            return (Criteria) this;
        }

        public Criteria andC4EqualTo(String value) {
            addCriterion("C4 =", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotEqualTo(String value) {
            addCriterion("C4 <>", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThan(String value) {
            addCriterion("C4 >", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThanOrEqualTo(String value) {
            addCriterion("C4 >=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThan(String value) {
            addCriterion("C4 <", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThanOrEqualTo(String value) {
            addCriterion("C4 <=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4Like(String value) {
            addCriterion("C4 like", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotLike(String value) {
            addCriterion("C4 not like", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4In(List<String> values) {
            addCriterion("C4 in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotIn(List<String> values) {
            addCriterion("C4 not in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4Between(String value1, String value2) {
            addCriterion("C4 between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotBetween(String value1, String value2) {
            addCriterion("C4 not between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andC5IsNull() {
            addCriterion("C5 is null");
            return (Criteria) this;
        }

        public Criteria andC5IsNotNull() {
            addCriterion("C5 is not null");
            return (Criteria) this;
        }

        public Criteria andC5EqualTo(String value) {
            addCriterion("C5 =", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotEqualTo(String value) {
            addCriterion("C5 <>", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5GreaterThan(String value) {
            addCriterion("C5 >", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5GreaterThanOrEqualTo(String value) {
            addCriterion("C5 >=", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5LessThan(String value) {
            addCriterion("C5 <", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5LessThanOrEqualTo(String value) {
            addCriterion("C5 <=", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5Like(String value) {
            addCriterion("C5 like", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotLike(String value) {
            addCriterion("C5 not like", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5In(List<String> values) {
            addCriterion("C5 in", values, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotIn(List<String> values) {
            addCriterion("C5 not in", values, "c5");
            return (Criteria) this;
        }

        public Criteria andC5Between(String value1, String value2) {
            addCriterion("C5 between", value1, value2, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotBetween(String value1, String value2) {
            addCriterion("C5 not between", value1, value2, "c5");
            return (Criteria) this;
        }

        public Criteria andC6IsNull() {
            addCriterion("C6 is null");
            return (Criteria) this;
        }

        public Criteria andC6IsNotNull() {
            addCriterion("C6 is not null");
            return (Criteria) this;
        }

        public Criteria andC6EqualTo(String value) {
            addCriterion("C6 =", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotEqualTo(String value) {
            addCriterion("C6 <>", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6GreaterThan(String value) {
            addCriterion("C6 >", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6GreaterThanOrEqualTo(String value) {
            addCriterion("C6 >=", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6LessThan(String value) {
            addCriterion("C6 <", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6LessThanOrEqualTo(String value) {
            addCriterion("C6 <=", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6Like(String value) {
            addCriterion("C6 like", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotLike(String value) {
            addCriterion("C6 not like", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6In(List<String> values) {
            addCriterion("C6 in", values, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotIn(List<String> values) {
            addCriterion("C6 not in", values, "c6");
            return (Criteria) this;
        }

        public Criteria andC6Between(String value1, String value2) {
            addCriterion("C6 between", value1, value2, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotBetween(String value1, String value2) {
            addCriterion("C6 not between", value1, value2, "c6");
            return (Criteria) this;
        }

        public Criteria andC7IsNull() {
            addCriterion("C7 is null");
            return (Criteria) this;
        }

        public Criteria andC7IsNotNull() {
            addCriterion("C7 is not null");
            return (Criteria) this;
        }

        public Criteria andC7EqualTo(String value) {
            addCriterion("C7 =", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotEqualTo(String value) {
            addCriterion("C7 <>", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7GreaterThan(String value) {
            addCriterion("C7 >", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7GreaterThanOrEqualTo(String value) {
            addCriterion("C7 >=", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7LessThan(String value) {
            addCriterion("C7 <", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7LessThanOrEqualTo(String value) {
            addCriterion("C7 <=", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7Like(String value) {
            addCriterion("C7 like", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotLike(String value) {
            addCriterion("C7 not like", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7In(List<String> values) {
            addCriterion("C7 in", values, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotIn(List<String> values) {
            addCriterion("C7 not in", values, "c7");
            return (Criteria) this;
        }

        public Criteria andC7Between(String value1, String value2) {
            addCriterion("C7 between", value1, value2, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotBetween(String value1, String value2) {
            addCriterion("C7 not between", value1, value2, "c7");
            return (Criteria) this;
        }

        public Criteria andC8IsNull() {
            addCriterion("C8 is null");
            return (Criteria) this;
        }

        public Criteria andC8IsNotNull() {
            addCriterion("C8 is not null");
            return (Criteria) this;
        }

        public Criteria andC8EqualTo(String value) {
            addCriterion("C8 =", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotEqualTo(String value) {
            addCriterion("C8 <>", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8GreaterThan(String value) {
            addCriterion("C8 >", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8GreaterThanOrEqualTo(String value) {
            addCriterion("C8 >=", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8LessThan(String value) {
            addCriterion("C8 <", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8LessThanOrEqualTo(String value) {
            addCriterion("C8 <=", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8Like(String value) {
            addCriterion("C8 like", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotLike(String value) {
            addCriterion("C8 not like", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8In(List<String> values) {
            addCriterion("C8 in", values, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotIn(List<String> values) {
            addCriterion("C8 not in", values, "c8");
            return (Criteria) this;
        }

        public Criteria andC8Between(String value1, String value2) {
            addCriterion("C8 between", value1, value2, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotBetween(String value1, String value2) {
            addCriterion("C8 not between", value1, value2, "c8");
            return (Criteria) this;
        }

        public Criteria andC9IsNull() {
            addCriterion("C9 is null");
            return (Criteria) this;
        }

        public Criteria andC9IsNotNull() {
            addCriterion("C9 is not null");
            return (Criteria) this;
        }

        public Criteria andC9EqualTo(String value) {
            addCriterion("C9 =", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotEqualTo(String value) {
            addCriterion("C9 <>", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9GreaterThan(String value) {
            addCriterion("C9 >", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9GreaterThanOrEqualTo(String value) {
            addCriterion("C9 >=", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9LessThan(String value) {
            addCriterion("C9 <", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9LessThanOrEqualTo(String value) {
            addCriterion("C9 <=", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9Like(String value) {
            addCriterion("C9 like", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotLike(String value) {
            addCriterion("C9 not like", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9In(List<String> values) {
            addCriterion("C9 in", values, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotIn(List<String> values) {
            addCriterion("C9 not in", values, "c9");
            return (Criteria) this;
        }

        public Criteria andC9Between(String value1, String value2) {
            addCriterion("C9 between", value1, value2, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotBetween(String value1, String value2) {
            addCriterion("C9 not between", value1, value2, "c9");
            return (Criteria) this;
        }

        public Criteria andC10IsNull() {
            addCriterion("C10 is null");
            return (Criteria) this;
        }

        public Criteria andC10IsNotNull() {
            addCriterion("C10 is not null");
            return (Criteria) this;
        }

        public Criteria andC10EqualTo(String value) {
            addCriterion("C10 =", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotEqualTo(String value) {
            addCriterion("C10 <>", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10GreaterThan(String value) {
            addCriterion("C10 >", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10GreaterThanOrEqualTo(String value) {
            addCriterion("C10 >=", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10LessThan(String value) {
            addCriterion("C10 <", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10LessThanOrEqualTo(String value) {
            addCriterion("C10 <=", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10Like(String value) {
            addCriterion("C10 like", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotLike(String value) {
            addCriterion("C10 not like", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10In(List<String> values) {
            addCriterion("C10 in", values, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotIn(List<String> values) {
            addCriterion("C10 not in", values, "c10");
            return (Criteria) this;
        }

        public Criteria andC10Between(String value1, String value2) {
            addCriterion("C10 between", value1, value2, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotBetween(String value1, String value2) {
            addCriterion("C10 not between", value1, value2, "c10");
            return (Criteria) this;
        }

        public Criteria andC11IsNull() {
            addCriterion("C11 is null");
            return (Criteria) this;
        }

        public Criteria andC11IsNotNull() {
            addCriterion("C11 is not null");
            return (Criteria) this;
        }

        public Criteria andC11EqualTo(String value) {
            addCriterion("C11 =", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotEqualTo(String value) {
            addCriterion("C11 <>", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11GreaterThan(String value) {
            addCriterion("C11 >", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11GreaterThanOrEqualTo(String value) {
            addCriterion("C11 >=", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11LessThan(String value) {
            addCriterion("C11 <", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11LessThanOrEqualTo(String value) {
            addCriterion("C11 <=", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11Like(String value) {
            addCriterion("C11 like", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotLike(String value) {
            addCriterion("C11 not like", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11In(List<String> values) {
            addCriterion("C11 in", values, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotIn(List<String> values) {
            addCriterion("C11 not in", values, "c11");
            return (Criteria) this;
        }

        public Criteria andC11Between(String value1, String value2) {
            addCriterion("C11 between", value1, value2, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotBetween(String value1, String value2) {
            addCriterion("C11 not between", value1, value2, "c11");
            return (Criteria) this;
        }

        public Criteria andC12IsNull() {
            addCriterion("C12 is null");
            return (Criteria) this;
        }

        public Criteria andC12IsNotNull() {
            addCriterion("C12 is not null");
            return (Criteria) this;
        }

        public Criteria andC12EqualTo(String value) {
            addCriterion("C12 =", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotEqualTo(String value) {
            addCriterion("C12 <>", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12GreaterThan(String value) {
            addCriterion("C12 >", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12GreaterThanOrEqualTo(String value) {
            addCriterion("C12 >=", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12LessThan(String value) {
            addCriterion("C12 <", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12LessThanOrEqualTo(String value) {
            addCriterion("C12 <=", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12Like(String value) {
            addCriterion("C12 like", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotLike(String value) {
            addCriterion("C12 not like", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12In(List<String> values) {
            addCriterion("C12 in", values, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotIn(List<String> values) {
            addCriterion("C12 not in", values, "c12");
            return (Criteria) this;
        }

        public Criteria andC12Between(String value1, String value2) {
            addCriterion("C12 between", value1, value2, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotBetween(String value1, String value2) {
            addCriterion("C12 not between", value1, value2, "c12");
            return (Criteria) this;
        }

        public Criteria andC13IsNull() {
            addCriterion("C13 is null");
            return (Criteria) this;
        }

        public Criteria andC13IsNotNull() {
            addCriterion("C13 is not null");
            return (Criteria) this;
        }

        public Criteria andC13EqualTo(String value) {
            addCriterion("C13 =", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotEqualTo(String value) {
            addCriterion("C13 <>", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13GreaterThan(String value) {
            addCriterion("C13 >", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13GreaterThanOrEqualTo(String value) {
            addCriterion("C13 >=", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13LessThan(String value) {
            addCriterion("C13 <", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13LessThanOrEqualTo(String value) {
            addCriterion("C13 <=", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13Like(String value) {
            addCriterion("C13 like", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotLike(String value) {
            addCriterion("C13 not like", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13In(List<String> values) {
            addCriterion("C13 in", values, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotIn(List<String> values) {
            addCriterion("C13 not in", values, "c13");
            return (Criteria) this;
        }

        public Criteria andC13Between(String value1, String value2) {
            addCriterion("C13 between", value1, value2, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotBetween(String value1, String value2) {
            addCriterion("C13 not between", value1, value2, "c13");
            return (Criteria) this;
        }

        public Criteria andC14IsNull() {
            addCriterion("C14 is null");
            return (Criteria) this;
        }

        public Criteria andC14IsNotNull() {
            addCriterion("C14 is not null");
            return (Criteria) this;
        }

        public Criteria andC14EqualTo(String value) {
            addCriterion("C14 =", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotEqualTo(String value) {
            addCriterion("C14 <>", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14GreaterThan(String value) {
            addCriterion("C14 >", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14GreaterThanOrEqualTo(String value) {
            addCriterion("C14 >=", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14LessThan(String value) {
            addCriterion("C14 <", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14LessThanOrEqualTo(String value) {
            addCriterion("C14 <=", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14Like(String value) {
            addCriterion("C14 like", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotLike(String value) {
            addCriterion("C14 not like", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14In(List<String> values) {
            addCriterion("C14 in", values, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotIn(List<String> values) {
            addCriterion("C14 not in", values, "c14");
            return (Criteria) this;
        }

        public Criteria andC14Between(String value1, String value2) {
            addCriterion("C14 between", value1, value2, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotBetween(String value1, String value2) {
            addCriterion("C14 not between", value1, value2, "c14");
            return (Criteria) this;
        }

        public Criteria andC15IsNull() {
            addCriterion("C15 is null");
            return (Criteria) this;
        }

        public Criteria andC15IsNotNull() {
            addCriterion("C15 is not null");
            return (Criteria) this;
        }

        public Criteria andC15EqualTo(String value) {
            addCriterion("C15 =", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotEqualTo(String value) {
            addCriterion("C15 <>", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15GreaterThan(String value) {
            addCriterion("C15 >", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15GreaterThanOrEqualTo(String value) {
            addCriterion("C15 >=", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15LessThan(String value) {
            addCriterion("C15 <", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15LessThanOrEqualTo(String value) {
            addCriterion("C15 <=", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15Like(String value) {
            addCriterion("C15 like", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotLike(String value) {
            addCriterion("C15 not like", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15In(List<String> values) {
            addCriterion("C15 in", values, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotIn(List<String> values) {
            addCriterion("C15 not in", values, "c15");
            return (Criteria) this;
        }

        public Criteria andC15Between(String value1, String value2) {
            addCriterion("C15 between", value1, value2, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotBetween(String value1, String value2) {
            addCriterion("C15 not between", value1, value2, "c15");
            return (Criteria) this;
        }

        public Criteria andC16IsNull() {
            addCriterion("C16 is null");
            return (Criteria) this;
        }

        public Criteria andC16IsNotNull() {
            addCriterion("C16 is not null");
            return (Criteria) this;
        }

        public Criteria andC16EqualTo(String value) {
            addCriterion("C16 =", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotEqualTo(String value) {
            addCriterion("C16 <>", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16GreaterThan(String value) {
            addCriterion("C16 >", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16GreaterThanOrEqualTo(String value) {
            addCriterion("C16 >=", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16LessThan(String value) {
            addCriterion("C16 <", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16LessThanOrEqualTo(String value) {
            addCriterion("C16 <=", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16Like(String value) {
            addCriterion("C16 like", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotLike(String value) {
            addCriterion("C16 not like", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16In(List<String> values) {
            addCriterion("C16 in", values, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotIn(List<String> values) {
            addCriterion("C16 not in", values, "c16");
            return (Criteria) this;
        }

        public Criteria andC16Between(String value1, String value2) {
            addCriterion("C16 between", value1, value2, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotBetween(String value1, String value2) {
            addCriterion("C16 not between", value1, value2, "c16");
            return (Criteria) this;
        }

        public Criteria andC17IsNull() {
            addCriterion("C17 is null");
            return (Criteria) this;
        }

        public Criteria andC17IsNotNull() {
            addCriterion("C17 is not null");
            return (Criteria) this;
        }

        public Criteria andC17EqualTo(String value) {
            addCriterion("C17 =", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotEqualTo(String value) {
            addCriterion("C17 <>", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17GreaterThan(String value) {
            addCriterion("C17 >", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17GreaterThanOrEqualTo(String value) {
            addCriterion("C17 >=", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17LessThan(String value) {
            addCriterion("C17 <", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17LessThanOrEqualTo(String value) {
            addCriterion("C17 <=", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17Like(String value) {
            addCriterion("C17 like", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotLike(String value) {
            addCriterion("C17 not like", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17In(List<String> values) {
            addCriterion("C17 in", values, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotIn(List<String> values) {
            addCriterion("C17 not in", values, "c17");
            return (Criteria) this;
        }

        public Criteria andC17Between(String value1, String value2) {
            addCriterion("C17 between", value1, value2, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotBetween(String value1, String value2) {
            addCriterion("C17 not between", value1, value2, "c17");
            return (Criteria) this;
        }

        public Criteria andC18IsNull() {
            addCriterion("C18 is null");
            return (Criteria) this;
        }

        public Criteria andC18IsNotNull() {
            addCriterion("C18 is not null");
            return (Criteria) this;
        }

        public Criteria andC18EqualTo(String value) {
            addCriterion("C18 =", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotEqualTo(String value) {
            addCriterion("C18 <>", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18GreaterThan(String value) {
            addCriterion("C18 >", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18GreaterThanOrEqualTo(String value) {
            addCriterion("C18 >=", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18LessThan(String value) {
            addCriterion("C18 <", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18LessThanOrEqualTo(String value) {
            addCriterion("C18 <=", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18Like(String value) {
            addCriterion("C18 like", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotLike(String value) {
            addCriterion("C18 not like", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18In(List<String> values) {
            addCriterion("C18 in", values, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotIn(List<String> values) {
            addCriterion("C18 not in", values, "c18");
            return (Criteria) this;
        }

        public Criteria andC18Between(String value1, String value2) {
            addCriterion("C18 between", value1, value2, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotBetween(String value1, String value2) {
            addCriterion("C18 not between", value1, value2, "c18");
            return (Criteria) this;
        }

        public Criteria andC19IsNull() {
            addCriterion("C19 is null");
            return (Criteria) this;
        }

        public Criteria andC19IsNotNull() {
            addCriterion("C19 is not null");
            return (Criteria) this;
        }

        public Criteria andC19EqualTo(String value) {
            addCriterion("C19 =", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotEqualTo(String value) {
            addCriterion("C19 <>", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19GreaterThan(String value) {
            addCriterion("C19 >", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19GreaterThanOrEqualTo(String value) {
            addCriterion("C19 >=", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19LessThan(String value) {
            addCriterion("C19 <", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19LessThanOrEqualTo(String value) {
            addCriterion("C19 <=", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19Like(String value) {
            addCriterion("C19 like", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotLike(String value) {
            addCriterion("C19 not like", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19In(List<String> values) {
            addCriterion("C19 in", values, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotIn(List<String> values) {
            addCriterion("C19 not in", values, "c19");
            return (Criteria) this;
        }

        public Criteria andC19Between(String value1, String value2) {
            addCriterion("C19 between", value1, value2, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotBetween(String value1, String value2) {
            addCriterion("C19 not between", value1, value2, "c19");
            return (Criteria) this;
        }

        public Criteria andC20IsNull() {
            addCriterion("C20 is null");
            return (Criteria) this;
        }

        public Criteria andC20IsNotNull() {
            addCriterion("C20 is not null");
            return (Criteria) this;
        }

        public Criteria andC20EqualTo(String value) {
            addCriterion("C20 =", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotEqualTo(String value) {
            addCriterion("C20 <>", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20GreaterThan(String value) {
            addCriterion("C20 >", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20GreaterThanOrEqualTo(String value) {
            addCriterion("C20 >=", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20LessThan(String value) {
            addCriterion("C20 <", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20LessThanOrEqualTo(String value) {
            addCriterion("C20 <=", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20Like(String value) {
            addCriterion("C20 like", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotLike(String value) {
            addCriterion("C20 not like", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20In(List<String> values) {
            addCriterion("C20 in", values, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotIn(List<String> values) {
            addCriterion("C20 not in", values, "c20");
            return (Criteria) this;
        }

        public Criteria andC20Between(String value1, String value2) {
            addCriterion("C20 between", value1, value2, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotBetween(String value1, String value2) {
            addCriterion("C20 not between", value1, value2, "c20");
            return (Criteria) this;
        }

        public Criteria andC21IsNull() {
            addCriterion("C21 is null");
            return (Criteria) this;
        }

        public Criteria andC21IsNotNull() {
            addCriterion("C21 is not null");
            return (Criteria) this;
        }

        public Criteria andC21EqualTo(String value) {
            addCriterion("C21 =", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotEqualTo(String value) {
            addCriterion("C21 <>", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21GreaterThan(String value) {
            addCriterion("C21 >", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21GreaterThanOrEqualTo(String value) {
            addCriterion("C21 >=", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21LessThan(String value) {
            addCriterion("C21 <", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21LessThanOrEqualTo(String value) {
            addCriterion("C21 <=", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21Like(String value) {
            addCriterion("C21 like", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotLike(String value) {
            addCriterion("C21 not like", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21In(List<String> values) {
            addCriterion("C21 in", values, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotIn(List<String> values) {
            addCriterion("C21 not in", values, "c21");
            return (Criteria) this;
        }

        public Criteria andC21Between(String value1, String value2) {
            addCriterion("C21 between", value1, value2, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotBetween(String value1, String value2) {
            addCriterion("C21 not between", value1, value2, "c21");
            return (Criteria) this;
        }

        public Criteria andC22IsNull() {
            addCriterion("C22 is null");
            return (Criteria) this;
        }

        public Criteria andC22IsNotNull() {
            addCriterion("C22 is not null");
            return (Criteria) this;
        }

        public Criteria andC22EqualTo(String value) {
            addCriterion("C22 =", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotEqualTo(String value) {
            addCriterion("C22 <>", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22GreaterThan(String value) {
            addCriterion("C22 >", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22GreaterThanOrEqualTo(String value) {
            addCriterion("C22 >=", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22LessThan(String value) {
            addCriterion("C22 <", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22LessThanOrEqualTo(String value) {
            addCriterion("C22 <=", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22Like(String value) {
            addCriterion("C22 like", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotLike(String value) {
            addCriterion("C22 not like", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22In(List<String> values) {
            addCriterion("C22 in", values, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotIn(List<String> values) {
            addCriterion("C22 not in", values, "c22");
            return (Criteria) this;
        }

        public Criteria andC22Between(String value1, String value2) {
            addCriterion("C22 between", value1, value2, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotBetween(String value1, String value2) {
            addCriterion("C22 not between", value1, value2, "c22");
            return (Criteria) this;
        }

        public Criteria andC23IsNull() {
            addCriterion("C23 is null");
            return (Criteria) this;
        }

        public Criteria andC23IsNotNull() {
            addCriterion("C23 is not null");
            return (Criteria) this;
        }

        public Criteria andC23EqualTo(String value) {
            addCriterion("C23 =", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotEqualTo(String value) {
            addCriterion("C23 <>", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23GreaterThan(String value) {
            addCriterion("C23 >", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23GreaterThanOrEqualTo(String value) {
            addCriterion("C23 >=", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23LessThan(String value) {
            addCriterion("C23 <", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23LessThanOrEqualTo(String value) {
            addCriterion("C23 <=", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23Like(String value) {
            addCriterion("C23 like", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotLike(String value) {
            addCriterion("C23 not like", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23In(List<String> values) {
            addCriterion("C23 in", values, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotIn(List<String> values) {
            addCriterion("C23 not in", values, "c23");
            return (Criteria) this;
        }

        public Criteria andC23Between(String value1, String value2) {
            addCriterion("C23 between", value1, value2, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotBetween(String value1, String value2) {
            addCriterion("C23 not between", value1, value2, "c23");
            return (Criteria) this;
        }

        public Criteria andC24IsNull() {
            addCriterion("C24 is null");
            return (Criteria) this;
        }

        public Criteria andC24IsNotNull() {
            addCriterion("C24 is not null");
            return (Criteria) this;
        }

        public Criteria andC24EqualTo(String value) {
            addCriterion("C24 =", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotEqualTo(String value) {
            addCriterion("C24 <>", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24GreaterThan(String value) {
            addCriterion("C24 >", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24GreaterThanOrEqualTo(String value) {
            addCriterion("C24 >=", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24LessThan(String value) {
            addCriterion("C24 <", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24LessThanOrEqualTo(String value) {
            addCriterion("C24 <=", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24Like(String value) {
            addCriterion("C24 like", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotLike(String value) {
            addCriterion("C24 not like", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24In(List<String> values) {
            addCriterion("C24 in", values, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotIn(List<String> values) {
            addCriterion("C24 not in", values, "c24");
            return (Criteria) this;
        }

        public Criteria andC24Between(String value1, String value2) {
            addCriterion("C24 between", value1, value2, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotBetween(String value1, String value2) {
            addCriterion("C24 not between", value1, value2, "c24");
            return (Criteria) this;
        }

        public Criteria andC25IsNull() {
            addCriterion("C25 is null");
            return (Criteria) this;
        }

        public Criteria andC25IsNotNull() {
            addCriterion("C25 is not null");
            return (Criteria) this;
        }

        public Criteria andC25EqualTo(String value) {
            addCriterion("C25 =", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotEqualTo(String value) {
            addCriterion("C25 <>", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25GreaterThan(String value) {
            addCriterion("C25 >", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25GreaterThanOrEqualTo(String value) {
            addCriterion("C25 >=", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25LessThan(String value) {
            addCriterion("C25 <", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25LessThanOrEqualTo(String value) {
            addCriterion("C25 <=", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25Like(String value) {
            addCriterion("C25 like", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotLike(String value) {
            addCriterion("C25 not like", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25In(List<String> values) {
            addCriterion("C25 in", values, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotIn(List<String> values) {
            addCriterion("C25 not in", values, "c25");
            return (Criteria) this;
        }

        public Criteria andC25Between(String value1, String value2) {
            addCriterion("C25 between", value1, value2, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotBetween(String value1, String value2) {
            addCriterion("C25 not between", value1, value2, "c25");
            return (Criteria) this;
        }

        public Criteria andC26IsNull() {
            addCriterion("C26 is null");
            return (Criteria) this;
        }

        public Criteria andC26IsNotNull() {
            addCriterion("C26 is not null");
            return (Criteria) this;
        }

        public Criteria andC26EqualTo(String value) {
            addCriterion("C26 =", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotEqualTo(String value) {
            addCriterion("C26 <>", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26GreaterThan(String value) {
            addCriterion("C26 >", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26GreaterThanOrEqualTo(String value) {
            addCriterion("C26 >=", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26LessThan(String value) {
            addCriterion("C26 <", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26LessThanOrEqualTo(String value) {
            addCriterion("C26 <=", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26Like(String value) {
            addCriterion("C26 like", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotLike(String value) {
            addCriterion("C26 not like", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26In(List<String> values) {
            addCriterion("C26 in", values, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotIn(List<String> values) {
            addCriterion("C26 not in", values, "c26");
            return (Criteria) this;
        }

        public Criteria andC26Between(String value1, String value2) {
            addCriterion("C26 between", value1, value2, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotBetween(String value1, String value2) {
            addCriterion("C26 not between", value1, value2, "c26");
            return (Criteria) this;
        }

        public Criteria andC27IsNull() {
            addCriterion("C27 is null");
            return (Criteria) this;
        }

        public Criteria andC27IsNotNull() {
            addCriterion("C27 is not null");
            return (Criteria) this;
        }

        public Criteria andC27EqualTo(String value) {
            addCriterion("C27 =", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotEqualTo(String value) {
            addCriterion("C27 <>", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27GreaterThan(String value) {
            addCriterion("C27 >", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27GreaterThanOrEqualTo(String value) {
            addCriterion("C27 >=", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27LessThan(String value) {
            addCriterion("C27 <", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27LessThanOrEqualTo(String value) {
            addCriterion("C27 <=", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27Like(String value) {
            addCriterion("C27 like", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotLike(String value) {
            addCriterion("C27 not like", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27In(List<String> values) {
            addCriterion("C27 in", values, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotIn(List<String> values) {
            addCriterion("C27 not in", values, "c27");
            return (Criteria) this;
        }

        public Criteria andC27Between(String value1, String value2) {
            addCriterion("C27 between", value1, value2, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotBetween(String value1, String value2) {
            addCriterion("C27 not between", value1, value2, "c27");
            return (Criteria) this;
        }

        public Criteria andC28IsNull() {
            addCriterion("C28 is null");
            return (Criteria) this;
        }

        public Criteria andC28IsNotNull() {
            addCriterion("C28 is not null");
            return (Criteria) this;
        }

        public Criteria andC28EqualTo(String value) {
            addCriterion("C28 =", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotEqualTo(String value) {
            addCriterion("C28 <>", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28GreaterThan(String value) {
            addCriterion("C28 >", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28GreaterThanOrEqualTo(String value) {
            addCriterion("C28 >=", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28LessThan(String value) {
            addCriterion("C28 <", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28LessThanOrEqualTo(String value) {
            addCriterion("C28 <=", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28Like(String value) {
            addCriterion("C28 like", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotLike(String value) {
            addCriterion("C28 not like", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28In(List<String> values) {
            addCriterion("C28 in", values, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotIn(List<String> values) {
            addCriterion("C28 not in", values, "c28");
            return (Criteria) this;
        }

        public Criteria andC28Between(String value1, String value2) {
            addCriterion("C28 between", value1, value2, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotBetween(String value1, String value2) {
            addCriterion("C28 not between", value1, value2, "c28");
            return (Criteria) this;
        }

        public Criteria andC29IsNull() {
            addCriterion("C29 is null");
            return (Criteria) this;
        }

        public Criteria andC29IsNotNull() {
            addCriterion("C29 is not null");
            return (Criteria) this;
        }

        public Criteria andC29EqualTo(String value) {
            addCriterion("C29 =", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotEqualTo(String value) {
            addCriterion("C29 <>", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29GreaterThan(String value) {
            addCriterion("C29 >", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29GreaterThanOrEqualTo(String value) {
            addCriterion("C29 >=", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29LessThan(String value) {
            addCriterion("C29 <", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29LessThanOrEqualTo(String value) {
            addCriterion("C29 <=", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29Like(String value) {
            addCriterion("C29 like", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotLike(String value) {
            addCriterion("C29 not like", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29In(List<String> values) {
            addCriterion("C29 in", values, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotIn(List<String> values) {
            addCriterion("C29 not in", values, "c29");
            return (Criteria) this;
        }

        public Criteria andC29Between(String value1, String value2) {
            addCriterion("C29 between", value1, value2, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotBetween(String value1, String value2) {
            addCriterion("C29 not between", value1, value2, "c29");
            return (Criteria) this;
        }

        public Criteria andC30IsNull() {
            addCriterion("C30 is null");
            return (Criteria) this;
        }

        public Criteria andC30IsNotNull() {
            addCriterion("C30 is not null");
            return (Criteria) this;
        }

        public Criteria andC30EqualTo(String value) {
            addCriterion("C30 =", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotEqualTo(String value) {
            addCriterion("C30 <>", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30GreaterThan(String value) {
            addCriterion("C30 >", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30GreaterThanOrEqualTo(String value) {
            addCriterion("C30 >=", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30LessThan(String value) {
            addCriterion("C30 <", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30LessThanOrEqualTo(String value) {
            addCriterion("C30 <=", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30Like(String value) {
            addCriterion("C30 like", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotLike(String value) {
            addCriterion("C30 not like", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30In(List<String> values) {
            addCriterion("C30 in", values, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotIn(List<String> values) {
            addCriterion("C30 not in", values, "c30");
            return (Criteria) this;
        }

        public Criteria andC30Between(String value1, String value2) {
            addCriterion("C30 between", value1, value2, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotBetween(String value1, String value2) {
            addCriterion("C30 not between", value1, value2, "c30");
            return (Criteria) this;
        }

        public Criteria andC31IsNull() {
            addCriterion("C31 is null");
            return (Criteria) this;
        }

        public Criteria andC31IsNotNull() {
            addCriterion("C31 is not null");
            return (Criteria) this;
        }

        public Criteria andC31EqualTo(String value) {
            addCriterion("C31 =", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotEqualTo(String value) {
            addCriterion("C31 <>", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31GreaterThan(String value) {
            addCriterion("C31 >", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31GreaterThanOrEqualTo(String value) {
            addCriterion("C31 >=", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31LessThan(String value) {
            addCriterion("C31 <", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31LessThanOrEqualTo(String value) {
            addCriterion("C31 <=", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31Like(String value) {
            addCriterion("C31 like", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotLike(String value) {
            addCriterion("C31 not like", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31In(List<String> values) {
            addCriterion("C31 in", values, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotIn(List<String> values) {
            addCriterion("C31 not in", values, "c31");
            return (Criteria) this;
        }

        public Criteria andC31Between(String value1, String value2) {
            addCriterion("C31 between", value1, value2, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotBetween(String value1, String value2) {
            addCriterion("C31 not between", value1, value2, "c31");
            return (Criteria) this;
        }

        public Criteria andC32IsNull() {
            addCriterion("C32 is null");
            return (Criteria) this;
        }

        public Criteria andC32IsNotNull() {
            addCriterion("C32 is not null");
            return (Criteria) this;
        }

        public Criteria andC32EqualTo(String value) {
            addCriterion("C32 =", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotEqualTo(String value) {
            addCriterion("C32 <>", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32GreaterThan(String value) {
            addCriterion("C32 >", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32GreaterThanOrEqualTo(String value) {
            addCriterion("C32 >=", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32LessThan(String value) {
            addCriterion("C32 <", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32LessThanOrEqualTo(String value) {
            addCriterion("C32 <=", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32Like(String value) {
            addCriterion("C32 like", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotLike(String value) {
            addCriterion("C32 not like", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32In(List<String> values) {
            addCriterion("C32 in", values, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotIn(List<String> values) {
            addCriterion("C32 not in", values, "c32");
            return (Criteria) this;
        }

        public Criteria andC32Between(String value1, String value2) {
            addCriterion("C32 between", value1, value2, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotBetween(String value1, String value2) {
            addCriterion("C32 not between", value1, value2, "c32");
            return (Criteria) this;
        }

        public Criteria andC33IsNull() {
            addCriterion("C33 is null");
            return (Criteria) this;
        }

        public Criteria andC33IsNotNull() {
            addCriterion("C33 is not null");
            return (Criteria) this;
        }

        public Criteria andC33EqualTo(String value) {
            addCriterion("C33 =", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotEqualTo(String value) {
            addCriterion("C33 <>", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33GreaterThan(String value) {
            addCriterion("C33 >", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33GreaterThanOrEqualTo(String value) {
            addCriterion("C33 >=", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33LessThan(String value) {
            addCriterion("C33 <", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33LessThanOrEqualTo(String value) {
            addCriterion("C33 <=", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33Like(String value) {
            addCriterion("C33 like", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotLike(String value) {
            addCriterion("C33 not like", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33In(List<String> values) {
            addCriterion("C33 in", values, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotIn(List<String> values) {
            addCriterion("C33 not in", values, "c33");
            return (Criteria) this;
        }

        public Criteria andC33Between(String value1, String value2) {
            addCriterion("C33 between", value1, value2, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotBetween(String value1, String value2) {
            addCriterion("C33 not between", value1, value2, "c33");
            return (Criteria) this;
        }

        public Criteria andC34IsNull() {
            addCriterion("C34 is null");
            return (Criteria) this;
        }

        public Criteria andC34IsNotNull() {
            addCriterion("C34 is not null");
            return (Criteria) this;
        }

        public Criteria andC34EqualTo(String value) {
            addCriterion("C34 =", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotEqualTo(String value) {
            addCriterion("C34 <>", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34GreaterThan(String value) {
            addCriterion("C34 >", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34GreaterThanOrEqualTo(String value) {
            addCriterion("C34 >=", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34LessThan(String value) {
            addCriterion("C34 <", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34LessThanOrEqualTo(String value) {
            addCriterion("C34 <=", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34Like(String value) {
            addCriterion("C34 like", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotLike(String value) {
            addCriterion("C34 not like", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34In(List<String> values) {
            addCriterion("C34 in", values, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotIn(List<String> values) {
            addCriterion("C34 not in", values, "c34");
            return (Criteria) this;
        }

        public Criteria andC34Between(String value1, String value2) {
            addCriterion("C34 between", value1, value2, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotBetween(String value1, String value2) {
            addCriterion("C34 not between", value1, value2, "c34");
            return (Criteria) this;
        }

        public Criteria andC35IsNull() {
            addCriterion("C35 is null");
            return (Criteria) this;
        }

        public Criteria andC35IsNotNull() {
            addCriterion("C35 is not null");
            return (Criteria) this;
        }

        public Criteria andC35EqualTo(String value) {
            addCriterion("C35 =", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotEqualTo(String value) {
            addCriterion("C35 <>", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35GreaterThan(String value) {
            addCriterion("C35 >", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35GreaterThanOrEqualTo(String value) {
            addCriterion("C35 >=", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35LessThan(String value) {
            addCriterion("C35 <", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35LessThanOrEqualTo(String value) {
            addCriterion("C35 <=", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35Like(String value) {
            addCriterion("C35 like", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotLike(String value) {
            addCriterion("C35 not like", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35In(List<String> values) {
            addCriterion("C35 in", values, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotIn(List<String> values) {
            addCriterion("C35 not in", values, "c35");
            return (Criteria) this;
        }

        public Criteria andC35Between(String value1, String value2) {
            addCriterion("C35 between", value1, value2, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotBetween(String value1, String value2) {
            addCriterion("C35 not between", value1, value2, "c35");
            return (Criteria) this;
        }

        public Criteria andC36IsNull() {
            addCriterion("C36 is null");
            return (Criteria) this;
        }

        public Criteria andC36IsNotNull() {
            addCriterion("C36 is not null");
            return (Criteria) this;
        }

        public Criteria andC36EqualTo(String value) {
            addCriterion("C36 =", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotEqualTo(String value) {
            addCriterion("C36 <>", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36GreaterThan(String value) {
            addCriterion("C36 >", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36GreaterThanOrEqualTo(String value) {
            addCriterion("C36 >=", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36LessThan(String value) {
            addCriterion("C36 <", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36LessThanOrEqualTo(String value) {
            addCriterion("C36 <=", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36Like(String value) {
            addCriterion("C36 like", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotLike(String value) {
            addCriterion("C36 not like", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36In(List<String> values) {
            addCriterion("C36 in", values, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotIn(List<String> values) {
            addCriterion("C36 not in", values, "c36");
            return (Criteria) this;
        }

        public Criteria andC36Between(String value1, String value2) {
            addCriterion("C36 between", value1, value2, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotBetween(String value1, String value2) {
            addCriterion("C36 not between", value1, value2, "c36");
            return (Criteria) this;
        }

        public Criteria andC37IsNull() {
            addCriterion("C37 is null");
            return (Criteria) this;
        }

        public Criteria andC37IsNotNull() {
            addCriterion("C37 is not null");
            return (Criteria) this;
        }

        public Criteria andC37EqualTo(String value) {
            addCriterion("C37 =", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotEqualTo(String value) {
            addCriterion("C37 <>", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37GreaterThan(String value) {
            addCriterion("C37 >", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37GreaterThanOrEqualTo(String value) {
            addCriterion("C37 >=", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37LessThan(String value) {
            addCriterion("C37 <", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37LessThanOrEqualTo(String value) {
            addCriterion("C37 <=", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37Like(String value) {
            addCriterion("C37 like", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotLike(String value) {
            addCriterion("C37 not like", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37In(List<String> values) {
            addCriterion("C37 in", values, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotIn(List<String> values) {
            addCriterion("C37 not in", values, "c37");
            return (Criteria) this;
        }

        public Criteria andC37Between(String value1, String value2) {
            addCriterion("C37 between", value1, value2, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotBetween(String value1, String value2) {
            addCriterion("C37 not between", value1, value2, "c37");
            return (Criteria) this;
        }

        public Criteria andC38IsNull() {
            addCriterion("C38 is null");
            return (Criteria) this;
        }

        public Criteria andC38IsNotNull() {
            addCriterion("C38 is not null");
            return (Criteria) this;
        }

        public Criteria andC38EqualTo(String value) {
            addCriterion("C38 =", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotEqualTo(String value) {
            addCriterion("C38 <>", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38GreaterThan(String value) {
            addCriterion("C38 >", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38GreaterThanOrEqualTo(String value) {
            addCriterion("C38 >=", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38LessThan(String value) {
            addCriterion("C38 <", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38LessThanOrEqualTo(String value) {
            addCriterion("C38 <=", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38Like(String value) {
            addCriterion("C38 like", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotLike(String value) {
            addCriterion("C38 not like", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38In(List<String> values) {
            addCriterion("C38 in", values, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotIn(List<String> values) {
            addCriterion("C38 not in", values, "c38");
            return (Criteria) this;
        }

        public Criteria andC38Between(String value1, String value2) {
            addCriterion("C38 between", value1, value2, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotBetween(String value1, String value2) {
            addCriterion("C38 not between", value1, value2, "c38");
            return (Criteria) this;
        }

        public Criteria andC39IsNull() {
            addCriterion("C39 is null");
            return (Criteria) this;
        }

        public Criteria andC39IsNotNull() {
            addCriterion("C39 is not null");
            return (Criteria) this;
        }

        public Criteria andC39EqualTo(String value) {
            addCriterion("C39 =", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotEqualTo(String value) {
            addCriterion("C39 <>", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39GreaterThan(String value) {
            addCriterion("C39 >", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39GreaterThanOrEqualTo(String value) {
            addCriterion("C39 >=", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39LessThan(String value) {
            addCriterion("C39 <", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39LessThanOrEqualTo(String value) {
            addCriterion("C39 <=", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39Like(String value) {
            addCriterion("C39 like", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotLike(String value) {
            addCriterion("C39 not like", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39In(List<String> values) {
            addCriterion("C39 in", values, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotIn(List<String> values) {
            addCriterion("C39 not in", values, "c39");
            return (Criteria) this;
        }

        public Criteria andC39Between(String value1, String value2) {
            addCriterion("C39 between", value1, value2, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotBetween(String value1, String value2) {
            addCriterion("C39 not between", value1, value2, "c39");
            return (Criteria) this;
        }

        public Criteria andC40IsNull() {
            addCriterion("C40 is null");
            return (Criteria) this;
        }

        public Criteria andC40IsNotNull() {
            addCriterion("C40 is not null");
            return (Criteria) this;
        }

        public Criteria andC40EqualTo(String value) {
            addCriterion("C40 =", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotEqualTo(String value) {
            addCriterion("C40 <>", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40GreaterThan(String value) {
            addCriterion("C40 >", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40GreaterThanOrEqualTo(String value) {
            addCriterion("C40 >=", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40LessThan(String value) {
            addCriterion("C40 <", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40LessThanOrEqualTo(String value) {
            addCriterion("C40 <=", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40Like(String value) {
            addCriterion("C40 like", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotLike(String value) {
            addCriterion("C40 not like", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40In(List<String> values) {
            addCriterion("C40 in", values, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotIn(List<String> values) {
            addCriterion("C40 not in", values, "c40");
            return (Criteria) this;
        }

        public Criteria andC40Between(String value1, String value2) {
            addCriterion("C40 between", value1, value2, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotBetween(String value1, String value2) {
            addCriterion("C40 not between", value1, value2, "c40");
            return (Criteria) this;
        }

        public Criteria andC41IsNull() {
            addCriterion("C41 is null");
            return (Criteria) this;
        }

        public Criteria andC41IsNotNull() {
            addCriterion("C41 is not null");
            return (Criteria) this;
        }

        public Criteria andC41EqualTo(String value) {
            addCriterion("C41 =", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotEqualTo(String value) {
            addCriterion("C41 <>", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41GreaterThan(String value) {
            addCriterion("C41 >", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41GreaterThanOrEqualTo(String value) {
            addCriterion("C41 >=", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41LessThan(String value) {
            addCriterion("C41 <", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41LessThanOrEqualTo(String value) {
            addCriterion("C41 <=", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41Like(String value) {
            addCriterion("C41 like", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotLike(String value) {
            addCriterion("C41 not like", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41In(List<String> values) {
            addCriterion("C41 in", values, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotIn(List<String> values) {
            addCriterion("C41 not in", values, "c41");
            return (Criteria) this;
        }

        public Criteria andC41Between(String value1, String value2) {
            addCriterion("C41 between", value1, value2, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotBetween(String value1, String value2) {
            addCriterion("C41 not between", value1, value2, "c41");
            return (Criteria) this;
        }

        public Criteria andC42IsNull() {
            addCriterion("C42 is null");
            return (Criteria) this;
        }

        public Criteria andC42IsNotNull() {
            addCriterion("C42 is not null");
            return (Criteria) this;
        }

        public Criteria andC42EqualTo(String value) {
            addCriterion("C42 =", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotEqualTo(String value) {
            addCriterion("C42 <>", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42GreaterThan(String value) {
            addCriterion("C42 >", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42GreaterThanOrEqualTo(String value) {
            addCriterion("C42 >=", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42LessThan(String value) {
            addCriterion("C42 <", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42LessThanOrEqualTo(String value) {
            addCriterion("C42 <=", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42Like(String value) {
            addCriterion("C42 like", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotLike(String value) {
            addCriterion("C42 not like", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42In(List<String> values) {
            addCriterion("C42 in", values, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotIn(List<String> values) {
            addCriterion("C42 not in", values, "c42");
            return (Criteria) this;
        }

        public Criteria andC42Between(String value1, String value2) {
            addCriterion("C42 between", value1, value2, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotBetween(String value1, String value2) {
            addCriterion("C42 not between", value1, value2, "c42");
            return (Criteria) this;
        }

        public Criteria andC43IsNull() {
            addCriterion("C43 is null");
            return (Criteria) this;
        }

        public Criteria andC43IsNotNull() {
            addCriterion("C43 is not null");
            return (Criteria) this;
        }

        public Criteria andC43EqualTo(String value) {
            addCriterion("C43 =", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotEqualTo(String value) {
            addCriterion("C43 <>", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43GreaterThan(String value) {
            addCriterion("C43 >", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43GreaterThanOrEqualTo(String value) {
            addCriterion("C43 >=", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43LessThan(String value) {
            addCriterion("C43 <", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43LessThanOrEqualTo(String value) {
            addCriterion("C43 <=", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43Like(String value) {
            addCriterion("C43 like", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotLike(String value) {
            addCriterion("C43 not like", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43In(List<String> values) {
            addCriterion("C43 in", values, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotIn(List<String> values) {
            addCriterion("C43 not in", values, "c43");
            return (Criteria) this;
        }

        public Criteria andC43Between(String value1, String value2) {
            addCriterion("C43 between", value1, value2, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotBetween(String value1, String value2) {
            addCriterion("C43 not between", value1, value2, "c43");
            return (Criteria) this;
        }

        public Criteria andC44IsNull() {
            addCriterion("C44 is null");
            return (Criteria) this;
        }

        public Criteria andC44IsNotNull() {
            addCriterion("C44 is not null");
            return (Criteria) this;
        }

        public Criteria andC44EqualTo(String value) {
            addCriterion("C44 =", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotEqualTo(String value) {
            addCriterion("C44 <>", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44GreaterThan(String value) {
            addCriterion("C44 >", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44GreaterThanOrEqualTo(String value) {
            addCriterion("C44 >=", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44LessThan(String value) {
            addCriterion("C44 <", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44LessThanOrEqualTo(String value) {
            addCriterion("C44 <=", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44Like(String value) {
            addCriterion("C44 like", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotLike(String value) {
            addCriterion("C44 not like", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44In(List<String> values) {
            addCriterion("C44 in", values, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotIn(List<String> values) {
            addCriterion("C44 not in", values, "c44");
            return (Criteria) this;
        }

        public Criteria andC44Between(String value1, String value2) {
            addCriterion("C44 between", value1, value2, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotBetween(String value1, String value2) {
            addCriterion("C44 not between", value1, value2, "c44");
            return (Criteria) this;
        }

        public Criteria andC45IsNull() {
            addCriterion("C45 is null");
            return (Criteria) this;
        }

        public Criteria andC45IsNotNull() {
            addCriterion("C45 is not null");
            return (Criteria) this;
        }

        public Criteria andC45EqualTo(String value) {
            addCriterion("C45 =", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotEqualTo(String value) {
            addCriterion("C45 <>", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45GreaterThan(String value) {
            addCriterion("C45 >", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45GreaterThanOrEqualTo(String value) {
            addCriterion("C45 >=", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45LessThan(String value) {
            addCriterion("C45 <", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45LessThanOrEqualTo(String value) {
            addCriterion("C45 <=", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45Like(String value) {
            addCriterion("C45 like", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotLike(String value) {
            addCriterion("C45 not like", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45In(List<String> values) {
            addCriterion("C45 in", values, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotIn(List<String> values) {
            addCriterion("C45 not in", values, "c45");
            return (Criteria) this;
        }

        public Criteria andC45Between(String value1, String value2) {
            addCriterion("C45 between", value1, value2, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotBetween(String value1, String value2) {
            addCriterion("C45 not between", value1, value2, "c45");
            return (Criteria) this;
        }

        public Criteria andC46IsNull() {
            addCriterion("C46 is null");
            return (Criteria) this;
        }

        public Criteria andC46IsNotNull() {
            addCriterion("C46 is not null");
            return (Criteria) this;
        }

        public Criteria andC46EqualTo(String value) {
            addCriterion("C46 =", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotEqualTo(String value) {
            addCriterion("C46 <>", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46GreaterThan(String value) {
            addCriterion("C46 >", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46GreaterThanOrEqualTo(String value) {
            addCriterion("C46 >=", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46LessThan(String value) {
            addCriterion("C46 <", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46LessThanOrEqualTo(String value) {
            addCriterion("C46 <=", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46Like(String value) {
            addCriterion("C46 like", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotLike(String value) {
            addCriterion("C46 not like", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46In(List<String> values) {
            addCriterion("C46 in", values, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotIn(List<String> values) {
            addCriterion("C46 not in", values, "c46");
            return (Criteria) this;
        }

        public Criteria andC46Between(String value1, String value2) {
            addCriterion("C46 between", value1, value2, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotBetween(String value1, String value2) {
            addCriterion("C46 not between", value1, value2, "c46");
            return (Criteria) this;
        }

        public Criteria andC47IsNull() {
            addCriterion("C47 is null");
            return (Criteria) this;
        }

        public Criteria andC47IsNotNull() {
            addCriterion("C47 is not null");
            return (Criteria) this;
        }

        public Criteria andC47EqualTo(String value) {
            addCriterion("C47 =", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotEqualTo(String value) {
            addCriterion("C47 <>", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47GreaterThan(String value) {
            addCriterion("C47 >", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47GreaterThanOrEqualTo(String value) {
            addCriterion("C47 >=", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47LessThan(String value) {
            addCriterion("C47 <", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47LessThanOrEqualTo(String value) {
            addCriterion("C47 <=", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47Like(String value) {
            addCriterion("C47 like", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotLike(String value) {
            addCriterion("C47 not like", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47In(List<String> values) {
            addCriterion("C47 in", values, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotIn(List<String> values) {
            addCriterion("C47 not in", values, "c47");
            return (Criteria) this;
        }

        public Criteria andC47Between(String value1, String value2) {
            addCriterion("C47 between", value1, value2, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotBetween(String value1, String value2) {
            addCriterion("C47 not between", value1, value2, "c47");
            return (Criteria) this;
        }

        public Criteria andC48IsNull() {
            addCriterion("C48 is null");
            return (Criteria) this;
        }

        public Criteria andC48IsNotNull() {
            addCriterion("C48 is not null");
            return (Criteria) this;
        }

        public Criteria andC48EqualTo(String value) {
            addCriterion("C48 =", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotEqualTo(String value) {
            addCriterion("C48 <>", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48GreaterThan(String value) {
            addCriterion("C48 >", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48GreaterThanOrEqualTo(String value) {
            addCriterion("C48 >=", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48LessThan(String value) {
            addCriterion("C48 <", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48LessThanOrEqualTo(String value) {
            addCriterion("C48 <=", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48Like(String value) {
            addCriterion("C48 like", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotLike(String value) {
            addCriterion("C48 not like", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48In(List<String> values) {
            addCriterion("C48 in", values, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotIn(List<String> values) {
            addCriterion("C48 not in", values, "c48");
            return (Criteria) this;
        }

        public Criteria andC48Between(String value1, String value2) {
            addCriterion("C48 between", value1, value2, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotBetween(String value1, String value2) {
            addCriterion("C48 not between", value1, value2, "c48");
            return (Criteria) this;
        }

        public Criteria andC49IsNull() {
            addCriterion("C49 is null");
            return (Criteria) this;
        }

        public Criteria andC49IsNotNull() {
            addCriterion("C49 is not null");
            return (Criteria) this;
        }

        public Criteria andC49EqualTo(String value) {
            addCriterion("C49 =", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotEqualTo(String value) {
            addCriterion("C49 <>", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49GreaterThan(String value) {
            addCriterion("C49 >", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49GreaterThanOrEqualTo(String value) {
            addCriterion("C49 >=", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49LessThan(String value) {
            addCriterion("C49 <", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49LessThanOrEqualTo(String value) {
            addCriterion("C49 <=", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49Like(String value) {
            addCriterion("C49 like", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotLike(String value) {
            addCriterion("C49 not like", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49In(List<String> values) {
            addCriterion("C49 in", values, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotIn(List<String> values) {
            addCriterion("C49 not in", values, "c49");
            return (Criteria) this;
        }

        public Criteria andC49Between(String value1, String value2) {
            addCriterion("C49 between", value1, value2, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotBetween(String value1, String value2) {
            addCriterion("C49 not between", value1, value2, "c49");
            return (Criteria) this;
        }

        public Criteria andC50IsNull() {
            addCriterion("C50 is null");
            return (Criteria) this;
        }

        public Criteria andC50IsNotNull() {
            addCriterion("C50 is not null");
            return (Criteria) this;
        }

        public Criteria andC50EqualTo(String value) {
            addCriterion("C50 =", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotEqualTo(String value) {
            addCriterion("C50 <>", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50GreaterThan(String value) {
            addCriterion("C50 >", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50GreaterThanOrEqualTo(String value) {
            addCriterion("C50 >=", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50LessThan(String value) {
            addCriterion("C50 <", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50LessThanOrEqualTo(String value) {
            addCriterion("C50 <=", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50Like(String value) {
            addCriterion("C50 like", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotLike(String value) {
            addCriterion("C50 not like", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50In(List<String> values) {
            addCriterion("C50 in", values, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotIn(List<String> values) {
            addCriterion("C50 not in", values, "c50");
            return (Criteria) this;
        }

        public Criteria andC50Between(String value1, String value2) {
            addCriterion("C50 between", value1, value2, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotBetween(String value1, String value2) {
            addCriterion("C50 not between", value1, value2, "c50");
            return (Criteria) this;
        }

        public Criteria andC51IsNull() {
            addCriterion("C51 is null");
            return (Criteria) this;
        }

        public Criteria andC51IsNotNull() {
            addCriterion("C51 is not null");
            return (Criteria) this;
        }

        public Criteria andC51EqualTo(String value) {
            addCriterion("C51 =", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotEqualTo(String value) {
            addCriterion("C51 <>", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51GreaterThan(String value) {
            addCriterion("C51 >", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51GreaterThanOrEqualTo(String value) {
            addCriterion("C51 >=", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51LessThan(String value) {
            addCriterion("C51 <", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51LessThanOrEqualTo(String value) {
            addCriterion("C51 <=", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51Like(String value) {
            addCriterion("C51 like", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotLike(String value) {
            addCriterion("C51 not like", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51In(List<String> values) {
            addCriterion("C51 in", values, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotIn(List<String> values) {
            addCriterion("C51 not in", values, "c51");
            return (Criteria) this;
        }

        public Criteria andC51Between(String value1, String value2) {
            addCriterion("C51 between", value1, value2, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotBetween(String value1, String value2) {
            addCriterion("C51 not between", value1, value2, "c51");
            return (Criteria) this;
        }

        public Criteria andC52IsNull() {
            addCriterion("C52 is null");
            return (Criteria) this;
        }

        public Criteria andC52IsNotNull() {
            addCriterion("C52 is not null");
            return (Criteria) this;
        }

        public Criteria andC52EqualTo(String value) {
            addCriterion("C52 =", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotEqualTo(String value) {
            addCriterion("C52 <>", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52GreaterThan(String value) {
            addCriterion("C52 >", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52GreaterThanOrEqualTo(String value) {
            addCriterion("C52 >=", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52LessThan(String value) {
            addCriterion("C52 <", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52LessThanOrEqualTo(String value) {
            addCriterion("C52 <=", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52Like(String value) {
            addCriterion("C52 like", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotLike(String value) {
            addCriterion("C52 not like", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52In(List<String> values) {
            addCriterion("C52 in", values, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotIn(List<String> values) {
            addCriterion("C52 not in", values, "c52");
            return (Criteria) this;
        }

        public Criteria andC52Between(String value1, String value2) {
            addCriterion("C52 between", value1, value2, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotBetween(String value1, String value2) {
            addCriterion("C52 not between", value1, value2, "c52");
            return (Criteria) this;
        }

        public Criteria andC53IsNull() {
            addCriterion("C53 is null");
            return (Criteria) this;
        }

        public Criteria andC53IsNotNull() {
            addCriterion("C53 is not null");
            return (Criteria) this;
        }

        public Criteria andC53EqualTo(String value) {
            addCriterion("C53 =", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotEqualTo(String value) {
            addCriterion("C53 <>", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53GreaterThan(String value) {
            addCriterion("C53 >", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53GreaterThanOrEqualTo(String value) {
            addCriterion("C53 >=", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53LessThan(String value) {
            addCriterion("C53 <", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53LessThanOrEqualTo(String value) {
            addCriterion("C53 <=", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53Like(String value) {
            addCriterion("C53 like", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotLike(String value) {
            addCriterion("C53 not like", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53In(List<String> values) {
            addCriterion("C53 in", values, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotIn(List<String> values) {
            addCriterion("C53 not in", values, "c53");
            return (Criteria) this;
        }

        public Criteria andC53Between(String value1, String value2) {
            addCriterion("C53 between", value1, value2, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotBetween(String value1, String value2) {
            addCriterion("C53 not between", value1, value2, "c53");
            return (Criteria) this;
        }

        public Criteria andC54IsNull() {
            addCriterion("C54 is null");
            return (Criteria) this;
        }

        public Criteria andC54IsNotNull() {
            addCriterion("C54 is not null");
            return (Criteria) this;
        }

        public Criteria andC54EqualTo(String value) {
            addCriterion("C54 =", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotEqualTo(String value) {
            addCriterion("C54 <>", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54GreaterThan(String value) {
            addCriterion("C54 >", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54GreaterThanOrEqualTo(String value) {
            addCriterion("C54 >=", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54LessThan(String value) {
            addCriterion("C54 <", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54LessThanOrEqualTo(String value) {
            addCriterion("C54 <=", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54Like(String value) {
            addCriterion("C54 like", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotLike(String value) {
            addCriterion("C54 not like", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54In(List<String> values) {
            addCriterion("C54 in", values, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotIn(List<String> values) {
            addCriterion("C54 not in", values, "c54");
            return (Criteria) this;
        }

        public Criteria andC54Between(String value1, String value2) {
            addCriterion("C54 between", value1, value2, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotBetween(String value1, String value2) {
            addCriterion("C54 not between", value1, value2, "c54");
            return (Criteria) this;
        }

        public Criteria andC55IsNull() {
            addCriterion("C55 is null");
            return (Criteria) this;
        }

        public Criteria andC55IsNotNull() {
            addCriterion("C55 is not null");
            return (Criteria) this;
        }

        public Criteria andC55EqualTo(String value) {
            addCriterion("C55 =", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotEqualTo(String value) {
            addCriterion("C55 <>", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55GreaterThan(String value) {
            addCriterion("C55 >", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55GreaterThanOrEqualTo(String value) {
            addCriterion("C55 >=", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55LessThan(String value) {
            addCriterion("C55 <", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55LessThanOrEqualTo(String value) {
            addCriterion("C55 <=", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55Like(String value) {
            addCriterion("C55 like", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotLike(String value) {
            addCriterion("C55 not like", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55In(List<String> values) {
            addCriterion("C55 in", values, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotIn(List<String> values) {
            addCriterion("C55 not in", values, "c55");
            return (Criteria) this;
        }

        public Criteria andC55Between(String value1, String value2) {
            addCriterion("C55 between", value1, value2, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotBetween(String value1, String value2) {
            addCriterion("C55 not between", value1, value2, "c55");
            return (Criteria) this;
        }

        public Criteria andC56IsNull() {
            addCriterion("C56 is null");
            return (Criteria) this;
        }

        public Criteria andC56IsNotNull() {
            addCriterion("C56 is not null");
            return (Criteria) this;
        }

        public Criteria andC56EqualTo(String value) {
            addCriterion("C56 =", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotEqualTo(String value) {
            addCriterion("C56 <>", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56GreaterThan(String value) {
            addCriterion("C56 >", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56GreaterThanOrEqualTo(String value) {
            addCriterion("C56 >=", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56LessThan(String value) {
            addCriterion("C56 <", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56LessThanOrEqualTo(String value) {
            addCriterion("C56 <=", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56Like(String value) {
            addCriterion("C56 like", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotLike(String value) {
            addCriterion("C56 not like", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56In(List<String> values) {
            addCriterion("C56 in", values, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotIn(List<String> values) {
            addCriterion("C56 not in", values, "c56");
            return (Criteria) this;
        }

        public Criteria andC56Between(String value1, String value2) {
            addCriterion("C56 between", value1, value2, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotBetween(String value1, String value2) {
            addCriterion("C56 not between", value1, value2, "c56");
            return (Criteria) this;
        }

        public Criteria andC57IsNull() {
            addCriterion("C57 is null");
            return (Criteria) this;
        }

        public Criteria andC57IsNotNull() {
            addCriterion("C57 is not null");
            return (Criteria) this;
        }

        public Criteria andC57EqualTo(String value) {
            addCriterion("C57 =", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotEqualTo(String value) {
            addCriterion("C57 <>", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57GreaterThan(String value) {
            addCriterion("C57 >", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57GreaterThanOrEqualTo(String value) {
            addCriterion("C57 >=", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57LessThan(String value) {
            addCriterion("C57 <", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57LessThanOrEqualTo(String value) {
            addCriterion("C57 <=", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57Like(String value) {
            addCriterion("C57 like", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotLike(String value) {
            addCriterion("C57 not like", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57In(List<String> values) {
            addCriterion("C57 in", values, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotIn(List<String> values) {
            addCriterion("C57 not in", values, "c57");
            return (Criteria) this;
        }

        public Criteria andC57Between(String value1, String value2) {
            addCriterion("C57 between", value1, value2, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotBetween(String value1, String value2) {
            addCriterion("C57 not between", value1, value2, "c57");
            return (Criteria) this;
        }

        public Criteria andC58IsNull() {
            addCriterion("C58 is null");
            return (Criteria) this;
        }

        public Criteria andC58IsNotNull() {
            addCriterion("C58 is not null");
            return (Criteria) this;
        }

        public Criteria andC58EqualTo(String value) {
            addCriterion("C58 =", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotEqualTo(String value) {
            addCriterion("C58 <>", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58GreaterThan(String value) {
            addCriterion("C58 >", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58GreaterThanOrEqualTo(String value) {
            addCriterion("C58 >=", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58LessThan(String value) {
            addCriterion("C58 <", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58LessThanOrEqualTo(String value) {
            addCriterion("C58 <=", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58Like(String value) {
            addCriterion("C58 like", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotLike(String value) {
            addCriterion("C58 not like", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58In(List<String> values) {
            addCriterion("C58 in", values, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotIn(List<String> values) {
            addCriterion("C58 not in", values, "c58");
            return (Criteria) this;
        }

        public Criteria andC58Between(String value1, String value2) {
            addCriterion("C58 between", value1, value2, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotBetween(String value1, String value2) {
            addCriterion("C58 not between", value1, value2, "c58");
            return (Criteria) this;
        }

        public Criteria andC59IsNull() {
            addCriterion("C59 is null");
            return (Criteria) this;
        }

        public Criteria andC59IsNotNull() {
            addCriterion("C59 is not null");
            return (Criteria) this;
        }

        public Criteria andC59EqualTo(String value) {
            addCriterion("C59 =", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotEqualTo(String value) {
            addCriterion("C59 <>", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59GreaterThan(String value) {
            addCriterion("C59 >", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59GreaterThanOrEqualTo(String value) {
            addCriterion("C59 >=", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59LessThan(String value) {
            addCriterion("C59 <", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59LessThanOrEqualTo(String value) {
            addCriterion("C59 <=", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59Like(String value) {
            addCriterion("C59 like", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotLike(String value) {
            addCriterion("C59 not like", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59In(List<String> values) {
            addCriterion("C59 in", values, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotIn(List<String> values) {
            addCriterion("C59 not in", values, "c59");
            return (Criteria) this;
        }

        public Criteria andC59Between(String value1, String value2) {
            addCriterion("C59 between", value1, value2, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotBetween(String value1, String value2) {
            addCriterion("C59 not between", value1, value2, "c59");
            return (Criteria) this;
        }

        public Criteria andC60IsNull() {
            addCriterion("C60 is null");
            return (Criteria) this;
        }

        public Criteria andC60IsNotNull() {
            addCriterion("C60 is not null");
            return (Criteria) this;
        }

        public Criteria andC60EqualTo(String value) {
            addCriterion("C60 =", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotEqualTo(String value) {
            addCriterion("C60 <>", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60GreaterThan(String value) {
            addCriterion("C60 >", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60GreaterThanOrEqualTo(String value) {
            addCriterion("C60 >=", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60LessThan(String value) {
            addCriterion("C60 <", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60LessThanOrEqualTo(String value) {
            addCriterion("C60 <=", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60Like(String value) {
            addCriterion("C60 like", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotLike(String value) {
            addCriterion("C60 not like", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60In(List<String> values) {
            addCriterion("C60 in", values, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotIn(List<String> values) {
            addCriterion("C60 not in", values, "c60");
            return (Criteria) this;
        }

        public Criteria andC60Between(String value1, String value2) {
            addCriterion("C60 between", value1, value2, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotBetween(String value1, String value2) {
            addCriterion("C60 not between", value1, value2, "c60");
            return (Criteria) this;
        }

        public Criteria andC61IsNull() {
            addCriterion("C61 is null");
            return (Criteria) this;
        }

        public Criteria andC61IsNotNull() {
            addCriterion("C61 is not null");
            return (Criteria) this;
        }

        public Criteria andC61EqualTo(String value) {
            addCriterion("C61 =", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotEqualTo(String value) {
            addCriterion("C61 <>", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61GreaterThan(String value) {
            addCriterion("C61 >", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61GreaterThanOrEqualTo(String value) {
            addCriterion("C61 >=", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61LessThan(String value) {
            addCriterion("C61 <", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61LessThanOrEqualTo(String value) {
            addCriterion("C61 <=", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61Like(String value) {
            addCriterion("C61 like", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotLike(String value) {
            addCriterion("C61 not like", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61In(List<String> values) {
            addCriterion("C61 in", values, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotIn(List<String> values) {
            addCriterion("C61 not in", values, "c61");
            return (Criteria) this;
        }

        public Criteria andC61Between(String value1, String value2) {
            addCriterion("C61 between", value1, value2, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotBetween(String value1, String value2) {
            addCriterion("C61 not between", value1, value2, "c61");
            return (Criteria) this;
        }

        public Criteria andC62IsNull() {
            addCriterion("C62 is null");
            return (Criteria) this;
        }

        public Criteria andC62IsNotNull() {
            addCriterion("C62 is not null");
            return (Criteria) this;
        }

        public Criteria andC62EqualTo(String value) {
            addCriterion("C62 =", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotEqualTo(String value) {
            addCriterion("C62 <>", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62GreaterThan(String value) {
            addCriterion("C62 >", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62GreaterThanOrEqualTo(String value) {
            addCriterion("C62 >=", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62LessThan(String value) {
            addCriterion("C62 <", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62LessThanOrEqualTo(String value) {
            addCriterion("C62 <=", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62Like(String value) {
            addCriterion("C62 like", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotLike(String value) {
            addCriterion("C62 not like", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62In(List<String> values) {
            addCriterion("C62 in", values, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotIn(List<String> values) {
            addCriterion("C62 not in", values, "c62");
            return (Criteria) this;
        }

        public Criteria andC62Between(String value1, String value2) {
            addCriterion("C62 between", value1, value2, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotBetween(String value1, String value2) {
            addCriterion("C62 not between", value1, value2, "c62");
            return (Criteria) this;
        }

        public Criteria andC63IsNull() {
            addCriterion("C63 is null");
            return (Criteria) this;
        }

        public Criteria andC63IsNotNull() {
            addCriterion("C63 is not null");
            return (Criteria) this;
        }

        public Criteria andC63EqualTo(String value) {
            addCriterion("C63 =", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotEqualTo(String value) {
            addCriterion("C63 <>", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63GreaterThan(String value) {
            addCriterion("C63 >", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63GreaterThanOrEqualTo(String value) {
            addCriterion("C63 >=", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63LessThan(String value) {
            addCriterion("C63 <", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63LessThanOrEqualTo(String value) {
            addCriterion("C63 <=", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63Like(String value) {
            addCriterion("C63 like", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotLike(String value) {
            addCriterion("C63 not like", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63In(List<String> values) {
            addCriterion("C63 in", values, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotIn(List<String> values) {
            addCriterion("C63 not in", values, "c63");
            return (Criteria) this;
        }

        public Criteria andC63Between(String value1, String value2) {
            addCriterion("C63 between", value1, value2, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotBetween(String value1, String value2) {
            addCriterion("C63 not between", value1, value2, "c63");
            return (Criteria) this;
        }

        public Criteria andC64IsNull() {
            addCriterion("C64 is null");
            return (Criteria) this;
        }

        public Criteria andC64IsNotNull() {
            addCriterion("C64 is not null");
            return (Criteria) this;
        }

        public Criteria andC64EqualTo(String value) {
            addCriterion("C64 =", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotEqualTo(String value) {
            addCriterion("C64 <>", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64GreaterThan(String value) {
            addCriterion("C64 >", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64GreaterThanOrEqualTo(String value) {
            addCriterion("C64 >=", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64LessThan(String value) {
            addCriterion("C64 <", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64LessThanOrEqualTo(String value) {
            addCriterion("C64 <=", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64Like(String value) {
            addCriterion("C64 like", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotLike(String value) {
            addCriterion("C64 not like", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64In(List<String> values) {
            addCriterion("C64 in", values, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotIn(List<String> values) {
            addCriterion("C64 not in", values, "c64");
            return (Criteria) this;
        }

        public Criteria andC64Between(String value1, String value2) {
            addCriterion("C64 between", value1, value2, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotBetween(String value1, String value2) {
            addCriterion("C64 not between", value1, value2, "c64");
            return (Criteria) this;
        }

        public Criteria andC65IsNull() {
            addCriterion("C65 is null");
            return (Criteria) this;
        }

        public Criteria andC65IsNotNull() {
            addCriterion("C65 is not null");
            return (Criteria) this;
        }

        public Criteria andC65EqualTo(String value) {
            addCriterion("C65 =", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotEqualTo(String value) {
            addCriterion("C65 <>", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65GreaterThan(String value) {
            addCriterion("C65 >", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65GreaterThanOrEqualTo(String value) {
            addCriterion("C65 >=", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65LessThan(String value) {
            addCriterion("C65 <", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65LessThanOrEqualTo(String value) {
            addCriterion("C65 <=", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65Like(String value) {
            addCriterion("C65 like", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotLike(String value) {
            addCriterion("C65 not like", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65In(List<String> values) {
            addCriterion("C65 in", values, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotIn(List<String> values) {
            addCriterion("C65 not in", values, "c65");
            return (Criteria) this;
        }

        public Criteria andC65Between(String value1, String value2) {
            addCriterion("C65 between", value1, value2, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotBetween(String value1, String value2) {
            addCriterion("C65 not between", value1, value2, "c65");
            return (Criteria) this;
        }

        public Criteria andC66IsNull() {
            addCriterion("C66 is null");
            return (Criteria) this;
        }

        public Criteria andC66IsNotNull() {
            addCriterion("C66 is not null");
            return (Criteria) this;
        }

        public Criteria andC66EqualTo(String value) {
            addCriterion("C66 =", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotEqualTo(String value) {
            addCriterion("C66 <>", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66GreaterThan(String value) {
            addCriterion("C66 >", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66GreaterThanOrEqualTo(String value) {
            addCriterion("C66 >=", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66LessThan(String value) {
            addCriterion("C66 <", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66LessThanOrEqualTo(String value) {
            addCriterion("C66 <=", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66Like(String value) {
            addCriterion("C66 like", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotLike(String value) {
            addCriterion("C66 not like", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66In(List<String> values) {
            addCriterion("C66 in", values, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotIn(List<String> values) {
            addCriterion("C66 not in", values, "c66");
            return (Criteria) this;
        }

        public Criteria andC66Between(String value1, String value2) {
            addCriterion("C66 between", value1, value2, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotBetween(String value1, String value2) {
            addCriterion("C66 not between", value1, value2, "c66");
            return (Criteria) this;
        }

        public Criteria andC67IsNull() {
            addCriterion("C67 is null");
            return (Criteria) this;
        }

        public Criteria andC67IsNotNull() {
            addCriterion("C67 is not null");
            return (Criteria) this;
        }

        public Criteria andC67EqualTo(String value) {
            addCriterion("C67 =", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotEqualTo(String value) {
            addCriterion("C67 <>", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67GreaterThan(String value) {
            addCriterion("C67 >", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67GreaterThanOrEqualTo(String value) {
            addCriterion("C67 >=", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67LessThan(String value) {
            addCriterion("C67 <", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67LessThanOrEqualTo(String value) {
            addCriterion("C67 <=", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67Like(String value) {
            addCriterion("C67 like", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotLike(String value) {
            addCriterion("C67 not like", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67In(List<String> values) {
            addCriterion("C67 in", values, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotIn(List<String> values) {
            addCriterion("C67 not in", values, "c67");
            return (Criteria) this;
        }

        public Criteria andC67Between(String value1, String value2) {
            addCriterion("C67 between", value1, value2, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotBetween(String value1, String value2) {
            addCriterion("C67 not between", value1, value2, "c67");
            return (Criteria) this;
        }

        public Criteria andC68IsNull() {
            addCriterion("C68 is null");
            return (Criteria) this;
        }

        public Criteria andC68IsNotNull() {
            addCriterion("C68 is not null");
            return (Criteria) this;
        }

        public Criteria andC68EqualTo(String value) {
            addCriterion("C68 =", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotEqualTo(String value) {
            addCriterion("C68 <>", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68GreaterThan(String value) {
            addCriterion("C68 >", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68GreaterThanOrEqualTo(String value) {
            addCriterion("C68 >=", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68LessThan(String value) {
            addCriterion("C68 <", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68LessThanOrEqualTo(String value) {
            addCriterion("C68 <=", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68Like(String value) {
            addCriterion("C68 like", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotLike(String value) {
            addCriterion("C68 not like", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68In(List<String> values) {
            addCriterion("C68 in", values, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotIn(List<String> values) {
            addCriterion("C68 not in", values, "c68");
            return (Criteria) this;
        }

        public Criteria andC68Between(String value1, String value2) {
            addCriterion("C68 between", value1, value2, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotBetween(String value1, String value2) {
            addCriterion("C68 not between", value1, value2, "c68");
            return (Criteria) this;
        }

        public Criteria andC69IsNull() {
            addCriterion("C69 is null");
            return (Criteria) this;
        }

        public Criteria andC69IsNotNull() {
            addCriterion("C69 is not null");
            return (Criteria) this;
        }

        public Criteria andC69EqualTo(String value) {
            addCriterion("C69 =", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotEqualTo(String value) {
            addCriterion("C69 <>", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69GreaterThan(String value) {
            addCriterion("C69 >", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69GreaterThanOrEqualTo(String value) {
            addCriterion("C69 >=", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69LessThan(String value) {
            addCriterion("C69 <", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69LessThanOrEqualTo(String value) {
            addCriterion("C69 <=", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69Like(String value) {
            addCriterion("C69 like", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotLike(String value) {
            addCriterion("C69 not like", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69In(List<String> values) {
            addCriterion("C69 in", values, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotIn(List<String> values) {
            addCriterion("C69 not in", values, "c69");
            return (Criteria) this;
        }

        public Criteria andC69Between(String value1, String value2) {
            addCriterion("C69 between", value1, value2, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotBetween(String value1, String value2) {
            addCriterion("C69 not between", value1, value2, "c69");
            return (Criteria) this;
        }

        public Criteria andC70IsNull() {
            addCriterion("C70 is null");
            return (Criteria) this;
        }

        public Criteria andC70IsNotNull() {
            addCriterion("C70 is not null");
            return (Criteria) this;
        }

        public Criteria andC70EqualTo(String value) {
            addCriterion("C70 =", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotEqualTo(String value) {
            addCriterion("C70 <>", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70GreaterThan(String value) {
            addCriterion("C70 >", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70GreaterThanOrEqualTo(String value) {
            addCriterion("C70 >=", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70LessThan(String value) {
            addCriterion("C70 <", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70LessThanOrEqualTo(String value) {
            addCriterion("C70 <=", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70Like(String value) {
            addCriterion("C70 like", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotLike(String value) {
            addCriterion("C70 not like", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70In(List<String> values) {
            addCriterion("C70 in", values, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotIn(List<String> values) {
            addCriterion("C70 not in", values, "c70");
            return (Criteria) this;
        }

        public Criteria andC70Between(String value1, String value2) {
            addCriterion("C70 between", value1, value2, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotBetween(String value1, String value2) {
            addCriterion("C70 not between", value1, value2, "c70");
            return (Criteria) this;
        }

        public Criteria andC71IsNull() {
            addCriterion("C71 is null");
            return (Criteria) this;
        }

        public Criteria andC71IsNotNull() {
            addCriterion("C71 is not null");
            return (Criteria) this;
        }

        public Criteria andC71EqualTo(String value) {
            addCriterion("C71 =", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotEqualTo(String value) {
            addCriterion("C71 <>", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71GreaterThan(String value) {
            addCriterion("C71 >", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71GreaterThanOrEqualTo(String value) {
            addCriterion("C71 >=", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71LessThan(String value) {
            addCriterion("C71 <", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71LessThanOrEqualTo(String value) {
            addCriterion("C71 <=", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71Like(String value) {
            addCriterion("C71 like", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotLike(String value) {
            addCriterion("C71 not like", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71In(List<String> values) {
            addCriterion("C71 in", values, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotIn(List<String> values) {
            addCriterion("C71 not in", values, "c71");
            return (Criteria) this;
        }

        public Criteria andC71Between(String value1, String value2) {
            addCriterion("C71 between", value1, value2, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotBetween(String value1, String value2) {
            addCriterion("C71 not between", value1, value2, "c71");
            return (Criteria) this;
        }

        public Criteria andC72IsNull() {
            addCriterion("C72 is null");
            return (Criteria) this;
        }

        public Criteria andC72IsNotNull() {
            addCriterion("C72 is not null");
            return (Criteria) this;
        }

        public Criteria andC72EqualTo(String value) {
            addCriterion("C72 =", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotEqualTo(String value) {
            addCriterion("C72 <>", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72GreaterThan(String value) {
            addCriterion("C72 >", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72GreaterThanOrEqualTo(String value) {
            addCriterion("C72 >=", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72LessThan(String value) {
            addCriterion("C72 <", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72LessThanOrEqualTo(String value) {
            addCriterion("C72 <=", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72Like(String value) {
            addCriterion("C72 like", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotLike(String value) {
            addCriterion("C72 not like", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72In(List<String> values) {
            addCriterion("C72 in", values, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotIn(List<String> values) {
            addCriterion("C72 not in", values, "c72");
            return (Criteria) this;
        }

        public Criteria andC72Between(String value1, String value2) {
            addCriterion("C72 between", value1, value2, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotBetween(String value1, String value2) {
            addCriterion("C72 not between", value1, value2, "c72");
            return (Criteria) this;
        }

        public Criteria andC73IsNull() {
            addCriterion("C73 is null");
            return (Criteria) this;
        }

        public Criteria andC73IsNotNull() {
            addCriterion("C73 is not null");
            return (Criteria) this;
        }

        public Criteria andC73EqualTo(String value) {
            addCriterion("C73 =", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotEqualTo(String value) {
            addCriterion("C73 <>", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73GreaterThan(String value) {
            addCriterion("C73 >", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73GreaterThanOrEqualTo(String value) {
            addCriterion("C73 >=", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73LessThan(String value) {
            addCriterion("C73 <", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73LessThanOrEqualTo(String value) {
            addCriterion("C73 <=", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73Like(String value) {
            addCriterion("C73 like", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotLike(String value) {
            addCriterion("C73 not like", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73In(List<String> values) {
            addCriterion("C73 in", values, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotIn(List<String> values) {
            addCriterion("C73 not in", values, "c73");
            return (Criteria) this;
        }

        public Criteria andC73Between(String value1, String value2) {
            addCriterion("C73 between", value1, value2, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotBetween(String value1, String value2) {
            addCriterion("C73 not between", value1, value2, "c73");
            return (Criteria) this;
        }

        public Criteria andC74IsNull() {
            addCriterion("C74 is null");
            return (Criteria) this;
        }

        public Criteria andC74IsNotNull() {
            addCriterion("C74 is not null");
            return (Criteria) this;
        }

        public Criteria andC74EqualTo(String value) {
            addCriterion("C74 =", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotEqualTo(String value) {
            addCriterion("C74 <>", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74GreaterThan(String value) {
            addCriterion("C74 >", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74GreaterThanOrEqualTo(String value) {
            addCriterion("C74 >=", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74LessThan(String value) {
            addCriterion("C74 <", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74LessThanOrEqualTo(String value) {
            addCriterion("C74 <=", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74Like(String value) {
            addCriterion("C74 like", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotLike(String value) {
            addCriterion("C74 not like", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74In(List<String> values) {
            addCriterion("C74 in", values, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotIn(List<String> values) {
            addCriterion("C74 not in", values, "c74");
            return (Criteria) this;
        }

        public Criteria andC74Between(String value1, String value2) {
            addCriterion("C74 between", value1, value2, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotBetween(String value1, String value2) {
            addCriterion("C74 not between", value1, value2, "c74");
            return (Criteria) this;
        }

        public Criteria andC75IsNull() {
            addCriterion("C75 is null");
            return (Criteria) this;
        }

        public Criteria andC75IsNotNull() {
            addCriterion("C75 is not null");
            return (Criteria) this;
        }

        public Criteria andC75EqualTo(String value) {
            addCriterion("C75 =", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotEqualTo(String value) {
            addCriterion("C75 <>", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75GreaterThan(String value) {
            addCriterion("C75 >", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75GreaterThanOrEqualTo(String value) {
            addCriterion("C75 >=", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75LessThan(String value) {
            addCriterion("C75 <", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75LessThanOrEqualTo(String value) {
            addCriterion("C75 <=", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75Like(String value) {
            addCriterion("C75 like", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotLike(String value) {
            addCriterion("C75 not like", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75In(List<String> values) {
            addCriterion("C75 in", values, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotIn(List<String> values) {
            addCriterion("C75 not in", values, "c75");
            return (Criteria) this;
        }

        public Criteria andC75Between(String value1, String value2) {
            addCriterion("C75 between", value1, value2, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotBetween(String value1, String value2) {
            addCriterion("C75 not between", value1, value2, "c75");
            return (Criteria) this;
        }

        public Criteria andC76IsNull() {
            addCriterion("C76 is null");
            return (Criteria) this;
        }

        public Criteria andC76IsNotNull() {
            addCriterion("C76 is not null");
            return (Criteria) this;
        }

        public Criteria andC76EqualTo(String value) {
            addCriterion("C76 =", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotEqualTo(String value) {
            addCriterion("C76 <>", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76GreaterThan(String value) {
            addCriterion("C76 >", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76GreaterThanOrEqualTo(String value) {
            addCriterion("C76 >=", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76LessThan(String value) {
            addCriterion("C76 <", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76LessThanOrEqualTo(String value) {
            addCriterion("C76 <=", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76Like(String value) {
            addCriterion("C76 like", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotLike(String value) {
            addCriterion("C76 not like", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76In(List<String> values) {
            addCriterion("C76 in", values, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotIn(List<String> values) {
            addCriterion("C76 not in", values, "c76");
            return (Criteria) this;
        }

        public Criteria andC76Between(String value1, String value2) {
            addCriterion("C76 between", value1, value2, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotBetween(String value1, String value2) {
            addCriterion("C76 not between", value1, value2, "c76");
            return (Criteria) this;
        }

        public Criteria andC77IsNull() {
            addCriterion("C77 is null");
            return (Criteria) this;
        }

        public Criteria andC77IsNotNull() {
            addCriterion("C77 is not null");
            return (Criteria) this;
        }

        public Criteria andC77EqualTo(String value) {
            addCriterion("C77 =", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotEqualTo(String value) {
            addCriterion("C77 <>", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77GreaterThan(String value) {
            addCriterion("C77 >", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77GreaterThanOrEqualTo(String value) {
            addCriterion("C77 >=", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77LessThan(String value) {
            addCriterion("C77 <", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77LessThanOrEqualTo(String value) {
            addCriterion("C77 <=", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77Like(String value) {
            addCriterion("C77 like", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotLike(String value) {
            addCriterion("C77 not like", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77In(List<String> values) {
            addCriterion("C77 in", values, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotIn(List<String> values) {
            addCriterion("C77 not in", values, "c77");
            return (Criteria) this;
        }

        public Criteria andC77Between(String value1, String value2) {
            addCriterion("C77 between", value1, value2, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotBetween(String value1, String value2) {
            addCriterion("C77 not between", value1, value2, "c77");
            return (Criteria) this;
        }

        public Criteria andC78IsNull() {
            addCriterion("C78 is null");
            return (Criteria) this;
        }

        public Criteria andC78IsNotNull() {
            addCriterion("C78 is not null");
            return (Criteria) this;
        }

        public Criteria andC78EqualTo(String value) {
            addCriterion("C78 =", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotEqualTo(String value) {
            addCriterion("C78 <>", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78GreaterThan(String value) {
            addCriterion("C78 >", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78GreaterThanOrEqualTo(String value) {
            addCriterion("C78 >=", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78LessThan(String value) {
            addCriterion("C78 <", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78LessThanOrEqualTo(String value) {
            addCriterion("C78 <=", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78Like(String value) {
            addCriterion("C78 like", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotLike(String value) {
            addCriterion("C78 not like", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78In(List<String> values) {
            addCriterion("C78 in", values, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotIn(List<String> values) {
            addCriterion("C78 not in", values, "c78");
            return (Criteria) this;
        }

        public Criteria andC78Between(String value1, String value2) {
            addCriterion("C78 between", value1, value2, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotBetween(String value1, String value2) {
            addCriterion("C78 not between", value1, value2, "c78");
            return (Criteria) this;
        }

        public Criteria andC79IsNull() {
            addCriterion("C79 is null");
            return (Criteria) this;
        }

        public Criteria andC79IsNotNull() {
            addCriterion("C79 is not null");
            return (Criteria) this;
        }

        public Criteria andC79EqualTo(String value) {
            addCriterion("C79 =", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotEqualTo(String value) {
            addCriterion("C79 <>", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79GreaterThan(String value) {
            addCriterion("C79 >", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79GreaterThanOrEqualTo(String value) {
            addCriterion("C79 >=", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79LessThan(String value) {
            addCriterion("C79 <", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79LessThanOrEqualTo(String value) {
            addCriterion("C79 <=", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79Like(String value) {
            addCriterion("C79 like", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotLike(String value) {
            addCriterion("C79 not like", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79In(List<String> values) {
            addCriterion("C79 in", values, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotIn(List<String> values) {
            addCriterion("C79 not in", values, "c79");
            return (Criteria) this;
        }

        public Criteria andC79Between(String value1, String value2) {
            addCriterion("C79 between", value1, value2, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotBetween(String value1, String value2) {
            addCriterion("C79 not between", value1, value2, "c79");
            return (Criteria) this;
        }

        public Criteria andC88IsNull() {
            addCriterion("C88 is null");
            return (Criteria) this;
        }

        public Criteria andC88IsNotNull() {
            addCriterion("C88 is not null");
            return (Criteria) this;
        }

        public Criteria andC88EqualTo(String value) {
            addCriterion("C88 =", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotEqualTo(String value) {
            addCriterion("C88 <>", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88GreaterThan(String value) {
            addCriterion("C88 >", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88GreaterThanOrEqualTo(String value) {
            addCriterion("C88 >=", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88LessThan(String value) {
            addCriterion("C88 <", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88LessThanOrEqualTo(String value) {
            addCriterion("C88 <=", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88Like(String value) {
            addCriterion("C88 like", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotLike(String value) {
            addCriterion("C88 not like", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88In(List<String> values) {
            addCriterion("C88 in", values, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotIn(List<String> values) {
            addCriterion("C88 not in", values, "c88");
            return (Criteria) this;
        }

        public Criteria andC88Between(String value1, String value2) {
            addCriterion("C88 between", value1, value2, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotBetween(String value1, String value2) {
            addCriterion("C88 not between", value1, value2, "c88");
            return (Criteria) this;
        }

        public Criteria andC89IsNull() {
            addCriterion("C89 is null");
            return (Criteria) this;
        }

        public Criteria andC89IsNotNull() {
            addCriterion("C89 is not null");
            return (Criteria) this;
        }

        public Criteria andC89EqualTo(String value) {
            addCriterion("C89 =", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotEqualTo(String value) {
            addCriterion("C89 <>", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89GreaterThan(String value) {
            addCriterion("C89 >", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89GreaterThanOrEqualTo(String value) {
            addCriterion("C89 >=", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89LessThan(String value) {
            addCriterion("C89 <", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89LessThanOrEqualTo(String value) {
            addCriterion("C89 <=", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89Like(String value) {
            addCriterion("C89 like", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotLike(String value) {
            addCriterion("C89 not like", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89In(List<String> values) {
            addCriterion("C89 in", values, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotIn(List<String> values) {
            addCriterion("C89 not in", values, "c89");
            return (Criteria) this;
        }

        public Criteria andC89Between(String value1, String value2) {
            addCriterion("C89 between", value1, value2, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotBetween(String value1, String value2) {
            addCriterion("C89 not between", value1, value2, "c89");
            return (Criteria) this;
        }

        public Criteria andC90IsNull() {
            addCriterion("C90 is null");
            return (Criteria) this;
        }

        public Criteria andC90IsNotNull() {
            addCriterion("C90 is not null");
            return (Criteria) this;
        }

        public Criteria andC90EqualTo(String value) {
            addCriterion("C90 =", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotEqualTo(String value) {
            addCriterion("C90 <>", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90GreaterThan(String value) {
            addCriterion("C90 >", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90GreaterThanOrEqualTo(String value) {
            addCriterion("C90 >=", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90LessThan(String value) {
            addCriterion("C90 <", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90LessThanOrEqualTo(String value) {
            addCriterion("C90 <=", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90Like(String value) {
            addCriterion("C90 like", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotLike(String value) {
            addCriterion("C90 not like", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90In(List<String> values) {
            addCriterion("C90 in", values, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotIn(List<String> values) {
            addCriterion("C90 not in", values, "c90");
            return (Criteria) this;
        }

        public Criteria andC90Between(String value1, String value2) {
            addCriterion("C90 between", value1, value2, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotBetween(String value1, String value2) {
            addCriterion("C90 not between", value1, value2, "c90");
            return (Criteria) this;
        }

        public Criteria andC91IsNull() {
            addCriterion("C91 is null");
            return (Criteria) this;
        }

        public Criteria andC91IsNotNull() {
            addCriterion("C91 is not null");
            return (Criteria) this;
        }

        public Criteria andC91EqualTo(String value) {
            addCriterion("C91 =", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotEqualTo(String value) {
            addCriterion("C91 <>", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91GreaterThan(String value) {
            addCriterion("C91 >", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91GreaterThanOrEqualTo(String value) {
            addCriterion("C91 >=", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91LessThan(String value) {
            addCriterion("C91 <", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91LessThanOrEqualTo(String value) {
            addCriterion("C91 <=", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91Like(String value) {
            addCriterion("C91 like", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotLike(String value) {
            addCriterion("C91 not like", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91In(List<String> values) {
            addCriterion("C91 in", values, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotIn(List<String> values) {
            addCriterion("C91 not in", values, "c91");
            return (Criteria) this;
        }

        public Criteria andC91Between(String value1, String value2) {
            addCriterion("C91 between", value1, value2, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotBetween(String value1, String value2) {
            addCriterion("C91 not between", value1, value2, "c91");
            return (Criteria) this;
        }

        public Criteria andC92IsNull() {
            addCriterion("C92 is null");
            return (Criteria) this;
        }

        public Criteria andC92IsNotNull() {
            addCriterion("C92 is not null");
            return (Criteria) this;
        }

        public Criteria andC92EqualTo(String value) {
            addCriterion("C92 =", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotEqualTo(String value) {
            addCriterion("C92 <>", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92GreaterThan(String value) {
            addCriterion("C92 >", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92GreaterThanOrEqualTo(String value) {
            addCriterion("C92 >=", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92LessThan(String value) {
            addCriterion("C92 <", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92LessThanOrEqualTo(String value) {
            addCriterion("C92 <=", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92Like(String value) {
            addCriterion("C92 like", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotLike(String value) {
            addCriterion("C92 not like", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92In(List<String> values) {
            addCriterion("C92 in", values, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotIn(List<String> values) {
            addCriterion("C92 not in", values, "c92");
            return (Criteria) this;
        }

        public Criteria andC92Between(String value1, String value2) {
            addCriterion("C92 between", value1, value2, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotBetween(String value1, String value2) {
            addCriterion("C92 not between", value1, value2, "c92");
            return (Criteria) this;
        }

        public Criteria andC93IsNull() {
            addCriterion("C93 is null");
            return (Criteria) this;
        }

        public Criteria andC93IsNotNull() {
            addCriterion("C93 is not null");
            return (Criteria) this;
        }

        public Criteria andC93EqualTo(String value) {
            addCriterion("C93 =", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotEqualTo(String value) {
            addCriterion("C93 <>", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93GreaterThan(String value) {
            addCriterion("C93 >", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93GreaterThanOrEqualTo(String value) {
            addCriterion("C93 >=", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93LessThan(String value) {
            addCriterion("C93 <", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93LessThanOrEqualTo(String value) {
            addCriterion("C93 <=", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93Like(String value) {
            addCriterion("C93 like", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotLike(String value) {
            addCriterion("C93 not like", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93In(List<String> values) {
            addCriterion("C93 in", values, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotIn(List<String> values) {
            addCriterion("C93 not in", values, "c93");
            return (Criteria) this;
        }

        public Criteria andC93Between(String value1, String value2) {
            addCriterion("C93 between", value1, value2, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotBetween(String value1, String value2) {
            addCriterion("C93 not between", value1, value2, "c93");
            return (Criteria) this;
        }

        public Criteria andC94IsNull() {
            addCriterion("C94 is null");
            return (Criteria) this;
        }

        public Criteria andC94IsNotNull() {
            addCriterion("C94 is not null");
            return (Criteria) this;
        }

        public Criteria andC94EqualTo(String value) {
            addCriterion("C94 =", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotEqualTo(String value) {
            addCriterion("C94 <>", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94GreaterThan(String value) {
            addCriterion("C94 >", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94GreaterThanOrEqualTo(String value) {
            addCriterion("C94 >=", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94LessThan(String value) {
            addCriterion("C94 <", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94LessThanOrEqualTo(String value) {
            addCriterion("C94 <=", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94Like(String value) {
            addCriterion("C94 like", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotLike(String value) {
            addCriterion("C94 not like", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94In(List<String> values) {
            addCriterion("C94 in", values, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotIn(List<String> values) {
            addCriterion("C94 not in", values, "c94");
            return (Criteria) this;
        }

        public Criteria andC94Between(String value1, String value2) {
            addCriterion("C94 between", value1, value2, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotBetween(String value1, String value2) {
            addCriterion("C94 not between", value1, value2, "c94");
            return (Criteria) this;
        }

        public Criteria andC95IsNull() {
            addCriterion("C95 is null");
            return (Criteria) this;
        }

        public Criteria andC95IsNotNull() {
            addCriterion("C95 is not null");
            return (Criteria) this;
        }

        public Criteria andC95EqualTo(String value) {
            addCriterion("C95 =", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotEqualTo(String value) {
            addCriterion("C95 <>", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95GreaterThan(String value) {
            addCriterion("C95 >", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95GreaterThanOrEqualTo(String value) {
            addCriterion("C95 >=", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95LessThan(String value) {
            addCriterion("C95 <", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95LessThanOrEqualTo(String value) {
            addCriterion("C95 <=", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95Like(String value) {
            addCriterion("C95 like", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotLike(String value) {
            addCriterion("C95 not like", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95In(List<String> values) {
            addCriterion("C95 in", values, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotIn(List<String> values) {
            addCriterion("C95 not in", values, "c95");
            return (Criteria) this;
        }

        public Criteria andC95Between(String value1, String value2) {
            addCriterion("C95 between", value1, value2, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotBetween(String value1, String value2) {
            addCriterion("C95 not between", value1, value2, "c95");
            return (Criteria) this;
        }

        public Criteria andC96IsNull() {
            addCriterion("C96 is null");
            return (Criteria) this;
        }

        public Criteria andC96IsNotNull() {
            addCriterion("C96 is not null");
            return (Criteria) this;
        }

        public Criteria andC96EqualTo(String value) {
            addCriterion("C96 =", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotEqualTo(String value) {
            addCriterion("C96 <>", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96GreaterThan(String value) {
            addCriterion("C96 >", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96GreaterThanOrEqualTo(String value) {
            addCriterion("C96 >=", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96LessThan(String value) {
            addCriterion("C96 <", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96LessThanOrEqualTo(String value) {
            addCriterion("C96 <=", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96Like(String value) {
            addCriterion("C96 like", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotLike(String value) {
            addCriterion("C96 not like", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96In(List<String> values) {
            addCriterion("C96 in", values, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotIn(List<String> values) {
            addCriterion("C96 not in", values, "c96");
            return (Criteria) this;
        }

        public Criteria andC96Between(String value1, String value2) {
            addCriterion("C96 between", value1, value2, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotBetween(String value1, String value2) {
            addCriterion("C96 not between", value1, value2, "c96");
            return (Criteria) this;
        }

        public Criteria andC97IsNull() {
            addCriterion("C97 is null");
            return (Criteria) this;
        }

        public Criteria andC97IsNotNull() {
            addCriterion("C97 is not null");
            return (Criteria) this;
        }

        public Criteria andC97EqualTo(String value) {
            addCriterion("C97 =", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotEqualTo(String value) {
            addCriterion("C97 <>", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97GreaterThan(String value) {
            addCriterion("C97 >", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97GreaterThanOrEqualTo(String value) {
            addCriterion("C97 >=", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97LessThan(String value) {
            addCriterion("C97 <", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97LessThanOrEqualTo(String value) {
            addCriterion("C97 <=", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97Like(String value) {
            addCriterion("C97 like", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotLike(String value) {
            addCriterion("C97 not like", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97In(List<String> values) {
            addCriterion("C97 in", values, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotIn(List<String> values) {
            addCriterion("C97 not in", values, "c97");
            return (Criteria) this;
        }

        public Criteria andC97Between(String value1, String value2) {
            addCriterion("C97 between", value1, value2, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotBetween(String value1, String value2) {
            addCriterion("C97 not between", value1, value2, "c97");
            return (Criteria) this;
        }

        public Criteria andC98IsNull() {
            addCriterion("C98 is null");
            return (Criteria) this;
        }

        public Criteria andC98IsNotNull() {
            addCriterion("C98 is not null");
            return (Criteria) this;
        }

        public Criteria andC98EqualTo(String value) {
            addCriterion("C98 =", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotEqualTo(String value) {
            addCriterion("C98 <>", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98GreaterThan(String value) {
            addCriterion("C98 >", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98GreaterThanOrEqualTo(String value) {
            addCriterion("C98 >=", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98LessThan(String value) {
            addCriterion("C98 <", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98LessThanOrEqualTo(String value) {
            addCriterion("C98 <=", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98Like(String value) {
            addCriterion("C98 like", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotLike(String value) {
            addCriterion("C98 not like", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98In(List<String> values) {
            addCriterion("C98 in", values, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotIn(List<String> values) {
            addCriterion("C98 not in", values, "c98");
            return (Criteria) this;
        }

        public Criteria andC98Between(String value1, String value2) {
            addCriterion("C98 between", value1, value2, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotBetween(String value1, String value2) {
            addCriterion("C98 not between", value1, value2, "c98");
            return (Criteria) this;
        }

        public Criteria andC99IsNull() {
            addCriterion("C99 is null");
            return (Criteria) this;
        }

        public Criteria andC99IsNotNull() {
            addCriterion("C99 is not null");
            return (Criteria) this;
        }

        public Criteria andC99EqualTo(String value) {
            addCriterion("C99 =", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotEqualTo(String value) {
            addCriterion("C99 <>", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99GreaterThan(String value) {
            addCriterion("C99 >", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99GreaterThanOrEqualTo(String value) {
            addCriterion("C99 >=", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99LessThan(String value) {
            addCriterion("C99 <", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99LessThanOrEqualTo(String value) {
            addCriterion("C99 <=", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99Like(String value) {
            addCriterion("C99 like", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotLike(String value) {
            addCriterion("C99 not like", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99In(List<String> values) {
            addCriterion("C99 in", values, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotIn(List<String> values) {
            addCriterion("C99 not in", values, "c99");
            return (Criteria) this;
        }

        public Criteria andC99Between(String value1, String value2) {
            addCriterion("C99 between", value1, value2, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotBetween(String value1, String value2) {
            addCriterion("C99 not between", value1, value2, "c99");
            return (Criteria) this;
        }

        public Criteria andC100IsNull() {
            addCriterion("C100 is null");
            return (Criteria) this;
        }

        public Criteria andC100IsNotNull() {
            addCriterion("C100 is not null");
            return (Criteria) this;
        }

        public Criteria andC100EqualTo(String value) {
            addCriterion("C100 =", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotEqualTo(String value) {
            addCriterion("C100 <>", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100GreaterThan(String value) {
            addCriterion("C100 >", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100GreaterThanOrEqualTo(String value) {
            addCriterion("C100 >=", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100LessThan(String value) {
            addCriterion("C100 <", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100LessThanOrEqualTo(String value) {
            addCriterion("C100 <=", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100Like(String value) {
            addCriterion("C100 like", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotLike(String value) {
            addCriterion("C100 not like", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100In(List<String> values) {
            addCriterion("C100 in", values, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotIn(List<String> values) {
            addCriterion("C100 not in", values, "c100");
            return (Criteria) this;
        }

        public Criteria andC100Between(String value1, String value2) {
            addCriterion("C100 between", value1, value2, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotBetween(String value1, String value2) {
            addCriterion("C100 not between", value1, value2, "c100");
            return (Criteria) this;
        }

        public Criteria andC101IsNull() {
            addCriterion("C101 is null");
            return (Criteria) this;
        }

        public Criteria andC101IsNotNull() {
            addCriterion("C101 is not null");
            return (Criteria) this;
        }

        public Criteria andC101EqualTo(String value) {
            addCriterion("C101 =", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotEqualTo(String value) {
            addCriterion("C101 <>", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101GreaterThan(String value) {
            addCriterion("C101 >", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101GreaterThanOrEqualTo(String value) {
            addCriterion("C101 >=", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101LessThan(String value) {
            addCriterion("C101 <", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101LessThanOrEqualTo(String value) {
            addCriterion("C101 <=", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101Like(String value) {
            addCriterion("C101 like", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotLike(String value) {
            addCriterion("C101 not like", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101In(List<String> values) {
            addCriterion("C101 in", values, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotIn(List<String> values) {
            addCriterion("C101 not in", values, "c101");
            return (Criteria) this;
        }

        public Criteria andC101Between(String value1, String value2) {
            addCriterion("C101 between", value1, value2, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotBetween(String value1, String value2) {
            addCriterion("C101 not between", value1, value2, "c101");
            return (Criteria) this;
        }

        public Criteria andC102IsNull() {
            addCriterion("C102 is null");
            return (Criteria) this;
        }

        public Criteria andC102IsNotNull() {
            addCriterion("C102 is not null");
            return (Criteria) this;
        }

        public Criteria andC102EqualTo(String value) {
            addCriterion("C102 =", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotEqualTo(String value) {
            addCriterion("C102 <>", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102GreaterThan(String value) {
            addCriterion("C102 >", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102GreaterThanOrEqualTo(String value) {
            addCriterion("C102 >=", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102LessThan(String value) {
            addCriterion("C102 <", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102LessThanOrEqualTo(String value) {
            addCriterion("C102 <=", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102Like(String value) {
            addCriterion("C102 like", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotLike(String value) {
            addCriterion("C102 not like", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102In(List<String> values) {
            addCriterion("C102 in", values, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotIn(List<String> values) {
            addCriterion("C102 not in", values, "c102");
            return (Criteria) this;
        }

        public Criteria andC102Between(String value1, String value2) {
            addCriterion("C102 between", value1, value2, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotBetween(String value1, String value2) {
            addCriterion("C102 not between", value1, value2, "c102");
            return (Criteria) this;
        }

        public Criteria andC103IsNull() {
            addCriterion("C103 is null");
            return (Criteria) this;
        }

        public Criteria andC103IsNotNull() {
            addCriterion("C103 is not null");
            return (Criteria) this;
        }

        public Criteria andC103EqualTo(String value) {
            addCriterion("C103 =", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotEqualTo(String value) {
            addCriterion("C103 <>", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103GreaterThan(String value) {
            addCriterion("C103 >", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103GreaterThanOrEqualTo(String value) {
            addCriterion("C103 >=", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103LessThan(String value) {
            addCriterion("C103 <", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103LessThanOrEqualTo(String value) {
            addCriterion("C103 <=", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103Like(String value) {
            addCriterion("C103 like", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotLike(String value) {
            addCriterion("C103 not like", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103In(List<String> values) {
            addCriterion("C103 in", values, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotIn(List<String> values) {
            addCriterion("C103 not in", values, "c103");
            return (Criteria) this;
        }

        public Criteria andC103Between(String value1, String value2) {
            addCriterion("C103 between", value1, value2, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotBetween(String value1, String value2) {
            addCriterion("C103 not between", value1, value2, "c103");
            return (Criteria) this;
        }

        public Criteria andC104IsNull() {
            addCriterion("C104 is null");
            return (Criteria) this;
        }

        public Criteria andC104IsNotNull() {
            addCriterion("C104 is not null");
            return (Criteria) this;
        }

        public Criteria andC104EqualTo(String value) {
            addCriterion("C104 =", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotEqualTo(String value) {
            addCriterion("C104 <>", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104GreaterThan(String value) {
            addCriterion("C104 >", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104GreaterThanOrEqualTo(String value) {
            addCriterion("C104 >=", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104LessThan(String value) {
            addCriterion("C104 <", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104LessThanOrEqualTo(String value) {
            addCriterion("C104 <=", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104Like(String value) {
            addCriterion("C104 like", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotLike(String value) {
            addCriterion("C104 not like", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104In(List<String> values) {
            addCriterion("C104 in", values, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotIn(List<String> values) {
            addCriterion("C104 not in", values, "c104");
            return (Criteria) this;
        }

        public Criteria andC104Between(String value1, String value2) {
            addCriterion("C104 between", value1, value2, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotBetween(String value1, String value2) {
            addCriterion("C104 not between", value1, value2, "c104");
            return (Criteria) this;
        }

        public Criteria andC105IsNull() {
            addCriterion("C105 is null");
            return (Criteria) this;
        }

        public Criteria andC105IsNotNull() {
            addCriterion("C105 is not null");
            return (Criteria) this;
        }

        public Criteria andC105EqualTo(String value) {
            addCriterion("C105 =", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotEqualTo(String value) {
            addCriterion("C105 <>", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105GreaterThan(String value) {
            addCriterion("C105 >", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105GreaterThanOrEqualTo(String value) {
            addCriterion("C105 >=", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105LessThan(String value) {
            addCriterion("C105 <", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105LessThanOrEqualTo(String value) {
            addCriterion("C105 <=", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105Like(String value) {
            addCriterion("C105 like", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotLike(String value) {
            addCriterion("C105 not like", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105In(List<String> values) {
            addCriterion("C105 in", values, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotIn(List<String> values) {
            addCriterion("C105 not in", values, "c105");
            return (Criteria) this;
        }

        public Criteria andC105Between(String value1, String value2) {
            addCriterion("C105 between", value1, value2, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotBetween(String value1, String value2) {
            addCriterion("C105 not between", value1, value2, "c105");
            return (Criteria) this;
        }

        public Criteria andC106IsNull() {
            addCriterion("C106 is null");
            return (Criteria) this;
        }

        public Criteria andC106IsNotNull() {
            addCriterion("C106 is not null");
            return (Criteria) this;
        }

        public Criteria andC106EqualTo(String value) {
            addCriterion("C106 =", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotEqualTo(String value) {
            addCriterion("C106 <>", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106GreaterThan(String value) {
            addCriterion("C106 >", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106GreaterThanOrEqualTo(String value) {
            addCriterion("C106 >=", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106LessThan(String value) {
            addCriterion("C106 <", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106LessThanOrEqualTo(String value) {
            addCriterion("C106 <=", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106Like(String value) {
            addCriterion("C106 like", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotLike(String value) {
            addCriterion("C106 not like", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106In(List<String> values) {
            addCriterion("C106 in", values, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotIn(List<String> values) {
            addCriterion("C106 not in", values, "c106");
            return (Criteria) this;
        }

        public Criteria andC106Between(String value1, String value2) {
            addCriterion("C106 between", value1, value2, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotBetween(String value1, String value2) {
            addCriterion("C106 not between", value1, value2, "c106");
            return (Criteria) this;
        }

        public Criteria andC107IsNull() {
            addCriterion("C107 is null");
            return (Criteria) this;
        }

        public Criteria andC107IsNotNull() {
            addCriterion("C107 is not null");
            return (Criteria) this;
        }

        public Criteria andC107EqualTo(String value) {
            addCriterion("C107 =", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotEqualTo(String value) {
            addCriterion("C107 <>", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107GreaterThan(String value) {
            addCriterion("C107 >", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107GreaterThanOrEqualTo(String value) {
            addCriterion("C107 >=", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107LessThan(String value) {
            addCriterion("C107 <", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107LessThanOrEqualTo(String value) {
            addCriterion("C107 <=", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107Like(String value) {
            addCriterion("C107 like", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotLike(String value) {
            addCriterion("C107 not like", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107In(List<String> values) {
            addCriterion("C107 in", values, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotIn(List<String> values) {
            addCriterion("C107 not in", values, "c107");
            return (Criteria) this;
        }

        public Criteria andC107Between(String value1, String value2) {
            addCriterion("C107 between", value1, value2, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotBetween(String value1, String value2) {
            addCriterion("C107 not between", value1, value2, "c107");
            return (Criteria) this;
        }

        public Criteria andC108IsNull() {
            addCriterion("C108 is null");
            return (Criteria) this;
        }

        public Criteria andC108IsNotNull() {
            addCriterion("C108 is not null");
            return (Criteria) this;
        }

        public Criteria andC108EqualTo(String value) {
            addCriterion("C108 =", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotEqualTo(String value) {
            addCriterion("C108 <>", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108GreaterThan(String value) {
            addCriterion("C108 >", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108GreaterThanOrEqualTo(String value) {
            addCriterion("C108 >=", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108LessThan(String value) {
            addCriterion("C108 <", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108LessThanOrEqualTo(String value) {
            addCriterion("C108 <=", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108Like(String value) {
            addCriterion("C108 like", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotLike(String value) {
            addCriterion("C108 not like", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108In(List<String> values) {
            addCriterion("C108 in", values, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotIn(List<String> values) {
            addCriterion("C108 not in", values, "c108");
            return (Criteria) this;
        }

        public Criteria andC108Between(String value1, String value2) {
            addCriterion("C108 between", value1, value2, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotBetween(String value1, String value2) {
            addCriterion("C108 not between", value1, value2, "c108");
            return (Criteria) this;
        }

        public Criteria andC109IsNull() {
            addCriterion("C109 is null");
            return (Criteria) this;
        }

        public Criteria andC109IsNotNull() {
            addCriterion("C109 is not null");
            return (Criteria) this;
        }

        public Criteria andC109EqualTo(String value) {
            addCriterion("C109 =", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotEqualTo(String value) {
            addCriterion("C109 <>", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109GreaterThan(String value) {
            addCriterion("C109 >", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109GreaterThanOrEqualTo(String value) {
            addCriterion("C109 >=", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109LessThan(String value) {
            addCriterion("C109 <", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109LessThanOrEqualTo(String value) {
            addCriterion("C109 <=", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109Like(String value) {
            addCriterion("C109 like", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotLike(String value) {
            addCriterion("C109 not like", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109In(List<String> values) {
            addCriterion("C109 in", values, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotIn(List<String> values) {
            addCriterion("C109 not in", values, "c109");
            return (Criteria) this;
        }

        public Criteria andC109Between(String value1, String value2) {
            addCriterion("C109 between", value1, value2, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotBetween(String value1, String value2) {
            addCriterion("C109 not between", value1, value2, "c109");
            return (Criteria) this;
        }

        public Criteria andC110IsNull() {
            addCriterion("C110 is null");
            return (Criteria) this;
        }

        public Criteria andC110IsNotNull() {
            addCriterion("C110 is not null");
            return (Criteria) this;
        }

        public Criteria andC110EqualTo(String value) {
            addCriterion("C110 =", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotEqualTo(String value) {
            addCriterion("C110 <>", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110GreaterThan(String value) {
            addCriterion("C110 >", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110GreaterThanOrEqualTo(String value) {
            addCriterion("C110 >=", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110LessThan(String value) {
            addCriterion("C110 <", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110LessThanOrEqualTo(String value) {
            addCriterion("C110 <=", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110Like(String value) {
            addCriterion("C110 like", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotLike(String value) {
            addCriterion("C110 not like", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110In(List<String> values) {
            addCriterion("C110 in", values, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotIn(List<String> values) {
            addCriterion("C110 not in", values, "c110");
            return (Criteria) this;
        }

        public Criteria andC110Between(String value1, String value2) {
            addCriterion("C110 between", value1, value2, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotBetween(String value1, String value2) {
            addCriterion("C110 not between", value1, value2, "c110");
            return (Criteria) this;
        }

        public Criteria andC111IsNull() {
            addCriterion("C111 is null");
            return (Criteria) this;
        }

        public Criteria andC111IsNotNull() {
            addCriterion("C111 is not null");
            return (Criteria) this;
        }

        public Criteria andC111EqualTo(String value) {
            addCriterion("C111 =", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotEqualTo(String value) {
            addCriterion("C111 <>", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111GreaterThan(String value) {
            addCriterion("C111 >", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111GreaterThanOrEqualTo(String value) {
            addCriterion("C111 >=", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111LessThan(String value) {
            addCriterion("C111 <", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111LessThanOrEqualTo(String value) {
            addCriterion("C111 <=", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111Like(String value) {
            addCriterion("C111 like", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotLike(String value) {
            addCriterion("C111 not like", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111In(List<String> values) {
            addCriterion("C111 in", values, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotIn(List<String> values) {
            addCriterion("C111 not in", values, "c111");
            return (Criteria) this;
        }

        public Criteria andC111Between(String value1, String value2) {
            addCriterion("C111 between", value1, value2, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotBetween(String value1, String value2) {
            addCriterion("C111 not between", value1, value2, "c111");
            return (Criteria) this;
        }

        public Criteria andC112IsNull() {
            addCriterion("C112 is null");
            return (Criteria) this;
        }

        public Criteria andC112IsNotNull() {
            addCriterion("C112 is not null");
            return (Criteria) this;
        }

        public Criteria andC112EqualTo(String value) {
            addCriterion("C112 =", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotEqualTo(String value) {
            addCriterion("C112 <>", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112GreaterThan(String value) {
            addCriterion("C112 >", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112GreaterThanOrEqualTo(String value) {
            addCriterion("C112 >=", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112LessThan(String value) {
            addCriterion("C112 <", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112LessThanOrEqualTo(String value) {
            addCriterion("C112 <=", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112Like(String value) {
            addCriterion("C112 like", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotLike(String value) {
            addCriterion("C112 not like", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112In(List<String> values) {
            addCriterion("C112 in", values, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotIn(List<String> values) {
            addCriterion("C112 not in", values, "c112");
            return (Criteria) this;
        }

        public Criteria andC112Between(String value1, String value2) {
            addCriterion("C112 between", value1, value2, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotBetween(String value1, String value2) {
            addCriterion("C112 not between", value1, value2, "c112");
            return (Criteria) this;
        }

        public Criteria andC113IsNull() {
            addCriterion("C113 is null");
            return (Criteria) this;
        }

        public Criteria andC113IsNotNull() {
            addCriterion("C113 is not null");
            return (Criteria) this;
        }

        public Criteria andC113EqualTo(String value) {
            addCriterion("C113 =", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotEqualTo(String value) {
            addCriterion("C113 <>", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113GreaterThan(String value) {
            addCriterion("C113 >", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113GreaterThanOrEqualTo(String value) {
            addCriterion("C113 >=", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113LessThan(String value) {
            addCriterion("C113 <", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113LessThanOrEqualTo(String value) {
            addCriterion("C113 <=", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113Like(String value) {
            addCriterion("C113 like", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotLike(String value) {
            addCriterion("C113 not like", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113In(List<String> values) {
            addCriterion("C113 in", values, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotIn(List<String> values) {
            addCriterion("C113 not in", values, "c113");
            return (Criteria) this;
        }

        public Criteria andC113Between(String value1, String value2) {
            addCriterion("C113 between", value1, value2, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotBetween(String value1, String value2) {
            addCriterion("C113 not between", value1, value2, "c113");
            return (Criteria) this;
        }

        public Criteria andC114IsNull() {
            addCriterion("C114 is null");
            return (Criteria) this;
        }

        public Criteria andC114IsNotNull() {
            addCriterion("C114 is not null");
            return (Criteria) this;
        }

        public Criteria andC114EqualTo(String value) {
            addCriterion("C114 =", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotEqualTo(String value) {
            addCriterion("C114 <>", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114GreaterThan(String value) {
            addCriterion("C114 >", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114GreaterThanOrEqualTo(String value) {
            addCriterion("C114 >=", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114LessThan(String value) {
            addCriterion("C114 <", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114LessThanOrEqualTo(String value) {
            addCriterion("C114 <=", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114Like(String value) {
            addCriterion("C114 like", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotLike(String value) {
            addCriterion("C114 not like", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114In(List<String> values) {
            addCriterion("C114 in", values, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotIn(List<String> values) {
            addCriterion("C114 not in", values, "c114");
            return (Criteria) this;
        }

        public Criteria andC114Between(String value1, String value2) {
            addCriterion("C114 between", value1, value2, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotBetween(String value1, String value2) {
            addCriterion("C114 not between", value1, value2, "c114");
            return (Criteria) this;
        }

        public Criteria andC115IsNull() {
            addCriterion("C115 is null");
            return (Criteria) this;
        }

        public Criteria andC115IsNotNull() {
            addCriterion("C115 is not null");
            return (Criteria) this;
        }

        public Criteria andC115EqualTo(String value) {
            addCriterion("C115 =", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotEqualTo(String value) {
            addCriterion("C115 <>", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115GreaterThan(String value) {
            addCriterion("C115 >", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115GreaterThanOrEqualTo(String value) {
            addCriterion("C115 >=", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115LessThan(String value) {
            addCriterion("C115 <", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115LessThanOrEqualTo(String value) {
            addCriterion("C115 <=", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115Like(String value) {
            addCriterion("C115 like", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotLike(String value) {
            addCriterion("C115 not like", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115In(List<String> values) {
            addCriterion("C115 in", values, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotIn(List<String> values) {
            addCriterion("C115 not in", values, "c115");
            return (Criteria) this;
        }

        public Criteria andC115Between(String value1, String value2) {
            addCriterion("C115 between", value1, value2, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotBetween(String value1, String value2) {
            addCriterion("C115 not between", value1, value2, "c115");
            return (Criteria) this;
        }

        public Criteria andC116IsNull() {
            addCriterion("C116 is null");
            return (Criteria) this;
        }

        public Criteria andC116IsNotNull() {
            addCriterion("C116 is not null");
            return (Criteria) this;
        }

        public Criteria andC116EqualTo(String value) {
            addCriterion("C116 =", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotEqualTo(String value) {
            addCriterion("C116 <>", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116GreaterThan(String value) {
            addCriterion("C116 >", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116GreaterThanOrEqualTo(String value) {
            addCriterion("C116 >=", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116LessThan(String value) {
            addCriterion("C116 <", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116LessThanOrEqualTo(String value) {
            addCriterion("C116 <=", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116Like(String value) {
            addCriterion("C116 like", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotLike(String value) {
            addCriterion("C116 not like", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116In(List<String> values) {
            addCriterion("C116 in", values, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotIn(List<String> values) {
            addCriterion("C116 not in", values, "c116");
            return (Criteria) this;
        }

        public Criteria andC116Between(String value1, String value2) {
            addCriterion("C116 between", value1, value2, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotBetween(String value1, String value2) {
            addCriterion("C116 not between", value1, value2, "c116");
            return (Criteria) this;
        }

        public Criteria andC117IsNull() {
            addCriterion("C117 is null");
            return (Criteria) this;
        }

        public Criteria andC117IsNotNull() {
            addCriterion("C117 is not null");
            return (Criteria) this;
        }

        public Criteria andC117EqualTo(String value) {
            addCriterion("C117 =", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotEqualTo(String value) {
            addCriterion("C117 <>", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117GreaterThan(String value) {
            addCriterion("C117 >", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117GreaterThanOrEqualTo(String value) {
            addCriterion("C117 >=", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117LessThan(String value) {
            addCriterion("C117 <", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117LessThanOrEqualTo(String value) {
            addCriterion("C117 <=", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117Like(String value) {
            addCriterion("C117 like", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotLike(String value) {
            addCriterion("C117 not like", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117In(List<String> values) {
            addCriterion("C117 in", values, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotIn(List<String> values) {
            addCriterion("C117 not in", values, "c117");
            return (Criteria) this;
        }

        public Criteria andC117Between(String value1, String value2) {
            addCriterion("C117 between", value1, value2, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotBetween(String value1, String value2) {
            addCriterion("C117 not between", value1, value2, "c117");
            return (Criteria) this;
        }

        public Criteria andC118IsNull() {
            addCriterion("C118 is null");
            return (Criteria) this;
        }

        public Criteria andC118IsNotNull() {
            addCriterion("C118 is not null");
            return (Criteria) this;
        }

        public Criteria andC118EqualTo(String value) {
            addCriterion("C118 =", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotEqualTo(String value) {
            addCriterion("C118 <>", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118GreaterThan(String value) {
            addCriterion("C118 >", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118GreaterThanOrEqualTo(String value) {
            addCriterion("C118 >=", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118LessThan(String value) {
            addCriterion("C118 <", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118LessThanOrEqualTo(String value) {
            addCriterion("C118 <=", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118Like(String value) {
            addCriterion("C118 like", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotLike(String value) {
            addCriterion("C118 not like", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118In(List<String> values) {
            addCriterion("C118 in", values, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotIn(List<String> values) {
            addCriterion("C118 not in", values, "c118");
            return (Criteria) this;
        }

        public Criteria andC118Between(String value1, String value2) {
            addCriterion("C118 between", value1, value2, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotBetween(String value1, String value2) {
            addCriterion("C118 not between", value1, value2, "c118");
            return (Criteria) this;
        }

        public Criteria andC119IsNull() {
            addCriterion("C119 is null");
            return (Criteria) this;
        }

        public Criteria andC119IsNotNull() {
            addCriterion("C119 is not null");
            return (Criteria) this;
        }

        public Criteria andC119EqualTo(String value) {
            addCriterion("C119 =", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotEqualTo(String value) {
            addCriterion("C119 <>", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119GreaterThan(String value) {
            addCriterion("C119 >", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119GreaterThanOrEqualTo(String value) {
            addCriterion("C119 >=", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119LessThan(String value) {
            addCriterion("C119 <", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119LessThanOrEqualTo(String value) {
            addCriterion("C119 <=", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119Like(String value) {
            addCriterion("C119 like", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotLike(String value) {
            addCriterion("C119 not like", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119In(List<String> values) {
            addCriterion("C119 in", values, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotIn(List<String> values) {
            addCriterion("C119 not in", values, "c119");
            return (Criteria) this;
        }

        public Criteria andC119Between(String value1, String value2) {
            addCriterion("C119 between", value1, value2, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotBetween(String value1, String value2) {
            addCriterion("C119 not between", value1, value2, "c119");
            return (Criteria) this;
        }

        public Criteria andC120IsNull() {
            addCriterion("C120 is null");
            return (Criteria) this;
        }

        public Criteria andC120IsNotNull() {
            addCriterion("C120 is not null");
            return (Criteria) this;
        }

        public Criteria andC120EqualTo(String value) {
            addCriterion("C120 =", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotEqualTo(String value) {
            addCriterion("C120 <>", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120GreaterThan(String value) {
            addCriterion("C120 >", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120GreaterThanOrEqualTo(String value) {
            addCriterion("C120 >=", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120LessThan(String value) {
            addCriterion("C120 <", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120LessThanOrEqualTo(String value) {
            addCriterion("C120 <=", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120Like(String value) {
            addCriterion("C120 like", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotLike(String value) {
            addCriterion("C120 not like", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120In(List<String> values) {
            addCriterion("C120 in", values, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotIn(List<String> values) {
            addCriterion("C120 not in", values, "c120");
            return (Criteria) this;
        }

        public Criteria andC120Between(String value1, String value2) {
            addCriterion("C120 between", value1, value2, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotBetween(String value1, String value2) {
            addCriterion("C120 not between", value1, value2, "c120");
            return (Criteria) this;
        }

        public Criteria andC121IsNull() {
            addCriterion("C121 is null");
            return (Criteria) this;
        }

        public Criteria andC121IsNotNull() {
            addCriterion("C121 is not null");
            return (Criteria) this;
        }

        public Criteria andC121EqualTo(String value) {
            addCriterion("C121 =", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotEqualTo(String value) {
            addCriterion("C121 <>", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121GreaterThan(String value) {
            addCriterion("C121 >", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121GreaterThanOrEqualTo(String value) {
            addCriterion("C121 >=", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121LessThan(String value) {
            addCriterion("C121 <", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121LessThanOrEqualTo(String value) {
            addCriterion("C121 <=", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121Like(String value) {
            addCriterion("C121 like", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotLike(String value) {
            addCriterion("C121 not like", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121In(List<String> values) {
            addCriterion("C121 in", values, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotIn(List<String> values) {
            addCriterion("C121 not in", values, "c121");
            return (Criteria) this;
        }

        public Criteria andC121Between(String value1, String value2) {
            addCriterion("C121 between", value1, value2, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotBetween(String value1, String value2) {
            addCriterion("C121 not between", value1, value2, "c121");
            return (Criteria) this;
        }

        public Criteria andC122IsNull() {
            addCriterion("C122 is null");
            return (Criteria) this;
        }

        public Criteria andC122IsNotNull() {
            addCriterion("C122 is not null");
            return (Criteria) this;
        }

        public Criteria andC122EqualTo(String value) {
            addCriterion("C122 =", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotEqualTo(String value) {
            addCriterion("C122 <>", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122GreaterThan(String value) {
            addCriterion("C122 >", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122GreaterThanOrEqualTo(String value) {
            addCriterion("C122 >=", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122LessThan(String value) {
            addCriterion("C122 <", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122LessThanOrEqualTo(String value) {
            addCriterion("C122 <=", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122Like(String value) {
            addCriterion("C122 like", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotLike(String value) {
            addCriterion("C122 not like", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122In(List<String> values) {
            addCriterion("C122 in", values, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotIn(List<String> values) {
            addCriterion("C122 not in", values, "c122");
            return (Criteria) this;
        }

        public Criteria andC122Between(String value1, String value2) {
            addCriterion("C122 between", value1, value2, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotBetween(String value1, String value2) {
            addCriterion("C122 not between", value1, value2, "c122");
            return (Criteria) this;
        }

        public Criteria andC123IsNull() {
            addCriterion("C123 is null");
            return (Criteria) this;
        }

        public Criteria andC123IsNotNull() {
            addCriterion("C123 is not null");
            return (Criteria) this;
        }

        public Criteria andC123EqualTo(String value) {
            addCriterion("C123 =", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotEqualTo(String value) {
            addCriterion("C123 <>", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123GreaterThan(String value) {
            addCriterion("C123 >", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123GreaterThanOrEqualTo(String value) {
            addCriterion("C123 >=", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123LessThan(String value) {
            addCriterion("C123 <", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123LessThanOrEqualTo(String value) {
            addCriterion("C123 <=", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123Like(String value) {
            addCriterion("C123 like", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotLike(String value) {
            addCriterion("C123 not like", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123In(List<String> values) {
            addCriterion("C123 in", values, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotIn(List<String> values) {
            addCriterion("C123 not in", values, "c123");
            return (Criteria) this;
        }

        public Criteria andC123Between(String value1, String value2) {
            addCriterion("C123 between", value1, value2, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotBetween(String value1, String value2) {
            addCriterion("C123 not between", value1, value2, "c123");
            return (Criteria) this;
        }

        public Criteria andC124IsNull() {
            addCriterion("C124 is null");
            return (Criteria) this;
        }

        public Criteria andC124IsNotNull() {
            addCriterion("C124 is not null");
            return (Criteria) this;
        }

        public Criteria andC124EqualTo(String value) {
            addCriterion("C124 =", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotEqualTo(String value) {
            addCriterion("C124 <>", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124GreaterThan(String value) {
            addCriterion("C124 >", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124GreaterThanOrEqualTo(String value) {
            addCriterion("C124 >=", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124LessThan(String value) {
            addCriterion("C124 <", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124LessThanOrEqualTo(String value) {
            addCriterion("C124 <=", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124Like(String value) {
            addCriterion("C124 like", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotLike(String value) {
            addCriterion("C124 not like", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124In(List<String> values) {
            addCriterion("C124 in", values, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotIn(List<String> values) {
            addCriterion("C124 not in", values, "c124");
            return (Criteria) this;
        }

        public Criteria andC124Between(String value1, String value2) {
            addCriterion("C124 between", value1, value2, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotBetween(String value1, String value2) {
            addCriterion("C124 not between", value1, value2, "c124");
            return (Criteria) this;
        }

        public Criteria andC125IsNull() {
            addCriterion("C125 is null");
            return (Criteria) this;
        }

        public Criteria andC125IsNotNull() {
            addCriterion("C125 is not null");
            return (Criteria) this;
        }

        public Criteria andC125EqualTo(String value) {
            addCriterion("C125 =", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotEqualTo(String value) {
            addCriterion("C125 <>", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125GreaterThan(String value) {
            addCriterion("C125 >", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125GreaterThanOrEqualTo(String value) {
            addCriterion("C125 >=", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125LessThan(String value) {
            addCriterion("C125 <", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125LessThanOrEqualTo(String value) {
            addCriterion("C125 <=", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125Like(String value) {
            addCriterion("C125 like", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotLike(String value) {
            addCriterion("C125 not like", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125In(List<String> values) {
            addCriterion("C125 in", values, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotIn(List<String> values) {
            addCriterion("C125 not in", values, "c125");
            return (Criteria) this;
        }

        public Criteria andC125Between(String value1, String value2) {
            addCriterion("C125 between", value1, value2, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotBetween(String value1, String value2) {
            addCriterion("C125 not between", value1, value2, "c125");
            return (Criteria) this;
        }

        public Criteria andC126IsNull() {
            addCriterion("C126 is null");
            return (Criteria) this;
        }

        public Criteria andC126IsNotNull() {
            addCriterion("C126 is not null");
            return (Criteria) this;
        }

        public Criteria andC126EqualTo(String value) {
            addCriterion("C126 =", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotEqualTo(String value) {
            addCriterion("C126 <>", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126GreaterThan(String value) {
            addCriterion("C126 >", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126GreaterThanOrEqualTo(String value) {
            addCriterion("C126 >=", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126LessThan(String value) {
            addCriterion("C126 <", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126LessThanOrEqualTo(String value) {
            addCriterion("C126 <=", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126Like(String value) {
            addCriterion("C126 like", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotLike(String value) {
            addCriterion("C126 not like", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126In(List<String> values) {
            addCriterion("C126 in", values, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotIn(List<String> values) {
            addCriterion("C126 not in", values, "c126");
            return (Criteria) this;
        }

        public Criteria andC126Between(String value1, String value2) {
            addCriterion("C126 between", value1, value2, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotBetween(String value1, String value2) {
            addCriterion("C126 not between", value1, value2, "c126");
            return (Criteria) this;
        }

        public Criteria andC127IsNull() {
            addCriterion("C127 is null");
            return (Criteria) this;
        }

        public Criteria andC127IsNotNull() {
            addCriterion("C127 is not null");
            return (Criteria) this;
        }

        public Criteria andC127EqualTo(String value) {
            addCriterion("C127 =", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotEqualTo(String value) {
            addCriterion("C127 <>", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127GreaterThan(String value) {
            addCriterion("C127 >", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127GreaterThanOrEqualTo(String value) {
            addCriterion("C127 >=", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127LessThan(String value) {
            addCriterion("C127 <", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127LessThanOrEqualTo(String value) {
            addCriterion("C127 <=", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127Like(String value) {
            addCriterion("C127 like", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotLike(String value) {
            addCriterion("C127 not like", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127In(List<String> values) {
            addCriterion("C127 in", values, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotIn(List<String> values) {
            addCriterion("C127 not in", values, "c127");
            return (Criteria) this;
        }

        public Criteria andC127Between(String value1, String value2) {
            addCriterion("C127 between", value1, value2, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotBetween(String value1, String value2) {
            addCriterion("C127 not between", value1, value2, "c127");
            return (Criteria) this;
        }

        public Criteria andC128IsNull() {
            addCriterion("C128 is null");
            return (Criteria) this;
        }

        public Criteria andC128IsNotNull() {
            addCriterion("C128 is not null");
            return (Criteria) this;
        }

        public Criteria andC128EqualTo(String value) {
            addCriterion("C128 =", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotEqualTo(String value) {
            addCriterion("C128 <>", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128GreaterThan(String value) {
            addCriterion("C128 >", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128GreaterThanOrEqualTo(String value) {
            addCriterion("C128 >=", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128LessThan(String value) {
            addCriterion("C128 <", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128LessThanOrEqualTo(String value) {
            addCriterion("C128 <=", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128Like(String value) {
            addCriterion("C128 like", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotLike(String value) {
            addCriterion("C128 not like", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128In(List<String> values) {
            addCriterion("C128 in", values, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotIn(List<String> values) {
            addCriterion("C128 not in", values, "c128");
            return (Criteria) this;
        }

        public Criteria andC128Between(String value1, String value2) {
            addCriterion("C128 between", value1, value2, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotBetween(String value1, String value2) {
            addCriterion("C128 not between", value1, value2, "c128");
            return (Criteria) this;
        }

        public Criteria andC129IsNull() {
            addCriterion("C129 is null");
            return (Criteria) this;
        }

        public Criteria andC129IsNotNull() {
            addCriterion("C129 is not null");
            return (Criteria) this;
        }

        public Criteria andC129EqualTo(String value) {
            addCriterion("C129 =", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotEqualTo(String value) {
            addCriterion("C129 <>", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129GreaterThan(String value) {
            addCriterion("C129 >", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129GreaterThanOrEqualTo(String value) {
            addCriterion("C129 >=", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129LessThan(String value) {
            addCriterion("C129 <", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129LessThanOrEqualTo(String value) {
            addCriterion("C129 <=", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129Like(String value) {
            addCriterion("C129 like", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotLike(String value) {
            addCriterion("C129 not like", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129In(List<String> values) {
            addCriterion("C129 in", values, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotIn(List<String> values) {
            addCriterion("C129 not in", values, "c129");
            return (Criteria) this;
        }

        public Criteria andC129Between(String value1, String value2) {
            addCriterion("C129 between", value1, value2, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotBetween(String value1, String value2) {
            addCriterion("C129 not between", value1, value2, "c129");
            return (Criteria) this;
        }

        public Criteria andC130IsNull() {
            addCriterion("C130 is null");
            return (Criteria) this;
        }

        public Criteria andC130IsNotNull() {
            addCriterion("C130 is not null");
            return (Criteria) this;
        }

        public Criteria andC130EqualTo(String value) {
            addCriterion("C130 =", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotEqualTo(String value) {
            addCriterion("C130 <>", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130GreaterThan(String value) {
            addCriterion("C130 >", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130GreaterThanOrEqualTo(String value) {
            addCriterion("C130 >=", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130LessThan(String value) {
            addCriterion("C130 <", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130LessThanOrEqualTo(String value) {
            addCriterion("C130 <=", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130Like(String value) {
            addCriterion("C130 like", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotLike(String value) {
            addCriterion("C130 not like", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130In(List<String> values) {
            addCriterion("C130 in", values, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotIn(List<String> values) {
            addCriterion("C130 not in", values, "c130");
            return (Criteria) this;
        }

        public Criteria andC130Between(String value1, String value2) {
            addCriterion("C130 between", value1, value2, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotBetween(String value1, String value2) {
            addCriterion("C130 not between", value1, value2, "c130");
            return (Criteria) this;
        }

        public Criteria andC131IsNull() {
            addCriterion("C131 is null");
            return (Criteria) this;
        }

        public Criteria andC131IsNotNull() {
            addCriterion("C131 is not null");
            return (Criteria) this;
        }

        public Criteria andC131EqualTo(String value) {
            addCriterion("C131 =", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotEqualTo(String value) {
            addCriterion("C131 <>", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131GreaterThan(String value) {
            addCriterion("C131 >", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131GreaterThanOrEqualTo(String value) {
            addCriterion("C131 >=", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131LessThan(String value) {
            addCriterion("C131 <", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131LessThanOrEqualTo(String value) {
            addCriterion("C131 <=", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131Like(String value) {
            addCriterion("C131 like", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotLike(String value) {
            addCriterion("C131 not like", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131In(List<String> values) {
            addCriterion("C131 in", values, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotIn(List<String> values) {
            addCriterion("C131 not in", values, "c131");
            return (Criteria) this;
        }

        public Criteria andC131Between(String value1, String value2) {
            addCriterion("C131 between", value1, value2, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotBetween(String value1, String value2) {
            addCriterion("C131 not between", value1, value2, "c131");
            return (Criteria) this;
        }

        public Criteria andC132IsNull() {
            addCriterion("C132 is null");
            return (Criteria) this;
        }

        public Criteria andC132IsNotNull() {
            addCriterion("C132 is not null");
            return (Criteria) this;
        }

        public Criteria andC132EqualTo(String value) {
            addCriterion("C132 =", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotEqualTo(String value) {
            addCriterion("C132 <>", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132GreaterThan(String value) {
            addCriterion("C132 >", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132GreaterThanOrEqualTo(String value) {
            addCriterion("C132 >=", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132LessThan(String value) {
            addCriterion("C132 <", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132LessThanOrEqualTo(String value) {
            addCriterion("C132 <=", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132Like(String value) {
            addCriterion("C132 like", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotLike(String value) {
            addCriterion("C132 not like", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132In(List<String> values) {
            addCriterion("C132 in", values, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotIn(List<String> values) {
            addCriterion("C132 not in", values, "c132");
            return (Criteria) this;
        }

        public Criteria andC132Between(String value1, String value2) {
            addCriterion("C132 between", value1, value2, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotBetween(String value1, String value2) {
            addCriterion("C132 not between", value1, value2, "c132");
            return (Criteria) this;
        }

        public Criteria andC133IsNull() {
            addCriterion("C133 is null");
            return (Criteria) this;
        }

        public Criteria andC133IsNotNull() {
            addCriterion("C133 is not null");
            return (Criteria) this;
        }

        public Criteria andC133EqualTo(String value) {
            addCriterion("C133 =", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotEqualTo(String value) {
            addCriterion("C133 <>", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133GreaterThan(String value) {
            addCriterion("C133 >", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133GreaterThanOrEqualTo(String value) {
            addCriterion("C133 >=", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133LessThan(String value) {
            addCriterion("C133 <", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133LessThanOrEqualTo(String value) {
            addCriterion("C133 <=", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133Like(String value) {
            addCriterion("C133 like", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotLike(String value) {
            addCriterion("C133 not like", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133In(List<String> values) {
            addCriterion("C133 in", values, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotIn(List<String> values) {
            addCriterion("C133 not in", values, "c133");
            return (Criteria) this;
        }

        public Criteria andC133Between(String value1, String value2) {
            addCriterion("C133 between", value1, value2, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotBetween(String value1, String value2) {
            addCriterion("C133 not between", value1, value2, "c133");
            return (Criteria) this;
        }

        public Criteria andC134IsNull() {
            addCriterion("C134 is null");
            return (Criteria) this;
        }

        public Criteria andC134IsNotNull() {
            addCriterion("C134 is not null");
            return (Criteria) this;
        }

        public Criteria andC134EqualTo(String value) {
            addCriterion("C134 =", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotEqualTo(String value) {
            addCriterion("C134 <>", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134GreaterThan(String value) {
            addCriterion("C134 >", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134GreaterThanOrEqualTo(String value) {
            addCriterion("C134 >=", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134LessThan(String value) {
            addCriterion("C134 <", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134LessThanOrEqualTo(String value) {
            addCriterion("C134 <=", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134Like(String value) {
            addCriterion("C134 like", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotLike(String value) {
            addCriterion("C134 not like", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134In(List<String> values) {
            addCriterion("C134 in", values, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotIn(List<String> values) {
            addCriterion("C134 not in", values, "c134");
            return (Criteria) this;
        }

        public Criteria andC134Between(String value1, String value2) {
            addCriterion("C134 between", value1, value2, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotBetween(String value1, String value2) {
            addCriterion("C134 not between", value1, value2, "c134");
            return (Criteria) this;
        }

        public Criteria andC135IsNull() {
            addCriterion("C135 is null");
            return (Criteria) this;
        }

        public Criteria andC135IsNotNull() {
            addCriterion("C135 is not null");
            return (Criteria) this;
        }

        public Criteria andC135EqualTo(String value) {
            addCriterion("C135 =", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotEqualTo(String value) {
            addCriterion("C135 <>", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135GreaterThan(String value) {
            addCriterion("C135 >", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135GreaterThanOrEqualTo(String value) {
            addCriterion("C135 >=", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135LessThan(String value) {
            addCriterion("C135 <", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135LessThanOrEqualTo(String value) {
            addCriterion("C135 <=", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135Like(String value) {
            addCriterion("C135 like", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotLike(String value) {
            addCriterion("C135 not like", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135In(List<String> values) {
            addCriterion("C135 in", values, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotIn(List<String> values) {
            addCriterion("C135 not in", values, "c135");
            return (Criteria) this;
        }

        public Criteria andC135Between(String value1, String value2) {
            addCriterion("C135 between", value1, value2, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotBetween(String value1, String value2) {
            addCriterion("C135 not between", value1, value2, "c135");
            return (Criteria) this;
        }

        public Criteria andC136IsNull() {
            addCriterion("C136 is null");
            return (Criteria) this;
        }

        public Criteria andC136IsNotNull() {
            addCriterion("C136 is not null");
            return (Criteria) this;
        }

        public Criteria andC136EqualTo(String value) {
            addCriterion("C136 =", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotEqualTo(String value) {
            addCriterion("C136 <>", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136GreaterThan(String value) {
            addCriterion("C136 >", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136GreaterThanOrEqualTo(String value) {
            addCriterion("C136 >=", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136LessThan(String value) {
            addCriterion("C136 <", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136LessThanOrEqualTo(String value) {
            addCriterion("C136 <=", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136Like(String value) {
            addCriterion("C136 like", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotLike(String value) {
            addCriterion("C136 not like", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136In(List<String> values) {
            addCriterion("C136 in", values, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotIn(List<String> values) {
            addCriterion("C136 not in", values, "c136");
            return (Criteria) this;
        }

        public Criteria andC136Between(String value1, String value2) {
            addCriterion("C136 between", value1, value2, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotBetween(String value1, String value2) {
            addCriterion("C136 not between", value1, value2, "c136");
            return (Criteria) this;
        }

        public Criteria andC137IsNull() {
            addCriterion("C137 is null");
            return (Criteria) this;
        }

        public Criteria andC137IsNotNull() {
            addCriterion("C137 is not null");
            return (Criteria) this;
        }

        public Criteria andC137EqualTo(String value) {
            addCriterion("C137 =", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotEqualTo(String value) {
            addCriterion("C137 <>", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137GreaterThan(String value) {
            addCriterion("C137 >", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137GreaterThanOrEqualTo(String value) {
            addCriterion("C137 >=", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137LessThan(String value) {
            addCriterion("C137 <", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137LessThanOrEqualTo(String value) {
            addCriterion("C137 <=", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137Like(String value) {
            addCriterion("C137 like", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotLike(String value) {
            addCriterion("C137 not like", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137In(List<String> values) {
            addCriterion("C137 in", values, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotIn(List<String> values) {
            addCriterion("C137 not in", values, "c137");
            return (Criteria) this;
        }

        public Criteria andC137Between(String value1, String value2) {
            addCriterion("C137 between", value1, value2, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotBetween(String value1, String value2) {
            addCriterion("C137 not between", value1, value2, "c137");
            return (Criteria) this;
        }

        public Criteria andC138IsNull() {
            addCriterion("C138 is null");
            return (Criteria) this;
        }

        public Criteria andC138IsNotNull() {
            addCriterion("C138 is not null");
            return (Criteria) this;
        }

        public Criteria andC138EqualTo(String value) {
            addCriterion("C138 =", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotEqualTo(String value) {
            addCriterion("C138 <>", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138GreaterThan(String value) {
            addCriterion("C138 >", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138GreaterThanOrEqualTo(String value) {
            addCriterion("C138 >=", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138LessThan(String value) {
            addCriterion("C138 <", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138LessThanOrEqualTo(String value) {
            addCriterion("C138 <=", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138Like(String value) {
            addCriterion("C138 like", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotLike(String value) {
            addCriterion("C138 not like", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138In(List<String> values) {
            addCriterion("C138 in", values, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotIn(List<String> values) {
            addCriterion("C138 not in", values, "c138");
            return (Criteria) this;
        }

        public Criteria andC138Between(String value1, String value2) {
            addCriterion("C138 between", value1, value2, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotBetween(String value1, String value2) {
            addCriterion("C138 not between", value1, value2, "c138");
            return (Criteria) this;
        }

        public Criteria andC139IsNull() {
            addCriterion("C139 is null");
            return (Criteria) this;
        }

        public Criteria andC139IsNotNull() {
            addCriterion("C139 is not null");
            return (Criteria) this;
        }

        public Criteria andC139EqualTo(String value) {
            addCriterion("C139 =", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotEqualTo(String value) {
            addCriterion("C139 <>", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139GreaterThan(String value) {
            addCriterion("C139 >", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139GreaterThanOrEqualTo(String value) {
            addCriterion("C139 >=", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139LessThan(String value) {
            addCriterion("C139 <", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139LessThanOrEqualTo(String value) {
            addCriterion("C139 <=", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139Like(String value) {
            addCriterion("C139 like", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotLike(String value) {
            addCriterion("C139 not like", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139In(List<String> values) {
            addCriterion("C139 in", values, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotIn(List<String> values) {
            addCriterion("C139 not in", values, "c139");
            return (Criteria) this;
        }

        public Criteria andC139Between(String value1, String value2) {
            addCriterion("C139 between", value1, value2, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotBetween(String value1, String value2) {
            addCriterion("C139 not between", value1, value2, "c139");
            return (Criteria) this;
        }

        public Criteria andC140IsNull() {
            addCriterion("C140 is null");
            return (Criteria) this;
        }

        public Criteria andC140IsNotNull() {
            addCriterion("C140 is not null");
            return (Criteria) this;
        }

        public Criteria andC140EqualTo(String value) {
            addCriterion("C140 =", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotEqualTo(String value) {
            addCriterion("C140 <>", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140GreaterThan(String value) {
            addCriterion("C140 >", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140GreaterThanOrEqualTo(String value) {
            addCriterion("C140 >=", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140LessThan(String value) {
            addCriterion("C140 <", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140LessThanOrEqualTo(String value) {
            addCriterion("C140 <=", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140Like(String value) {
            addCriterion("C140 like", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotLike(String value) {
            addCriterion("C140 not like", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140In(List<String> values) {
            addCriterion("C140 in", values, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotIn(List<String> values) {
            addCriterion("C140 not in", values, "c140");
            return (Criteria) this;
        }

        public Criteria andC140Between(String value1, String value2) {
            addCriterion("C140 between", value1, value2, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotBetween(String value1, String value2) {
            addCriterion("C140 not between", value1, value2, "c140");
            return (Criteria) this;
        }

        public Criteria andC141IsNull() {
            addCriterion("C141 is null");
            return (Criteria) this;
        }

        public Criteria andC141IsNotNull() {
            addCriterion("C141 is not null");
            return (Criteria) this;
        }

        public Criteria andC141EqualTo(String value) {
            addCriterion("C141 =", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotEqualTo(String value) {
            addCriterion("C141 <>", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141GreaterThan(String value) {
            addCriterion("C141 >", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141GreaterThanOrEqualTo(String value) {
            addCriterion("C141 >=", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141LessThan(String value) {
            addCriterion("C141 <", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141LessThanOrEqualTo(String value) {
            addCriterion("C141 <=", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141Like(String value) {
            addCriterion("C141 like", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotLike(String value) {
            addCriterion("C141 not like", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141In(List<String> values) {
            addCriterion("C141 in", values, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotIn(List<String> values) {
            addCriterion("C141 not in", values, "c141");
            return (Criteria) this;
        }

        public Criteria andC141Between(String value1, String value2) {
            addCriterion("C141 between", value1, value2, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotBetween(String value1, String value2) {
            addCriterion("C141 not between", value1, value2, "c141");
            return (Criteria) this;
        }

        public Criteria andC142IsNull() {
            addCriterion("C142 is null");
            return (Criteria) this;
        }

        public Criteria andC142IsNotNull() {
            addCriterion("C142 is not null");
            return (Criteria) this;
        }

        public Criteria andC142EqualTo(String value) {
            addCriterion("C142 =", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotEqualTo(String value) {
            addCriterion("C142 <>", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142GreaterThan(String value) {
            addCriterion("C142 >", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142GreaterThanOrEqualTo(String value) {
            addCriterion("C142 >=", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142LessThan(String value) {
            addCriterion("C142 <", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142LessThanOrEqualTo(String value) {
            addCriterion("C142 <=", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142Like(String value) {
            addCriterion("C142 like", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotLike(String value) {
            addCriterion("C142 not like", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142In(List<String> values) {
            addCriterion("C142 in", values, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotIn(List<String> values) {
            addCriterion("C142 not in", values, "c142");
            return (Criteria) this;
        }

        public Criteria andC142Between(String value1, String value2) {
            addCriterion("C142 between", value1, value2, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotBetween(String value1, String value2) {
            addCriterion("C142 not between", value1, value2, "c142");
            return (Criteria) this;
        }

        public Criteria andC143IsNull() {
            addCriterion("C143 is null");
            return (Criteria) this;
        }

        public Criteria andC143IsNotNull() {
            addCriterion("C143 is not null");
            return (Criteria) this;
        }

        public Criteria andC143EqualTo(String value) {
            addCriterion("C143 =", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotEqualTo(String value) {
            addCriterion("C143 <>", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143GreaterThan(String value) {
            addCriterion("C143 >", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143GreaterThanOrEqualTo(String value) {
            addCriterion("C143 >=", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143LessThan(String value) {
            addCriterion("C143 <", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143LessThanOrEqualTo(String value) {
            addCriterion("C143 <=", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143Like(String value) {
            addCriterion("C143 like", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotLike(String value) {
            addCriterion("C143 not like", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143In(List<String> values) {
            addCriterion("C143 in", values, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotIn(List<String> values) {
            addCriterion("C143 not in", values, "c143");
            return (Criteria) this;
        }

        public Criteria andC143Between(String value1, String value2) {
            addCriterion("C143 between", value1, value2, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotBetween(String value1, String value2) {
            addCriterion("C143 not between", value1, value2, "c143");
            return (Criteria) this;
        }

        public Criteria andC144IsNull() {
            addCriterion("C144 is null");
            return (Criteria) this;
        }

        public Criteria andC144IsNotNull() {
            addCriterion("C144 is not null");
            return (Criteria) this;
        }

        public Criteria andC144EqualTo(String value) {
            addCriterion("C144 =", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotEqualTo(String value) {
            addCriterion("C144 <>", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144GreaterThan(String value) {
            addCriterion("C144 >", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144GreaterThanOrEqualTo(String value) {
            addCriterion("C144 >=", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144LessThan(String value) {
            addCriterion("C144 <", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144LessThanOrEqualTo(String value) {
            addCriterion("C144 <=", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144Like(String value) {
            addCriterion("C144 like", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotLike(String value) {
            addCriterion("C144 not like", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144In(List<String> values) {
            addCriterion("C144 in", values, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotIn(List<String> values) {
            addCriterion("C144 not in", values, "c144");
            return (Criteria) this;
        }

        public Criteria andC144Between(String value1, String value2) {
            addCriterion("C144 between", value1, value2, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotBetween(String value1, String value2) {
            addCriterion("C144 not between", value1, value2, "c144");
            return (Criteria) this;
        }

        public Criteria andC145IsNull() {
            addCriterion("C145 is null");
            return (Criteria) this;
        }

        public Criteria andC145IsNotNull() {
            addCriterion("C145 is not null");
            return (Criteria) this;
        }

        public Criteria andC145EqualTo(String value) {
            addCriterion("C145 =", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotEqualTo(String value) {
            addCriterion("C145 <>", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145GreaterThan(String value) {
            addCriterion("C145 >", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145GreaterThanOrEqualTo(String value) {
            addCriterion("C145 >=", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145LessThan(String value) {
            addCriterion("C145 <", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145LessThanOrEqualTo(String value) {
            addCriterion("C145 <=", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145Like(String value) {
            addCriterion("C145 like", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotLike(String value) {
            addCriterion("C145 not like", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145In(List<String> values) {
            addCriterion("C145 in", values, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotIn(List<String> values) {
            addCriterion("C145 not in", values, "c145");
            return (Criteria) this;
        }

        public Criteria andC145Between(String value1, String value2) {
            addCriterion("C145 between", value1, value2, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotBetween(String value1, String value2) {
            addCriterion("C145 not between", value1, value2, "c145");
            return (Criteria) this;
        }

        public Criteria andC146IsNull() {
            addCriterion("C146 is null");
            return (Criteria) this;
        }

        public Criteria andC146IsNotNull() {
            addCriterion("C146 is not null");
            return (Criteria) this;
        }

        public Criteria andC146EqualTo(String value) {
            addCriterion("C146 =", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotEqualTo(String value) {
            addCriterion("C146 <>", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146GreaterThan(String value) {
            addCriterion("C146 >", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146GreaterThanOrEqualTo(String value) {
            addCriterion("C146 >=", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146LessThan(String value) {
            addCriterion("C146 <", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146LessThanOrEqualTo(String value) {
            addCriterion("C146 <=", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146Like(String value) {
            addCriterion("C146 like", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotLike(String value) {
            addCriterion("C146 not like", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146In(List<String> values) {
            addCriterion("C146 in", values, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotIn(List<String> values) {
            addCriterion("C146 not in", values, "c146");
            return (Criteria) this;
        }

        public Criteria andC146Between(String value1, String value2) {
            addCriterion("C146 between", value1, value2, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotBetween(String value1, String value2) {
            addCriterion("C146 not between", value1, value2, "c146");
            return (Criteria) this;
        }

        public Criteria andC147IsNull() {
            addCriterion("C147 is null");
            return (Criteria) this;
        }

        public Criteria andC147IsNotNull() {
            addCriterion("C147 is not null");
            return (Criteria) this;
        }

        public Criteria andC147EqualTo(String value) {
            addCriterion("C147 =", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotEqualTo(String value) {
            addCriterion("C147 <>", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147GreaterThan(String value) {
            addCriterion("C147 >", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147GreaterThanOrEqualTo(String value) {
            addCriterion("C147 >=", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147LessThan(String value) {
            addCriterion("C147 <", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147LessThanOrEqualTo(String value) {
            addCriterion("C147 <=", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147Like(String value) {
            addCriterion("C147 like", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotLike(String value) {
            addCriterion("C147 not like", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147In(List<String> values) {
            addCriterion("C147 in", values, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotIn(List<String> values) {
            addCriterion("C147 not in", values, "c147");
            return (Criteria) this;
        }

        public Criteria andC147Between(String value1, String value2) {
            addCriterion("C147 between", value1, value2, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotBetween(String value1, String value2) {
            addCriterion("C147 not between", value1, value2, "c147");
            return (Criteria) this;
        }

        public Criteria andC148IsNull() {
            addCriterion("C148 is null");
            return (Criteria) this;
        }

        public Criteria andC148IsNotNull() {
            addCriterion("C148 is not null");
            return (Criteria) this;
        }

        public Criteria andC148EqualTo(String value) {
            addCriterion("C148 =", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotEqualTo(String value) {
            addCriterion("C148 <>", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148GreaterThan(String value) {
            addCriterion("C148 >", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148GreaterThanOrEqualTo(String value) {
            addCriterion("C148 >=", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148LessThan(String value) {
            addCriterion("C148 <", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148LessThanOrEqualTo(String value) {
            addCriterion("C148 <=", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148Like(String value) {
            addCriterion("C148 like", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotLike(String value) {
            addCriterion("C148 not like", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148In(List<String> values) {
            addCriterion("C148 in", values, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotIn(List<String> values) {
            addCriterion("C148 not in", values, "c148");
            return (Criteria) this;
        }

        public Criteria andC148Between(String value1, String value2) {
            addCriterion("C148 between", value1, value2, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotBetween(String value1, String value2) {
            addCriterion("C148 not between", value1, value2, "c148");
            return (Criteria) this;
        }

        public Criteria andC149IsNull() {
            addCriterion("C149 is null");
            return (Criteria) this;
        }

        public Criteria andC149IsNotNull() {
            addCriterion("C149 is not null");
            return (Criteria) this;
        }

        public Criteria andC149EqualTo(String value) {
            addCriterion("C149 =", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotEqualTo(String value) {
            addCriterion("C149 <>", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149GreaterThan(String value) {
            addCriterion("C149 >", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149GreaterThanOrEqualTo(String value) {
            addCriterion("C149 >=", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149LessThan(String value) {
            addCriterion("C149 <", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149LessThanOrEqualTo(String value) {
            addCriterion("C149 <=", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149Like(String value) {
            addCriterion("C149 like", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotLike(String value) {
            addCriterion("C149 not like", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149In(List<String> values) {
            addCriterion("C149 in", values, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotIn(List<String> values) {
            addCriterion("C149 not in", values, "c149");
            return (Criteria) this;
        }

        public Criteria andC149Between(String value1, String value2) {
            addCriterion("C149 between", value1, value2, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotBetween(String value1, String value2) {
            addCriterion("C149 not between", value1, value2, "c149");
            return (Criteria) this;
        }

        public Criteria andC150IsNull() {
            addCriterion("C150 is null");
            return (Criteria) this;
        }

        public Criteria andC150IsNotNull() {
            addCriterion("C150 is not null");
            return (Criteria) this;
        }

        public Criteria andC150EqualTo(String value) {
            addCriterion("C150 =", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotEqualTo(String value) {
            addCriterion("C150 <>", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150GreaterThan(String value) {
            addCriterion("C150 >", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150GreaterThanOrEqualTo(String value) {
            addCriterion("C150 >=", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150LessThan(String value) {
            addCriterion("C150 <", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150LessThanOrEqualTo(String value) {
            addCriterion("C150 <=", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150Like(String value) {
            addCriterion("C150 like", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotLike(String value) {
            addCriterion("C150 not like", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150In(List<String> values) {
            addCriterion("C150 in", values, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotIn(List<String> values) {
            addCriterion("C150 not in", values, "c150");
            return (Criteria) this;
        }

        public Criteria andC150Between(String value1, String value2) {
            addCriterion("C150 between", value1, value2, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotBetween(String value1, String value2) {
            addCriterion("C150 not between", value1, value2, "c150");
            return (Criteria) this;
        }

        public Criteria andC151IsNull() {
            addCriterion("C151 is null");
            return (Criteria) this;
        }

        public Criteria andC151IsNotNull() {
            addCriterion("C151 is not null");
            return (Criteria) this;
        }

        public Criteria andC151EqualTo(String value) {
            addCriterion("C151 =", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotEqualTo(String value) {
            addCriterion("C151 <>", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151GreaterThan(String value) {
            addCriterion("C151 >", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151GreaterThanOrEqualTo(String value) {
            addCriterion("C151 >=", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151LessThan(String value) {
            addCriterion("C151 <", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151LessThanOrEqualTo(String value) {
            addCriterion("C151 <=", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151Like(String value) {
            addCriterion("C151 like", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotLike(String value) {
            addCriterion("C151 not like", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151In(List<String> values) {
            addCriterion("C151 in", values, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotIn(List<String> values) {
            addCriterion("C151 not in", values, "c151");
            return (Criteria) this;
        }

        public Criteria andC151Between(String value1, String value2) {
            addCriterion("C151 between", value1, value2, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotBetween(String value1, String value2) {
            addCriterion("C151 not between", value1, value2, "c151");
            return (Criteria) this;
        }

        public Criteria andC152IsNull() {
            addCriterion("C152 is null");
            return (Criteria) this;
        }

        public Criteria andC152IsNotNull() {
            addCriterion("C152 is not null");
            return (Criteria) this;
        }

        public Criteria andC152EqualTo(String value) {
            addCriterion("C152 =", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotEqualTo(String value) {
            addCriterion("C152 <>", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152GreaterThan(String value) {
            addCriterion("C152 >", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152GreaterThanOrEqualTo(String value) {
            addCriterion("C152 >=", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152LessThan(String value) {
            addCriterion("C152 <", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152LessThanOrEqualTo(String value) {
            addCriterion("C152 <=", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152Like(String value) {
            addCriterion("C152 like", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotLike(String value) {
            addCriterion("C152 not like", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152In(List<String> values) {
            addCriterion("C152 in", values, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotIn(List<String> values) {
            addCriterion("C152 not in", values, "c152");
            return (Criteria) this;
        }

        public Criteria andC152Between(String value1, String value2) {
            addCriterion("C152 between", value1, value2, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotBetween(String value1, String value2) {
            addCriterion("C152 not between", value1, value2, "c152");
            return (Criteria) this;
        }

        public Criteria andC153IsNull() {
            addCriterion("C153 is null");
            return (Criteria) this;
        }

        public Criteria andC153IsNotNull() {
            addCriterion("C153 is not null");
            return (Criteria) this;
        }

        public Criteria andC153EqualTo(String value) {
            addCriterion("C153 =", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotEqualTo(String value) {
            addCriterion("C153 <>", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153GreaterThan(String value) {
            addCriterion("C153 >", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153GreaterThanOrEqualTo(String value) {
            addCriterion("C153 >=", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153LessThan(String value) {
            addCriterion("C153 <", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153LessThanOrEqualTo(String value) {
            addCriterion("C153 <=", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153Like(String value) {
            addCriterion("C153 like", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotLike(String value) {
            addCriterion("C153 not like", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153In(List<String> values) {
            addCriterion("C153 in", values, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotIn(List<String> values) {
            addCriterion("C153 not in", values, "c153");
            return (Criteria) this;
        }

        public Criteria andC153Between(String value1, String value2) {
            addCriterion("C153 between", value1, value2, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotBetween(String value1, String value2) {
            addCriterion("C153 not between", value1, value2, "c153");
            return (Criteria) this;
        }

        public Criteria andC154IsNull() {
            addCriterion("C154 is null");
            return (Criteria) this;
        }

        public Criteria andC154IsNotNull() {
            addCriterion("C154 is not null");
            return (Criteria) this;
        }

        public Criteria andC154EqualTo(String value) {
            addCriterion("C154 =", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotEqualTo(String value) {
            addCriterion("C154 <>", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154GreaterThan(String value) {
            addCriterion("C154 >", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154GreaterThanOrEqualTo(String value) {
            addCriterion("C154 >=", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154LessThan(String value) {
            addCriterion("C154 <", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154LessThanOrEqualTo(String value) {
            addCriterion("C154 <=", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154Like(String value) {
            addCriterion("C154 like", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotLike(String value) {
            addCriterion("C154 not like", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154In(List<String> values) {
            addCriterion("C154 in", values, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotIn(List<String> values) {
            addCriterion("C154 not in", values, "c154");
            return (Criteria) this;
        }

        public Criteria andC154Between(String value1, String value2) {
            addCriterion("C154 between", value1, value2, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotBetween(String value1, String value2) {
            addCriterion("C154 not between", value1, value2, "c154");
            return (Criteria) this;
        }

        public Criteria andC155IsNull() {
            addCriterion("C155 is null");
            return (Criteria) this;
        }

        public Criteria andC155IsNotNull() {
            addCriterion("C155 is not null");
            return (Criteria) this;
        }

        public Criteria andC155EqualTo(String value) {
            addCriterion("C155 =", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotEqualTo(String value) {
            addCriterion("C155 <>", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155GreaterThan(String value) {
            addCriterion("C155 >", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155GreaterThanOrEqualTo(String value) {
            addCriterion("C155 >=", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155LessThan(String value) {
            addCriterion("C155 <", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155LessThanOrEqualTo(String value) {
            addCriterion("C155 <=", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155Like(String value) {
            addCriterion("C155 like", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotLike(String value) {
            addCriterion("C155 not like", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155In(List<String> values) {
            addCriterion("C155 in", values, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotIn(List<String> values) {
            addCriterion("C155 not in", values, "c155");
            return (Criteria) this;
        }

        public Criteria andC155Between(String value1, String value2) {
            addCriterion("C155 between", value1, value2, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotBetween(String value1, String value2) {
            addCriterion("C155 not between", value1, value2, "c155");
            return (Criteria) this;
        }

        public Criteria andC156IsNull() {
            addCriterion("C156 is null");
            return (Criteria) this;
        }

        public Criteria andC156IsNotNull() {
            addCriterion("C156 is not null");
            return (Criteria) this;
        }

        public Criteria andC156EqualTo(String value) {
            addCriterion("C156 =", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotEqualTo(String value) {
            addCriterion("C156 <>", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156GreaterThan(String value) {
            addCriterion("C156 >", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156GreaterThanOrEqualTo(String value) {
            addCriterion("C156 >=", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156LessThan(String value) {
            addCriterion("C156 <", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156LessThanOrEqualTo(String value) {
            addCriterion("C156 <=", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156Like(String value) {
            addCriterion("C156 like", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotLike(String value) {
            addCriterion("C156 not like", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156In(List<String> values) {
            addCriterion("C156 in", values, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotIn(List<String> values) {
            addCriterion("C156 not in", values, "c156");
            return (Criteria) this;
        }

        public Criteria andC156Between(String value1, String value2) {
            addCriterion("C156 between", value1, value2, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotBetween(String value1, String value2) {
            addCriterion("C156 not between", value1, value2, "c156");
            return (Criteria) this;
        }

        public Criteria andC157IsNull() {
            addCriterion("C157 is null");
            return (Criteria) this;
        }

        public Criteria andC157IsNotNull() {
            addCriterion("C157 is not null");
            return (Criteria) this;
        }

        public Criteria andC157EqualTo(String value) {
            addCriterion("C157 =", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotEqualTo(String value) {
            addCriterion("C157 <>", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157GreaterThan(String value) {
            addCriterion("C157 >", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157GreaterThanOrEqualTo(String value) {
            addCriterion("C157 >=", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157LessThan(String value) {
            addCriterion("C157 <", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157LessThanOrEqualTo(String value) {
            addCriterion("C157 <=", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157Like(String value) {
            addCriterion("C157 like", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotLike(String value) {
            addCriterion("C157 not like", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157In(List<String> values) {
            addCriterion("C157 in", values, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotIn(List<String> values) {
            addCriterion("C157 not in", values, "c157");
            return (Criteria) this;
        }

        public Criteria andC157Between(String value1, String value2) {
            addCriterion("C157 between", value1, value2, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotBetween(String value1, String value2) {
            addCriterion("C157 not between", value1, value2, "c157");
            return (Criteria) this;
        }

        public Criteria andC158IsNull() {
            addCriterion("C158 is null");
            return (Criteria) this;
        }

        public Criteria andC158IsNotNull() {
            addCriterion("C158 is not null");
            return (Criteria) this;
        }

        public Criteria andC158EqualTo(String value) {
            addCriterion("C158 =", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotEqualTo(String value) {
            addCriterion("C158 <>", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158GreaterThan(String value) {
            addCriterion("C158 >", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158GreaterThanOrEqualTo(String value) {
            addCriterion("C158 >=", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158LessThan(String value) {
            addCriterion("C158 <", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158LessThanOrEqualTo(String value) {
            addCriterion("C158 <=", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158Like(String value) {
            addCriterion("C158 like", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotLike(String value) {
            addCriterion("C158 not like", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158In(List<String> values) {
            addCriterion("C158 in", values, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotIn(List<String> values) {
            addCriterion("C158 not in", values, "c158");
            return (Criteria) this;
        }

        public Criteria andC158Between(String value1, String value2) {
            addCriterion("C158 between", value1, value2, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotBetween(String value1, String value2) {
            addCriterion("C158 not between", value1, value2, "c158");
            return (Criteria) this;
        }

        public Criteria andC159IsNull() {
            addCriterion("C159 is null");
            return (Criteria) this;
        }

        public Criteria andC159IsNotNull() {
            addCriterion("C159 is not null");
            return (Criteria) this;
        }

        public Criteria andC159EqualTo(String value) {
            addCriterion("C159 =", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotEqualTo(String value) {
            addCriterion("C159 <>", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159GreaterThan(String value) {
            addCriterion("C159 >", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159GreaterThanOrEqualTo(String value) {
            addCriterion("C159 >=", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159LessThan(String value) {
            addCriterion("C159 <", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159LessThanOrEqualTo(String value) {
            addCriterion("C159 <=", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159Like(String value) {
            addCriterion("C159 like", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotLike(String value) {
            addCriterion("C159 not like", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159In(List<String> values) {
            addCriterion("C159 in", values, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotIn(List<String> values) {
            addCriterion("C159 not in", values, "c159");
            return (Criteria) this;
        }

        public Criteria andC159Between(String value1, String value2) {
            addCriterion("C159 between", value1, value2, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotBetween(String value1, String value2) {
            addCriterion("C159 not between", value1, value2, "c159");
            return (Criteria) this;
        }

        public Criteria andC160IsNull() {
            addCriterion("C160 is null");
            return (Criteria) this;
        }

        public Criteria andC160IsNotNull() {
            addCriterion("C160 is not null");
            return (Criteria) this;
        }

        public Criteria andC160EqualTo(String value) {
            addCriterion("C160 =", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotEqualTo(String value) {
            addCriterion("C160 <>", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160GreaterThan(String value) {
            addCriterion("C160 >", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160GreaterThanOrEqualTo(String value) {
            addCriterion("C160 >=", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160LessThan(String value) {
            addCriterion("C160 <", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160LessThanOrEqualTo(String value) {
            addCriterion("C160 <=", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160Like(String value) {
            addCriterion("C160 like", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotLike(String value) {
            addCriterion("C160 not like", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160In(List<String> values) {
            addCriterion("C160 in", values, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotIn(List<String> values) {
            addCriterion("C160 not in", values, "c160");
            return (Criteria) this;
        }

        public Criteria andC160Between(String value1, String value2) {
            addCriterion("C160 between", value1, value2, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotBetween(String value1, String value2) {
            addCriterion("C160 not between", value1, value2, "c160");
            return (Criteria) this;
        }

        public Criteria andC161IsNull() {
            addCriterion("C161 is null");
            return (Criteria) this;
        }

        public Criteria andC161IsNotNull() {
            addCriterion("C161 is not null");
            return (Criteria) this;
        }

        public Criteria andC161EqualTo(String value) {
            addCriterion("C161 =", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotEqualTo(String value) {
            addCriterion("C161 <>", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161GreaterThan(String value) {
            addCriterion("C161 >", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161GreaterThanOrEqualTo(String value) {
            addCriterion("C161 >=", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161LessThan(String value) {
            addCriterion("C161 <", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161LessThanOrEqualTo(String value) {
            addCriterion("C161 <=", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161Like(String value) {
            addCriterion("C161 like", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotLike(String value) {
            addCriterion("C161 not like", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161In(List<String> values) {
            addCriterion("C161 in", values, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotIn(List<String> values) {
            addCriterion("C161 not in", values, "c161");
            return (Criteria) this;
        }

        public Criteria andC161Between(String value1, String value2) {
            addCriterion("C161 between", value1, value2, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotBetween(String value1, String value2) {
            addCriterion("C161 not between", value1, value2, "c161");
            return (Criteria) this;
        }

        public Criteria andC162IsNull() {
            addCriterion("C162 is null");
            return (Criteria) this;
        }

        public Criteria andC162IsNotNull() {
            addCriterion("C162 is not null");
            return (Criteria) this;
        }

        public Criteria andC162EqualTo(String value) {
            addCriterion("C162 =", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotEqualTo(String value) {
            addCriterion("C162 <>", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162GreaterThan(String value) {
            addCriterion("C162 >", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162GreaterThanOrEqualTo(String value) {
            addCriterion("C162 >=", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162LessThan(String value) {
            addCriterion("C162 <", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162LessThanOrEqualTo(String value) {
            addCriterion("C162 <=", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162Like(String value) {
            addCriterion("C162 like", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotLike(String value) {
            addCriterion("C162 not like", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162In(List<String> values) {
            addCriterion("C162 in", values, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotIn(List<String> values) {
            addCriterion("C162 not in", values, "c162");
            return (Criteria) this;
        }

        public Criteria andC162Between(String value1, String value2) {
            addCriterion("C162 between", value1, value2, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotBetween(String value1, String value2) {
            addCriterion("C162 not between", value1, value2, "c162");
            return (Criteria) this;
        }

        public Criteria andC163IsNull() {
            addCriterion("C163 is null");
            return (Criteria) this;
        }

        public Criteria andC163IsNotNull() {
            addCriterion("C163 is not null");
            return (Criteria) this;
        }

        public Criteria andC163EqualTo(String value) {
            addCriterion("C163 =", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotEqualTo(String value) {
            addCriterion("C163 <>", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163GreaterThan(String value) {
            addCriterion("C163 >", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163GreaterThanOrEqualTo(String value) {
            addCriterion("C163 >=", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163LessThan(String value) {
            addCriterion("C163 <", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163LessThanOrEqualTo(String value) {
            addCriterion("C163 <=", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163Like(String value) {
            addCriterion("C163 like", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotLike(String value) {
            addCriterion("C163 not like", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163In(List<String> values) {
            addCriterion("C163 in", values, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotIn(List<String> values) {
            addCriterion("C163 not in", values, "c163");
            return (Criteria) this;
        }

        public Criteria andC163Between(String value1, String value2) {
            addCriterion("C163 between", value1, value2, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotBetween(String value1, String value2) {
            addCriterion("C163 not between", value1, value2, "c163");
            return (Criteria) this;
        }

        public Criteria andC164IsNull() {
            addCriterion("C164 is null");
            return (Criteria) this;
        }

        public Criteria andC164IsNotNull() {
            addCriterion("C164 is not null");
            return (Criteria) this;
        }

        public Criteria andC164EqualTo(String value) {
            addCriterion("C164 =", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotEqualTo(String value) {
            addCriterion("C164 <>", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164GreaterThan(String value) {
            addCriterion("C164 >", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164GreaterThanOrEqualTo(String value) {
            addCriterion("C164 >=", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164LessThan(String value) {
            addCriterion("C164 <", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164LessThanOrEqualTo(String value) {
            addCriterion("C164 <=", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164Like(String value) {
            addCriterion("C164 like", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotLike(String value) {
            addCriterion("C164 not like", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164In(List<String> values) {
            addCriterion("C164 in", values, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotIn(List<String> values) {
            addCriterion("C164 not in", values, "c164");
            return (Criteria) this;
        }

        public Criteria andC164Between(String value1, String value2) {
            addCriterion("C164 between", value1, value2, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotBetween(String value1, String value2) {
            addCriterion("C164 not between", value1, value2, "c164");
            return (Criteria) this;
        }

        public Criteria andC165IsNull() {
            addCriterion("C165 is null");
            return (Criteria) this;
        }

        public Criteria andC165IsNotNull() {
            addCriterion("C165 is not null");
            return (Criteria) this;
        }

        public Criteria andC165EqualTo(String value) {
            addCriterion("C165 =", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotEqualTo(String value) {
            addCriterion("C165 <>", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165GreaterThan(String value) {
            addCriterion("C165 >", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165GreaterThanOrEqualTo(String value) {
            addCriterion("C165 >=", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165LessThan(String value) {
            addCriterion("C165 <", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165LessThanOrEqualTo(String value) {
            addCriterion("C165 <=", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165Like(String value) {
            addCriterion("C165 like", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotLike(String value) {
            addCriterion("C165 not like", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165In(List<String> values) {
            addCriterion("C165 in", values, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotIn(List<String> values) {
            addCriterion("C165 not in", values, "c165");
            return (Criteria) this;
        }

        public Criteria andC165Between(String value1, String value2) {
            addCriterion("C165 between", value1, value2, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotBetween(String value1, String value2) {
            addCriterion("C165 not between", value1, value2, "c165");
            return (Criteria) this;
        }

        public Criteria andC166IsNull() {
            addCriterion("C166 is null");
            return (Criteria) this;
        }

        public Criteria andC166IsNotNull() {
            addCriterion("C166 is not null");
            return (Criteria) this;
        }

        public Criteria andC166EqualTo(String value) {
            addCriterion("C166 =", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotEqualTo(String value) {
            addCriterion("C166 <>", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166GreaterThan(String value) {
            addCriterion("C166 >", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166GreaterThanOrEqualTo(String value) {
            addCriterion("C166 >=", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166LessThan(String value) {
            addCriterion("C166 <", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166LessThanOrEqualTo(String value) {
            addCriterion("C166 <=", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166Like(String value) {
            addCriterion("C166 like", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotLike(String value) {
            addCriterion("C166 not like", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166In(List<String> values) {
            addCriterion("C166 in", values, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotIn(List<String> values) {
            addCriterion("C166 not in", values, "c166");
            return (Criteria) this;
        }

        public Criteria andC166Between(String value1, String value2) {
            addCriterion("C166 between", value1, value2, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotBetween(String value1, String value2) {
            addCriterion("C166 not between", value1, value2, "c166");
            return (Criteria) this;
        }

        public Criteria andC167IsNull() {
            addCriterion("C167 is null");
            return (Criteria) this;
        }

        public Criteria andC167IsNotNull() {
            addCriterion("C167 is not null");
            return (Criteria) this;
        }

        public Criteria andC167EqualTo(String value) {
            addCriterion("C167 =", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotEqualTo(String value) {
            addCriterion("C167 <>", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167GreaterThan(String value) {
            addCriterion("C167 >", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167GreaterThanOrEqualTo(String value) {
            addCriterion("C167 >=", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167LessThan(String value) {
            addCriterion("C167 <", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167LessThanOrEqualTo(String value) {
            addCriterion("C167 <=", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167Like(String value) {
            addCriterion("C167 like", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotLike(String value) {
            addCriterion("C167 not like", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167In(List<String> values) {
            addCriterion("C167 in", values, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotIn(List<String> values) {
            addCriterion("C167 not in", values, "c167");
            return (Criteria) this;
        }

        public Criteria andC167Between(String value1, String value2) {
            addCriterion("C167 between", value1, value2, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotBetween(String value1, String value2) {
            addCriterion("C167 not between", value1, value2, "c167");
            return (Criteria) this;
        }

        public Criteria andC168IsNull() {
            addCriterion("C168 is null");
            return (Criteria) this;
        }

        public Criteria andC168IsNotNull() {
            addCriterion("C168 is not null");
            return (Criteria) this;
        }

        public Criteria andC168EqualTo(String value) {
            addCriterion("C168 =", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotEqualTo(String value) {
            addCriterion("C168 <>", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168GreaterThan(String value) {
            addCriterion("C168 >", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168GreaterThanOrEqualTo(String value) {
            addCriterion("C168 >=", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168LessThan(String value) {
            addCriterion("C168 <", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168LessThanOrEqualTo(String value) {
            addCriterion("C168 <=", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168Like(String value) {
            addCriterion("C168 like", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotLike(String value) {
            addCriterion("C168 not like", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168In(List<String> values) {
            addCriterion("C168 in", values, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotIn(List<String> values) {
            addCriterion("C168 not in", values, "c168");
            return (Criteria) this;
        }

        public Criteria andC168Between(String value1, String value2) {
            addCriterion("C168 between", value1, value2, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotBetween(String value1, String value2) {
            addCriterion("C168 not between", value1, value2, "c168");
            return (Criteria) this;
        }

        public Criteria andC169IsNull() {
            addCriterion("C169 is null");
            return (Criteria) this;
        }

        public Criteria andC169IsNotNull() {
            addCriterion("C169 is not null");
            return (Criteria) this;
        }

        public Criteria andC169EqualTo(String value) {
            addCriterion("C169 =", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotEqualTo(String value) {
            addCriterion("C169 <>", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169GreaterThan(String value) {
            addCriterion("C169 >", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169GreaterThanOrEqualTo(String value) {
            addCriterion("C169 >=", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169LessThan(String value) {
            addCriterion("C169 <", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169LessThanOrEqualTo(String value) {
            addCriterion("C169 <=", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169Like(String value) {
            addCriterion("C169 like", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotLike(String value) {
            addCriterion("C169 not like", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169In(List<String> values) {
            addCriterion("C169 in", values, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotIn(List<String> values) {
            addCriterion("C169 not in", values, "c169");
            return (Criteria) this;
        }

        public Criteria andC169Between(String value1, String value2) {
            addCriterion("C169 between", value1, value2, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotBetween(String value1, String value2) {
            addCriterion("C169 not between", value1, value2, "c169");
            return (Criteria) this;
        }

        public Criteria andC170IsNull() {
            addCriterion("C170 is null");
            return (Criteria) this;
        }

        public Criteria andC170IsNotNull() {
            addCriterion("C170 is not null");
            return (Criteria) this;
        }

        public Criteria andC170EqualTo(String value) {
            addCriterion("C170 =", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotEqualTo(String value) {
            addCriterion("C170 <>", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170GreaterThan(String value) {
            addCriterion("C170 >", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170GreaterThanOrEqualTo(String value) {
            addCriterion("C170 >=", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170LessThan(String value) {
            addCriterion("C170 <", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170LessThanOrEqualTo(String value) {
            addCriterion("C170 <=", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170Like(String value) {
            addCriterion("C170 like", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotLike(String value) {
            addCriterion("C170 not like", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170In(List<String> values) {
            addCriterion("C170 in", values, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotIn(List<String> values) {
            addCriterion("C170 not in", values, "c170");
            return (Criteria) this;
        }

        public Criteria andC170Between(String value1, String value2) {
            addCriterion("C170 between", value1, value2, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotBetween(String value1, String value2) {
            addCriterion("C170 not between", value1, value2, "c170");
            return (Criteria) this;
        }

        public Criteria andC171IsNull() {
            addCriterion("C171 is null");
            return (Criteria) this;
        }

        public Criteria andC171IsNotNull() {
            addCriterion("C171 is not null");
            return (Criteria) this;
        }

        public Criteria andC171EqualTo(String value) {
            addCriterion("C171 =", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotEqualTo(String value) {
            addCriterion("C171 <>", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171GreaterThan(String value) {
            addCriterion("C171 >", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171GreaterThanOrEqualTo(String value) {
            addCriterion("C171 >=", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171LessThan(String value) {
            addCriterion("C171 <", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171LessThanOrEqualTo(String value) {
            addCriterion("C171 <=", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171Like(String value) {
            addCriterion("C171 like", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotLike(String value) {
            addCriterion("C171 not like", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171In(List<String> values) {
            addCriterion("C171 in", values, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotIn(List<String> values) {
            addCriterion("C171 not in", values, "c171");
            return (Criteria) this;
        }

        public Criteria andC171Between(String value1, String value2) {
            addCriterion("C171 between", value1, value2, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotBetween(String value1, String value2) {
            addCriterion("C171 not between", value1, value2, "c171");
            return (Criteria) this;
        }

        public Criteria andC172IsNull() {
            addCriterion("C172 is null");
            return (Criteria) this;
        }

        public Criteria andC172IsNotNull() {
            addCriterion("C172 is not null");
            return (Criteria) this;
        }

        public Criteria andC172EqualTo(String value) {
            addCriterion("C172 =", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotEqualTo(String value) {
            addCriterion("C172 <>", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172GreaterThan(String value) {
            addCriterion("C172 >", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172GreaterThanOrEqualTo(String value) {
            addCriterion("C172 >=", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172LessThan(String value) {
            addCriterion("C172 <", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172LessThanOrEqualTo(String value) {
            addCriterion("C172 <=", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172Like(String value) {
            addCriterion("C172 like", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotLike(String value) {
            addCriterion("C172 not like", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172In(List<String> values) {
            addCriterion("C172 in", values, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotIn(List<String> values) {
            addCriterion("C172 not in", values, "c172");
            return (Criteria) this;
        }

        public Criteria andC172Between(String value1, String value2) {
            addCriterion("C172 between", value1, value2, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotBetween(String value1, String value2) {
            addCriterion("C172 not between", value1, value2, "c172");
            return (Criteria) this;
        }

        public Criteria andC173IsNull() {
            addCriterion("C173 is null");
            return (Criteria) this;
        }

        public Criteria andC173IsNotNull() {
            addCriterion("C173 is not null");
            return (Criteria) this;
        }

        public Criteria andC173EqualTo(String value) {
            addCriterion("C173 =", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotEqualTo(String value) {
            addCriterion("C173 <>", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173GreaterThan(String value) {
            addCriterion("C173 >", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173GreaterThanOrEqualTo(String value) {
            addCriterion("C173 >=", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173LessThan(String value) {
            addCriterion("C173 <", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173LessThanOrEqualTo(String value) {
            addCriterion("C173 <=", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173Like(String value) {
            addCriterion("C173 like", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotLike(String value) {
            addCriterion("C173 not like", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173In(List<String> values) {
            addCriterion("C173 in", values, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotIn(List<String> values) {
            addCriterion("C173 not in", values, "c173");
            return (Criteria) this;
        }

        public Criteria andC173Between(String value1, String value2) {
            addCriterion("C173 between", value1, value2, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotBetween(String value1, String value2) {
            addCriterion("C173 not between", value1, value2, "c173");
            return (Criteria) this;
        }

        public Criteria andC174IsNull() {
            addCriterion("C174 is null");
            return (Criteria) this;
        }

        public Criteria andC174IsNotNull() {
            addCriterion("C174 is not null");
            return (Criteria) this;
        }

        public Criteria andC174EqualTo(String value) {
            addCriterion("C174 =", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotEqualTo(String value) {
            addCriterion("C174 <>", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174GreaterThan(String value) {
            addCriterion("C174 >", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174GreaterThanOrEqualTo(String value) {
            addCriterion("C174 >=", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174LessThan(String value) {
            addCriterion("C174 <", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174LessThanOrEqualTo(String value) {
            addCriterion("C174 <=", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174Like(String value) {
            addCriterion("C174 like", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotLike(String value) {
            addCriterion("C174 not like", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174In(List<String> values) {
            addCriterion("C174 in", values, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotIn(List<String> values) {
            addCriterion("C174 not in", values, "c174");
            return (Criteria) this;
        }

        public Criteria andC174Between(String value1, String value2) {
            addCriterion("C174 between", value1, value2, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotBetween(String value1, String value2) {
            addCriterion("C174 not between", value1, value2, "c174");
            return (Criteria) this;
        }

        public Criteria andC175IsNull() {
            addCriterion("C175 is null");
            return (Criteria) this;
        }

        public Criteria andC175IsNotNull() {
            addCriterion("C175 is not null");
            return (Criteria) this;
        }

        public Criteria andC175EqualTo(String value) {
            addCriterion("C175 =", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotEqualTo(String value) {
            addCriterion("C175 <>", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175GreaterThan(String value) {
            addCriterion("C175 >", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175GreaterThanOrEqualTo(String value) {
            addCriterion("C175 >=", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175LessThan(String value) {
            addCriterion("C175 <", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175LessThanOrEqualTo(String value) {
            addCriterion("C175 <=", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175Like(String value) {
            addCriterion("C175 like", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotLike(String value) {
            addCriterion("C175 not like", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175In(List<String> values) {
            addCriterion("C175 in", values, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotIn(List<String> values) {
            addCriterion("C175 not in", values, "c175");
            return (Criteria) this;
        }

        public Criteria andC175Between(String value1, String value2) {
            addCriterion("C175 between", value1, value2, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotBetween(String value1, String value2) {
            addCriterion("C175 not between", value1, value2, "c175");
            return (Criteria) this;
        }

        public Criteria andC176IsNull() {
            addCriterion("C176 is null");
            return (Criteria) this;
        }

        public Criteria andC176IsNotNull() {
            addCriterion("C176 is not null");
            return (Criteria) this;
        }

        public Criteria andC176EqualTo(String value) {
            addCriterion("C176 =", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotEqualTo(String value) {
            addCriterion("C176 <>", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176GreaterThan(String value) {
            addCriterion("C176 >", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176GreaterThanOrEqualTo(String value) {
            addCriterion("C176 >=", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176LessThan(String value) {
            addCriterion("C176 <", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176LessThanOrEqualTo(String value) {
            addCriterion("C176 <=", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176Like(String value) {
            addCriterion("C176 like", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotLike(String value) {
            addCriterion("C176 not like", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176In(List<String> values) {
            addCriterion("C176 in", values, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotIn(List<String> values) {
            addCriterion("C176 not in", values, "c176");
            return (Criteria) this;
        }

        public Criteria andC176Between(String value1, String value2) {
            addCriterion("C176 between", value1, value2, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotBetween(String value1, String value2) {
            addCriterion("C176 not between", value1, value2, "c176");
            return (Criteria) this;
        }

        public Criteria andC177IsNull() {
            addCriterion("C177 is null");
            return (Criteria) this;
        }

        public Criteria andC177IsNotNull() {
            addCriterion("C177 is not null");
            return (Criteria) this;
        }

        public Criteria andC177EqualTo(String value) {
            addCriterion("C177 =", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotEqualTo(String value) {
            addCriterion("C177 <>", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177GreaterThan(String value) {
            addCriterion("C177 >", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177GreaterThanOrEqualTo(String value) {
            addCriterion("C177 >=", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177LessThan(String value) {
            addCriterion("C177 <", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177LessThanOrEqualTo(String value) {
            addCriterion("C177 <=", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177Like(String value) {
            addCriterion("C177 like", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotLike(String value) {
            addCriterion("C177 not like", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177In(List<String> values) {
            addCriterion("C177 in", values, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotIn(List<String> values) {
            addCriterion("C177 not in", values, "c177");
            return (Criteria) this;
        }

        public Criteria andC177Between(String value1, String value2) {
            addCriterion("C177 between", value1, value2, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotBetween(String value1, String value2) {
            addCriterion("C177 not between", value1, value2, "c177");
            return (Criteria) this;
        }

        public Criteria andC178IsNull() {
            addCriterion("C178 is null");
            return (Criteria) this;
        }

        public Criteria andC178IsNotNull() {
            addCriterion("C178 is not null");
            return (Criteria) this;
        }

        public Criteria andC178EqualTo(String value) {
            addCriterion("C178 =", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotEqualTo(String value) {
            addCriterion("C178 <>", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178GreaterThan(String value) {
            addCriterion("C178 >", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178GreaterThanOrEqualTo(String value) {
            addCriterion("C178 >=", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178LessThan(String value) {
            addCriterion("C178 <", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178LessThanOrEqualTo(String value) {
            addCriterion("C178 <=", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178Like(String value) {
            addCriterion("C178 like", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotLike(String value) {
            addCriterion("C178 not like", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178In(List<String> values) {
            addCriterion("C178 in", values, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotIn(List<String> values) {
            addCriterion("C178 not in", values, "c178");
            return (Criteria) this;
        }

        public Criteria andC178Between(String value1, String value2) {
            addCriterion("C178 between", value1, value2, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotBetween(String value1, String value2) {
            addCriterion("C178 not between", value1, value2, "c178");
            return (Criteria) this;
        }

        public Criteria andC179IsNull() {
            addCriterion("C179 is null");
            return (Criteria) this;
        }

        public Criteria andC179IsNotNull() {
            addCriterion("C179 is not null");
            return (Criteria) this;
        }

        public Criteria andC179EqualTo(String value) {
            addCriterion("C179 =", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotEqualTo(String value) {
            addCriterion("C179 <>", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179GreaterThan(String value) {
            addCriterion("C179 >", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179GreaterThanOrEqualTo(String value) {
            addCriterion("C179 >=", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179LessThan(String value) {
            addCriterion("C179 <", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179LessThanOrEqualTo(String value) {
            addCriterion("C179 <=", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179Like(String value) {
            addCriterion("C179 like", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotLike(String value) {
            addCriterion("C179 not like", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179In(List<String> values) {
            addCriterion("C179 in", values, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotIn(List<String> values) {
            addCriterion("C179 not in", values, "c179");
            return (Criteria) this;
        }

        public Criteria andC179Between(String value1, String value2) {
            addCriterion("C179 between", value1, value2, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotBetween(String value1, String value2) {
            addCriterion("C179 not between", value1, value2, "c179");
            return (Criteria) this;
        }

        public Criteria andC180IsNull() {
            addCriterion("C180 is null");
            return (Criteria) this;
        }

        public Criteria andC180IsNotNull() {
            addCriterion("C180 is not null");
            return (Criteria) this;
        }

        public Criteria andC180EqualTo(String value) {
            addCriterion("C180 =", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotEqualTo(String value) {
            addCriterion("C180 <>", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180GreaterThan(String value) {
            addCriterion("C180 >", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180GreaterThanOrEqualTo(String value) {
            addCriterion("C180 >=", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180LessThan(String value) {
            addCriterion("C180 <", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180LessThanOrEqualTo(String value) {
            addCriterion("C180 <=", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180Like(String value) {
            addCriterion("C180 like", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotLike(String value) {
            addCriterion("C180 not like", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180In(List<String> values) {
            addCriterion("C180 in", values, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotIn(List<String> values) {
            addCriterion("C180 not in", values, "c180");
            return (Criteria) this;
        }

        public Criteria andC180Between(String value1, String value2) {
            addCriterion("C180 between", value1, value2, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotBetween(String value1, String value2) {
            addCriterion("C180 not between", value1, value2, "c180");
            return (Criteria) this;
        }

        public Criteria andC181IsNull() {
            addCriterion("C181 is null");
            return (Criteria) this;
        }

        public Criteria andC181IsNotNull() {
            addCriterion("C181 is not null");
            return (Criteria) this;
        }

        public Criteria andC181EqualTo(String value) {
            addCriterion("C181 =", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotEqualTo(String value) {
            addCriterion("C181 <>", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181GreaterThan(String value) {
            addCriterion("C181 >", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181GreaterThanOrEqualTo(String value) {
            addCriterion("C181 >=", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181LessThan(String value) {
            addCriterion("C181 <", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181LessThanOrEqualTo(String value) {
            addCriterion("C181 <=", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181Like(String value) {
            addCriterion("C181 like", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotLike(String value) {
            addCriterion("C181 not like", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181In(List<String> values) {
            addCriterion("C181 in", values, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotIn(List<String> values) {
            addCriterion("C181 not in", values, "c181");
            return (Criteria) this;
        }

        public Criteria andC181Between(String value1, String value2) {
            addCriterion("C181 between", value1, value2, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotBetween(String value1, String value2) {
            addCriterion("C181 not between", value1, value2, "c181");
            return (Criteria) this;
        }

        public Criteria andC182IsNull() {
            addCriterion("C182 is null");
            return (Criteria) this;
        }

        public Criteria andC182IsNotNull() {
            addCriterion("C182 is not null");
            return (Criteria) this;
        }

        public Criteria andC182EqualTo(String value) {
            addCriterion("C182 =", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotEqualTo(String value) {
            addCriterion("C182 <>", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182GreaterThan(String value) {
            addCriterion("C182 >", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182GreaterThanOrEqualTo(String value) {
            addCriterion("C182 >=", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182LessThan(String value) {
            addCriterion("C182 <", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182LessThanOrEqualTo(String value) {
            addCriterion("C182 <=", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182Like(String value) {
            addCriterion("C182 like", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotLike(String value) {
            addCriterion("C182 not like", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182In(List<String> values) {
            addCriterion("C182 in", values, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotIn(List<String> values) {
            addCriterion("C182 not in", values, "c182");
            return (Criteria) this;
        }

        public Criteria andC182Between(String value1, String value2) {
            addCriterion("C182 between", value1, value2, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotBetween(String value1, String value2) {
            addCriterion("C182 not between", value1, value2, "c182");
            return (Criteria) this;
        }

        public Criteria andC183IsNull() {
            addCriterion("C183 is null");
            return (Criteria) this;
        }

        public Criteria andC183IsNotNull() {
            addCriterion("C183 is not null");
            return (Criteria) this;
        }

        public Criteria andC183EqualTo(String value) {
            addCriterion("C183 =", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotEqualTo(String value) {
            addCriterion("C183 <>", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183GreaterThan(String value) {
            addCriterion("C183 >", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183GreaterThanOrEqualTo(String value) {
            addCriterion("C183 >=", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183LessThan(String value) {
            addCriterion("C183 <", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183LessThanOrEqualTo(String value) {
            addCriterion("C183 <=", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183Like(String value) {
            addCriterion("C183 like", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotLike(String value) {
            addCriterion("C183 not like", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183In(List<String> values) {
            addCriterion("C183 in", values, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotIn(List<String> values) {
            addCriterion("C183 not in", values, "c183");
            return (Criteria) this;
        }

        public Criteria andC183Between(String value1, String value2) {
            addCriterion("C183 between", value1, value2, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotBetween(String value1, String value2) {
            addCriterion("C183 not between", value1, value2, "c183");
            return (Criteria) this;
        }

        public Criteria andC184IsNull() {
            addCriterion("C184 is null");
            return (Criteria) this;
        }

        public Criteria andC184IsNotNull() {
            addCriterion("C184 is not null");
            return (Criteria) this;
        }

        public Criteria andC184EqualTo(String value) {
            addCriterion("C184 =", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotEqualTo(String value) {
            addCriterion("C184 <>", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184GreaterThan(String value) {
            addCriterion("C184 >", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184GreaterThanOrEqualTo(String value) {
            addCriterion("C184 >=", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184LessThan(String value) {
            addCriterion("C184 <", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184LessThanOrEqualTo(String value) {
            addCriterion("C184 <=", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184Like(String value) {
            addCriterion("C184 like", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotLike(String value) {
            addCriterion("C184 not like", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184In(List<String> values) {
            addCriterion("C184 in", values, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotIn(List<String> values) {
            addCriterion("C184 not in", values, "c184");
            return (Criteria) this;
        }

        public Criteria andC184Between(String value1, String value2) {
            addCriterion("C184 between", value1, value2, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotBetween(String value1, String value2) {
            addCriterion("C184 not between", value1, value2, "c184");
            return (Criteria) this;
        }

        public Criteria andC185IsNull() {
            addCriterion("C185 is null");
            return (Criteria) this;
        }

        public Criteria andC185IsNotNull() {
            addCriterion("C185 is not null");
            return (Criteria) this;
        }

        public Criteria andC185EqualTo(String value) {
            addCriterion("C185 =", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotEqualTo(String value) {
            addCriterion("C185 <>", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185GreaterThan(String value) {
            addCriterion("C185 >", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185GreaterThanOrEqualTo(String value) {
            addCriterion("C185 >=", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185LessThan(String value) {
            addCriterion("C185 <", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185LessThanOrEqualTo(String value) {
            addCriterion("C185 <=", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185Like(String value) {
            addCriterion("C185 like", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotLike(String value) {
            addCriterion("C185 not like", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185In(List<String> values) {
            addCriterion("C185 in", values, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotIn(List<String> values) {
            addCriterion("C185 not in", values, "c185");
            return (Criteria) this;
        }

        public Criteria andC185Between(String value1, String value2) {
            addCriterion("C185 between", value1, value2, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotBetween(String value1, String value2) {
            addCriterion("C185 not between", value1, value2, "c185");
            return (Criteria) this;
        }

        public Criteria andC186IsNull() {
            addCriterion("C186 is null");
            return (Criteria) this;
        }

        public Criteria andC186IsNotNull() {
            addCriterion("C186 is not null");
            return (Criteria) this;
        }

        public Criteria andC186EqualTo(String value) {
            addCriterion("C186 =", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotEqualTo(String value) {
            addCriterion("C186 <>", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186GreaterThan(String value) {
            addCriterion("C186 >", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186GreaterThanOrEqualTo(String value) {
            addCriterion("C186 >=", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186LessThan(String value) {
            addCriterion("C186 <", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186LessThanOrEqualTo(String value) {
            addCriterion("C186 <=", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186Like(String value) {
            addCriterion("C186 like", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotLike(String value) {
            addCriterion("C186 not like", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186In(List<String> values) {
            addCriterion("C186 in", values, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotIn(List<String> values) {
            addCriterion("C186 not in", values, "c186");
            return (Criteria) this;
        }

        public Criteria andC186Between(String value1, String value2) {
            addCriterion("C186 between", value1, value2, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotBetween(String value1, String value2) {
            addCriterion("C186 not between", value1, value2, "c186");
            return (Criteria) this;
        }

        public Criteria andC187IsNull() {
            addCriterion("C187 is null");
            return (Criteria) this;
        }

        public Criteria andC187IsNotNull() {
            addCriterion("C187 is not null");
            return (Criteria) this;
        }

        public Criteria andC187EqualTo(String value) {
            addCriterion("C187 =", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotEqualTo(String value) {
            addCriterion("C187 <>", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187GreaterThan(String value) {
            addCriterion("C187 >", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187GreaterThanOrEqualTo(String value) {
            addCriterion("C187 >=", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187LessThan(String value) {
            addCriterion("C187 <", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187LessThanOrEqualTo(String value) {
            addCriterion("C187 <=", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187Like(String value) {
            addCriterion("C187 like", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotLike(String value) {
            addCriterion("C187 not like", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187In(List<String> values) {
            addCriterion("C187 in", values, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotIn(List<String> values) {
            addCriterion("C187 not in", values, "c187");
            return (Criteria) this;
        }

        public Criteria andC187Between(String value1, String value2) {
            addCriterion("C187 between", value1, value2, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotBetween(String value1, String value2) {
            addCriterion("C187 not between", value1, value2, "c187");
            return (Criteria) this;
        }

        public Criteria andC188IsNull() {
            addCriterion("C188 is null");
            return (Criteria) this;
        }

        public Criteria andC188IsNotNull() {
            addCriterion("C188 is not null");
            return (Criteria) this;
        }

        public Criteria andC188EqualTo(String value) {
            addCriterion("C188 =", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotEqualTo(String value) {
            addCriterion("C188 <>", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188GreaterThan(String value) {
            addCriterion("C188 >", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188GreaterThanOrEqualTo(String value) {
            addCriterion("C188 >=", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188LessThan(String value) {
            addCriterion("C188 <", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188LessThanOrEqualTo(String value) {
            addCriterion("C188 <=", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188Like(String value) {
            addCriterion("C188 like", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotLike(String value) {
            addCriterion("C188 not like", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188In(List<String> values) {
            addCriterion("C188 in", values, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotIn(List<String> values) {
            addCriterion("C188 not in", values, "c188");
            return (Criteria) this;
        }

        public Criteria andC188Between(String value1, String value2) {
            addCriterion("C188 between", value1, value2, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotBetween(String value1, String value2) {
            addCriterion("C188 not between", value1, value2, "c188");
            return (Criteria) this;
        }
    }

    /**
     * car_models
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * car_models 2018-06-19
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