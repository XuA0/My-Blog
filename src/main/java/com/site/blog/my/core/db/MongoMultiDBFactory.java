package com.site.blog.my.core.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Slf4j
public class MongoMultiDBFactory extends SimpleMongoClientDatabaseFactory {

    public String serviceName;


    public MongoMultiDBFactory(MongoClient client, String dataBaseName, String serviceName) {
        super(client, dataBaseName);
        this.serviceName = serviceName;
    }

    @Override
    protected MongoDatabase doGetMongoDatabase(String dbName) {
        log.debug("Default Switch DB! DB=[{}]", dbName);
        return getMongoClient().getDatabase(dbName);
    }
}
