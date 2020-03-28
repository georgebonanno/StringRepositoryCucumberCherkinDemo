package las3007.lesson4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRepository implements Repository {

	private final List<String> repoList = new ArrayList<>();
	
	@Override
	public boolean write(String entry) {
		return repoList.add(entry);
	}

	@Override
	public List<String> read() {
		//keep read-only
		return new ArrayList<>(repoList);
	}

}
