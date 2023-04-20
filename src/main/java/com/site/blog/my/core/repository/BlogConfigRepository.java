package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.BlogConfig;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BlogConfigRepository {

	@Resource
	MongoTemplate mongoTemplate;

	public List<BlogConfig> selectAll() {
		return mongoTemplate.findAll(BlogConfig.class);
	}

	public BlogConfig selectByPrimaryKey(String configName) {
		return null;
	}

	public int updateByPrimaryKeySelective(BlogConfig record) {
		return 0;
	}

}