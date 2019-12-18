package com.example.demo.dao;

import com.example.demo.entity.BlogTag;
import com.example.demo.entity.BlogTagCount;
import com.example.demo.util.PageQueryUtil;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pc on 2019/7/28.
 */
@Component
public interface BlogTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(BlogTag record);

    int insertSelective(BlogTag record);

    BlogTag selectByPrimaryKey(Integer tagId);

    BlogTag selectByTagName(String tagName);

    int updateByPrimaryKeySelective(BlogTag record);

    int updateByPrimaryKey(BlogTag record);

    List<BlogTag> findTagList(PageQueryUtil pageUtil);

    List<BlogTagCount> getTagCount();

    int getTotalTags(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

    int batchInsertBlogTag(List<BlogTag> tagList);
}
