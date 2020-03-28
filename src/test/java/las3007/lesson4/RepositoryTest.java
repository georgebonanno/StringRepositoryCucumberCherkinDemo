package las3007.lesson4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.stream.Stream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@ExtendWith(MockitoExtension.class)
public class RepositoryTest {
	private StrCollection strCollection = new StrCollection(new ArrayListRepository());
	String whenCalledValue="";
	
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Mock
	private StrCollection strCollection2; 
	
	
	@Test
	public void shouldCountMinusFromMock() {
		Mockito.when(strCollection2.count()).thenReturn(-1);
		System.out.println("hello "+strCollection2.count());
		assertEquals(strCollection2.count(), -1);
	}
	
	@Given("^I have (\\d+) strings in my collection$")
	public void given(int strNumber) {
		Stream.iterate(1, n -> n <= strNumber, n->n+1)
			.forEach(n -> strCollection.add(""+n));
		
	}
	
	@When("^I call ([^\\s]+)$")
	public void whenCalled(String method) {
		try {
			Method m =strCollection.getClass().getMethod(method);
			Object whenCalledValueOb=m.invoke(strCollection);
			whenCalledValue = Objects.toString(whenCalledValueOb,"null");
			System.out.println("when called value: "+whenCalledValue);
		} catch (Exception e) {
			throw new RuntimeException("error in invoking method: "+method,e);
		}
	}
	
	@Then("^I should get (.*)$")
	public void valueExcepted(String expectedValue) {
		assertEquals(""+whenCalledValue, expectedValue,"unexpected value");
	}
}
