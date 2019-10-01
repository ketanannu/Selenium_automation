$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature3.feature");
formatter.feature({
  "line": 2,
  "name": "Ideaboard",
  "description": "",
  "id": "ideaboard",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ShopSuite"
    }
  ]
});
foformatter.before({
  "duration": 36707726061,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify brand page is working fine",
  "description": "",
  "id": "brandpages;verify-brand-page-is-working-fine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Brandpages"
    },
    {
      "line": 4,
      "name": "@Run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch browser",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Go to shop brand page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on brand logo and link and verify user is redirected to correct page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination_brand_pages.read_brand_title()"
});
formatter.result({
  "duration": 151932122,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_brand_pages.Go_to_shop_brand_page()"
});
formatter.result({
  "duration": 9991003152,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_brand_pages.Click_on_brand_logo_and_link()"
});
formatter.result({
  "duration": 150formatter.result({
  "duration": 30245202909,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_Ideaboard.add_prod_from_pdp()"
});
formatter.result({
  "duration": 56451714424,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_Ideaboard.add_product_from_plp()"
});
formatter.result({
  "duration": 57493420122,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_Ideaboard.add_more_product()"
});
formatter.result({
  "duration": 84924234182,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination_Ideaboard.add_3more_product_from_pdp()"
});
formatter.result({
  "duration": 66607274182,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d77.0.3865.90)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 6.11 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027WL2781-0044148\u0027, ip: \u0027172.17.19.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:52801}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e), userDataDir\u003dC:\\windows\\TEMP\\scoped_dir30408_22874}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d77.0.3865.90, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 4776a15131bdd14cfc6276bd5ac39578\n*** Element info: {Using\u003dxpath, value\u003d//button[@class\u003d\u0027input-button Button_5b9DYQ activePressed Button_3G2SkB SelectIdeaboardList_6PFlfS ml1\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat Selenium.Cucumber.StepDefination_Ideaboard.add_3more_product_from_pdp(StepDefination_Ideaboard.java:110)\r\n\tat ✽.And Add few more product to ideaboard from PLP(feature3.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination_Ideaboard.writereview()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 6110045090,
  "status": "passed"
});
});