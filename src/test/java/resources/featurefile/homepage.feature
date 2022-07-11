Feature: UI testing of Tile filtering

  As a user I would like to filter the animals with life span to 40

  @Smoke
  Scenario: User navigates smart Client page and filter the search with tile filtering
    Given I click on tile and filtering
    When I select animal using letter "a"
    And I select life span to 40
    And I select "Life Span" from dropdown
    And I select checkbox to ascending
    Then I verify result contain more than 12 items

  @Regression
  Scenario: User navigates to smart Client page and filter the search with grid filtering
    Given I click on dropdown grid
    And when I select excercise from the dropdown
    Then I should able to select Excercise













