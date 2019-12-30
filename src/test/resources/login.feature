
  Feature: Login

    @test
    Scenario Outline: login successfully with valid credentials
      Given as a user I am on homepage
      When I click on sign in page
      Then I navigate to sign in page
      When I enter email address as "<emailId>"
      And I enter password as "<password>"
      And I click on Sign In button
      Then I sign in successfully

      Examples:
      |emailId|password|
      |test1234@gmail.com|Gujarat123|