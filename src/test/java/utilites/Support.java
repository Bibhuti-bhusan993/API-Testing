package utilites;

import io.restassured.path.json.JsonPath;

public class Support {

	public static JsonPath rawToJson(String response) {
		return new JsonPath(response);
	}

}
