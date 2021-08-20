package com.runner;

//copy below 4/5 line code always

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(	
	features="src/main/java/com/feature",			//path of feature file package
	glue= "com.stepDefs",							//path of stepDef class package
    format= {"pretty","html:test-output"},			//format(deprecated word) is for report generation."pretty" is a keyword.Report is in HTML format.test-output is folder name.
	monochrome= true,						//for proper output on console
	
	dryRun=true		)						//dryRun=true---it is used to compile steps in feature file----it generates snippet in the Console for the step definition 
											//this snippet is pasted in steDef class and we define in it)
											//after steps defined in stepDefinition class we should make dryRun=false---now code runs---launches chrome browser
											//by default druRun is false
											
public class TestRunner {
	//There will be only one runner class in Project
		//Runner class runs with cucumber class along with above 4 options
		//create com.stepDefination package and create class in it
		
		//Add Junit library--->right click in Runner class--->Run as a Junit--->with dryRun=true it generates snippet for code  definition
	
		//At line 12, we have given package name of feature files........so
		//If any feature file is added in future then run this class again with dryRun=true,then snippet on the console like (2 skipped, 4 undefined)
		//then those undefined method's snippet can be pasted in respective stepDef.These methods are defined.
	
	
	//EXECUTION FLOW OF BDD Cucumber Framework
	//When runner is run,control goes to feature file
	//control goes to Scenarios and according to steps mentioned in scenarios,it finds the definition of the steps in the stepDef file
	//scenario sequence will same as it is written	(no priority concept like in TestNG)
	//it finds  steps definition in entire package (com.stepDefinition)...package name is mentioned on line 13
	
	//by default,runner class will run all feature files
	//tags are used to run specific feature file/specific scenario...see image from IMP snaps folder
	
	//@Before and @After are Hooks of cucumber
	//@Before and @After---browser opening/closing code is written in it...it will open/close browser after every scenario
	//if these hooks are tagged then these hooks will run for scenarios which have same tags
	
	//****************BDD cucumber framework is mostly used with POM design pattern...see image from IMP snaps folder
	
	
	
	
	
}
