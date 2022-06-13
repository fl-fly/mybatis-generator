package com.fl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmBscEquityquoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmBscEquityquoteExample() {
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

        public Criteria andLTradeDateIsNull() {
            addCriterion("L_TRADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLTradeDateIsNotNull() {
            addCriterion("L_TRADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLTradeDateEqualTo(BigDecimal value) {
            addCriterion("L_TRADE_DATE =", value, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateNotEqualTo(BigDecimal value) {
            addCriterion("L_TRADE_DATE <>", value, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateGreaterThan(BigDecimal value) {
            addCriterion("L_TRADE_DATE >", value, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_TRADE_DATE >=", value, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateLessThan(BigDecimal value) {
            addCriterion("L_TRADE_DATE <", value, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_TRADE_DATE <=", value, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateIn(List<BigDecimal> values) {
            addCriterion("L_TRADE_DATE in", values, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateNotIn(List<BigDecimal> values) {
            addCriterion("L_TRADE_DATE not in", values, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_TRADE_DATE between", value1, value2, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andLTradeDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_TRADE_DATE not between", value1, value2, "lTradeDate");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeIsNull() {
            addCriterion("VC_STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeIsNotNull() {
            addCriterion("VC_STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeEqualTo(String value) {
            addCriterion("VC_STOCK_CODE =", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeNotEqualTo(String value) {
            addCriterion("VC_STOCK_CODE <>", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeGreaterThan(String value) {
            addCriterion("VC_STOCK_CODE >", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_STOCK_CODE >=", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeLessThan(String value) {
            addCriterion("VC_STOCK_CODE <", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeLessThanOrEqualTo(String value) {
            addCriterion("VC_STOCK_CODE <=", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeLike(String value) {
            addCriterion("VC_STOCK_CODE like", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeNotLike(String value) {
            addCriterion("VC_STOCK_CODE not like", value, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeIn(List<String> values) {
            addCriterion("VC_STOCK_CODE in", values, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeNotIn(List<String> values) {
            addCriterion("VC_STOCK_CODE not in", values, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeBetween(String value1, String value2) {
            addCriterion("VC_STOCK_CODE between", value1, value2, "vcStockCode");
            return (Criteria) this;
        }

        public Criteria andVcStockCodeNotBetween(String value1, String value2) {
            addCriterion("VC_STOCK_CODE not between", value1, value2, "vcStockCode");
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

        public Criteria andEnLastPriceIsNull() {
            addCriterion("EN_LAST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceIsNotNull() {
            addCriterion("EN_LAST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceEqualTo(BigDecimal value) {
            addCriterion("EN_LAST_PRICE =", value, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceNotEqualTo(BigDecimal value) {
            addCriterion("EN_LAST_PRICE <>", value, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceGreaterThan(BigDecimal value) {
            addCriterion("EN_LAST_PRICE >", value, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_LAST_PRICE >=", value, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceLessThan(BigDecimal value) {
            addCriterion("EN_LAST_PRICE <", value, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_LAST_PRICE <=", value, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceIn(List<BigDecimal> values) {
            addCriterion("EN_LAST_PRICE in", values, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceNotIn(List<BigDecimal> values) {
            addCriterion("EN_LAST_PRICE not in", values, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_LAST_PRICE between", value1, value2, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnLastPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_LAST_PRICE not between", value1, value2, "enLastPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceIsNull() {
            addCriterion("EN_OPEN_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceIsNotNull() {
            addCriterion("EN_OPEN_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceEqualTo(BigDecimal value) {
            addCriterion("EN_OPEN_PRICE =", value, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceNotEqualTo(BigDecimal value) {
            addCriterion("EN_OPEN_PRICE <>", value, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceGreaterThan(BigDecimal value) {
            addCriterion("EN_OPEN_PRICE >", value, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_OPEN_PRICE >=", value, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceLessThan(BigDecimal value) {
            addCriterion("EN_OPEN_PRICE <", value, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_OPEN_PRICE <=", value, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceIn(List<BigDecimal> values) {
            addCriterion("EN_OPEN_PRICE in", values, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceNotIn(List<BigDecimal> values) {
            addCriterion("EN_OPEN_PRICE not in", values, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_OPEN_PRICE between", value1, value2, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnOpenPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_OPEN_PRICE not between", value1, value2, "enOpenPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceIsNull() {
            addCriterion("EN_HIGH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceIsNotNull() {
            addCriterion("EN_HIGH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceEqualTo(BigDecimal value) {
            addCriterion("EN_HIGH_PRICE =", value, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceNotEqualTo(BigDecimal value) {
            addCriterion("EN_HIGH_PRICE <>", value, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceGreaterThan(BigDecimal value) {
            addCriterion("EN_HIGH_PRICE >", value, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_HIGH_PRICE >=", value, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceLessThan(BigDecimal value) {
            addCriterion("EN_HIGH_PRICE <", value, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_HIGH_PRICE <=", value, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceIn(List<BigDecimal> values) {
            addCriterion("EN_HIGH_PRICE in", values, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceNotIn(List<BigDecimal> values) {
            addCriterion("EN_HIGH_PRICE not in", values, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_HIGH_PRICE between", value1, value2, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnHighPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_HIGH_PRICE not between", value1, value2, "enHighPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceIsNull() {
            addCriterion("EN_LOW_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceIsNotNull() {
            addCriterion("EN_LOW_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceEqualTo(BigDecimal value) {
            addCriterion("EN_LOW_PRICE =", value, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceNotEqualTo(BigDecimal value) {
            addCriterion("EN_LOW_PRICE <>", value, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceGreaterThan(BigDecimal value) {
            addCriterion("EN_LOW_PRICE >", value, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_LOW_PRICE >=", value, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceLessThan(BigDecimal value) {
            addCriterion("EN_LOW_PRICE <", value, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_LOW_PRICE <=", value, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceIn(List<BigDecimal> values) {
            addCriterion("EN_LOW_PRICE in", values, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceNotIn(List<BigDecimal> values) {
            addCriterion("EN_LOW_PRICE not in", values, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_LOW_PRICE between", value1, value2, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnLowPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_LOW_PRICE not between", value1, value2, "enLowPrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceIsNull() {
            addCriterion("EN_CLOSE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceIsNotNull() {
            addCriterion("EN_CLOSE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceEqualTo(BigDecimal value) {
            addCriterion("EN_CLOSE_PRICE =", value, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceNotEqualTo(BigDecimal value) {
            addCriterion("EN_CLOSE_PRICE <>", value, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceGreaterThan(BigDecimal value) {
            addCriterion("EN_CLOSE_PRICE >", value, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_CLOSE_PRICE >=", value, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceLessThan(BigDecimal value) {
            addCriterion("EN_CLOSE_PRICE <", value, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_CLOSE_PRICE <=", value, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceIn(List<BigDecimal> values) {
            addCriterion("EN_CLOSE_PRICE in", values, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceNotIn(List<BigDecimal> values) {
            addCriterion("EN_CLOSE_PRICE not in", values, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_CLOSE_PRICE between", value1, value2, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnClosePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_CLOSE_PRICE not between", value1, value2, "enClosePrice");
            return (Criteria) this;
        }

        public Criteria andEnAmountIsNull() {
            addCriterion("EN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andEnAmountIsNotNull() {
            addCriterion("EN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEnAmountEqualTo(BigDecimal value) {
            addCriterion("EN_AMOUNT =", value, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountNotEqualTo(BigDecimal value) {
            addCriterion("EN_AMOUNT <>", value, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountGreaterThan(BigDecimal value) {
            addCriterion("EN_AMOUNT >", value, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_AMOUNT >=", value, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountLessThan(BigDecimal value) {
            addCriterion("EN_AMOUNT <", value, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_AMOUNT <=", value, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountIn(List<BigDecimal> values) {
            addCriterion("EN_AMOUNT in", values, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountNotIn(List<BigDecimal> values) {
            addCriterion("EN_AMOUNT not in", values, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_AMOUNT between", value1, value2, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_AMOUNT not between", value1, value2, "enAmount");
            return (Criteria) this;
        }

        public Criteria andEnVolumeIsNull() {
            addCriterion("EN_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andEnVolumeIsNotNull() {
            addCriterion("EN_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andEnVolumeEqualTo(BigDecimal value) {
            addCriterion("EN_VOLUME =", value, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeNotEqualTo(BigDecimal value) {
            addCriterion("EN_VOLUME <>", value, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeGreaterThan(BigDecimal value) {
            addCriterion("EN_VOLUME >", value, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_VOLUME >=", value, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeLessThan(BigDecimal value) {
            addCriterion("EN_VOLUME <", value, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_VOLUME <=", value, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeIn(List<BigDecimal> values) {
            addCriterion("EN_VOLUME in", values, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeNotIn(List<BigDecimal> values) {
            addCriterion("EN_VOLUME not in", values, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_VOLUME between", value1, value2, "enVolume");
            return (Criteria) this;
        }

        public Criteria andEnVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_VOLUME not between", value1, value2, "enVolume");
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

        public Criteria andLSourceIdEqualTo(BigDecimal value) {
            addCriterion("L_SOURCE_ID =", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotEqualTo(BigDecimal value) {
            addCriterion("L_SOURCE_ID <>", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdGreaterThan(BigDecimal value) {
            addCriterion("L_SOURCE_ID >", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SOURCE_ID >=", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdLessThan(BigDecimal value) {
            addCriterion("L_SOURCE_ID <", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_SOURCE_ID <=", value, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdIn(List<BigDecimal> values) {
            addCriterion("L_SOURCE_ID in", values, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotIn(List<BigDecimal> values) {
            addCriterion("L_SOURCE_ID not in", values, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_SOURCE_ID between", value1, value2, "lSourceId");
            return (Criteria) this;
        }

        public Criteria andLSourceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_SOURCE_ID not between", value1, value2, "lSourceId");
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

        public Criteria andLPriceChangeIsNull() {
            addCriterion("L_PRICE_CHANGE is null");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeIsNotNull() {
            addCriterion("L_PRICE_CHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeEqualTo(BigDecimal value) {
            addCriterion("L_PRICE_CHANGE =", value, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeNotEqualTo(BigDecimal value) {
            addCriterion("L_PRICE_CHANGE <>", value, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeGreaterThan(BigDecimal value) {
            addCriterion("L_PRICE_CHANGE >", value, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_PRICE_CHANGE >=", value, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeLessThan(BigDecimal value) {
            addCriterion("L_PRICE_CHANGE <", value, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_PRICE_CHANGE <=", value, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeIn(List<BigDecimal> values) {
            addCriterion("L_PRICE_CHANGE in", values, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeNotIn(List<BigDecimal> values) {
            addCriterion("L_PRICE_CHANGE not in", values, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_PRICE_CHANGE between", value1, value2, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andLPriceChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_PRICE_CHANGE not between", value1, value2, "lPriceChange");
            return (Criteria) this;
        }

        public Criteria andEnPlmtIsNull() {
            addCriterion("EN_PLMT is null");
            return (Criteria) this;
        }

        public Criteria andEnPlmtIsNotNull() {
            addCriterion("EN_PLMT is not null");
            return (Criteria) this;
        }

        public Criteria andEnPlmtEqualTo(BigDecimal value) {
            addCriterion("EN_PLMT =", value, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtNotEqualTo(BigDecimal value) {
            addCriterion("EN_PLMT <>", value, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtGreaterThan(BigDecimal value) {
            addCriterion("EN_PLMT >", value, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_PLMT >=", value, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtLessThan(BigDecimal value) {
            addCriterion("EN_PLMT <", value, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EN_PLMT <=", value, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtIn(List<BigDecimal> values) {
            addCriterion("EN_PLMT in", values, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtNotIn(List<BigDecimal> values) {
            addCriterion("EN_PLMT not in", values, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_PLMT between", value1, value2, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andEnPlmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EN_PLMT not between", value1, value2, "enPlmt");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateIsNull() {
            addCriterion("L_QUOTE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateIsNotNull() {
            addCriterion("L_QUOTE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateEqualTo(BigDecimal value) {
            addCriterion("L_QUOTE_DATE =", value, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateNotEqualTo(BigDecimal value) {
            addCriterion("L_QUOTE_DATE <>", value, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateGreaterThan(BigDecimal value) {
            addCriterion("L_QUOTE_DATE >", value, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_QUOTE_DATE >=", value, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateLessThan(BigDecimal value) {
            addCriterion("L_QUOTE_DATE <", value, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_QUOTE_DATE <=", value, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateIn(List<BigDecimal> values) {
            addCriterion("L_QUOTE_DATE in", values, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateNotIn(List<BigDecimal> values) {
            addCriterion("L_QUOTE_DATE not in", values, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_QUOTE_DATE between", value1, value2, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andLQuoteDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_QUOTE_DATE not between", value1, value2, "lQuoteDate");
            return (Criteria) this;
        }

        public Criteria andCIsFillIsNull() {
            addCriterion("C_IS_FILL is null");
            return (Criteria) this;
        }

        public Criteria andCIsFillIsNotNull() {
            addCriterion("C_IS_FILL is not null");
            return (Criteria) this;
        }

        public Criteria andCIsFillEqualTo(String value) {
            addCriterion("C_IS_FILL =", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillNotEqualTo(String value) {
            addCriterion("C_IS_FILL <>", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillGreaterThan(String value) {
            addCriterion("C_IS_FILL >", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillGreaterThanOrEqualTo(String value) {
            addCriterion("C_IS_FILL >=", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillLessThan(String value) {
            addCriterion("C_IS_FILL <", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillLessThanOrEqualTo(String value) {
            addCriterion("C_IS_FILL <=", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillLike(String value) {
            addCriterion("C_IS_FILL like", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillNotLike(String value) {
            addCriterion("C_IS_FILL not like", value, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillIn(List<String> values) {
            addCriterion("C_IS_FILL in", values, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillNotIn(List<String> values) {
            addCriterion("C_IS_FILL not in", values, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillBetween(String value1, String value2) {
            addCriterion("C_IS_FILL between", value1, value2, "cIsFill");
            return (Criteria) this;
        }

        public Criteria andCIsFillNotBetween(String value1, String value2) {
            addCriterion("C_IS_FILL not between", value1, value2, "cIsFill");
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