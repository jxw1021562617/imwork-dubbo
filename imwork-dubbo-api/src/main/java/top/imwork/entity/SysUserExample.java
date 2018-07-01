package top.imwork.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellIsNull() {
            addCriterion("user_name_spell is null");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellIsNotNull() {
            addCriterion("user_name_spell is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellEqualTo(String value) {
            addCriterion("user_name_spell =", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotEqualTo(String value) {
            addCriterion("user_name_spell <>", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellGreaterThan(String value) {
            addCriterion("user_name_spell >", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellGreaterThanOrEqualTo(String value) {
            addCriterion("user_name_spell >=", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellLessThan(String value) {
            addCriterion("user_name_spell <", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellLessThanOrEqualTo(String value) {
            addCriterion("user_name_spell <=", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellLike(String value) {
            addCriterion("user_name_spell like", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotLike(String value) {
            addCriterion("user_name_spell not like", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellIn(List<String> values) {
            addCriterion("user_name_spell in", values, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotIn(List<String> values) {
            addCriterion("user_name_spell not in", values, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellBetween(String value1, String value2) {
            addCriterion("user_name_spell between", value1, value2, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotBetween(String value1, String value2) {
            addCriterion("user_name_spell not between", value1, value2, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNull() {
            addCriterion("user_desc is null");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNotNull() {
            addCriterion("user_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescEqualTo(String value) {
            addCriterion("user_desc =", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotEqualTo(String value) {
            addCriterion("user_desc <>", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThan(String value) {
            addCriterion("user_desc >", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThanOrEqualTo(String value) {
            addCriterion("user_desc >=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThan(String value) {
            addCriterion("user_desc <", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThanOrEqualTo(String value) {
            addCriterion("user_desc <=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLike(String value) {
            addCriterion("user_desc like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotLike(String value) {
            addCriterion("user_desc not like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescIn(List<String> values) {
            addCriterion("user_desc in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotIn(List<String> values) {
            addCriterion("user_desc not in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescBetween(String value1, String value2) {
            addCriterion("user_desc between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotBetween(String value1, String value2) {
            addCriterion("user_desc not between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneIsNull() {
            addCriterion("user_mobil_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneIsNotNull() {
            addCriterion("user_mobil_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneEqualTo(String value) {
            addCriterion("user_mobil_phone =", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneNotEqualTo(String value) {
            addCriterion("user_mobil_phone <>", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneGreaterThan(String value) {
            addCriterion("user_mobil_phone >", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobil_phone >=", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneLessThan(String value) {
            addCriterion("user_mobil_phone <", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_mobil_phone <=", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneLike(String value) {
            addCriterion("user_mobil_phone like", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneNotLike(String value) {
            addCriterion("user_mobil_phone not like", value, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneIn(List<String> values) {
            addCriterion("user_mobil_phone in", values, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneNotIn(List<String> values) {
            addCriterion("user_mobil_phone not in", values, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneBetween(String value1, String value2) {
            addCriterion("user_mobil_phone between", value1, value2, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobilPhoneNotBetween(String value1, String value2) {
            addCriterion("user_mobil_phone not between", value1, value2, "userMobilPhone");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserIdCardIsNull() {
            addCriterion("user_id_card is null");
            return (Criteria) this;
        }

        public Criteria andUserIdCardIsNotNull() {
            addCriterion("user_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdCardEqualTo(String value) {
            addCriterion("user_id_card =", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotEqualTo(String value) {
            addCriterion("user_id_card <>", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardGreaterThan(String value) {
            addCriterion("user_id_card >", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_id_card >=", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardLessThan(String value) {
            addCriterion("user_id_card <", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardLessThanOrEqualTo(String value) {
            addCriterion("user_id_card <=", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardLike(String value) {
            addCriterion("user_id_card like", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotLike(String value) {
            addCriterion("user_id_card not like", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardIn(List<String> values) {
            addCriterion("user_id_card in", values, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotIn(List<String> values) {
            addCriterion("user_id_card not in", values, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardBetween(String value1, String value2) {
            addCriterion("user_id_card between", value1, value2, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotBetween(String value1, String value2) {
            addCriterion("user_id_card not between", value1, value2, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIsNull() {
            addCriterion("user_avatar is null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIsNotNull() {
            addCriterion("user_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarEqualTo(String value) {
            addCriterion("user_avatar =", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotEqualTo(String value) {
            addCriterion("user_avatar <>", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarGreaterThan(String value) {
            addCriterion("user_avatar >", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("user_avatar >=", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLessThan(String value) {
            addCriterion("user_avatar <", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLessThanOrEqualTo(String value) {
            addCriterion("user_avatar <=", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLike(String value) {
            addCriterion("user_avatar like", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotLike(String value) {
            addCriterion("user_avatar not like", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIn(List<String> values) {
            addCriterion("user_avatar in", values, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotIn(List<String> values) {
            addCriterion("user_avatar not in", values, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarBetween(String value1, String value2) {
            addCriterion("user_avatar between", value1, value2, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotBetween(String value1, String value2) {
            addCriterion("user_avatar not between", value1, value2, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andDncnetIsNull() {
            addCriterion("dncnet is null");
            return (Criteria) this;
        }

        public Criteria andDncnetIsNotNull() {
            addCriterion("dncnet is not null");
            return (Criteria) this;
        }

        public Criteria andDncnetEqualTo(Integer value) {
            addCriterion("dncnet =", value, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetNotEqualTo(Integer value) {
            addCriterion("dncnet <>", value, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetGreaterThan(Integer value) {
            addCriterion("dncnet >", value, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetGreaterThanOrEqualTo(Integer value) {
            addCriterion("dncnet >=", value, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetLessThan(Integer value) {
            addCriterion("dncnet <", value, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetLessThanOrEqualTo(Integer value) {
            addCriterion("dncnet <=", value, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetIn(List<Integer> values) {
            addCriterion("dncnet in", values, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetNotIn(List<Integer> values) {
            addCriterion("dncnet not in", values, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetBetween(Integer value1, Integer value2) {
            addCriterion("dncnet between", value1, value2, "dncnet");
            return (Criteria) this;
        }

        public Criteria andDncnetNotBetween(Integer value1, Integer value2) {
            addCriterion("dncnet not between", value1, value2, "dncnet");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdIsNull() {
            addCriterion("org_tree_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdIsNotNull() {
            addCriterion("org_tree_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdEqualTo(Integer value) {
            addCriterion("org_tree_id =", value, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdNotEqualTo(Integer value) {
            addCriterion("org_tree_id <>", value, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdGreaterThan(Integer value) {
            addCriterion("org_tree_id >", value, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_tree_id >=", value, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdLessThan(Integer value) {
            addCriterion("org_tree_id <", value, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_tree_id <=", value, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdIn(List<Integer> values) {
            addCriterion("org_tree_id in", values, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdNotIn(List<Integer> values) {
            addCriterion("org_tree_id not in", values, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("org_tree_id between", value1, value2, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_tree_id not between", value1, value2, "orgTreeId");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameIsNull() {
            addCriterion("org_tree_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameIsNotNull() {
            addCriterion("org_tree_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameEqualTo(String value) {
            addCriterion("org_tree_name =", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameNotEqualTo(String value) {
            addCriterion("org_tree_name <>", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameGreaterThan(String value) {
            addCriterion("org_tree_name >", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_tree_name >=", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameLessThan(String value) {
            addCriterion("org_tree_name <", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameLessThanOrEqualTo(String value) {
            addCriterion("org_tree_name <=", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameLike(String value) {
            addCriterion("org_tree_name like", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameNotLike(String value) {
            addCriterion("org_tree_name not like", value, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameIn(List<String> values) {
            addCriterion("org_tree_name in", values, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameNotIn(List<String> values) {
            addCriterion("org_tree_name not in", values, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameBetween(String value1, String value2) {
            addCriterion("org_tree_name between", value1, value2, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andOrgTreeNameNotBetween(String value1, String value2) {
            addCriterion("org_tree_name not between", value1, value2, "orgTreeName");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_password is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_password =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_password <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_password >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_password >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_password <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_password <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_password like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_password not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_password in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_password not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_password between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_password not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andErrorTimesIsNull() {
            addCriterion("error_times is null");
            return (Criteria) this;
        }

        public Criteria andErrorTimesIsNotNull() {
            addCriterion("error_times is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTimesEqualTo(Integer value) {
            addCriterion("error_times =", value, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesNotEqualTo(Integer value) {
            addCriterion("error_times <>", value, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesGreaterThan(Integer value) {
            addCriterion("error_times >", value, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_times >=", value, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesLessThan(Integer value) {
            addCriterion("error_times <", value, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesLessThanOrEqualTo(Integer value) {
            addCriterion("error_times <=", value, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesIn(List<Integer> values) {
            addCriterion("error_times in", values, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesNotIn(List<Integer> values) {
            addCriterion("error_times not in", values, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesBetween(Integer value1, Integer value2) {
            addCriterion("error_times between", value1, value2, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andErrorTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("error_times not between", value1, value2, "errorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesIsNull() {
            addCriterion("loginerror_times is null");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesIsNotNull() {
            addCriterion("loginerror_times is not null");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesEqualTo(Integer value) {
            addCriterion("loginerror_times =", value, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesNotEqualTo(Integer value) {
            addCriterion("loginerror_times <>", value, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesGreaterThan(Integer value) {
            addCriterion("loginerror_times >", value, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginerror_times >=", value, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesLessThan(Integer value) {
            addCriterion("loginerror_times <", value, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesLessThanOrEqualTo(Integer value) {
            addCriterion("loginerror_times <=", value, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesIn(List<Integer> values) {
            addCriterion("loginerror_times in", values, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesNotIn(List<Integer> values) {
            addCriterion("loginerror_times not in", values, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesBetween(Integer value1, Integer value2) {
            addCriterion("loginerror_times between", value1, value2, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andLoginerrorTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("loginerror_times not between", value1, value2, "loginerrorTimes");
            return (Criteria) this;
        }

        public Criteria andSortsIsNull() {
            addCriterion("sorts is null");
            return (Criteria) this;
        }

        public Criteria andSortsIsNotNull() {
            addCriterion("sorts is not null");
            return (Criteria) this;
        }

        public Criteria andSortsEqualTo(Integer value) {
            addCriterion("sorts =", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotEqualTo(Integer value) {
            addCriterion("sorts <>", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThan(Integer value) {
            addCriterion("sorts >", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorts >=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThan(Integer value) {
            addCriterion("sorts <", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThanOrEqualTo(Integer value) {
            addCriterion("sorts <=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsIn(List<Integer> values) {
            addCriterion("sorts in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotIn(List<Integer> values) {
            addCriterion("sorts not in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsBetween(Integer value1, Integer value2) {
            addCriterion("sorts between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotBetween(Integer value1, Integer value2) {
            addCriterion("sorts not between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginIsNull() {
            addCriterion("is_different_ip_login is null");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginIsNotNull() {
            addCriterion("is_different_ip_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginEqualTo(String value) {
            addCriterion("is_different_ip_login =", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginNotEqualTo(String value) {
            addCriterion("is_different_ip_login <>", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginGreaterThan(String value) {
            addCriterion("is_different_ip_login >", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginGreaterThanOrEqualTo(String value) {
            addCriterion("is_different_ip_login >=", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginLessThan(String value) {
            addCriterion("is_different_ip_login <", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginLessThanOrEqualTo(String value) {
            addCriterion("is_different_ip_login <=", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginLike(String value) {
            addCriterion("is_different_ip_login like", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginNotLike(String value) {
            addCriterion("is_different_ip_login not like", value, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginIn(List<String> values) {
            addCriterion("is_different_ip_login in", values, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginNotIn(List<String> values) {
            addCriterion("is_different_ip_login not in", values, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginBetween(String value1, String value2) {
            addCriterion("is_different_ip_login between", value1, value2, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andIsDifferentIpLoginNotBetween(String value1, String value2) {
            addCriterion("is_different_ip_login not between", value1, value2, "isDifferentIpLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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

        public Criteria andLastModifiedIsNull() {
            addCriterion("last_modified is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("last_modified is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(Date value) {
            addCriterion("last_modified =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(Date value) {
            addCriterion("last_modified <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(Date value) {
            addCriterion("last_modified >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(Date value) {
            addCriterion("last_modified <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(Date value) {
            addCriterion("last_modified <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<Date> values) {
            addCriterion("last_modified in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<Date> values) {
            addCriterion("last_modified not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(Date value1, Date value2) {
            addCriterion("last_modified between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(Date value1, Date value2) {
            addCriterion("last_modified not between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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