

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class TestGETMethod {
	
	@Test(priority = 1)
	public void testStatusCode(){
		get("https://postman-echo.com/GET").then().statusCode(200);
	}
	
	@Test(priority = 2)
	public void testBody(){
		get("https://postman-echo.com/GET").then().assertThat()
               .body("headers.host", equalTo("postman-echo.com"));
	}
	
	@Test(priority = 3)
	public void testHeader(){
		get("https://postman-echo.com/GET").then()
               .header("Content-Encoding", "gzip");
	}
}
