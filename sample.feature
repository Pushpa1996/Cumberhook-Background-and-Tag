Feature: Sample Testing

Background:
When  user enter url "https://artoftesting.com/sampleSiteForSelenium"
@positive @Smoke
Scenario: Samplepage Sumbit

When  user enter value in text field " This is sample"
And  user click sumbit button
@Negative
Scenario: To genaerate alert box
When : user click alert box
And : user click generate confirm box


