package com.fl.model;

import java.math.BigDecimal;
import java.util.Date;

public class Security {
    private String vcScode;

    private String vcCode;

    private String vcSname;

    private String vcName;

    private String vcSpellAbbr;

    private String vcIsin;

    private BigDecimal lCurrency;

    private BigDecimal lMarket;

    private String vcCompanyCode;

    private BigDecimal lKind;

    private BigDecimal lOfferDate;

    private BigDecimal lListDate;

    private BigDecimal lCancelDate;

    private String cValidFlag;

    private Date dUpdatetime;

    private String vcDataSource;

    private Date dSrcUpdatetime;

    private String lSourceId;

    private String vcModifier;

    private String cModiFlag;

    private String vcLinkScode;

    private String srcid;

    private BigDecimal lListedsector;

    private String vcInnercode;

    public String getVcScode() {
        return vcScode;
    }

    public void setVcScode(String vcScode) {
        this.vcScode = vcScode == null ? null : vcScode.trim();
    }

    public String getVcCode() {
        return vcCode;
    }

    public void setVcCode(String vcCode) {
        this.vcCode = vcCode == null ? null : vcCode.trim();
    }

    public String getVcSname() {
        return vcSname;
    }

    public void setVcSname(String vcSname) {
        this.vcSname = vcSname == null ? null : vcSname.trim();
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcSpellAbbr() {
        return vcSpellAbbr;
    }

    public void setVcSpellAbbr(String vcSpellAbbr) {
        this.vcSpellAbbr = vcSpellAbbr == null ? null : vcSpellAbbr.trim();
    }

    public String getVcIsin() {
        return vcIsin;
    }

    public void setVcIsin(String vcIsin) {
        this.vcIsin = vcIsin == null ? null : vcIsin.trim();
    }

    public BigDecimal getlCurrency() {
        return lCurrency;
    }

    public void setlCurrency(BigDecimal lCurrency) {
        this.lCurrency = lCurrency;
    }

    public BigDecimal getlMarket() {
        return lMarket;
    }

    public void setlMarket(BigDecimal lMarket) {
        this.lMarket = lMarket;
    }

    public String getVcCompanyCode() {
        return vcCompanyCode;
    }

    public void setVcCompanyCode(String vcCompanyCode) {
        this.vcCompanyCode = vcCompanyCode == null ? null : vcCompanyCode.trim();
    }

    public BigDecimal getlKind() {
        return lKind;
    }

    public void setlKind(BigDecimal lKind) {
        this.lKind = lKind;
    }

    public BigDecimal getlOfferDate() {
        return lOfferDate;
    }

    public void setlOfferDate(BigDecimal lOfferDate) {
        this.lOfferDate = lOfferDate;
    }

    public BigDecimal getlListDate() {
        return lListDate;
    }

    public void setlListDate(BigDecimal lListDate) {
        this.lListDate = lListDate;
    }

    public BigDecimal getlCancelDate() {
        return lCancelDate;
    }

    public void setlCancelDate(BigDecimal lCancelDate) {
        this.lCancelDate = lCancelDate;
    }

    public String getcValidFlag() {
        return cValidFlag;
    }

    public void setcValidFlag(String cValidFlag) {
        this.cValidFlag = cValidFlag == null ? null : cValidFlag.trim();
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

    public String getlSourceId() {
        return lSourceId;
    }

    public void setlSourceId(String lSourceId) {
        this.lSourceId = lSourceId == null ? null : lSourceId.trim();
    }

    public String getVcModifier() {
        return vcModifier;
    }

    public void setVcModifier(String vcModifier) {
        this.vcModifier = vcModifier == null ? null : vcModifier.trim();
    }

    public String getcModiFlag() {
        return cModiFlag;
    }

    public void setcModiFlag(String cModiFlag) {
        this.cModiFlag = cModiFlag == null ? null : cModiFlag.trim();
    }

    public String getVcLinkScode() {
        return vcLinkScode;
    }

    public void setVcLinkScode(String vcLinkScode) {
        this.vcLinkScode = vcLinkScode == null ? null : vcLinkScode.trim();
    }

    public String getSrcid() {
        return srcid;
    }

    public void setSrcid(String srcid) {
        this.srcid = srcid == null ? null : srcid.trim();
    }

    public BigDecimal getlListedsector() {
        return lListedsector;
    }

    public void setlListedsector(BigDecimal lListedsector) {
        this.lListedsector = lListedsector;
    }

    public String getVcInnercode() {
        return vcInnercode;
    }

    public void setVcInnercode(String vcInnercode) {
        this.vcInnercode = vcInnercode == null ? null : vcInnercode.trim();
    }
}