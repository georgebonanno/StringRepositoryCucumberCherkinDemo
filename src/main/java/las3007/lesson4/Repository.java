package las3007.lesson4;

import java.util.List;

public interface Repository {

	public boolean write(String entry);
	public List<String> read();
}
