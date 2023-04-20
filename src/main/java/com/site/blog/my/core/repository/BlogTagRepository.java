package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.BlogTag;
import com.site.blog.my.core.entity.BlogTagCount;
import com.site.blog.my.core.util.PageQueryUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogTagRepository {
	public int deleteByPrimaryKey(Integer tagId) {
		return 0;
	}

	public int insert(BlogTag record) {
		return 0;
	}

	public int insertSelective(BlogTag record) {
		return 0;
	}

	public BlogTag selectByPrimaryKey(Integer tagId) {
		return null;
	}

	public BlogTag selectByTagName(String tagName) {
		return null;
	}

	public int updateByPrimaryKeySelective(BlogTag record) {
		return 0;
	}

	public int updateByPrimaryKey(BlogTag record) {
		return 0;
	}

	public List<BlogTag> findTagList(PageQueryUtil pageUtil) {
		return null;
	}

	public List<BlogTagCount> getTagCount() {
		return null;
	}

	public int getTotalTags(PageQueryUtil pageUtil) {
		return 0;
	}

	public int deleteBatch(Integer[] ids) {
		return 0;
	}

	public int batchInsertBlogTag(List<BlogTag> tagList) {
		return 0;
	}
}