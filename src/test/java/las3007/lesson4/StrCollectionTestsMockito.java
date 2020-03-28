package las3007.lesson4;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class StrCollectionTestsMockito {

	@Test
	void testNullReadRepository() {
		Repository nullRead = Mockito.mock(Repository.class);
		Mockito.when(nullRead.write(Mockito.anyString())).thenReturn(false);
		Mockito.when(nullRead.read()).thenReturn(null);
		StrCollection collection = new StrCollection(nullRead);
		
		assertNull(collection.getLastEntry(), "No Crash on null from repo.read()");
		
		assertFalse(collection.add("hello"),"should not write");
		assertNull(collection.getLastEntry(), "No Crash on null from repo.read()");
	}
	
	

}
