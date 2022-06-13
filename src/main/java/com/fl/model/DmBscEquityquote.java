package com.fl.model;

import java.math.BigDecimal;
import java.util.Date;

public class DmBscEquityquote extends DmBscEquityquoteKey {
    private String vcStockCode;

    private BigDecimal lMarket;

    private BigDecimal enLastPrice;

    private BigDecimal enOpenPrice;

    private BigDecimal enHighPrice;

    private BigDecimal enLowPrice;

    private BigDecimal enClosePrice;

    private BigDecimal enAmount;

    private BigDecimal enVolume;

    private Date dUpdatetime;

    private String vcDataSource;

    private Date dSrcUpdatetime;

    private BigDecimal lSourceId;

    private String srcid;

    private BigDecimal lPriceChange;

    private BigDecimal enPlmt;

    private BigDecimal lQuoteDate;

    private String cIsFill;

    public String getVcStockCode() {
        return vcStockCode;
    }

    public void setVcStockCode(String vcStockCode) {
        this.vcStockCode = vcStockCode == null ? null : vcStockCode.trim();
    }

    public BigDecimal getlMarket() {
        return lMarket;
    }

    public void setlMarket(BigDecimal lMarket) {
        this.lMarket = lMarket;
    }

    public BigDecimal getEnLastPrice() {
        return enLastPrice;
    }

    public void setEnLastPrice(BigDecimal enLastPrice) {
        this.enLastPrice = enLastPrice;
    }

    public BigDecimal getEnOpenPrice() {
        return enOpenPrice;
    }

    public void setEnOpenPrice(BigDecimal enOpenPrice) {
        this.enOpenPrice = enOpenPrice;
    }

    public BigDecimal getEnHighPrice() {
        return enHighPrice;
    }

    public void setEnHighPrice(BigDecimal enHighPrice) {
        this.enHighPrice = enHighPrice;
    }

    public BigDecimal getEnLowPrice() {
        return enLowPrice;
    }

    public void setEnLowPrice(BigDecimal enLowPrice) {
        this.enLowPrice = enLowPrice;
    }

    public BigDecimal getEnClosePrice() {
        return enClosePrice;
    }

    public void setEnClosePrice(BigDecimal enClosePrice) {
        this.enClosePrice = enClosePrice;
    }

    public BigDecimal getEnAmount() {
        return enAmount;
    }

    public void setEnAmount(BigDecimal enAmount) {
        this.enAmount = enAmount;
    }

    public BigDecimal getEnVolume() {
        return enVolume;
    }

    public void setEnVolume(BigDecimal enVolume) {
        this.enVolume = enVolume;
    }

    public Date getdUpdatetime() {
        return dUpdatetime;
    }

    public void setdUpdatetime(Date dUpdatetime) {
        this.dUpdatetime = dUpdatetime;
    }

    public String getVcDataSource() {
        return vcDataSource;
    }

    public void setVcDataSource(String vcDataSource) {
        this.vcDataSource = vcDataSource == null ? null : vcDataSource.trim();
    }

    public Date getdSrcUpdatetime() {
        return dSrcUpdatetime;
    }

    public void setdSrcUpdatetime(Date dSrcUpdatetime) {
        this.dSrcUpdatetime = dSrcUpdatetime;
    }

    public BigDecimal getlSourceId() {
        return lSourceId;
    }

    public void setlSourceId(BigDecimal lSourceId) {
        this.lSourceId = lSourceId;
    }

    public String getSrcid() {
        return srcid;
    }

    public void setSrcid(String srcid) {
        this.srcid = srcid == null ? null : srcid.trim();
    }

    public BigDecimal getlPriceChange() {
        return lPriceChange;
    }

    public void setlPriceChange(BigDecimal lPriceChange) {
        this.lPriceChange = lPriceChange;
    }

    public BigDecimal getEnPlmt() {
        return enPlmt;
    }

    public void setEnPlmt(BigDecimal enPlmt) {
        this.enPlmt = enPlmt;
    }

    public BigDecimal getlQuoteDate() {
        return lQuoteDate;
    }

    public void setlQuoteDate(BigDecimal lQuoteDate) {
        this.lQuoteDate = lQuoteDate;
    }

    public String getcIsFill() {
        return cIsFill;
    }

    public void setcIsFill(String cIsFill) {
        this.cIsFill = cIsFill == null ? null : cIsFill.trim();
    }
}