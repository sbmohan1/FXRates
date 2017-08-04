<html>
<head>

<title>FXRates Board</title>
<style>
body {
	font-family: 'FoXE', Arial, Helvetica, sans-serif;
	background-color: #2E86C1;
	background-image:
		url("https://github.com/sbmohan1/FXRates/blob/master/background.jpg?raw=true");
}


table#FXRateBoard {
	width: 65%;
	border:5px solid;
	border-collapse: collapse;
	border-color: rgba(149,222,239,0.5);
	margin-top:3em;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

table#FXRateBoard tr:nth-child(even) {
	background-color: #F0F0F0;
	border-bottom: 1px solid black;
	border-color: #d2d5db;
}


table#FXRateBoard tr:nth-child(odd) {
	background-color: #F0F0F0;
	border-bottom: 1px solid black;
	border-color: #d2d5db;
}


table#FXRateBoard th {
	background-color: #F0F0F0;
	color: #2E86C1;
	padding: 5px;
	width: 10%;
}

table#FXRateBoard td {
	padding: 5px;
	text-align: center;
	color: black;
	font-size: 14px;
}

#selectedCurrency {
	position: absolute; 
	top: 20px; 
	left: 996px;
	height:35px;
    line-height:30px;
    margin-left:auto;
}

#caption {
	color: black;
	text-align: left;
	word-spacing: 3px;
	font-family: 'FoXE', Arial, Helvetica, sans-serif;
	font-size: 17px;
	padding-left: 14.5em;
}

#flags {
	width: 18.2px; 
	height: 14px;
	
}
</style>

</head>

<body>
	
	<p id="caption">FX Rates 2017/07/25</p>
	
	<table id="FXRateBoard"></table>
	
	<form method="GET" action="FXRate">
		
		<select name="baseCurrency" id = "selectedCurrency" onchange ="updateDisplay()">
			<option value="DEF">Change/Remove a currency</option>
			<option value="CAD">CAD- Canadian Dollar</option>
			<option value="INR">INR- Nepal-Indian Rupee</option>
			<option value="AUD">AUD- Austrlian Dollar</option>
			<option value="ZAR">ZAR- South Africa Rand</option>
			<option value="NZD">NZD- New Zealand Dollar</option>
			<option value="JPY">JPY- Japanese Yen</option>
		</select> 
		
	</form>

</body>

<script type="text/javascript" src="table.js"></script>
<script type="text/javascript" src="loadDisplay.js"></script>
<script type="text/javascript" src="updateDisplay.js"></script>

</html>