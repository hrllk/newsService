package com.infinigru.gruvoice.web.model;


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class DataTable {
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List data;
    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }



    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public void setData(List data) {
        this.data = data;
    }

    public DataTable() {
    }

    public List getData(){
        if(CollectionUtils.isEmpty(data)){
            data = new ArrayList();
        }
        return data;
    }



}
