package org.example.azcosmos.config;

import com.azure.cosmos.CosmosClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCosmosRepositories(basePackages = "org.example.azcosmos.repo")
public class MyCosmosConfigV2 extends AbstractCosmosConfiguration {

    @Override
    protected String getDatabaseName() {
        return "users-db";
    }

    @Bean
    public CosmosClientBuilder cosmosClientBuilder(@Value("${azure.cosmos.uri}") String url) {
        return new CosmosClientBuilder()
                .endpoint(url)
                .credential(new DefaultAzureCredentialBuilder().build());
    }

    @Bean
    public CosmosConfig cosmosConfig() {
        return CosmosConfig.builder()
                .enableQueryMetrics(true)
                .build();
    }
}
