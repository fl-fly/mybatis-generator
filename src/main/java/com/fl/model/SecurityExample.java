package com.fl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecurityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecurityExample() {
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

        public Criteria andVcScodeIsNull() {
            addCriterion("VC_SCODE is null");
            return (Criteria) this;
        }

        public Criteria andVcScodeIsNotNull() {
            addCriterion("VC_SCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcScodeEqualTo(String value) {
            addCriterion("VC_SCODE =", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeNotEqualTo(String value) {
            addCriterion("VC_SCODE <>", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeGreaterThan(String value) {
            addCriterion("VC_SCODE >", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_SCODE >=", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeLessThan(String value) {
            addCriterion("VC_SCODE <", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeLessThanOrEqualTo(String value) {
            addCriterion("VC_SCODE <=", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeLike(String value) {
            addCriterion("VC_SCODE like", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeNotLike(String value) {
            addCriterion("VC_SCODE not like", value, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeIn(List<String> values) {
            addCriterion("VC_SCODE in", values, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeNotIn(List<String> values) {
            addCriterion("VC_SCODE not in", values, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeBetween(String value1, String value2) {
            addCriterion("VC_SCODE between", value1, value2, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcScodeNotBetween(String value1, String value2) {
            addCriterion("VC_SCODE not between", value1, value2, "vcScode");
            return (Criteria) this;
        }

        public Criteria andVcCodeIsNull() {
            addCriterion("VC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVcCodeIsNotNull() {
            addCriterion("VC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcCodeEqualTo(String value) {
            addCriterion("VC_CODE =", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotEqualTo(String value) {
            addCriterion("VC_CODE <>", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeGreaterThan(String value) {
            addCriterion("VC_CODE >", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CODE >=", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeLessThan(String value) {
            addCriterion("VC_CODE <", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeLessThanOrEqualTo(String value) {
            addCriterion("VC_CODE <=", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeLike(String value) {
            addCriterion("VC_CODE like", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotLike(String value) {
            addCriterion("VC_CODE not like", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeIn(List<String> values) {
            addCriterion("VC_CODE in", values, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotIn(List<String> values) {
            addCriterion("VC_CODE not in", values, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeBetween(String value1, String value2) {
            addCriterion("VC_CODE between", value1, value2, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotBetween(String value1, String value2) {
            addCriterion("VC_CODE not between", value1, value2, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcSnameIsNull() {
            addCriterion("VC_SNAME is null");
            return (Criteria) this;
        }

        public Criteria andVcSnameIsNotNull() {
            addCriterion("VC_SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcSnameEqualTo(String value) {
            addCriterion("VC_SNAME =", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameNotEqualTo(String value) {
            addCriterion("VC_SNAME <>", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameGreaterThan(String value) {
            addCriterion("VC_SNAME >", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_SNAME >=", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameLessThan(String value) {
            addCriterion("VC_SNAME <", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameLessThanOrEqualTo(String value) {
            addCriterion("VC_SNAME <=", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameLike(String value) {
            addCriterion("VC_SNAME like", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameNotLike(String value) {
            addCriterion("VC_SNAME not like", value, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameIn(List<String> values) {
            addCriterion("VC_SNAME in", values, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameNotIn(List<String> values) {
            addCriterion("VC_SNAME not in", values, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameBetween(String value1, String value2) {
            addCriterion("VC_SNAME between", value1, value2, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcSnameNotBetween(String value1, String value2) {
            addCriterion("VC_SNAME not between", value1, value2, "vcSname");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNull() {
            addCriterion("VC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNotNull() {
            addCriterion("VC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcNameEqualTo(String value) {
            addCriterion("VC_NAME =", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotEqualTo(String value) {
            addCriterion("VC_NAME <>", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThan(String value) {
            addCriterion("VC_NAME >", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_NAME >=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThan(String value) {
            addCriterion("VC_NAME <", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThanOrEqualTo(String value) {
            addCriterion("VC_NAME <=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLike(String value) {
            addCriterion("VC_NAME like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotLike(String value) {
            addCriterion("VC_NAME not like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameIn(List<String> values) {
            addCriterion("VC_NAME in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotIn(List<String> values) {
            addCriterion("VC_NAME not in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameBetween(String value1, String value2) {
            addCriterion("VC_NAME between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotBetween(String value1, String value2) {
            addCriterion("VC_NAME not between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrIsNull() {
            addCriterion("VC_SPELL_ABBR is null");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrIsNotNull() {
            addCriterion("VC_SPELL_ABBR is not null");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrEqualTo(String value) {
            addCriterion("VC_SPELL_ABBR =", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrNotEqualTo(String value) {
            addCriterion("VC_SPELL_ABBR <>", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrGreaterThan(String value) {
            addCriterion("VC_SPELL_ABBR >", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("VC_SPELL_ABBR >=", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrLessThan(String value) {
            addCriterion("VC_SPELL_ABBR <", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrLessThanOrEqualTo(String value) {
            addCriterion("VC_SPELL_ABBR <=", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrLike(String value) {
            addCriterion("VC_SPELL_ABBR like", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrNotLike(String value) {
            addCriterion("VC_SPELL_ABBR not like", value, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrIn(List<String> values) {
            addCriterion("VC_SPELL_ABBR in", values, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrNotIn(List<String> values) {
            addCriterion("VC_SPELL_ABBR not in", values, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrBetween(String value1, String value2) {
            addCriterion("VC_SPELL_ABBR between", value1, value2, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcSpellAbbrNotBetween(String value1, String value2) {
            addCriterion("VC_SPELL_ABBR not between", value1, value2, "vcSpellAbbr");
            return (Criteria) this;
        }

        public Criteria andVcIsinIsNull() {
            addCriterion("VC_ISIN is null");
            return (Criteria) this;
        }

        public Criteria andVcIsinIsNotNull() {
            addCriterion("VC_ISIN is not null");
            return (Criteria) this;
        }

        public Criteria andVcIsinEqualTo(String value) {
            addCriterion("VC_ISIN =", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinNotEqualTo(String value) {
            addCriterion("VC_ISIN <>", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinGreaterThan(String value) {
            addCriterion("VC_ISIN >", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ISIN >=", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinLessThan(String value) {
            addCriterion("VC_ISIN <", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinLessThanOrEqualTo(String value) {
            addCriterion("VC_ISIN <=", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinLike(String value) {
            addCriterion("VC_ISIN like", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinNotLike(String value) {
            addCriterion("VC_ISIN not like", value, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinIn(List<String> values) {
            addCriterion("VC_ISIN in", values, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinNotIn(List<String> values) {
            addCriterion("VC_ISIN not in", values, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinBetween(String value1, String value2) {
            addCriterion("VC_ISIN between", value1, value2, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andVcIsinNotBetween(String value1, String value2) {
            addCriterion("VC_ISIN not between", value1, value2, "vcIsin");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIsNull() {
            addCriterion("L_CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIsNotNull() {
            addCriterion("L_CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andLCurrencyEqualTo(BigDecimal value) {
            addCriterion("L_CURRENCY =", value, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyNotEqualTo(BigDecimal value) {
            addCriterion("L_CURRENCY <>", value, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyGreaterThan(BigDecimal value) {
            addCriterion("L_CURRENCY >", value, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_CURRENCY >=", value, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyLessThan(BigDecimal value) {
            addCriterion("L_CURRENCY <", value, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_CURRENCY <=", value, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIn(List<BigDecimal> values) {
            addCriterion("L_CURRENCY in", values, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyNotIn(List<BigDecimal> values) {
            addCriterion("L_CURRENCY not in", values, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_CURRENCY between", value1, value2, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLCurrencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_CURRENCY not between", value1, value2, "lCurrency");
            return (Criteria) this;
        }

        public Criteria andLMarketIsNull() {
            addCriterion("L_MARKET is null");
            return (Criteria) this;
        }

        public Criteria andLMarketIsNotNull() {
            addCriterion("L_MARKET is not null");
            return (Criteria) this;
        }

        public Criteria andLMarketEqualTo(BigDecimal value) {
            addCriterion("L_MARKET =", value, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketNotEqualTo(BigDecimal value) {
            addCriterion("L_MARKET <>", value, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketGreaterThan(BigDecimal value) {
            addCriterion("L_MARKET >", value, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_MARKET >=", value, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketLessThan(BigDecimal value) {
            addCriterion("L_MARKET <", value, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_MARKET <=", value, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketIn(List<BigDecimal> values) {
            addCriterion("L_MARKET in", values, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketNotIn(List<BigDecimal> values) {
            addCriterion("L_MARKET not in", values, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_MARKET between", value1, value2, "lMarket");
            return (Criteria) this;
        }

        public Criteria andLMarketNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_MARKET not between", value1, value2, "lMarket");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeIsNull() {
            addCriterion("VC_COMPANY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeIsNotNull() {
            addCriterion("VC_COMPANY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeEqualTo(String value) {
            addCriterion("VC_COMPANY_CODE =", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeNotEqualTo(String value) {
            addCriterion("VC_COMPANY_CODE <>", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeGreaterThan(String value) {
            addCriterion("VC_COMPANY_CODE >", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_COMPANY_CODE >=", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeLessThan(String value) {
            addCriterion("VC_COMPANY_CODE <", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("VC_COMPANY_CODE <=", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeLike(String value) {
            addCriterion("VC_COMPANY_CODE like", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeNotLike(String value) {
            addCriterion("VC_COMPANY_CODE not like", value, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeIn(List<String> values) {
            addCriterion("VC_COMPANY_CODE in", values, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeNotIn(List<String> values) {
            addCriterion("VC_COMPANY_CODE not in", values, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeBetween(String value1, String value2) {
            addCriterion("VC_COMPANY_CODE between", value1, value2, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andVcCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("VC_COMPANY_CODE not between", value1, value2, "vcCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLKindIsNull() {
            addCriterion("L_KIND is null");
            return (Criteria) this;
        }

        public Criteria andLKindIsNotNull() {
            addCriterion("L_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andLKindEqualTo(BigDecimal value) {
            addCriterion("L_KIND =", value, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindNotEqualTo(BigDecimal value) {
            addCriterion("L_KIND <>", value, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindGreaterThan(BigDecimal value) {
            addCriterion("L_KIND >", value, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_KIND >=", value, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindLessThan(BigDecimal value) {
            addCriterion("L_KIND <", value, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_KIND <=", value, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindIn(List<BigDecimal> values) {
            addCriterion("L_KIND in", values, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindNotIn(List<BigDecimal> values) {
            addCriterion("L_KIND not in", values, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_KIND between", value1, value2, "lKind");
            return (Criteria) this;
        }

        public Criteria andLKindNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_KIND not between", value1, value2, "lKind");
            return (Criteria) this;
        }

        public Criteria andLOfferDateIsNull() {
            addCriterion("L_OFFER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLOfferDateIsNotNull() {
            addCriterion("L_OFFER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLOfferDateEqualTo(BigDecimal value) {
            addCriterion("L_OFFER_DATE =", value, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateNotEqualTo(BigDecimal value) {
            addCriterion("L_OFFER_DATE <>", value, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateGreaterThan(BigDecimal value) {
            addCriterion("L_OFFER_DATE >", value, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_OFFER_DATE >=", value, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateLessThan(BigDecimal value) {
            addCriterion("L_OFFER_DATE <", value, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_OFFER_DATE <=", value, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateIn(List<BigDecimal> values) {
            addCriterion("L_OFFER_DATE in", values, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateNotIn(List<BigDecimal> values) {
            addCriterion("L_OFFER_DATE not in", values, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_OFFER_DATE between", value1, value2, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLOfferDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_OFFER_DATE not between", value1, value2, "lOfferDate");
            return (Criteria) this;
        }

        public Criteria andLListDateIsNull() {
            addCriterion("L_LIST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLListDateIsNotNull() {
            addCriterion("L_LIST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLListDateEqualTo(BigDecimal value) {
            addCriterion("L_LIST_DATE =", value, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateNotEqualTo(BigDecimal value) {
            addCriterion("L_LIST_DATE <>", value, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateGreaterThan(BigDecimal value) {
            addCriterion("L_LIST_DATE >", value, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_LIST_DATE >=", value, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateLessThan(BigDecimal value) {
            addCriterion("L_LIST_DATE <", value, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_LIST_DATE <=", value, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateIn(List<BigDecimal> values) {
            addCriterion("L_LIST_DATE in", values, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateNotIn(List<BigDecimal> values) {
            addCriterion("L_LIST_DATE not in", values, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_LIST_DATE between", value1, value2, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLListDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_LIST_DATE not between", value1, value2, "lListDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateIsNull() {
            addCriterion("L_CANCEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLCancelDateIsNotNull() {
            addCriterion("L_CANCEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLCancelDateEqualTo(BigDecimal value) {
            addCriterion("L_CANCEL_DATE =", value, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateNotEqualTo(BigDecimal value) {
            addCriterion("L_CANCEL_DATE <>", value, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateGreaterThan(BigDecimal value) {
            addCriterion("L_CANCEL_DATE >", value, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_CANCEL_DATE >=", value, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateLessThan(BigDecimal value) {
            addCriterion("L_CANCEL_DATE <", value, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_CANCEL_DATE <=", value, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateIn(List<BigDecimal> values) {
            addCriterion("L_CANCEL_DATE in", values, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateNotIn(List<BigDecimal> values) {
            addCriterion("L_CANCEL_DATE not in", values, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_CANCEL_DATE between", value1, value2, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andLCancelDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_CANCEL_DATE not between", value1, value2, "lCancelDate");
            return (Criteria) this;
        }

        public Criteria andCValidFlagIsNull() {
            addCriterion("C_VALID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCValidFlagIsNotNull() {
            addCriterion("C_VALID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCValidFlagEqualTo(String value) {
            addCriterion("C_VALID_FLAG =", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagNotEqualTo(String value) {
            addCriterion("C_VALID_FLAG <>", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagGreaterThan(String value) {
            addCriterion("C_VALID_FLAG >", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("C_VALID_FLAG >=", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagLessThan(String value) {
            addCriterion("C_VALID_FLAG <", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagLessThanOrEqualTo(String value) {
            addCriterion("C_VALID_FLAG <=", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagLike(String value) {
            addCriterion("C_VALID_FLAG like", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagNotLike(String value) {
            addCriterion("C_VALID_FLAG not like", value, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagIn(List<String> values) {
            addCriterion("C_VALID_FLAG in", values, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagNotIn(List<String> values) {
            addCriterion("C_VALID_FLAG not in", values, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagBetween(String value1, String value2) {
            addCriterion("C_VALID_FLAG between", value1, value2, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andCValidFlagNotBetween(String value1, String value2) {
            addCriterion("C_VALID_FLAG not between", value1, value2, "cValidFlag");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeIsNull() {
            addCriterion("D_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeIsNotNull() {
            addCriterion("D_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeEqualTo(Date value) {
            addCriterion("D_UPDATETIME =", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeNotEqualTo(Date value) {
            addCriterion("D_UPDATETIME <>", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeGreaterThan(Date value) {
            addCriterion("D_UPDATETIME >", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_UPDATETIME >=", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeLessThan(Date value) {
            addCriterion("D_UPDATETIME <", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("D_UPDATETIME <=", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeIn(List<Date> values) {
            addCriterion("D_UPDATETIME in", values, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeNotIn(List<Date> values) {
            addCriterion("D_UPDATETIME not in", values, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("D_UPDATETIME between", value1, value2, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("D_UPDATETIME not between", value1, value2, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceIsNull() {
            addCriterion("VC_DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceIsNotNull() {
            addCriterion("VC_DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceEqualTo(String value) {
            addCriterion("VC_DATA_SOURCE =", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceNotEqualTo(String value) {
            addCriterion("VC_DATA_SOURCE <>", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceGreaterThan(String value) {
            addCriterion("VC_DATA_SOURCE >", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DATA_SOURCE >=", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceLessThan(String value) {
            addCriterion("VC_DATA_SOURCE <", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceLessThanOrEqualTo(String value) {
            addCriterion("VC_DATA_SOURCE <=", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceLike(String value) {
            addCriterion("VC_DATA_SOURCE like", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceNotLike(String value) {
            addCriterion("VC_DATA_SOURCE not like", value, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceIn(List<String> values) {
            addCriterion("VC_DATA_SOURCE in", values, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceNotIn(List<String> values) {
            addCriterion("VC_DATA_SOURCE not in", values, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceBetween(String value1, String value2) {
            addCriterion("VC_DATA_SOURCE between", value1, value2, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andVcDataSourceNotBetween(String value1, String value2) {
            addCriterion("VC_DATA_SOURCE not between", value1, value2, "vcDataSource");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeIsNull() {
            addCriterion("D_SRC_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeIsNotNull() {
            addCriterion("D_SRC_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeEqualTo(Date value) {
            addCriterion("D_SRC_UPDATETIME =", value, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeNotEqualTo(Date value) {
            addCriterion("D_SRC_UPDATETIME <>", value, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeGreaterThan(Date value) {
            addCriterion("D_SRC_UPDATETIME >", value, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_SRC_UPDATETIME >=", value, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeLessThan(Date value) {
            addCriterion("D_SRC_UPDATETIME <", value, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("D_SRC_UPDATETIME <=", value, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeIn(List<Date> values) {
            addCriterion("D_SRC_UPDATETIME in", values, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeNotIn(List<Date> values) {
            addCriterion("D_SRC_UPDATETIME not in", values, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("D_SRC_UPDATETIME between", value1, value2, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDSrcUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("D_SRC_UPDATETIME not between", value1, value2, "dSrcUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLSourceIdIsNull() {
            addCriterion("L_SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLSourceIdIsNotNull() {
            addCriterion("L_SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLSourceIdEqualTo(String value) {
            addCriterion("L_SOURCE_ID =", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotEqualTo(String value) {
            addCriterion("L_SOURCE_ID <>", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdGreaterThan(String value) {
            addCriterion("L_SOURCE_ID >", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("L_SOURCE_ID >=", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdLessThan(String value) {
            addCriterion("L_SOURCE_ID <", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdLessThanOrEqualTo(String value) {
            addCriterion("L_SOURCE_ID <=", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdLike(String value) {
            addCriterion("L_SOURCE_ID like", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotLike(String value) {
            addCriterion("L_SOURCE_ID not like", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdIn(List<String> values) {
            addCriterion("L_SOURCE_ID in", values, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotIn(List<String> values) {
            addCriterion("L_SOURCE_ID not in", values, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdBetween(String value1, String value2) {
            addCriterion("L_SOURCE_ID between", value1, value2, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotBetween(String value1, String value2) {
            addCriterion("L_SOURCE_ID not between", value1, value2, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andVcModifierIsNull() {
            addCriterion("VC_MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andVcModifierIsNotNull() {
            addCriterion("VC_MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andVcModifierEqualTo(String value) {
            addCriterion("VC_MODIFIER =", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierNotEqualTo(String value) {
            addCriterion("VC_MODIFIER <>", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierGreaterThan(String value) {
            addCriterion("VC_MODIFIER >", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierGreaterThanOrEqualTo(String value) {
            addCriterion("VC_MODIFIER >=", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierLessThan(String value) {
            addCriterion("VC_MODIFIER <", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierLessThanOrEqualTo(String value) {
            addCriterion("VC_MODIFIER <=", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierLike(String value) {
            addCriterion("VC_MODIFIER like", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierNotLike(String value) {
            addCriterion("VC_MODIFIER not like", value, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierIn(List<String> values) {
            addCriterion("VC_MODIFIER in", values, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierNotIn(List<String> values) {
            addCriterion("VC_MODIFIER not in", values, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierBetween(String value1, String value2) {
            addCriterion("VC_MODIFIER between", value1, value2, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andVcModifierNotBetween(String value1, String value2) {
            addCriterion("VC_MODIFIER not between", value1, value2, "vcModifier");
            return (Criteria) this;
        }

        public Criteria andCModiFlagIsNull() {
            addCriterion("C_MODI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCModiFlagIsNotNull() {
            addCriterion("C_MODI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCModiFlagEqualTo(String value) {
            addCriterion("C_MODI_FLAG =", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagNotEqualTo(String value) {
            addCriterion("C_MODI_FLAG <>", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagGreaterThan(String value) {
            addCriterion("C_MODI_FLAG >", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagGreaterThanOrEqualTo(String value) {
            addCriterion("C_MODI_FLAG >=", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagLessThan(String value) {
            addCriterion("C_MODI_FLAG <", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagLessThanOrEqualTo(String value) {
            addCriterion("C_MODI_FLAG <=", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagLike(String value) {
            addCriterion("C_MODI_FLAG like", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagNotLike(String value) {
            addCriterion("C_MODI_FLAG not like", value, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagIn(List<String> values) {
            addCriterion("C_MODI_FLAG in", values, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagNotIn(List<String> values) {
            addCriterion("C_MODI_FLAG not in", values, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagBetween(String value1, String value2) {
            addCriterion("C_MODI_FLAG between", value1, value2, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andCModiFlagNotBetween(String value1, String value2) {
            addCriterion("C_MODI_FLAG not between", value1, value2, "cModiFlag");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeIsNull() {
            addCriterion("VC_LINK_SCODE is null");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeIsNotNull() {
            addCriterion("VC_LINK_SCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeEqualTo(String value) {
            addCriterion("VC_LINK_SCODE =", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeNotEqualTo(String value) {
            addCriterion("VC_LINK_SCODE <>", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeGreaterThan(String value) {
            addCriterion("VC_LINK_SCODE >", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_LINK_SCODE >=", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeLessThan(String value) {
            addCriterion("VC_LINK_SCODE <", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeLessThanOrEqualTo(String value) {
            addCriterion("VC_LINK_SCODE <=", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeLike(String value) {
            addCriterion("VC_LINK_SCODE like", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeNotLike(String value) {
            addCriterion("VC_LINK_SCODE not like", value, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeIn(List<String> values) {
            addCriterion("VC_LINK_SCODE in", values, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeNotIn(List<String> values) {
            addCriterion("VC_LINK_SCODE not in", values, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeBetween(String value1, String value2) {
            addCriterion("VC_LINK_SCODE between", value1, value2, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andVcLinkScodeNotBetween(String value1, String value2) {
            addCriterion("VC_LINK_SCODE not between", value1, value2, "vcLinkScode");
            return (Criteria) this;
        }

        public Criteria andSrcidIsNull() {
            addCriterion("SRCID is null");
            return (Criteria) this;
        }

        public Criteria andSrcidIsNotNull() {
            addCriterion("SRCID is not null");
            return (Criteria) this;
        }

        public Criteria andSrcidEqualTo(String value) {
            addCriterion("SRCID =", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidNotEqualTo(String value) {
            addCriterion("SRCID <>", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidGreaterThan(String value) {
            addCriterion("SRCID >", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidGreaterThanOrEqualTo(String value) {
            addCriterion("SRCID >=", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidLessThan(String value) {
            addCriterion("SRCID <", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidLessThanOrEqualTo(String value) {
            addCriterion("SRCID <=", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidLike(String value) {
            addCriterion("SRCID like", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidNotLike(String value) {
            addCriterion("SRCID not like", value, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidIn(List<String> values) {
            addCriterion("SRCID in", values, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidNotIn(List<String> values) {
            addCriterion("SRCID not in", values, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidBetween(String value1, String value2) {
            addCriterion("SRCID between", value1, value2, "srcid");
            return (Criteria) this;
        }

        public Criteria andSrcidNotBetween(String value1, String value2) {
            addCriterion("SRCID not between", value1, value2, "srcid");
            return (Criteria) this;
        }

        public Criteria andLListedsectorIsNull() {
            addCriterion("L_LISTEDSECTOR is null");
            return (Criteria) this;
        }

        public Criteria andLListedsectorIsNotNull() {
            addCriterion("L_LISTEDSECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andLListedsectorEqualTo(BigDecimal value) {
            addCriterion("L_LISTEDSECTOR =", value, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorNotEqualTo(BigDecimal value) {
            addCriterion("L_LISTEDSECTOR <>", value, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorGreaterThan(BigDecimal value) {
            addCriterion("L_LISTEDSECTOR >", value, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_LISTEDSECTOR >=", value, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorLessThan(BigDecimal value) {
            addCriterion("L_LISTEDSECTOR <", value, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_LISTEDSECTOR <=", value, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorIn(List<BigDecimal> values) {
            addCriterion("L_LISTEDSECTOR in", values, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorNotIn(List<BigDecimal> values) {
            addCriterion("L_LISTEDSECTOR not in", values, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_LISTEDSECTOR between", value1, value2, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andLListedsectorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_LISTEDSECTOR not between", value1, value2, "lListedsector");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeIsNull() {
            addCriterion("VC_INNERCODE is null");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeIsNotNull() {
            addCriterion("VC_INNERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeEqualTo(String value) {
            addCriterion("VC_INNERCODE =", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeNotEqualTo(String value) {
            addCriterion("VC_INNERCODE <>", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeGreaterThan(String value) {
            addCriterion("VC_INNERCODE >", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_INNERCODE >=", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeLessThan(String value) {
            addCriterion("VC_INNERCODE <", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeLessThanOrEqualTo(String value) {
            addCriterion("VC_INNERCODE <=", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeLike(String value) {
            addCriterion("VC_INNERCODE like", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeNotLike(String value) {
            addCriterion("VC_INNERCODE not like", value, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeIn(List<String> values) {
            addCriterion("VC_INNERCODE in", values, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeNotIn(List<String> values) {
            addCriterion("VC_INNERCODE not in", values, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeBetween(String value1, String value2) {
            addCriterion("VC_INNERCODE between", value1, value2, "vcInnercode");
            return (Criteria) this;
        }

        public Criteria andVcInnercodeNotBetween(String value1, String value2) {
            addCriterion("VC_INNERCODE not between", value1, value2, "vcInnercode");
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