package com.example.demo.dao;

import com.example.demo.entity.BlogConfig;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pc on 2019/7/27.
 */
@Component
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}
