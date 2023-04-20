package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.BlogComment;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BlogCommentRepository {
	public int deleteByPrimaryKey(Long commentId) {
		return 0;
	}

	public int insert(BlogComment record) {
		return 0;
	}

	public int insertSelective(BlogComment record) {
		return 0;
	}

	public BlogComment selectByPrimaryKey(Long commentId){
		return null;
	}

	public int updateByPrimaryKeySelective(BlogComment record) {
		return 0;
	}

	public int updateByPrimaryKey(BlogComment record) {
		return 0;
	}

	public List<BlogComment> findBlogCommentList(Map map){
		return null;
	}

	public int getTotalBlogComments(Map map) {
		return 0;
	}

	public int checkDone(Integer[] ids) {
		return 0;
	}

	public int deleteBatch(Integer[] ids) {
		return 0;
	}
}