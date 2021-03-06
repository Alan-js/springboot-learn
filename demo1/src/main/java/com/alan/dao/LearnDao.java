package com.alan.dao;

import com.alan.domain.LearnResouce;
import com.alan.tools.Page;

import java.util.Map;

/**
 * Created by 170090 on 2018/2/1.
 */
public interface LearnDao {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long id);
    Page queryLearnResouceList(Map<String,Object> params);
}
