package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.BlogTagRelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogTagRelationRepository {
	public int deleteByPrimaryKey(Long relationId) {
		return 0;
	}

	public int insert(BlogTagRelation record) {
		return 0;
	}

	public int insertSelective(BlogTagRelation record) {
		return 0;
	}

	public BlogTagRelation selectByPrimaryKey(Long relationId) {
		return null;
	}

	public BlogTagRelation selectByBlogIdAndTagId(Long blogId, Integer tagId) {
		return null;
	}

	public List<Long> selectDistinctTagIds(Integer[] tagIds) {
		return null;
	}

	public int updateByPrimaryKeySelective(BlogTagRelation record) {
		return 0;
	}

	public int updateByPrimaryKey(BlogTagRelation record) {
		return 0;
	}

	public int batchInsert(List<BlogTagRelation> blogTagRelationList) {
		return 0;
	}

	public int deleteByBlogId(Long blogId) {
		return 0;
	}
}