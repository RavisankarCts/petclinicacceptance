package acceptancetest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class PetClinicTest {
	
	@Test
	public void testFindOwners() throws Exception {
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("http://localhost:8090/petclinic/owners/find.html");
	        Assert.assertEquals("PetClinic :: a Spring Framework demonstration", page.getTitleText());
	    }
	}

}
