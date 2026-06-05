Feature: Parking fee calculation

  Scenario: Free parking period
    Given a vehicle stayed for 30 minutes
    When the parking fee is calculated
    Then the total amount should be 0

  Scenario: First billable hour
    Given a vehicle stayed for 31 minutes
    When the parking fee is calculated
    Then the total amount should be 500

  Scenario: VIP customer
    Given a vehicle stayed for 91 minutes
    And the customer is VIP
    When the parking fee is calculated
    Then the total amount should be 800

  Scenario: Daily cap
    Given a vehicle stayed for 2000 minutes
    When the parking fee is calculated
    Then the total amount should be 12000