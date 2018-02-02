package com.alan.service;

import com.alan.domain.LearnResouce;
import com.alan.tools.Page;

import java.util.Map;

/**
 * Created by 170090 on 2018/1/31.
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    Page queryLearnResouceList(Map<String,Object> params);
}
