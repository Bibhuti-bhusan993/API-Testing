package resources;

public class NestedJsonBody {

	public static String nestedJsonBody() {
		return "{\r\n" + "\"dashboard\": {\r\n" + "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n" + "},\r\n" + "\"courses\": [\r\n" + "{\r\n"
				+ "\"title\": \"Selenium Python\",\r\n" + "\"price\": 50,\r\n" + "\"copies\": 6\r\n" + "},\r\n"
				+ "{\r\n" + "\"title\": \"Cypress\",\r\n" + "\"price\": 40,\r\n" + "\"copies\": 4\r\n" + "},\r\n"
				+ "{\r\n" + "\"title\": \"RPA\",\r\n" + "\"price\": 45,\r\n" + "\"copies\": 10\r\n" + "}\r\n" + "]\r\n"
				+ "}\r\n" + "";
	}

	public static String nestedJson2() {
		return "{\r\n" + "  \"name\": {\r\n" + "    \"name\": \"Bibhuti\",\r\n" + "    \"age\": 27,\r\n"
				+ "    \"weight\": \"78\"\r\n" + "  },\r\n" + "  \"bikes\": [\r\n" + "    {\r\n"
				+ "      \"company\": \"Honda\",\r\n" + "      \"models\": [\r\n" + "        \"CBR\",\r\n"
				+ "        \"Shine\",\r\n" + "        \"activa\"\r\n" + "      ],\r\n" + "      \"price\": [\r\n"
				+ "        100,\r\n" + "        200,\r\n" + "        300\r\n" + "      ]\r\n" + "    }\r\n" + "  ],\r\n"
				+ "  \"cars\": [\r\n" + "    {\r\n" + "      \"company\": \"BMW\",\r\n" + "      \"models\": [\r\n"
				+ "        \"X3\",\r\n" + "        \"X2\",\r\n" + "        \"X1\",\r\n" + "        \"Z4\"\r\n"
				+ "      ],\r\n" + "      \"price\": [\r\n" + "        150,\r\n" + "        250,\r\n"
				+ "        350,\r\n" + "        450\r\n" + "      ]\r\n" + "    }\r\n" + "  ]\r\n" + "}";
	}

}
