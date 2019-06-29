Feature: Login

@multiple
Scenario Outline: Successful login to the page

Given I navigate to mail.google.com page
And I provide username as <username>
And I click the next button
And I provide password as <password>
And  I click again the next button
Then it is opened main page.

Examples:

|   username              | password |
| 1401test2705@gmail.com  | 1401198n |
| 1234454n@gmail.com      | 1401198n |
| 3242123n@gmail.com      | 1401198n |
| 4323234n@gmail.com      | 2705197n |
| 4225643n@gmail.com	  | 2705197n |
