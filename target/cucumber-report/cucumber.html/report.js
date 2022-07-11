$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "UI testing of Tile filtering",
  "description": "\nAs a user I would like to filter the animals with life span to 40",
  "id": "ui-testing-of-tile-filtering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6460373900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User navigates to smart Client page and filter the search with grid filtering",
  "description": "",
  "id": "ui-testing-of-tile-filtering;user-navigates-to-smart-client-page-and-filter-the-search-with-grid-filtering",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I click on dropdown grid",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "when I select excercise from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should able to select Excercise",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartClientStep.iClickOnDropdownGrid()"
});
formatter.result({
  "duration": 1966308499,
  "status": "passed"
});
formatter.match({
  "location": "SmartClientStep.whenISelectExcerciseFromTheDropdown()"
});
formatter.result({
  "duration": 230777300,
  "status": "passed"
});
formatter.match({
  "location": "SmartClientStep.iShouldAbleToSelectExcercise()"
});
formatter.result({
  "duration": 742572100,
  "status": "passed"
});
formatter.after({
  "duration": 618862699,
  "status": "passed"
});
});