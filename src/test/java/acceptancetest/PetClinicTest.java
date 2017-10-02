package acceptancetest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class PetClinicTest {

	/*@Test
	public void testFindOwners() throws Exception {
		try (final WebClient webClient = new WebClient()) {
			final HtmlPage page = webClient.getPage("http://localhost:8090/petclinic/owners/find.html");
			Assert.assertEquals("PetClinic :: a Spring Framework demonstration", page.getTitleText());
		}
	}*/

	@Test
	public void testRestClient() throws Exception {
		try {

			URL url = new URL("http://localhost:8888/info");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			conn.disconnect();
			assertTrue(true);
		} catch (MalformedURLException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}

}
