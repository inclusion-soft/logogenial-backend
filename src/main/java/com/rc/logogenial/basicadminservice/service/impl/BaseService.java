package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import org.springframework.data.domain.Page;

public class BaseService <T>{
    public ResultSearchData getResultSearch(Page<T> pagedResult ){
        ResultSearchData<T> result = new ResultSearchData();
        if(pagedResult.hasContent()) {
            result.setContent(pagedResult.getContent());
            result.setSize(pagedResult.getSize());
            result.setTotalPages(pagedResult.getTotalPages());
            result.setTotalElements(pagedResult.getTotalElements());
        }
        return  result;
    }
}
