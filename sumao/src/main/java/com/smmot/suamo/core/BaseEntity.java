package com.smmot.suamo.core;

import java.io.Serializable;

/**
 * Created by adams on 2017/4/11.
 */

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private Integer page = 1;

    private Integer rows = 10;


    /**
     * 关键字
     */
    private String keywords;



    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}