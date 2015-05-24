package com.nextlegal.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

    
    /**
    * represent an order resource.
    **/
    public class Order  {
    
        private Integer id = null;
        private String companyStatus = null;
        private String tradeTarget = null;
        private String tradeBackground = null;
        private String downloads = null;
        private Date startDate = null;
        private Date etc = null;
        private Date deadline = null;
        private String pay = null;
        public enum StatusEnum {
         submitted,  assigned,  accepted,  comleted,  failed, 
        };
        private StatusEnum status = null;
        private String specialRequirement = null;

    
        /**
            * ID of the order.
        **/
        @JsonProperty("id")
        @Valid
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
    
        /**
            * the whole status of the customer company
        **/
        @JsonProperty("companyStatus")
        @Valid
        @NotNull
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
        @NotNull
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
        @NotNull
        public String getTradeBackground() {
            return tradeBackground;
        }
        public void setTradeBackground(String tradeBackground) {
            this.tradeBackground = tradeBackground;
        }
    
        /**
            * releted materials download links
        **/
        @JsonProperty("downloads")
        @Valid
        public String getDownloads() {
            return downloads;
        }
        public void setDownloads(String downloads) {
            this.downloads = downloads;
        }
    
        /**
            * order start time
        **/
        @JsonProperty("startDate")
        @Valid
        public Date getStartDate() {
            return startDate;
        }
        public void setStartDate(Date startDate) {
            this.startDate = startDate;
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
    
        /**
            * order deadline
        **/
        @JsonProperty("deadline")
        @Valid
        @NotNull
        public Date getDeadline() {
            return deadline;
        }
        public void setDeadline(Date deadline) {
            this.deadline = deadline;
        }
    
        /**
            * the pay for lawyer
        **/
        @JsonProperty("pay")
        @Valid
        @NotNull
        public String getPay() {
            return pay;
        }
        public void setPay(String pay) {
            this.pay = pay;
        }
    
        /**
            * status of order
        **/
        @JsonProperty("status")
        @Valid
        public StatusEnum getStatus() {
            return status;
        }
        public void setStatus(StatusEnum status) {
            this.status = status;
        }
    
        /**
            * special requirement from customer
        **/
        @JsonProperty("specialRequirement")
        @Valid
        public String getSpecialRequirement() {
            return specialRequirement;
        }
        public void setSpecialRequirement(String specialRequirement) {
            this.specialRequirement = specialRequirement;
        }
    

        @Override
        public String toString()  {
            StringBuilder sb = new StringBuilder();
            sb.append("class Order {\n");
            
            sb.append("  id: ").append(id).append("\n");
            sb.append("  companyStatus: ").append(companyStatus).append("\n");
            sb.append("  tradeTarget: ").append(tradeTarget).append("\n");
            sb.append("  tradeBackground: ").append(tradeBackground).append("\n");
            sb.append("  downloads: ").append(downloads).append("\n");
            sb.append("  startDate: ").append(startDate).append("\n");
            sb.append("  etc: ").append(etc).append("\n");
            sb.append("  deadline: ").append(deadline).append("\n");
            sb.append("  pay: ").append(pay).append("\n");
            sb.append("  status: ").append(status).append("\n");
            sb.append("  specialRequirement: ").append(specialRequirement).append("\n");
            sb.append("}\n");
            return sb.toString();
        }
    }
    
