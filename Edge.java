package week2.day3;

public class Edge extends BrowserSc {
	public void takeSnap() {
		System.out.println("Take the snap of the screen");
		
	}
	public void clearCookies() {
		System.out.println("Clear the Cookies");
		
	}
	public static void main(String[] args) {
		Edge ed = new Edge();
		ed.clearCookies();
		ed.takeSnap();
		System.out.println(ed.browserName);
		System.out.println(ed.browserVersion);
		ed.closeBrowser();
	}

}
