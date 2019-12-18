package com.example.demo.service;

import com.example.demo.entity.BlogCategory;
import com.example.demo.util.PageQueryUtil;
import com.example.demo.util.PageResult;

import java.util.List;

/**
 * Created by pc on 2019/7/28.
 */
public interface CategoryService {
    /**
     * 查询分类的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    int getTotalCategories();

    /**
     * 添加分类数据
     *
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean saveCategory(String categoryName,String categoryIcon);

    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();
}
