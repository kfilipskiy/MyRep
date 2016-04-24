import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import java.lang.AssertionError;

import static com.jayway.restassured.RestAssured.given;




public class MyTest {

    @Test
    public void createAppWithNonDefaultName() {

        RestAssured.baseURI = "https://api.heroku.com";

        JSONObject app = new JSONObject();
        app.put("name", "test2");

        app.toJSONString();

        given().
                header("Accept", "application/vnd.heroku+json; version=3").
                header("Content-Type", "application/json").
                header("Authorization", "Bearer 316634d7-1870-41db-b05d-c10d0ede5552").
                body("{ \"name\" : \"test\" }").
                when().
                post("/apps").
                then().
                statusCode(200);
    }
}


