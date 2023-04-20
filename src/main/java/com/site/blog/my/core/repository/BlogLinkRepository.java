package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.BlogLink;
import com.site.blog.my.core.util.PageQueryUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogLinkRepository {
	public int deleteByPrimaryKey(Integer linkId) {
		return 0;
	}

	public int insert(BlogLink record) {
		return 0;
	}

	public int insertSelective(BlogLink record) {
		return 0;
	}

	public BlogLink selectByPrimaryKey(Integer linkId){
		return null;
	}

	public int updateByPrimaryKeySelective(BlogLink record) {
		return 0;
	}

	public int updateByPrimaryKey(BlogLink record) {
		return 0;
	}

	public List<BlogLink> findLinkList(PageQueryUtil pageUtil){
		return null;
	}

	public int getTotalLinks(PageQueryUtil pageUtil) {
		return 0;
	}

	public int deleteBatch(Integer[] ids) {
		return 0;
	}
}