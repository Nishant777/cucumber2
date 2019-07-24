package Nishant_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber .class)
@CucumberOptions(features="MYDEMODDC2FEATURES",glue="ddc2mystepdefinations",tags= {"@regression, @smoke"},
plugin={"html:target/cucumber-htmlreport.html"})
public class myrunner {

}
