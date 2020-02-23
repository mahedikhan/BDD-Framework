$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Mahtab/eclipse-workspace/auto/src/main/java/auto/com/feature/auto.feature");
formatter.feature({
  "line": 1,
  "name": "AutoTReader HomePage Functionality",
  "description": "",
  "id": "autotreader-homepage-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify HomePage Elements are present",
  "description": "",
  "id": "autotreader-homepage-functionality;verify-homepage-elements-are-present",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on AutoTrader HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Browse by Make is present",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Browse by Style is present",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Advanced Search is present",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Search button is present",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Drop Downs make and model is present",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_already_on_AutoTrader_HomePage()"
});
formatter.result({
  "duration": 15696666700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Browse_by_Make_is_present()"
});
formatter.result({
  "duration": 2045997500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.browse_by_Style_is_present()"
});
formatter.result({
  "duration": 103663900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Advanced_Search_is_present()"
});
formatter.result({
  "duration": 550351800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.search_button_is_present()"
});
formatter.result({
  "duration": 297727700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.drop_Downs_make_and_model_is_present()"
});
formatter.result({
  "duration": 1338387300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verify Advanced Search Functionality",
  "description": "",
  "id": "autotreader-homepage-functionality;verify-advanced-search-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is on AdvancedSearch Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter \"\u003czipcode\u003e\" in text box",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user select certified checkbox under condition",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user select convertible checkbox under style",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user select from year to year",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select make, model and trim section",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click search button",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "autotreader-homepage-functionality;verify-advanced-search-functionality;",
  "rows": [
    {
      "cells": [
        "zipcode"
      ],
      "line": 23,
      "id": "autotreader-homepage-functionality;verify-advanced-search-functionality;;1"
    },
    {
      "cells": [
        "30004"
      ],
      "line": 24,
      "id": "autotreader-homepage-functionality;verify-advanced-search-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Verify Advanced Search Functionality",
  "description": "",
  "id": "autotreader-homepage-functionality;verify-advanced-search-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is on AdvancedSearch Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enter \"30004\" in text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user select certified checkbox under condition",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user select convertible checkbox under style",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user select from year to year",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select make, model and trim section",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_AdvancedSearch_Page()"
});
formatter.result({
  "duration": 19236778900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30004",
      "offset": 12
    }
  ],
  "location": "StepDefinition.user_enter_in_text_box(String)"
});
formatter.result({
  "duration": 3341182200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_certified_checkbox_under_condition()"
});
formatter.result({
  "duration": 12804555000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_convertible_checkbox_under_style()"
});
formatter.result({
  "duration": 329538500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_from_year_to_year()"
});
formatter.result({
  "duration": 4563601900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_make_model_and_trim_section()"
});
formatter.result({
  "duration": 15253556200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_search_button()"
});
formatter.result({
  "duration": 30222436700,
  "status": "passed"
});
});