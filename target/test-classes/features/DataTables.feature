@dataTable
Feature: Cucumber Data Tables implementation practice


  Scenario: List of fruits and vegetables I like
    Then user should see the list below
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | banana     |
      | pear       |
      | eggplant   |

  #Create a new scenario where we list the type of pets you love
  #Print out all the strings in the List


  Scenario: List of pets
    Then user should be able to see the list below
      | Dog      |
      | Cat      |
      | Panda    |
      | Koala    |
      | Kangaroo |
      | Horse    |
      | Hamster  |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Ivana       |
      | surname | Tune        |
      | age     | 30          |
      | address | somewhere   |
      | state   | Florida     |
      | zipcode | 33141       |
      | phone   | 111-111-111 |