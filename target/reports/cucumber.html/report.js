$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TechFiosLogin.feature");
formatter.feature({
  "name": "TechFios todo list validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to set on the SkyBlue background color",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "name": "User is on the todo list page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.User_is_on_the_todo_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Set SkyBlue Background color",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.User_click_on_Set_SkyBlue_Background_color()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change to the SkyBlue Background color",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_change_to_the_SkyBlue_Background_color()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to set on the White background color",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "name": "User is on the todo list page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.User_is_on_the_todo_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Set SkyWhite Background color",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_Set_SkyWhite_Background_color()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change to the SkyWhite Background color",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_change_to_the_SkyWhite_Background_color()"
});
formatter.result({
  "status": "passed"
});
});