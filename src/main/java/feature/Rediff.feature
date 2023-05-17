Feature: To validate the Login Functionality.

  Scenario: To validate the valid login
    Given User launches the application
    Then User clicks on SignIn
    Then  User enters username as "icttest@rediffmail.com" and password as "Test123$$"
    Then  User clicks on Login
    Then  Username displays in the Homepage
    Then Close the Application

    Scenario Outline: To validate the invalid login
      Given User launches the application
      Then  User clicks on SignIn
      Then  User enters username as "<Username>" and password as "<Password>"
      Then  User clicks on Login
      Then  Error message is displayed
      Then Close the Application
      Examples:
        |Username              |Password |
        |mkmk                  |         |
        |                      |mkmk     |
        |                      |         |
        |icttest@rediffmail.com| mkmk    |
        |mkmk                  |Test123$$|