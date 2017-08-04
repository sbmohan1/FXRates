package training.web.rest;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import training.web.rest.LinkedProperties;

@RestController
@RequestMapping(value = "/FXRate")
public class FXController {

	public static String maptoXML(Object hashMap) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		XMLEncoder xmlEncoder = new XMLEncoder(bos);
		xmlEncoder.writeObject(hashMap);
		xmlEncoder.close();
		return bos.toString();
	}

	@RequestMapping(value = "rates", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> getRates(HttpServletRequest request) throws IOException {

		FileOutputStream ratesFOS = new FileOutputStream("rates.xml");
		FileInputStream ratesFIS = new FileInputStream("rates.xml");
		
		LinkedProperties rates = new LinkedProperties();

		rates.put("usdUSD", "1.00000");
		rates.put("usdEUR", "0.85783");
		rates.put("usdGBP", "0.76696");
		rates.put("usdINR", "64.4390");
		rates.put("usdAUD", "1.25819");
		rates.put("usdCAD", "1.25074");
		rates.put("usdZAR", "13.0349");
		rates.put("usdNZD", "1.34628");
		rates.put("usdJPY", "111.644");

		rates.put("eurUSD", "1.16569");
		rates.put("eurEUR", "1.00000");
		rates.put("eurGBP", "0.89404");
		rates.put("eurINR", "75.1102");
		rates.put("eurAUD", "1.46677");
		rates.put("eurCAD", "1.45787");
		rates.put("eurZAR", "15.1964");
		rates.put("eurNZD", "1.56946");
		rates.put("eurJPY", "130.128");

		rates.put("gbpUSD", "1.30372");
		rates.put("gbpEUR", "1.11849");
		rates.put("gbpGBP", "1.00000");
		rates.put("gbpINR", "84.0018");
		rates.put("gbpAUD", "1.64038");
		rates.put("gbpCAD", "1.63010");
		rates.put("gbpZAR", "16.9945");
		rates.put("gbpNZD", "1.75534");
		rates.put("gbpJPY", "145.520");
		
		/*rates.put("inrUSD", "0.01552");
		rates.put("inrEUR", "0.01332");
		rates.put("inrGBP", "0.01191");
		rates.put("inrINR", "1.00000");
		rates.put("inrAUD", "0.01953");
		rates.put("inrCAD", "0.01941");
		rates.put("inrZAR", "0.20221");
		rates.put("inrNZD", "0.02090");
		rates.put("inrJPY", "1.73213");
		
		rates.put("audUSD", "0.79486");
		rates.put("audEUR", "0.68203");
		rates.put("audGBP", "0.60965");
		rates.put("audINR", "51.2114");
		rates.put("audAUD", "1.00000");
		rates.put("audCAD", "0.99427");
		rates.put("audZAR", "10.3564");
		rates.put("audNZD", "1.07031");
		rates.put("audJPY", "88.7089");
		
		rates.put("cadUSD", "0.79968");
		rates.put("cadEUR", "0.68615");
		rates.put("cadGBP", "0.61366");
		rates.put("cadINR", "51.5490");
		rates.put("cadAUD", "1.00650");
		rates.put("cadCAD", "1.00000");
		rates.put("cadZAR", "10.4324");
		rates.put("cadNZD", "1.07710");
		rates.put("cadJPY", "89.2836");
		
		rates.put("zarUSD", "0.07674");
		rates.put("zarEUR", "0.06585");
		rates.put("zarGBP", "0.05886");
		rates.put("zarINR", "4.94462");
		rates.put("zarAUD", "0.09654");
		rates.put("zarCAD", "0.09598");
		rates.put("zarZAR", "1.00000");
		rates.put("zarNZD", "0.10333");
		rates.put("zarJPY", "8.56323");
		
		rates.put("nzdUSD", "0.74270");
		rates.put("nzdEUR", "0.63733");
		rates.put("nzdGBP", "0.56962");
		rates.put("nzdINR", "47.8430");
		rates.put("nzdAUD", "0.93442");
		rates.put("nzdCAD", "0.92890");
		rates.put("nzdZAR", "9.67907");
		rates.put("nzdNZD", "1.00000");
		rates.put("nzdJPY", "82.8840");
		
		rates.put("jpyUSD", "0.00896");
		rates.put("jpyEUR", "0.00769");
		rates.put("jpyGBP", "0.00687");
		rates.put("jpyINR", "0.57721");
		rates.put("jpyAUD", "0.01128");
		rates.put("jpyCAD", "0.01121");
		rates.put("jpyZAR", "0.11676");
		rates.put("jpyNZD", "0.01207");
		rates.put("jpyJPY", "1.00000");*/
		
		rates.storeToXML(ratesFOS, "Global FXRates Test Data", "UTF-8");

		StringBuilder ratesString = new StringBuilder();

		while (ratesFIS.available() > 0) {
			ratesString.append("" + (char) ratesFIS.read());
		}
		ratesFIS.close();

		return new ResponseEntity<String>(ratesString.toString(), HttpStatus.OK);
	}

}