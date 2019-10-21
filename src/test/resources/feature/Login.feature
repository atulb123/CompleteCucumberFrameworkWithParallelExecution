@Hooks
Feature: Check Login Functionality is Working

  @XTP-001 @Smoke @Regression
  Scenario: Check Login Functionality is Working
    Given I am a Valid user
    When I login to application
    Then I should see logout option

