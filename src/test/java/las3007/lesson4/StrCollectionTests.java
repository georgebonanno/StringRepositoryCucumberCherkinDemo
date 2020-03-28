package las3007.lesson4;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class StrCollectionTests {

	@Test
	void testNullReadRepository() {
		Repository nullRead = new NullRepositoryStub();
		StrCollection collection = new StrCollection(nullRead);
		
		assertNull(collection.getLastEntry(), "No Crash on null from repo.read()");
	}

}
