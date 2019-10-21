@Hooks
Feature: Verify Register Page Title

    @XTP-003 @Smoke @Regression @Sade
  Scenario: Verify Register Page Title
    When I navigate to registration page
    Then I should see registration page displayed
