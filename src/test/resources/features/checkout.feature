Feature: Customer repository
  Scenario: Bewaar customer en vind met zelfde naam
    Given Een customer met naam "Yannis" bestaat
    When I search customer met naam "Yannis"
    Then I find 1 customer

  Scenario: Bewaar customer en vind customer niet met andere naam
    Given Een customer met naam "Frank" bestaat
    When I search customer met naam "Yannis"
    Then I find 0 customer