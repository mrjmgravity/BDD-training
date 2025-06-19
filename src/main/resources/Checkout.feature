Feature:

  #REQ-001
  Scenario: Checkout banana
    Given the price of "banana" 35c
    When user checkout "banana" 2
    Then the total price should be 90c