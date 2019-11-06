$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features.feature");
formatter.feature({
  "line": 2,
  "name": "WriteAReview",
  "description": "",
  "id": "writeareview",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ShopSuite"
    }
  ]
});
formatter.before({
  "duration": 54110488135,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify that if there is no rating and reivew available for a product then \" Write the first reivew\" link should be displayed on TOP of the PDP and loggedin user can submit his review by clicking on that particular link.",
  "description": "",
  "id": "writeareview;verify-that-if-there-is-no-rating-and-reivew-available-for-a-product-then-\"-write-the-first-reivew\"-link-should-be-displayed-on-top-of-the-pdp-and-loggedin-user-can-submit-his-review-by-clicking-on-that-particular-link.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@WriteAReview"
    },
    {
      "line": 4,
      "name": "@Run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Signin",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search Product",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Write Review",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Review Submit",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Write_a_Review.signin()"
});
formatter.result({
  "duration": 21271764585,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Write_a_Review.search_product()"
});
formatter.result({
  "duration": 16001037090,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Write_a_Review.writereview()"
});
formatter.result({
  "duration": 65629071390,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_Write_a_Review.reviewSubmit()"
});
formatter.result({
  "duration": 4049981043,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 314043332,
  "status": "passed"
});
});