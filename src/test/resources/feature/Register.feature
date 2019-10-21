@Hooks
Feature: Check Register Page is Opening

  @XTP-002 @Smoke
  Scenario: Check Register Page is Opening
    When I click on register link
    Then I should see registration form displayed

