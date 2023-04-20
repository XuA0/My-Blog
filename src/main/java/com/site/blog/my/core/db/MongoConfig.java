package com.site.blog.my.core.db;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * mongo 配置
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(MongoProperties.class)
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUrl;
    @Value("${spring.application.name}")
    private String serviceName;
    @Value("${service.mongodb.db.name}")
    private String dbName;

    @Override
    protected String getDatabaseName() {
        return new ConnectionString(mongoUrl).getDatabase();
    }

    @Bean
    @Primary
    public MongoDatabaseFactory mongoDbFactory() {
        return switchFactory(mongoClient());
    }

    private MongoDatabaseFactory switchFactory(MongoClient mongoClient) {
        return new MongoMultiDBFactory(mongoClient, dbName, serviceName);
    }

    @Bean
    @Override
    public MappingMongoConverter mappingMongoConverter(MongoDatabaseFactory databaseFactory, MongoCustomConversions customConversions,
                                                       MongoMappingContext mappingContext) {
        MappingMongoConverter mappingMongoConverter = super.mappingMongoConverter(databaseFactory, customConversions, mappingContext);
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return mappingMongoConverter;
    }

    @Bean
    @Override
    public MongoTemplate mongoTemplate(MongoDatabaseFactory databaseFactory, MappingMongoConverter mappingMongoConverter) {
        return new MongoTemplate(databaseFactory, mappingMongoConverter);
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder.applyConnectionString(new ConnectionString(mongoUrl));
    }


    @Override
    protected Collection<String> getMappingBasePackages() {
        return Stream.of("com.broctagon").collect(Collectors.toList());
    }


    @Bean("mongoTransactionManager")
    @Primary
    public MongoTransactionManager mongoTransactionManager(MongoDatabaseFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }
}
