import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class BTM {
	static int totalCount;
	int count;
	void swipe() {
		totalCount++;
		count++;
	}
	int getCount() {
		return count;
	}
	int getTotalCount() {
		return totalCount;
	}

}
