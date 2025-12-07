package week1.day2.assignment;

public class EdgeBrowser {

 public static void main(String[] args) {
     
     Browser browser = new Browser();// Create object of Browser class
     browser.launchBrowser("Edge");// Call launchBrowser method with "Edge"
     String result = browser.loadUrl();// Call loadUrl method and print the returned message
     System.out.println(result);
 }
}