package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(tags = "",features ={"C:\\Users\\DEVI\\IdeaProjects\\BDD_Framework2\\src\\main\\java\\feature"} ,glue ={"stepDefinition"} ,plugin ={} )
    public class Runner extends AbstractTestNGCucumberTests {

    }
