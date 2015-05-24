package com.nextlegal.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

    
    /**
    * paramters for a pagination request
    **/
    public class PaginationParameters  {
    
        private Integer pageSize = null;
        private Integer page = null;

    
        /**
            * max number of objects per page
            * minimum: 1.0
        **/
        @JsonProperty("pageSize")
        @Valid
        @Min(1)
        public Integer getPageSize() {
            return pageSize;
        }
        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }
    
        /**
            * current page number
            * minimum: 1.0
        **/
        @JsonProperty("page")
        @Valid
        @Min(1)
        public Integer getPage() {
            return page;
        }
        public void setPage(Integer page) {
            this.page = page;
        }
    

        @Override
        public String toString()  {
            StringBuilder sb = new StringBuilder();
            sb.append("class PaginationParameters {\n");
            
            sb.append("  pageSize: ").append(pageSize).append("\n");
            sb.append("  page: ").append(page).append("\n");
            sb.append("}\n");
            return sb.toString();
        }
    }
    
