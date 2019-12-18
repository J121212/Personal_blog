package com.example.demo.dao;

import com.example.demo.entity.BlogLink;
import com.example.demo.util.PageQueryUtil;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pc on 2019/7/27.
 */
@Component
public interface BlogLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(BlogLink record);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(BlogLink record);

    int updateByPrimaryKey(BlogLink record);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int getTotalLinks(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);




}
