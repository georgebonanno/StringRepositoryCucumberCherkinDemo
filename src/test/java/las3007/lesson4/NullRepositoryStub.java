package las3007.lesson4;

import java.util.List;

public class NullRepositoryStub implements Repository {

	@Override
	public List<String> read() {
		return null;
	}

	@Override
	public boolean write(String entry) {
		return false;
	}
}
