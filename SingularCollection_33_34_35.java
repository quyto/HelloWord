<<<<<<< HEAD
package SingularCollection;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.PageFactory;
import page.SingularCollectionDetailPage;
import page.SingularCollectionPage;
//import common.Browser;
///import common.Common;
//import common.Constant;
//import common.Interfaces;


public class SingularCollection_33_34_35 extends Common {
	
	
	protected WebDriver driver = null;
	private Browser browser;
	private SingularCollectionPage singularCollectionPage;
	private SingularCollectionDetailPage singularCollectionDetailPage;
	

	
	@BeforeClass
	public void init() 
		{
			Common.config();
			browser = PageFactory.getBrowser();
			singularCollectionPage = PageFactory.getSingularCollectionPage();
			singularCollectionDetailPage = PageFactory.getSingularCollectionDetailPage();
			
		}
	
	@Test
	public void SingularCollection () throws Exception {
					
		browser.navigateURL(Constant.URL_COLLECTION);
		singularCollectionPage.loginSingular(Constant.Username, Constant.Password);
		
		
		log.info("Open a collection details page");
		singularCollectionPage.openCollectionDetailsPageViaViewCollectionButton();
	
		log.info("Scroll down to COLLECTION TOPICS section");	
					
		singularCollectionDetailPage.scrollToCollectionSection();
		
		String topictext = singularCollectionDetailPage.getTopicText();
		
		log.info("Click on a random topic");
		//singularCollectionDetailPage.chooseTopic();
					
		//VP:The corresponding topic page is opened
		
		singularCollectionDetailPage.verifyTopicOpen(topictext);
		
		//log.info("Back to Collection details page and scroll to SHARE section");
		
			
		singularCollectionDetailPage.backToColletionDetailsPage();
		
		
		log.info("Get first collection url");
		String firsturl = singularCollectionDetailPage.getCurrentURL();
	
		
	    //log.info("Copy collection link at SHARING section ");
		
		singularCollectionDetailPage.copyCollectionLink();
	
		//VP: "Link copied" message display
		singularCollectionDetailPage.verifyLinkCopiedMessageDisplay();
		
	
		//log.info("Paste the link to browser");
		singularCollectionDetailPage.openCollectionByURL();
		

		log.info("Get second collection url");
		String secondurl = singularCollectionDetailPage.getCurrentURL();
		
		
		//VP: Compare new Collection url with old Collection url --> Two collection links are matched
		singularCollectionDetailPage.compareCollectionLinks(firsturl, secondurl);
		
		
		//-----------------------------------------------------------------------------
		
		log.info("Scroll up the page to top and Click on Share button under Hero banner");
		
		singularCollectionDetailPage.clickSharebutton();
		
		
		log.info("Open Collection page by link from Sharing popup");
		
		singularCollectionDetailPage.navigateCollectionByURL2(Interfaces.url_CollectionLinkfromShare);
		
		log.info("Get third collection url");
		String thirdurl = singularCollectionDetailPage.getCurrentURL();
		
		//VP: Compare new Collection url with old Collection url --> Two collection links are matched
		singularCollectionDetailPage.compareCollectionLinks(thirdurl, secondurl);
		
	}
	
	
	@AfterClass
	public void tearDown() {
		closeBrowser(driver);
	}

}
=======
package SingularCollection;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.PageFactory;
import page.SingularCollectionDetailPage;
import page.SingularCollectionPage;
import common.Browser;
import common.Common;
import common.Constant;
import common.Interfaces;


public class SingularCollection_33_34_35 extends Common {
	
	
	protected WebDriver driver = null;
	private Browser browser;
	private SingularCollectionPage singularCollectionPage;
	private SingularCollectionDetailPage singularCollectionDetailPage;
	

	
	@BeforeClass
	public void init() 
		{
			Common.config();
			browser = PageFactory.getBrowser();
			singularCollectionPage = PageFactory.getSingularCollectionPage();
			singularCollectionDetailPage = PageFactory.getSingularCollectionDetailPage();
			
		}
	
	@Test
	public void SingularCollection () throws Exception {
					
		browser.navigateURL(Constant.URL_COLLECTION);
		singularCollectionPage.loginSingular(Constant.Username, Constant.Password);
		
		
		log.info("Open a collection details page");
		singularCollectionPage.openCollectionDetailsPageViaViewCollectionButton();
	
		log.info("Scroll down to COLLECTION TOPICS section");	
					
		singularCollectionDetailPage.scrollToCollectionSection();
		
		String topictext = singularCollectionDetailPage.getTopicText();
		
		log.info("Click on a random topic");
		//singularCollectionDetailPage.chooseTopic();
					
		//VP:The corresponding topic page is opened
		
		singularCollectionDetailPage.verifyTopicOpen(topictext);
		
		//log.info("Back to Collection details page and scroll to SHARE section");
		
			
		singularCollectionDetailPage.backToColletionDetailsPage();
		
		
		log.info("Get first collection url");
		String firsturl = singularCollectionDetailPage.getCurrentURL();
	
		
	    //log.info("Copy collection link at SHARING section ");
		
		singularCollectionDetailPage.copyCollectionLink();
	
		//VP: "Link copied" message display
		singularCollectionDetailPage.verifyLinkCopiedMessageDisplay();
		
	
		//log.info("Paste the link to browser");
		singularCollectionDetailPage.openCollectionByURL();
		

		log.info("Get second collection url");
		String secondurl = singularCollectionDetailPage.getCurrentURL();
		
		
		//VP: Compare new Collection url with old Collection url --> Two collection links are matched
		singularCollectionDetailPage.compareCollectionLinks(firsturl, secondurl);
		
		
		//-----------------------------------------------------------------------------
		
		log.info("Scroll up the page to top and Click on Share button under Hero banner");
		
		singularCollectionDetailPage.clickSharebutton();
		
		
		log.info("Open Collection page by link from Sharing popup");
		
		singularCollectionDetailPage.navigateCollectionByURL2(Interfaces.url_CollectionLinkfromShare);
		
		log.info("Get third collection url");
		String thirdurl = singularCollectionDetailPage.getCurrentURL();
		
		//VP: Compare new Collection url with old Collection url --> Two collection links are matched
		singularCollectionDetailPage.compareCollectionLinks(thirdurl, secondurl);
		
	}
	
	
	@AfterClass
	public void tearDown() {
		closeBrowser(driver);
	}

}
>>>>>>> origin/master
