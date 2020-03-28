package las3007.lesson4;

import java.util.List;

public class StrCollection {

	private Repository repo;
	
	public StrCollection(Repository repo) {
		this.repo = repo;
	}
	
	public boolean add(String entry) {
		return repo.write(entry);
	}
	
	public int count() {
		return repo.read().size();
	}
	
	public String getLastEntry() {
		List<String> allEntries = repo.read();
		if (allEntries == null || allEntries.isEmpty())
			return null;
		else
			return allEntries.get(allEntries.size()-1); 
	}
	
	public List<String> getAll() {
		return repo.read();
	}
}
