package com.nextlegal.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

    
    public class UpdateOrderRequest  {
    
        private String companyStatus = null;
        private String tradeTarget = null;
        private String tradeBackground = null;
        private String pay = null;
        private Date etc = null;

    
        /**
            * the whole status of the customer company
        **/
        @JsonProperty("companyStatus")
        @Valid
        public String getCompanyStatus() {
            return companyStatus;
        }
        public void setCompanyStatus(String companyStatus) {
            this.companyStatus = companyStatus;
        }
    
        /**
            * trade target
        **/
        @JsonProperty("tradeTarget")
        @Valid
        public String getTradeTarget() {
            return tradeTarget;
        }
        public void setTradeTarget(String tradeTarget) {
            this.tradeTarget = tradeTarget;
        }
    
        /**
            * trade background
        **/
        @JsonProperty("tradeBackground")
        @Valid
        public String getTradeBackground() {
            return tradeBackground;
        }
        public void setTradeBackground(String tradeBackground) {
            this.tradeBackground = tradeBackground;
        }
    
        /**
            * the pay for lawyer
        **/
        @JsonProperty("pay")
        @Valid
        public String getPay() {
            return pay;
        }
        public void setPay(String pay) {
            this.pay = pay;
        }
    
        /**
            * estimated time of completion
        **/
        @JsonProperty("etc")
        @Valid
        public Date getEtc() {
            return etc;
        }
        public void setEtc(Date etc) {
            this.etc = etc;
        }
    

        @Override
        public String toString()  {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateOrderRequest {\n");
            
            sb.append("  companyStatus: ").append(companyStatus).append("\n");
            sb.append("  tradeTarget: ").append(tradeTarget).append("\n");
            sb.append("  tradeBackground: ").append(tradeBackground).append("\n");
            sb.append("  pay: ").append(pay).append("\n");
            sb.append("  etc: ").append(etc).append("\n");
            sb.append("}\n");
            return sb.toString();
        }
    }
    
