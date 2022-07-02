import com.google.common.base.Strings;

public class Calculator {

	String name;
	/**
	 * 
	 * @param name
	 */
	public Calculator(final String name) {
		
		if (Strings.isNullOrEmpty(name)) {
			this.name = "Standard";
		} else {
			this.name = name;
		}
	}
	

	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int add(int x, int y) {
		if (x < 0 || y < 0) {
			throw new RuntimeException("wrong");
		}
		
		return x + y;
	}
	
	public long getTomorrowInMill() {
		return System.currentTimeMillis() + 24 * 60 * 60 * 1000;
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator("Mohamed");
		System.out.println(cal.name);
		System.out.println(cal.add(4, 6));
	}
}
