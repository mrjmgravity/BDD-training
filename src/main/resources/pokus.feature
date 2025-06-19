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

    Scenario: Kalkulacka - delenie dvoch cisiel
      Given Uzivatel ma zadane dve cisla 8 a 2
      When Uzivatel vydeli tieto cisla
      Then Uzivatel vidi na kalkulacke vysledok 4



    Scenario Outline: Kalkulacka - viac scenarov scitania
      Given Uzivatel ma zadane dve cisla <prveCislo> a <druheCislo>
      When Uzivatel scita tieto cisla
      Then Uzivatel vidi na kalkulacke vysledok <vysledok>

      Examples:
        | prveCislo | druheCislo | vysledok |
        | 120       | 24         | 144      |
        | 10        | 10         | 20       |
        | 5000      | 1000       | 6000     |