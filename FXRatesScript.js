function createTable() {
	var table = "<tr>";
	var headers = [ "", "", "USD", "EUR", "GBP", "INR", "AUD", "CAD", "ZAR",
			"NZD", "JPY" ];
	var currencies = [ "1 USD", "1 EUR", "1 GBP", "1 INR", "1 AUD", "1 CAD",
			"1 ZAR", "1 NZD", "1 JPY" ]
	var exRate = [ .2038, .9272, .62762, .86876, .7268, 1.27736, .0289783,
			.37863, .7573 ];
	var table2get = document.querySelector("#table2");
	var flags = [
			"",
			"",
			"<img src=http://fla.fg-a.com/American/1-lg-american-flag.jpg id='flags'/>",
			"<img src=http://www.clker.com/cliparts/e/c/7/9/11949890211029228051eu_flag_hash_0x8a0ab9c__01.svg.med.png id='flags'/>",
			"<img src=https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1200px-Flag_of_the_United_Kingdom.svg.png id='flags'/>",
			"<img src=https://s-media-cache-ak0.pinimg.com/564x/1c/50/5f/1c505fe9b39698142c243607e06236f5.jpg id='flags'/>",
			"<img src=http://www.travelmoneyoz.com/sites/travelmoneyoz.com/files/flags/flag-australia.gif id='flags'/>",
			"<img src=http://luc.devroye.org/Flag_of_Canada.svg id='flags'/>",
			"<img src=https://flagspot.net/images/z/za.gif id='flags'/>",
			"<img src=https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2015/05/15/102682673-549707421.530x298.jpg?v=1431698185 id='flags'/>",
			"<img src=http://www.clker.com/cliparts/7/e/0/2/11970908441495821413jp_draws_Japanese_Flag.svg.hi.png id='flags'/>" ];

	for (var i = 0; i < headers.length; i++) {
		table += "<th>" + flags[i] + "<br>" + headers[i] + "</th>";
	}
	table += "</tr>";

	for (var i = 0; i < currencies.length; i++) {
		table += "<tr id= 'row" + i + "'><th>" + flags[i + 2] + "</th><th>"
				+ currencies[i] + "<br>"
				+ "<span style='color: grey; font-size: 14px'>Inverse: </th>";
		for (var y = 0; y < exRate.length; y++) {
			table += "<td>" + exRate[y].toPrecision(5) + "<br>"
					+ exRate[y].toPrecision(5) + "</td>";
		}
		table += "</tr>";
	}
	table2get.innerHTML = table;
}
window.onload = createTable();


function loadDisplay() {
	document.getElementById("row3").style.display = "none";
	document.getElementById("row4").style.display = "none";
	document.getElementById("row5").style.display = "none";
	document.getElementById("row6").style.display = "none";
	document.getElementById("row7").style.display = "none";
	document.getElementById("row8").style.display = "none";
}
window.onload = loadDisplay();


var oldCurrency;
var currencies = [ "INR", "AUD", "CAD", "ZAR", "NZD", "JPY" ];
var rows = [ "row3", "row4", "row5", "row6", "row7", "row8" ];

function updateDisplay() {

	var selectedCurrency = document.getElementById("selectedCurrency").value;

	for ( var i in currencies) {
		if (oldCurrency != selectedCurrency
				&& currencies[i] == selectedCurrency) {
			document.getElementById(rows[i]).style.display = "";
			oldCurrency = selectedCurrency;
		} else {
			document.getElementById(rows[i]).style.display = "none";
		}
	}
	document.getElementById("selectedCurrency").value = "DEF";
}
