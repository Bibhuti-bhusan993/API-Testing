package stepdefinations;

import org.testng.Assert;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import resources.NestedJsonBody;
import utilites.Support;

public class NestedJson {

	@Given("User get data from {string}")
	public void user_hit_GET_API(String scenario) {
		System.out.println(scenario);
		if(scenario  .equals("nestedJosn")){
			JsonPath js = Support.rawToJson(NestedJsonBody.nestedJsonBody());
			System.out.println(js.getInt("courses.size()"));
			System.out.println(js.getInt("dashboard.purchaseAmount"));
			System.out.println(js.getString("courses[0].title"));
			int sum = 0;
			for (int i = 0; i < js.getInt("courses.size()"); i++) {
				System.out.println(js.getString("courses[" + i + "].title"));
				System.out.println(js.getInt("courses[" + i + "].price"));
				if (js.getString("courses[" + i + "].title").equals("RPA")) {
					System.out.println(js.getString("courses[" + i + "].copies"));
				}

				sum = sum + js.getInt("courses[" + i + "].price") * js.getInt("courses[" + i + "].copies");
			}
			Assert.assertEquals(sum, js.getInt("dashboard.purchaseAmount"));

		}
		else{
			JsonPath js = Support.rawToJson(NestedJsonBody.nestedJson2());
			System.out.println(js.getString("name.name"));
			System.out.println(js.getInt("bikes.size()"));
			System.out.println(js.getString("bikes[0].models.size()"));
			System.out.println(js.getString("bikes[0].price.size()"));
		}
	}
	}


