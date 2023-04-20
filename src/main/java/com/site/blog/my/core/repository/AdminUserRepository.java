package com.site.blog.my.core.repository;

import com.site.blog.my.core.entity.AdminUser;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class AdminUserRepository {

	@Resource
	MongoTemplate mongoTemplate;

	public int insert(AdminUser record) {
		return 0;
	}

	public int insertSelective(AdminUser record) {
		return 0;
	}

	/**
	 * 登陆方法
	 *
	 * @param userName
	 * @param password
	 * @return
	 */
	public AdminUser login(String userName, String password) {
		Criteria criteria = Criteria.where("loginUserName").is(userName)
				.and("password").is(password);
		return mongoTemplate.findOne(Query.query(criteria), AdminUser.class);
	}

	public AdminUser selectByPrimaryKey(Integer adminUserId) {
		Criteria criteria = Criteria.where("adminUserId").is(adminUserId);
		return mongoTemplate.findOne(Query.query(criteria), AdminUser.class);
	}

	public int updateByPrimaryKeySelective(AdminUser record) {
		return 0;
	}

	public int updateByPrimaryKey(AdminUser record) {
		return 0;
	}
}