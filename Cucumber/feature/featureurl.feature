@ShopSuite
Feature: Url

  @Url @run
  Scenario Outline: Login Data Driven
    When User opens new "<urls>"

    Examples: 
      | urls                             |
      | https://www.buybuybaby.com       |
      | https://www.bedbathandbeyond.com |
      | https://www.bedbathandbeyond.ca  |
