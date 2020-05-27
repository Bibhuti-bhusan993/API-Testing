$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/mockJson.feature");
formatter.feature({
  "name": "Verify MOCK josn",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get all data from nested JSON array",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User get data from \"nestedJosn\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.NestedJson.user_hit_GET_API(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get data from \"nestedJosn2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.NestedJson.user_hit_GET_API(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});