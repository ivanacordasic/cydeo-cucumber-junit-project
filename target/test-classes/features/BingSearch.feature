
Feature: Bing search feature
  Agile story: As a user, when I am on the Bing Search page
  I should be able to search anything and see relevant results

  Scenario: Search and verify title
    Given user is on the Bing search page
    When user enters orange in the search box and presses enter
    Then user should be directed to a new page with title orange - Search

@Bing
  Scenario: Search and verify title
    Given user is on the Bing search page
    When user enters "orange" in the search box and presses enter
    Then user should be directed to a new page with title "orange - Search"

