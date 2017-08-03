var oldCurrency;
var currencies = ["INR","AUD","CAD","ZAR","NZD","JPY"];
var rows = ["row3","row4","row5","row6","row7","row8"]


function updateDisplay(){
	
	var selectedCurrency = document.getElementById("selectedCurrency").value;
	
	for(var i in currencies){
		if(oldCurrency != selectedCurrency && currencies[i] == selectedCurrency){
			document.getElementById(rows[i]).style.display = "";
			oldCurrency = selectedCurrency;
		}else{
			document.getElementById(rows[i]).style.display = "none";
		}
	}
	document.getElementById("selectedCurrency").value = "DEF";	
}