package training.web.rest;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

	@RequestMapping(value = "rates", method = RequestMethod.GET, produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> getRates() throws IOException {

		//LinkedHashMap<String, String> rates = new LinkedHashMap<String, String>();

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
		
		rates.storeToXML(ratesFOS, "Global FXRates Test Data", "UTF-8");

		StringBuilder ratesString = new StringBuilder();

		while (ratesFIS.available() > 0) {
			ratesString.append("" + (char) ratesFIS.read());
		}
		ratesFIS.close();

		return new ResponseEntity<String>(ratesString.toString(), HttpStatus.OK);
	}

}