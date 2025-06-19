Feature: Bank

  Scenario: Bank account balance
    Given bank account with 1000 kc
    Then a user account balance is 1000 kc

  Scenario Outline: Bank account transfer
    Given bank account with <inicialBalance> kc
    When a user withdraw <withdrawAmount> kc
    And a user transfer <transferAmount> kc to this account
    Then a user account balance is <expectedBalance> kc

  Examples:
    | inicialBalance | withdrawAmount | transferAmount | expectedBalance |
    | 500            | 250            | 1250           | 1500            |
    | 1000           | 500            | 1000           | 1500            |
    | 2              | 1              | 1              | 2               |