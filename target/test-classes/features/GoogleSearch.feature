@googleSearch
Feature: Google search functionality
  Agile story: As a user, when I am on the Google Search page
  I should be able to search anything and see relevant results

  Background: user is on Google search page
    When user is on the Google search page

  Scenario: Search page default title verification
    Then user should see title is Google

    @wip_Ivana
  Scenario: Search result title verification
    When user enters apple in the search box and press Enter
    Then user should be directed to a new page with apple – Google Search title