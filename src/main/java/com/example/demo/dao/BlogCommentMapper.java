package com.example.demo.dao;

import com.example.demo.entity.BlogComment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2019/7/27.
 */
@Component
public interface BlogCommentMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    BlogComment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKey(BlogComment record);

    List<BlogComment> findBlogCommentList(Map map);

    int getTotalBlogComments(Map map);

    int checkDone(Integer[] ids);

    int deleteBatch(Integer[] ids);



}
