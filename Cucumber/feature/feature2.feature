@ShopSuite
Feature: Brandpages

  @Brandpages @Run
  Scenario: Verify brand page is working fine
    When Launch browser
    Then Go to shop brand page
    And Click on brand logo and link and verify user is redirected to correct page
