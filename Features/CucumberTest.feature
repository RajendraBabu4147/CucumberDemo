@FunctionalTest
Feature: Sample Application
How to ignore some scenarios and run what we need

@SmokeTest @RegressionTest
Scenario: Successfull Login
Given This is a blank test

@RegressionTest
Scenario: Unsuccessfull Login
Given This is a blank test

@SmokeTest
Scenario: Add product to cart
Given This is a blank test


Scenario: Add multiple products to cart
Given This is a blank test

@SmokeTest @RegressionTest
Scenario: Remove products from cart
Given This is a blank test

@RegressionTest
Scenario: Remove all products from cart
Given This is a blank test

@SmokeTest
Scenario: Product quantity from cart page
Given This is a blank test


Scenario: Decrease products quantity from cart
Given This is a blank test

@SmokeTest @E2ETest
Scenario: Buy product with cash payment
Given This is a blank test

@SmokeTest @E2ETest
Scenario: Buy product with CC payment
Given This is a blank test

@E2ETest
Scenario Outline: Payment Declined
Given This is a blank test

Examples: 
| Payment Method |
| CC |
| DC |
| Net Banking |
| Wallet |
