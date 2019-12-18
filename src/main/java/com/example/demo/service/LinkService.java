package com.example.demo.service;

import com.example.demo.entity.BlogLink;
import com.example.demo.util.PageQueryUtil;
import com.example.demo.util.PageResult;

import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2019/7/29.
 */
public interface LinkService {

    /**
     * 查询友链的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
