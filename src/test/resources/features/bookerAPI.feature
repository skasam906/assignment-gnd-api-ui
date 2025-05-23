Feature: Restful-booker Create Booking operation check
  user should be able to perform create booking operation

  Scenario Outline:Verify create booking operation on Restful-booker application
    Given user create a token for booking providing username "<username>" password "<password>"
    Then create a new booking providing "<firstname>" "<lastname>" "<total price>" "<deposit paid>" "<additional needs>" "<checkin>" "<checkout>"
    Then verify that the booking is created successfully
    When user delete the booking
    Then verify that the booking is deleted successfully
    Examples:
      | username | password    | firstname | lastname | total price | deposit paid | additional needs | checkin    | checkout   |
      | admin    | password123 | Srikanth  | Kasam    | 230.44      | true         | Breakfast        | 2025-06-01 | 2025-06-25 |