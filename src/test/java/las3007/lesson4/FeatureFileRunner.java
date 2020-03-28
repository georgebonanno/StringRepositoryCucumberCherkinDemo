package las3007.lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) // Framework to Run the tests
@CucumberOptions(
	strict = true, // undefined and pending steps should be treated as errors
	features = "src/test/resources" // path to feature files
)
public class FeatureFileRunner {
	
	
}


//command must execute
// command pddsf execute
// command should execute
