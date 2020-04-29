$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/orangehrm/resources/featuresfiles/dashboard.feature");
formatter.feature({
  "line": 1,
  "name": "Dashboard feature",
  "description": "As a user I want to add employee",
  "id": "dashboard-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20997355900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to add employee page",
  "description": "",
  "id": "dashboard-feature;user-should-navigate-to-add-employee-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on pim button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on add button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am on add employee page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 582080400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 361948900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 166696000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 22964630600,
  "status": "passed"
});
formatter.match({
  "location": "DashboardSteps.iClickOnPimButton()"
});
formatter.result({
  "duration": 1119290800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardSteps.iClickOnAddButton()"
});
formatter.result({
  "duration": 133704200,
  "status": "passed"
});
formatter.match({
  "location": "DashboardSteps.iAmOnAddEmployeePage()"
});
formatter.result({
  "duration": 182301600,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Employee Information]\u003e but was:\u003c[Add Employee]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.orangehrm.cucumber.stepdefs.DashboardSteps.iAmOnAddEmployeePage(DashboardSteps.java:28)\r\n\tat ✽.Then I am on add employee page(src/test/java/com/orangehrm/resources/featuresfiles/dashboard.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 449163000,
  "status": "passed"
});
formatter.before({
  "duration": 12590337100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should add employee successfully",
  "description": "",
  "id": "dashboard-feature;user-should-add-employee-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on employee page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on add button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter firstname \"ravi\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter lastname \"mak\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.iAmOnEmployeePage()"
});
formatter.result({
  "duration": 23739216500,
  "status": "passed"
});
formatter.match({
  "location": "DashboardSteps.iClickOnAddButton()"
});
formatter.result({
  "duration": 20887140500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi",
      "offset": 19
    }
  ],
  "location": "DashboardSteps.iEnterFirstname(String)"
});
formatter.result({
  "duration": 185220900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mak",
      "offset": 18
    }
  ],
  "location": "DashboardSteps.iEnterLastname(String)"
});
formatter.result({
  "duration": 143649600,
  "status": "passed"
});
formatter.match({
  "location": "DashboardSteps.iClickOnSaveButton()"
});
formatter.result({
  "duration": 925652600,
  "status": "passed"
});
formatter.after({
  "duration": 47500,
  "status": "passed"
});
});