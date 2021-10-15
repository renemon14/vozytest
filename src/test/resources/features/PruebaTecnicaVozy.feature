@vozy
Feature: Prueba Tecnica Vozy


  Scenario: Buy in sauce
    Given I want to navigate in the site: "SAUCE"
    And Login with user "standard_user", pass "secret_sauce"
    When Add to cart item
    Then Checkout and finish buy
    #And Validate message "THANK YOU FOR YOUR ORDER"