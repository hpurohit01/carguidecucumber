Feature: Search functionality
  As a user I want to search car by make and model

  @smoke
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on by+sell tab
    And I click Search Cars
    Then I navigate to "New & Used Car Search - carsguide"
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car Tab
    Then I should see the make "<make>" in result

    Examples:
      | make       | model     | location               | price   |
      | Audi       | A3        | NSW - All              | $30,000 |
      | BMW        | 2 Series  | NSW - New England      | $80,000 |
      | Honda      | CR-V      | NSW - Sydney           | $60,000 |
      | Hyundai    | I30       | NSW - Newcastle        | $40,000 |
      | Land Rover | Discovery | VIC - Central Victoria | $90,000 |
      | Nissan     | Qashqai   | SA - North             | $50,000 |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make “<make>”
    And I select model “<model>”
    And I select location “<location>”
    And I select price “<price>”
    And I click on Find My Next Car tab
    Then I should see the make “<make>” in results

    Examples:
      | make       | model     | location               | price   |
      | Audi       | A3        | NSW - All              | $30,000 |
      | BMW        | 2 Series  | NSW - New England      | $80,000 |
      | Honda      | CR-V      | NSW - Sydney           | $60,000 |
      | Hyundai    | I30       | NSW - Newcastle        | $40,000 |
      | Land Rover | Discovery | VIC - Central Victoria | $90,000 |
      | Nissan     | Qashqai   | SA - North             | $50,000 |

