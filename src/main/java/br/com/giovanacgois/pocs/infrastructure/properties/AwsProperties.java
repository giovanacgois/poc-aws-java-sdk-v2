package br.com.giovanacgois.pocs.infrastructure.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class AwsProperties {

    @Value("${cloud.aws.credentials.access-key}")
    private String accessKeyId;

    @Value("${cloud.aws.credentials.secret-key}")
    private String secretKey;

    @Value("${cloud.aws.credentials.endpoint.uri}")
    private String endpointUrl;

    @Value("${cloud.aws.credentials.region.static}")
    private String region;

}
