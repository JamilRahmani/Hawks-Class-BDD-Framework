 Feature: Register new user
 \
 
 
 @RegisterTest
 Scenario: Creat new user acount in Test Test Environment
 Given user is on Retail website
When user click on Myaccount
And user click on Register 
And user fill registration form with below information
|firstName|lastName|email|telephone|password|passwordConfirm|subscribe|
|Jolia|John|jolia@gmail.com|2021011123|WrongPass|yes|
And user agree to privacy and policy
And user click on continie button 
Then user should see successful message'Your Account Has Been Created'

































 