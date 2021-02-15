@Values_verification
Feature: User enter the values in page and verify the same

  @Values
  Scenario Outline: User enter the Values and Verification
    Given User is in value pages
    And User enters value1"<value1>"
    And User enters value2"<value2>" 
    And User enters value3"<value3>"
    And User enters value4"<value4>"
    And User enters value5"<value5>"
    Then User verify right count is appear on the screen
    Then User verify values on the screen is greather than zero
    Then User verify total balance "<Total_values>"
    Then User verify the formatted as currencies
    Then User verify the total balance matches the sum values "<Total_sum_values>"
    

    Examples: 
    
    |value1     |values2|value3     |value4    |value5 |Total_values |Total_sum_values|
    |$122,365.24|$599.00|$850,139.99|$23,329.50|$566.27|$1,000,000.00|$1,000,000.00   |
    
    
     