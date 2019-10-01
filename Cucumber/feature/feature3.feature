@ShopSuite
Feature: Ideaboard

  @Ideaboard @Run
  Scenario: Verify user is able to create Ideaboard and add product to IB

	When Create Ideaboard
  Then Add product to ideaboard from PDP
  And Add product to ideaboard from PLP
  Then Add more product
  And Add few more product to ideaboard from PLP
  Then Verify for non loggedin user unable to add more than 4 product without log in



    