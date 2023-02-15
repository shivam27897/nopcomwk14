Feature: Computer page Test
  As a user i want to Test on computer page and and test on add cart with multiple data

  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When I click on computer tab
    Then I should navigate to result page

  Scenario:  verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktop
    Then I should navigate to desktop result page

  @computer
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktop
    And I click on Build your own computer
    And I select Processor "<processor>"
    And I select Ram "<ram>"
    And I select Hdd "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on Add to cart
    Then I should verify product added into cart or not
    Examples: Data Set
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |

