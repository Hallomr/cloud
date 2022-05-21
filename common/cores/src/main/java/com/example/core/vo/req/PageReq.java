package com.example.core.vo.req;

public class PageReq {
    private Integer pageNum;
    private Integer pageSize;

    public Integer getPageNum() {
        if(pageNum == null || pageNum<1){
            this.pageNum=1;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if(pageNum==null){
            this.pageNum = 1;
        }else {
            this.pageNum = pageNum;
        }
    }

    public Integer getPageSize() {
        if(pageSize == null || pageSize<1){
            this.pageSize=10;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize==null){
            this.pageSize = 10;
        }else {
            this.pageSize = pageSize;
        }
    }
}
