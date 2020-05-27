package resources;

public class AddPlacePayLoad {

	static String location = "123456";

	public static String addplaceBody() {
		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": " + location + ",\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n" + "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n" + "  ],\r\n" + "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "";
	}

	public static String updatePlaceBody(String placeId, String placeName) {
		return "{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + placeName + "\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "";
	}

	public static String deletePlaceBody(String placeId) {
		return "{\r\n" + "    \"place_id\":\"" + placeId + "\"\r\n" + "}\r\n" + "";
	}

}
