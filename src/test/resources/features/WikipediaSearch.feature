@wikipedia
Feature: Wikipedia search functionality
  Agile story: As a user, when I am on the Wikipedia Search page
  I should be able to search anything and see relevant results

  Scenario: Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks search button
    Then user sees "Steve Jobs" in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks search button
    Then user sees "Steve Jobs" in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks search button
    Then user sees "Steve Jobs" in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality with Scenario Outline
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks search button
    Then user sees "<expectedTitle>" in the wiki title
    Then user sees "<expectedMainHeader>" in the main header
    Then user sees "<expectedImageHeader>" in the image header

    @ceos
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Nikola Tesla    | Nikola Tesla    | Nikola Tesla       | Nikola Tesla        |


