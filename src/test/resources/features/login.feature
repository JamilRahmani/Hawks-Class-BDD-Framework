Feature: Login to Retail Website

# Each feature file starts with Feature Keyword and name for feature file.
# each senario starts with Scenario Key Word and : then name of senario 
#Given is used for precondition
#When is used for an action
#And is used for actions step following When Keyword
#Then is  used for expected result and writting assertions.
# Senario runs with provided data 
# Senario Outline runs same senario with multiple set of data and
# we use Example keyword to store the data to under it.
#we can write same steps N(infinity) times as long as they are the same(case sensitive, no extra space)
# but in step Defination we should have only one step associated with this step.
 
@smokeTest  @Regression  @endtoendTesting 
Scenario: Retail website Login test

Given user is on Retail website
When user click on Myaccount
And user click on Login option
And user enter userName 'eagles@tekschool.us' and password 'eagles'
And user click on Login button
Then user should be loged in to Myaccount dashboard


 @endtoendTesting 
Scenario Outline: Retail website Login test with multiple account

Given user is on Retail website
When user click on Myaccount
And user click on Login option
And user enter userName '<userName> ' and password '<password>'
And user click on Login button
Then user should be loged in to Myaccount dashboard


Examples:

|userNmae|password|
|eagles@tekschool.us|eagles|
|hawks@tekschool.us|hawks|
|falcons@tekschool.us|falcons|
