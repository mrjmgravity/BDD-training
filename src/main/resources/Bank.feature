Feature: Bank

  Scenario: Bank account balance
    Given bank account with 1000 kc
    Then a user account balance is 1000 kc

  Scenario: Bank account transfer
    Given bank account with 500 kc
    When a user withdraw 250 kc
    And a user transfer 1250 kc to this account
    Then a user account balance is 1500 kc
