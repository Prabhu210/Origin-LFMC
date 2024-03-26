Feature: To validate Origin DashBoard

  @Regression
  Scenario Outline: Validate Origin Mapping functionality
    Given the user launches the Origin Dashboard through Chrome Browser
    When the user clicks on Code Mapping and selects Testing company from the Dropdown option
    When Enter aa as "<a>" and bb as "<b>" and cc as "<c>" and dd as "<d>"and ee as "<e>"
    And the user clicks the Submit Button
    Then the user should receive a mapping successful message
    Examples:
    |a|b|c|d |e |
	|AutomationTestmarch25 | 1|2| 10|1000|


  @Regression
  Scenario: Validate Origin Demapping functionality
    Given the user launches the Origin Dashboard through Chrome Browser
    When the user clicks on the History module
    And the user validates whether the mapping has occurred or not
    And the user performs demapping
    Then the user should receive a demapping successful message
