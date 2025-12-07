package week1.day2.assignment;

public class Browser {

    // launch browser with given name
    public void launchBrowser(String browserName) {
        System.out.println("Browser Name is: " + browserName);
    }

    //load URL and return a message
    public String loadUrl() {
        return "Url loaded successfully";
    }

    //test Browser class
    public static void main(String[] args) {
        Browser bw = new Browser(); 	// create object
        bw.launchBrowser("Chrome");    // Launch browser
        String url = bw.loadUrl();    // Load URL and print the returned message
        System.out.println(url);
    }
}