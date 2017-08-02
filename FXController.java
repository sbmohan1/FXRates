package training.web.rest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/FXRate")
public class FXController {
	
	@RequestMapping(value = "rates", method = RequestMethod.GET, produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> getRates()	{
		Map<String, BigDecimal> globalRates = new HashMap<String, BigDecimal>();
		globalRates.put("usdUSD", new BigDecimal("1.000000"));
		globalRates.put("usdEUR", new BigDecimal("0.85783"));
		globalRates.put("usdGBP", new BigDecimal("0.76696"));
		globalRates.put("usdINR", new BigDecimal("64.4390"));
		globalRates.put("usdAUD", new BigDecimal("1.25819"));
		globalRates.put("usdCAD", new BigDecimal("1.25074"));
		globalRates.put("usdZAR", new BigDecimal("13.0349"));
		globalRates.put("usdNZD", new BigDecimal("1.34628"));
		globalRates.put("usdJPY", new BigDecimal("111.644"));
		
		globalRates.put("eurUSD", new BigDecimal("1.16569"));
		globalRates.put("eurEUR", new BigDecimal("1.000000"));
		globalRates.put("eurGBP", new BigDecimal("0.89404"));
		globalRates.put("eurINR", new BigDecimal("75.1102"));
		globalRates.put("eurAUD", new BigDecimal("1.46677"));
		globalRates.put("eurCAD", new BigDecimal("1.45787"));
		globalRates.put("eurZAR", new BigDecimal("15.1964"));
		globalRates.put("eurNZD", new BigDecimal("1.56946"));
		globalRates.put("eurJPY", new BigDecimal("130.128"));
		
		globalRates.put("gbpUSD", new BigDecimal("1.30372"));
		globalRates.put("gbpEUR", new BigDecimal("1.11849"));
		globalRates.put("gbpGBP", new BigDecimal("1.000000"));
		globalRates.put("gbpINR", new BigDecimal("84.0018"));
		globalRates.put("gbpAUD", new BigDecimal("1.64038"));
		globalRates.put("gbpCAD", new BigDecimal("1.63010"));
		globalRates.put("gbpZAR", new BigDecimal("16.9945"));
		globalRates.put("gbpNZD", new BigDecimal("1.75534"));
		globalRates.put("gbpJPY", new BigDecimal("145.520"));
		
		globalRates.put("inrUSD", new BigDecimal("0.01552"));
		globalRates.put("inrEUR", new BigDecimal("0.01332"));
		globalRates.put("inrGBP", new BigDecimal("0.01191"));
		globalRates.put("inrINR", new BigDecimal("1.00000"));
		globalRates.put("inrAUD", new BigDecimal("0.01953"));
		globalRates.put("inrCAD", new BigDecimal("0.01941"));
		globalRates.put("inrZAR", new BigDecimal("0.20221"));
		globalRates.put("inrNZD", new BigDecimal("0.02090"));
		globalRates.put("inrJPY", new BigDecimal("1.73213"));
		
		globalRates.put("audUSD", new BigDecimal("0.79486"));
		globalRates.put("audEUR", new BigDecimal("0.68203"));
		globalRates.put("audGBP", new BigDecimal("0.60965"));
		globalRates.put("audINR", new BigDecimal("51.2114"));
		globalRates.put("audAUD", new BigDecimal("1.00000"));
		globalRates.put("audCAD", new BigDecimal("0.99427"));
		globalRates.put("audZAR", new BigDecimal("10.3564"));
		globalRates.put("audNZD", new BigDecimal("1.07031"));
		globalRates.put("audJPY", new BigDecimal("88.7089"));
		
		globalRates.put("cadUSD", new BigDecimal("0.79968"));
		globalRates.put("cadEUR", new BigDecimal("0.68615"));
		globalRates.put("cadGBP", new BigDecimal("0.61366"));
		globalRates.put("cadINR", new BigDecimal("51.5490"));
		globalRates.put("cadAUD", new BigDecimal("1.00650"));
		globalRates.put("cadCAD", new BigDecimal("1.000000"));
		globalRates.put("cadZAR", new BigDecimal("10.4324"));
		globalRates.put("cadNZD", new BigDecimal("1.07710"));
		globalRates.put("cadJPY", new BigDecimal("89.2836"));
		
		globalRates.put("zarUSD", new BigDecimal("0.07674"));
		globalRates.put("zarEUR", new BigDecimal("0.06585"));
		globalRates.put("zarGBP", new BigDecimal("0.05886"));
		globalRates.put("zarINR", new BigDecimal("4.94462"));
		globalRates.put("zarAUD", new BigDecimal("0.09654"));
		globalRates.put("zarCAD", new BigDecimal("0.09598"));
		globalRates.put("zarZAR", new BigDecimal("1.00000"));
		globalRates.put("zarNZD", new BigDecimal("0.10333"));
		globalRates.put("zarJPY", new BigDecimal("8.56323"));
		
		globalRates.put("nzdUSD", new BigDecimal("0.74270"));
		globalRates.put("nzdEUR", new BigDecimal("0.63733"));
		globalRates.put("nzdGBP", new BigDecimal("0.56962"));
		globalRates.put("nzdINR", new BigDecimal("47.8430"));
		globalRates.put("nzdAUD", new BigDecimal("0.93442"));
		globalRates.put("nzdCAD", new BigDecimal("0.92890"));
		globalRates.put("nzdZAR", new BigDecimal("9.67907"));
		globalRates.put("nzdNZD", new BigDecimal("1.00000"));
		globalRates.put("nzdJPY", new BigDecimal("82.8840"));
		
		globalRates.put("jpyUSD", new BigDecimal("0.00896"));
		globalRates.put("jpyEUR", new BigDecimal("0.00769"));
		globalRates.put("jpyGBP", new BigDecimal("0.00687"));
		globalRates.put("jpyINR", new BigDecimal("0.57721"));
		globalRates.put("jpyAUD", new BigDecimal("0.01128"));
		globalRates.put("jpyCAD", new BigDecimal("0.01121"));
		globalRates.put("jpyZAR", new BigDecimal("0.11676"));
		globalRates.put("jpyNZD", new BigDecimal("0.01207"));
		globalRates.put("jpyJPY", new BigDecimal("1.00000"));
		JSONObject jsonRates = new JSONObject(globalRates);	
		
		return new ResponseEntity<String>(jsonRates.toString(), HttpStatus.OK);
	}

}
