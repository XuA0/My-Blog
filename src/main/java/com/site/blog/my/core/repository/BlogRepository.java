package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.Blog;
import com.site.blog.my.core.util.PageQueryUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogRepository {
	public int deleteByPrimaryKey(Long blogId) {
		return 0;
	}

	public int insert(Blog record) {
		return 0;
	}

	public int insertSelective(Blog record) {
		return 0;
	}

	public Blog selectByPrimaryKey(Long blogId) {
		return null;
	}

	public int updateByPrimaryKeySelective(Blog record) {
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(Blog record) {
		return 0;
	}

	public int updateByPrimaryKey(Blog record) {
		return 0;
	}

	public List<Blog> findBlogList(PageQueryUtil pageUtil) {
		return null;
	}

	public List<Blog> findBlogListByType( int type,  int limit) {
		return null;
	}

	public int getTotalBlogs(PageQueryUtil pageUtil) {
		return 0;
	}

	public int deleteBatch(Integer[] ids) {
		return 0;
	}

	public List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil) {
		return null;
	}

	public int getTotalBlogsByTagId(PageQueryUtil pageUtil) {
		return 0;
	}

	public Blog selectBySubUrl(String subUrl) {
		return null;
	}

	public int updateBlogCategorys(String categoryName, Integer categoryId, Integer[] ids) {
		return 0;
	}

}