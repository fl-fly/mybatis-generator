package com.fl.model;

import java.math.BigDecimal;

public class DmBscEquityquoteKey {
    private String vcScode;

    private BigDecimal lTradeDate;

    public String getVcScode() {
        return vcScode;
    }

    public void setVcScode(String vcScode) {
        this.vcScode = vcScode == null ? null : vcScode.trim();
    }

    public BigDecimal getlTradeDate() {
        return lTradeDate;
    }

    public void setlTradeDate(BigDecimal lTradeDate) {
        this.lTradeDate = lTradeDate;
    }
}