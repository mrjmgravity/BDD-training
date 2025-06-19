Feature: pokus

  Scenario: Pokusny test 1
    Given nastaveni zaciatocnych podmienok
    And dalsi nastavovaci krok
    When toto je nejaka akcia
    And toto je dalsia akcia
    Then overenie vysledku

    Scenario: Pokusny test 2
      Given nastaveni zaciatocnych podmienok
      When toto je dalsia akcia
      Then overenie vysledku
