Feature: Google search

  Scenario: Searching for 'cucumber' includes the Cucumber.io website in the search results
    Given I am viewing the Google home page
    When I submit a search for 'cucumber'
    Then the search is performed
    And the Cucumber.io website is included on the first page of results
