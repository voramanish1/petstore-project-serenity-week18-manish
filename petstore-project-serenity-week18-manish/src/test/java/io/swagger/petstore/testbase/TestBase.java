package io.swagger.petstore.testbase;

import io.restassured.RestAssured;
import io.swagger.petstore.constants.Path;
import io.swagger.petstore.utils.PropertyReader;
import io.swagger.petstore.utils.TestUtils;
import org.junit.BeforeClass;

public class TestBase extends TestUtils {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.RESOURCE;
    }
}
