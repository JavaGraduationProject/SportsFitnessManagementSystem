package com.stern.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table member
     *
     * @mbg.generated
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNull() {
            addCriterion("mpassword is null");
            return (Criteria) this;
        }

        public Criteria andMpasswordIsNotNull() {
            addCriterion("mpassword is not null");
            return (Criteria) this;
        }

        public Criteria andMpasswordEqualTo(String value) {
            addCriterion("mpassword =", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotEqualTo(String value) {
            addCriterion("mpassword <>", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThan(String value) {
            addCriterion("mpassword >", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mpassword >=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThan(String value) {
            addCriterion("mpassword <", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLessThanOrEqualTo(String value) {
            addCriterion("mpassword <=", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordLike(String value) {
            addCriterion("mpassword like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotLike(String value) {
            addCriterion("mpassword not like", value, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordIn(List<String> values) {
            addCriterion("mpassword in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotIn(List<String> values) {
            addCriterion("mpassword not in", values, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordBetween(String value1, String value2) {
            addCriterion("mpassword between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMpasswordNotBetween(String value1, String value2) {
            addCriterion("mpassword not between", value1, value2, "mpassword");
            return (Criteria) this;
        }

        public Criteria andMgenderIsNull() {
            addCriterion("mgender is null");
            return (Criteria) this;
        }

        public Criteria andMgenderIsNotNull() {
            addCriterion("mgender is not null");
            return (Criteria) this;
        }

        public Criteria andMgenderEqualTo(Byte value) {
            addCriterion("mgender =", value, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderNotEqualTo(Byte value) {
            addCriterion("mgender <>", value, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderGreaterThan(Byte value) {
            addCriterion("mgender >", value, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("mgender >=", value, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderLessThan(Byte value) {
            addCriterion("mgender <", value, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderLessThanOrEqualTo(Byte value) {
            addCriterion("mgender <=", value, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderIn(List<Byte> values) {
            addCriterion("mgender in", values, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderNotIn(List<Byte> values) {
            addCriterion("mgender not in", values, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderBetween(Byte value1, Byte value2) {
            addCriterion("mgender between", value1, value2, "mgender");
            return (Criteria) this;
        }

        public Criteria andMgenderNotBetween(Byte value1, Byte value2) {
            addCriterion("mgender not between", value1, value2, "mgender");
            return (Criteria) this;
        }

        public Criteria andMidnoIsNull() {
            addCriterion("midno is null");
            return (Criteria) this;
        }

        public Criteria andMidnoIsNotNull() {
            addCriterion("midno is not null");
            return (Criteria) this;
        }

        public Criteria andMidnoEqualTo(String value) {
            addCriterion("midno =", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotEqualTo(String value) {
            addCriterion("midno <>", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoGreaterThan(String value) {
            addCriterion("midno >", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoGreaterThanOrEqualTo(String value) {
            addCriterion("midno >=", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoLessThan(String value) {
            addCriterion("midno <", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoLessThanOrEqualTo(String value) {
            addCriterion("midno <=", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoLike(String value) {
            addCriterion("midno like", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotLike(String value) {
            addCriterion("midno not like", value, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoIn(List<String> values) {
            addCriterion("midno in", values, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotIn(List<String> values) {
            addCriterion("midno not in", values, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoBetween(String value1, String value2) {
            addCriterion("midno between", value1, value2, "midno");
            return (Criteria) this;
        }

        public Criteria andMidnoNotBetween(String value1, String value2) {
            addCriterion("midno not between", value1, value2, "midno");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("mphone is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("mphone is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(String value) {
            addCriterion("mphone =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(String value) {
            addCriterion("mphone <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(String value) {
            addCriterion("mphone >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mphone >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(String value) {
            addCriterion("mphone <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(String value) {
            addCriterion("mphone <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLike(String value) {
            addCriterion("mphone like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotLike(String value) {
            addCriterion("mphone not like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<String> values) {
            addCriterion("mphone in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<String> values) {
            addCriterion("mphone not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(String value1, String value2) {
            addCriterion("mphone between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(String value1, String value2) {
            addCriterion("mphone not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMemailIsNull() {
            addCriterion("memail is null");
            return (Criteria) this;
        }

        public Criteria andMemailIsNotNull() {
            addCriterion("memail is not null");
            return (Criteria) this;
        }

        public Criteria andMemailEqualTo(String value) {
            addCriterion("memail =", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailNotEqualTo(String value) {
            addCriterion("memail <>", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailGreaterThan(String value) {
            addCriterion("memail >", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailGreaterThanOrEqualTo(String value) {
            addCriterion("memail >=", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailLessThan(String value) {
            addCriterion("memail <", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailLessThanOrEqualTo(String value) {
            addCriterion("memail <=", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailLike(String value) {
            addCriterion("memail like", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailNotLike(String value) {
            addCriterion("memail not like", value, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailIn(List<String> values) {
            addCriterion("memail in", values, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailNotIn(List<String> values) {
            addCriterion("memail not in", values, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailBetween(String value1, String value2) {
            addCriterion("memail between", value1, value2, "memail");
            return (Criteria) this;
        }

        public Criteria andMemailNotBetween(String value1, String value2) {
            addCriterion("memail not between", value1, value2, "memail");
            return (Criteria) this;
        }

        public Criteria andMdateIsNull() {
            addCriterion("mdate is null");
            return (Criteria) this;
        }

        public Criteria andMdateIsNotNull() {
            addCriterion("mdate is not null");
            return (Criteria) this;
        }

        public Criteria andMdateEqualTo(Date value) {
            addCriterion("mdate =", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotEqualTo(Date value) {
            addCriterion("mdate <>", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThan(Date value) {
            addCriterion("mdate >", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateGreaterThanOrEqualTo(Date value) {
            addCriterion("mdate >=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThan(Date value) {
            addCriterion("mdate <", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateLessThanOrEqualTo(Date value) {
            addCriterion("mdate <=", value, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateIn(List<Date> values) {
            addCriterion("mdate in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotIn(List<Date> values) {
            addCriterion("mdate not in", values, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateBetween(Date value1, Date value2) {
            addCriterion("mdate between", value1, value2, "mdate");
            return (Criteria) this;
        }

        public Criteria andMdateNotBetween(Date value1, Date value2) {
            addCriterion("mdate not between", value1, value2, "mdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table member
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table member
     *
     * @mbg.generated
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