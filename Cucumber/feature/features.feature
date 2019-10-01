@ShopSuite
Feature: WriteAReview

  @WriteAReview @Run
  Scenario: Verify that if there is no rating and reivew available for a product then " Write the first reivew" link should be displayed on TOP of the PDP and loggedin user can submit his review by clicking on that particular link.
    Given Signin
    Then Search Product
    Then Write Review
    Then Review Submit
    
    
 