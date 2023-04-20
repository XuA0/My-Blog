package com.site.blog.my.core.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("BlogConfig")
@Data
public class BlogConfig {
	public String configName;

	public String configValue;

	public Date createTime;

	public Date updateTime;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", configName=").append(configName);
		sb.append(", configValue=").append(configValue);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append("]");
		return sb.toString();
	}
}