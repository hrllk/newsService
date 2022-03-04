package com.example.news.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Long value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Long value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Long value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Long value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Long value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Long> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Long> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Long value1, Long value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Long value1, Long value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProviderCodeIsNull() {
            addCriterion("provider_code is null");
            return (Criteria) this;
        }

        public Criteria andProviderCodeIsNotNull() {
            addCriterion("provider_code is not null");
            return (Criteria) this;
        }

        public Criteria andProviderCodeEqualTo(Byte value) {
            addCriterion("provider_code =", value, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeNotEqualTo(Byte value) {
            addCriterion("provider_code <>", value, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeGreaterThan(Byte value) {
            addCriterion("provider_code >", value, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("provider_code >=", value, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeLessThan(Byte value) {
            addCriterion("provider_code <", value, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeLessThanOrEqualTo(Byte value) {
            addCriterion("provider_code <=", value, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeIn(List<Byte> values) {
            addCriterion("provider_code in", values, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeNotIn(List<Byte> values) {
            addCriterion("provider_code not in", values, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeBetween(Byte value1, Byte value2) {
            addCriterion("provider_code between", value1, value2, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("provider_code not between", value1, value2, "providerCode");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("provider is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("provider is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(String value) {
            addCriterion("provider =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("provider <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(String value) {
            addCriterion("provider >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("provider >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(String value) {
            addCriterion("provider <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("provider <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLike(String value) {
            addCriterion("provider like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotLike(String value) {
            addCriterion("provider not like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<String> values) {
            addCriterion("provider in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<String> values) {
            addCriterion("provider not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("provider between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("provider not between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andOriginallinkIsNull() {
            addCriterion("originallink is null");
            return (Criteria) this;
        }

        public Criteria andOriginallinkIsNotNull() {
            addCriterion("originallink is not null");
            return (Criteria) this;
        }

        public Criteria andOriginallinkEqualTo(String value) {
            addCriterion("originallink =", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkNotEqualTo(String value) {
            addCriterion("originallink <>", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkGreaterThan(String value) {
            addCriterion("originallink >", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkGreaterThanOrEqualTo(String value) {
            addCriterion("originallink >=", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkLessThan(String value) {
            addCriterion("originallink <", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkLessThanOrEqualTo(String value) {
            addCriterion("originallink <=", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkLike(String value) {
            addCriterion("originallink like", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkNotLike(String value) {
            addCriterion("originallink not like", value, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkIn(List<String> values) {
            addCriterion("originallink in", values, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkNotIn(List<String> values) {
            addCriterion("originallink not in", values, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkBetween(String value1, String value2) {
            addCriterion("originallink between", value1, value2, "originallink");
            return (Criteria) this;
        }

        public Criteria andOriginallinkNotBetween(String value1, String value2) {
            addCriterion("originallink not between", value1, value2, "originallink");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNull() {
            addCriterion("collection_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNotNull() {
            addCriterion("collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeEqualTo(Date value) {
            addCriterion("collection_time =", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotEqualTo(Date value) {
            addCriterion("collection_time <>", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThan(Date value) {
            addCriterion("collection_time >", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_time >=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThan(Date value) {
            addCriterion("collection_time <", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_time <=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIn(List<Date> values) {
            addCriterion("collection_time in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotIn(List<Date> values) {
            addCriterion("collection_time not in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("collection_time between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_time not between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andPubAtIsNull() {
            addCriterion("pub_at is null");
            return (Criteria) this;
        }

        public Criteria andPubAtIsNotNull() {
            addCriterion("pub_at is not null");
            return (Criteria) this;
        }

        public Criteria andPubAtEqualTo(Date value) {
            addCriterion("pub_at =", value, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtNotEqualTo(Date value) {
            addCriterion("pub_at <>", value, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtGreaterThan(Date value) {
            addCriterion("pub_at >", value, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtGreaterThanOrEqualTo(Date value) {
            addCriterion("pub_at >=", value, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtLessThan(Date value) {
            addCriterion("pub_at <", value, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtLessThanOrEqualTo(Date value) {
            addCriterion("pub_at <=", value, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtIn(List<Date> values) {
            addCriterion("pub_at in", values, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtNotIn(List<Date> values) {
            addCriterion("pub_at not in", values, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtBetween(Date value1, Date value2) {
            addCriterion("pub_at between", value1, value2, "pubAt");
            return (Criteria) this;
        }

        public Criteria andPubAtNotBetween(Date value1, Date value2) {
            addCriterion("pub_at not between", value1, value2, "pubAt");
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