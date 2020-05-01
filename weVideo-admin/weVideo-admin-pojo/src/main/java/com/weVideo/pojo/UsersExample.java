package com.weVideo.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFaceImageIsNull() {
            addCriterion("face_image is null");
            return (Criteria) this;
        }

        public Criteria andFaceImageIsNotNull() {
            addCriterion("face_image is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImageEqualTo(String value) {
            addCriterion("face_image =", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotEqualTo(String value) {
            addCriterion("face_image <>", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageGreaterThan(String value) {
            addCriterion("face_image >", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageGreaterThanOrEqualTo(String value) {
            addCriterion("face_image >=", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageLessThan(String value) {
            addCriterion("face_image <", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageLessThanOrEqualTo(String value) {
            addCriterion("face_image <=", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageLike(String value) {
            addCriterion("face_image like", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotLike(String value) {
            addCriterion("face_image not like", value, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageIn(List<String> values) {
            addCriterion("face_image in", values, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotIn(List<String> values) {
            addCriterion("face_image not in", values, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageBetween(String value1, String value2) {
            addCriterion("face_image between", value1, value2, "faceImage");
            return (Criteria) this;
        }

        public Criteria andFaceImageNotBetween(String value1, String value2) {
            addCriterion("face_image not between", value1, value2, "faceImage");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andFansCountsIsNull() {
            addCriterion("fans_counts is null");
            return (Criteria) this;
        }

        public Criteria andFansCountsIsNotNull() {
            addCriterion("fans_counts is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountsEqualTo(Integer value) {
            addCriterion("fans_counts =", value, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsNotEqualTo(Integer value) {
            addCriterion("fans_counts <>", value, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsGreaterThan(Integer value) {
            addCriterion("fans_counts >", value, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_counts >=", value, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsLessThan(Integer value) {
            addCriterion("fans_counts <", value, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsLessThanOrEqualTo(Integer value) {
            addCriterion("fans_counts <=", value, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsIn(List<Integer> values) {
            addCriterion("fans_counts in", values, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsNotIn(List<Integer> values) {
            addCriterion("fans_counts not in", values, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsBetween(Integer value1, Integer value2) {
            addCriterion("fans_counts between", value1, value2, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFansCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_counts not between", value1, value2, "fansCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsIsNull() {
            addCriterion("follow_counts is null");
            return (Criteria) this;
        }

        public Criteria andFollowCountsIsNotNull() {
            addCriterion("follow_counts is not null");
            return (Criteria) this;
        }

        public Criteria andFollowCountsEqualTo(Integer value) {
            addCriterion("follow_counts =", value, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsNotEqualTo(Integer value) {
            addCriterion("follow_counts <>", value, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsGreaterThan(Integer value) {
            addCriterion("follow_counts >", value, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_counts >=", value, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsLessThan(Integer value) {
            addCriterion("follow_counts <", value, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsLessThanOrEqualTo(Integer value) {
            addCriterion("follow_counts <=", value, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsIn(List<Integer> values) {
            addCriterion("follow_counts in", values, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsNotIn(List<Integer> values) {
            addCriterion("follow_counts not in", values, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsBetween(Integer value1, Integer value2) {
            addCriterion("follow_counts between", value1, value2, "followCounts");
            return (Criteria) this;
        }

        public Criteria andFollowCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_counts not between", value1, value2, "followCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsIsNull() {
            addCriterion("receive_like_counts is null");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsIsNotNull() {
            addCriterion("receive_like_counts is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsEqualTo(Integer value) {
            addCriterion("receive_like_counts =", value, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsNotEqualTo(Integer value) {
            addCriterion("receive_like_counts <>", value, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsGreaterThan(Integer value) {
            addCriterion("receive_like_counts >", value, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_like_counts >=", value, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsLessThan(Integer value) {
            addCriterion("receive_like_counts <", value, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsLessThanOrEqualTo(Integer value) {
            addCriterion("receive_like_counts <=", value, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsIn(List<Integer> values) {
            addCriterion("receive_like_counts in", values, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsNotIn(List<Integer> values) {
            addCriterion("receive_like_counts not in", values, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsBetween(Integer value1, Integer value2) {
            addCriterion("receive_like_counts between", value1, value2, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andReceiveLikeCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_like_counts not between", value1, value2, "receiveLikeCounts");
            return (Criteria) this;
        }

        public Criteria andBanIsNull() {
            addCriterion("ban is null");
            return (Criteria) this;
        }

        public Criteria andBanIsNotNull() {
            addCriterion("ban is not null");
            return (Criteria) this;
        }

        public Criteria andBanEqualTo(Integer value) {
            addCriterion("ban =", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotEqualTo(Integer value) {
            addCriterion("ban <>", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanGreaterThan(Integer value) {
            addCriterion("ban >", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanGreaterThanOrEqualTo(Integer value) {
            addCriterion("ban >=", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanLessThan(Integer value) {
            addCriterion("ban <", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanLessThanOrEqualTo(Integer value) {
            addCriterion("ban <=", value, "ban");
            return (Criteria) this;
        }

        public Criteria andBanIn(List<Integer> values) {
            addCriterion("ban in", values, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotIn(List<Integer> values) {
            addCriterion("ban not in", values, "ban");
            return (Criteria) this;
        }

        public Criteria andBanBetween(Integer value1, Integer value2) {
            addCriterion("ban between", value1, value2, "ban");
            return (Criteria) this;
        }

        public Criteria andBanNotBetween(Integer value1, Integer value2) {
            addCriterion("ban not between", value1, value2, "ban");
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