Feature: Product Page Scenario

  Scenario Outline: Validate product info at product page


    Given User is logged in to the application
    Then The product listed with "<tittle>" and "<price>"
    Examples:
      | tittle                  | price  |
      | Sauce Labs Bolt T-Shirt | $15.99 |


  Scenario Outline: Validate Product into at Product Details page

    Given User is logged in to the application
    When User clicks on the product "<tittle>"
    Then The product details page is displayed
    And The product details page contains "<tittle>"  "<price>" and "<description>"
    Examples:
      | tittle                  | price  | description                     |
      | Sauce Labs Bolt T-Shirt | $15.99 | 100% Cotton, 200% Comfortable |
