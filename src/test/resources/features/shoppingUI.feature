Feature: Ordering on Modern Store

  Background:
    Given user is on the Modern Store home page

  Scenario Outline: Successfully placing order on Modern Store
    When clicks on MEN on the primary menu items black label
    Then user is successfully navigated to MEN category
    And select sort by option average rating
    And select the item Yellow Hoodie
    When update quantity of Hoodie to "<quantity>" and add items to cart
    And navigate to shopping cart
    Then verify quantity of item is "10"
    When update shipping address "<country>" "<state>" "<city>" "<postcode>"
    Then verify shipping address got updated "<country>" "<state>" "<city>" "<postcode>"
    And proceed to checkout the order
    Then verify checkout message "<checkoutMessage>"
    Examples:
      | quantity | country | state   | city   | postcode | checkoutMessage                                    |
      | 10       | Germany | Bavaria | Munich | 80001    | modern-store.competethemes.com refused to connect. |


