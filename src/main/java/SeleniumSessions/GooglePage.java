package SeleniumSessions;

public class GooglePage {

	public static void main(String[] args) {
		
		String Browser = "Chrome";
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(Browser);
		br.LunchURL("http:\\www.amazon.com");
		String title = br.getPageTitle();
		System.out.println("Page title is: " + title);
		
		if (title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		System.out.println(br.getPageUrl());
		br.closeBrowser();
			
	}

}
