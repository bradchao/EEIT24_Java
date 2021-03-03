package tw.brad.myclass;

public class TWId {
	private String id;
	public TWId() {
		
	}
	public TWId(boolean isMale) {
		
	}
	public TWId(int area) {
		
	}
	public TWId(boolean isMale, int area) {
		
	}
	
	public static boolean checkID(String id) {
		// A123456789
		boolean ret = false;
		if (id.matches("[A-Z][12][0-9]{8}")) {
			ret = true;
		}
		return ret;
	}
}
