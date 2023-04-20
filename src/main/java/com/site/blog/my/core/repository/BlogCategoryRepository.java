package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.BlogCategory;
import com.site.blog.my.core.util.PageQueryUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogCategoryRepository {
	public int deleteByPrimaryKey(Integer categoryId) {
		return 0;
	}

	public int insert(BlogCategory record) {
		return 0;
	}

	public int insertSelective(BlogCategory record) {
		return 0;
	}

	public BlogCategory selectByPrimaryKey(Integer categoryId){
		return null;
	}

	public BlogCategory selectByCategoryName(String categoryName){
		return null;
	}

	public int updateByPrimaryKeySelective(BlogCategory record) {
		return 0;
	}

	public int updateByPrimaryKey(BlogCategory record) {
		return 0;
	}

	public List<BlogCategory> findCategoryList(PageQueryUtil pageUtil){
		return null;
	}

	public List<BlogCategory> selectByCategoryIds(List<Integer> categoryIds){
		return null;
	}

	public int getTotalCategories(PageQueryUtil pageUtil) {
		return 0;
	}

	public int deleteBatch(Integer[] ids) {
		return 0;
	}
}