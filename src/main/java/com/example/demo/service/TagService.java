package com.example.demo.service;

import com.example.demo.entity.BlogTagCount;
import com.example.demo.util.PageQueryUtil;
import com.example.demo.util.PageResult;

import java.util.List;

/**
 * Created by pc on 2019/7/29.
 */
public interface TagService {
    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
