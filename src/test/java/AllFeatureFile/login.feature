Feature: End To End Flow OrangeHrm

  Scenario: Validate login functionality
    When user enter valid userName as "Admin" and password as "admin123"
    Then user click on login button
