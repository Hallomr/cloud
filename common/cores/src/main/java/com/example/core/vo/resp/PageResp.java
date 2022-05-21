package com.example.core.vo.resp;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

@Data
public class PageResp<T> {
    private long totalSize;
    private long totalPage;
    private List<T> records;

    public PageResp(Page<T> page) {
        if (page != null) {
            this.totalPage = page.getPages();
            this.totalSize = page.getTotal();
            this.records = page.getRecords();
        }
    }
}
