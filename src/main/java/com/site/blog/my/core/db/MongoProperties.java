package com.site.blog.my.core.db;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoProperties {
    private Integer minConnectionsPerHost;

    private Integer maxConnectionsPerHost;

    private Integer threadsAllowedToBlockForConnectionMultiplier;

    private Integer serverSelectionTimeout;

    private Integer maxWaitTime;

    private Integer maxConnectionIdleTime;

    private Integer maxConnectionLifeTime;

    private Integer connectTimeout;

    private Integer socketTimeout;

    private Integer heartbeatFrequency;

    private Integer minHeartbeatFrequency;

    private Integer heartbeatConnectTimeout;

    private Integer heartbeatSocketTimeout;

    private Integer localThreshold;
}
