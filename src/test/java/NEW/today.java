package NEW;

import org.testng.annotations.Test;

class today {

	@Test(groups= "Regression")
	public void todaytest1st() {
		System.out.println("1st test");
	}
	@Test
	public void todaytest2nd() {
		System.out.println("2nd test");
	}
	@Test(groups= "Regression")
	public void todaytest3rd() {
		System.out.println("3rd test");
	}
}
