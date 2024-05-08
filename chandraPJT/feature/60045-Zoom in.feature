
Feature: 60045-Zoom in

  @60045_TC001
  Scenario: validating application login with valid data
    Given User open the browser
    And User open application
    When User enter username and password
    And User click login
    Then User validates orange hrm dashboard page is displayed
    
