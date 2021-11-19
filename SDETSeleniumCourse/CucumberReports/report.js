$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Escenario1.feature");
formatter.feature({
  "line": 2,
  "name": "Login and go to admin menu",
  "description": "",
  "id": "login-and-go-to-admin-menu",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AdminMenu"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login to OrangeHRP Application",
  "description": "",
  "id": "login-and-go-to-admin-menu;login-to-orangehrp-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in orangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login to Application",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page is available",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Admin menu",
  "keyword": "And "
});
formatter.match({
  "location": "Escenario1.i_am_in_orangeHRP_Application()"
});
formatter.result({
  "duration": 5365146500,
  "status": "passed"
});
formatter.match({
  "location": "Escenario1.login_to_Application()"
});
formatter.result({
  "duration": 4121106900,
  "status": "passed"
});
formatter.match({
  "location": "Escenario1.dashboard_page_is_available()"
});
formatter.result({
  "duration": 129617400,
  "status": "passed"
});
formatter.match({
  "location": "Escenario1.click_on_Admin_menu()"
});
formatter.result({
  "duration": 4759778500,
  "status": "passed"
});
formatter.uri("Escenario2.feature");
formatter.feature({
  "line": 2,
  "name": "Validate page heading of Job dashboard",
  "description": "",
  "id": "validate-page-heading-of-job-dashboard",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@JobMenu"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "I am logged into Orange Application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "On home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Escenario2.on_home_page_of_application()"
});
formatter.result({
  "duration": 4108281400,
  "status": "passed"
});
formatter.match({
  "location": "Escenario2.i_enter_credentials()"
});
formatter.result({
  "duration": 3012374800,
  "status": "passed"
});
formatter.match({
  "location": "Escenario2.i_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 59686500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Title of your scenario",
  "description": "",
  "id": "validate-page-heading-of-job-dashboard;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@JobTitle"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I click on Admin link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on Job",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Validate text in Job title",
  "keyword": "And "
});
formatter.match({
  "location": "Escenario2.i_click_on_Admin_link()"
});
formatter.result({
  "duration": 1415540000,
  "status": "passed"
});
formatter.match({
  "location": "Escenario2.click_on_Job()"
});
formatter.result({
  "duration": 174448200,
  "status": "passed"
});
formatter.match({
  "location": "Escenario2.validate_text_in_Job_title()"
});
formatter.result({
  "duration": 47141600,
  "status": "passed"
});
formatter.uri("OtherScenarios.feature");
formatter.feature({
  "line": 3,
  "name": "Browse Orange Application Options",
  "description": "",
  "id": "browse-orange-application-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Navigate to Admin page of OrangeHRP Application",
  "description": "",
  "id": "browse-orange-application-options;navigate-to-admin-page-of-orangehrp-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@NavigateToAdmin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in orangeHRP",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on Admin tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see System Users page heading",
  "keyword": "Then "
});
formatter.match({
  "location": "OtherScenarios.i_am_in_orangehrp()"
});
formatter.result({
  "duration": 6989133299,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.click_on_Admin_tab()"
});
formatter.result({
  "duration": 1289819000,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.i_see_System_Users_page_heading()"
});
formatter.result({
  "duration": 39032000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Navigate to PIM page of OrangeHRP Application",
  "description": "",
  "id": "browse-orange-application-options;navigate-to-pim-page-of-orangehrp-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@NavigateToPIM"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am in orangeHRP",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on PIM tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I see Employee Information page heading",
  "keyword": "Then "
});
formatter.match({
  "location": "OtherScenarios.i_am_in_orangehrp()"
});
formatter.result({
  "duration": 7978404600,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.click_on_PIM_tab()"
});
formatter.result({
  "duration": 1112842900,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.i_see_Employee_Information_page_heading()"
});
formatter.result({
  "duration": 43979801,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Navigate to Leave page of OrangeHRP Application",
  "description": "",
  "id": "browse-orange-application-options;navigate-to-leave-page-of-orangehrp-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@NavigateToLeave"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am in orangeHRP",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Click on Leave tab",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I see Leave List page heading",
  "keyword": "Then "
});
formatter.match({
  "location": "OtherScenarios.i_am_in_orangehrp()"
});
formatter.result({
  "duration": 6794030300,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.click_on_Leave_tab()"
});
formatter.result({
  "duration": 1412506900,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.i_see_Leave_List_page_heading()"
});
formatter.result({
  "duration": 68560800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Navigate to Time page of OrangeHRP Application",
  "description": "",
  "id": "browse-orange-application-options;navigate-to-time-page-of-orangehrp-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@NavigateToTime"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I am in orangeHRP",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Click on Time tab",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I see Select Employee page heading",
  "keyword": "Then "
});
formatter.match({
  "location": "OtherScenarios.i_am_in_orangehrp()"
});
formatter.result({
  "duration": 6686672500,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.click_on_Time_tab()"
});
formatter.result({
  "duration": 798135800,
  "status": "passed"
});
formatter.match({
  "location": "OtherScenarios.i_see_Select_Employee_page_heading()"
});
formatter.result({
  "duration": 60395499,
  "status": "passed"
});
});