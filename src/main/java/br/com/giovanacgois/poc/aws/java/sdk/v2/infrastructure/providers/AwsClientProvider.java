package br.com.giovanacgois.poc.aws.java.sdk.v2.infrastructure.providers;

import br.com.giovanacgois.poc.aws.java.sdk.v2.infrastructure.properties.AwsProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Configuration
@RequiredArgsConstructor
public class AwsClientProvider {

    private final AwsProperties awsProperties;

    @Bean
    public AwsCredentials credentials() {
        return AwsBasicCredentials.create(awsProperties.getAccessKeyId(), awsProperties.getSecretKey());
    }

    @Bean
    public DynamoDbClient dynamoDbClient() {
        return DynamoDbClient.builder()
                .credentialsProvider(StaticCredentialsProvider.create(credentials()))
                .region(Region.of(awsProperties.getRegion()))
                .build();
    }
}
