function getRates() {
	var rates = new XMLHttpRequest();
	rates.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			populateTable(this);
		}
	};
	rates.open("GET","http://localhost:8080/tomcat-hello-world/rest/FXRate/rates", true);
	rates.send();
}

function populateTable(xml)	{
	var ratesXML = xml.responseXML;
	var x = ratesXML.getElementsByTagName("entry");
	
	var table = "<tr><th>Rates</th></tr>";

	for (var i = 0; i < x.length; i++)	{
		table += "<tr><td>" + x[i].childNodes[0].nodeValue +"</td></tr>";
	}
	
	document.getElementById("testTable").innerHTML = table;
}