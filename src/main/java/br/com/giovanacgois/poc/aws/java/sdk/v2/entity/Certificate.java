package br.com.giovanacgois.poc.aws.java.sdk.v2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class Certificate {

    private String id;
    private String courseName;
    private String issuer;
    private long workload;
    private LocalDate conclusionDate;

    @DynamoDbPartitionKey //primary key
    @DynamoDbAttribute(value = "certificateId")
    public String getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public long getWorkload() {
        return workload;
    }

    public void setWorkload(long workload) {
        this.workload = workload;
    }

    public LocalDate getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(LocalDate conclusionDate) {
        this.conclusionDate = conclusionDate;
    }
}
