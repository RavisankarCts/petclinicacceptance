package acceptancetest;

import org.junit.Assert;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class petclinictest {
	
	@Test
	public void testFindOwners() throws Exception {
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("http://localhost:8080/petclinic/owners/find.html");
	        Assert.assertEquals("PetClinic :: a Spring Framework demonstration", page.getTitleText());
	    }
	}
	
	
	

}
