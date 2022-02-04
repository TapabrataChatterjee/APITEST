package BDD.Resources;

import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Helper {
    String baseURI = "https://rahulshettyacademy.com";
    String contentType = "application/json";
    String key = "key";
    String keyValue = "qaclick123";
    PrintStream logger;

    public RequestSpecification getNewRequest() throws Exception{
        logger = new PrintStream(new FileOutputStream("logs.txt"));
        RequestSpecification request = new RequestSpecBuilder().setBaseUri(baseURI).setContentType(contentType)
                .addQueryParam(key, keyValue)
                .addFilter(RequestLoggingFilter.logRequestTo(logger))
                .addFilter(ResponseLoggingFilter.logResponseTo(logger))
                .build();

        return request;

    }

    public ResponseSpecification createResponse()
    {
        
        ResponseSpecification response = new ResponseSpecBuilder()
        .build();
        return response;
    }

    


}
