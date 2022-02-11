package BDD.Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Helper {
    String baseURI;
    String contentType = "application/json";
    String key = "key";
    String keyValue = "qaclick123";
    PrintStream logger;

    public RequestSpecification getNewRequest() throws Exception {
        logger = new PrintStream(new FileOutputStream("logs.txt"));
        baseURI = "baseURL";
        RequestSpecification request = new RequestSpecBuilder().setBaseUri(getbaseURL(baseURI)).setContentType(contentType)
                .addQueryParam(key, keyValue).addFilter(RequestLoggingFilter.logRequestTo(logger))
                .addFilter(ResponseLoggingFilter.logResponseTo(logger)).build();

        return request;

    }

    public ResponseSpecification createResponse() {

        ResponseSpecification response = new ResponseSpecBuilder().build();
        return response;
    }

    public static String getbaseURL(String baseURI) throws IOException
    {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/java/BDD/Resources/global.properties");

        properties.load(fileInputStream);

        String baseURL=properties.getProperty(baseURI);

        return baseURL;
        



    }



    


}
