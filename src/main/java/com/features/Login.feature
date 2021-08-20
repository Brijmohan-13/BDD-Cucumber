Feature: Web Application LoginPage Testing 

Scenario: Valid Login Test 

Given user should be on Login Page				#yellow warning means this step is not defined sepDef class
When user enter username and password 
And click on Login Button
Then user should be on HomePage

Scenario: Verify Error Message on wrong credentials 		#scenario

Given user should be on Login Page							#step means method in stefDef class
															# if POM is used,then steps are defined in Page class and they called in stepDef class(Test class)
															# so there will be 4 packages in the project-com.features,com.Pages.com.stepDef.com.Runner...see image from IMP snaps folder
When user enters wrong username and password 				#step
And click on Login Button									#step
Then Error message should be displayed						#step


	
#	Following are Cucumber-Gherkin keywords--->
#	Feature
#	Scenario
#	Given,When,Then,And,But,
#	Background
#	Scenario Outline
#	Examples


#	for meaningful sentences 
#	Given- is for preconditions
#	When-  is for actions
#	Then-  is for output
 
#	 keywords can be used multiple times in one scenario and in any order

#there can be multiple feature files in one project
#In feature file comments are added with # keyword since it is not a java file
