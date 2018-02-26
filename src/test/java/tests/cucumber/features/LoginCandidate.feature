@Candidate
Feature: Candidate Successful Login Feature

  Scenario: Login the app successfully as a candidate
    Given I have skipped Splash and Tutorial pages and I am on the job selection pages
    When I click İs Ariyorum button
    And I go to Profilim page
    And I click Giris Yap button
    And I fill "5910000010" as my telephone number
    And I click Giriş Yap button
    And I give permission for SMS
    And I fill "35880" as a login code
    And I click Tamam button
    Then I should see my profile page