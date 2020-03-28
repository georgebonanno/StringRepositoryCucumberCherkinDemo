Feature: collection / repository demo

  Scenario: Empty collection
    Given I have 0 strings in my collection
    When I call getLastEntry
    Then I should get null

  Scenario: One item
    Given I have 1 strings in my collection
    When I call getLastEntry
    Then I should get 1
  
  Scenario: Two items
    Given I have 2 strings in my collection
    When I call getLastEntry
    Then I should get 2
    When I call count
    Then I should get 2
    When I call getAll
    Then I should get [1, 2]
    
  Scenario: Five items
    Given I have 5 strings in my collection
    When I call getLastEntry
    Then I should get 5
    When I call count
    Then I should get 5
    When I call getAll
    Then I should get [1, 2, 3, 4, 5]