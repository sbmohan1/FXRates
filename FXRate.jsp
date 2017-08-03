<html>
<head>

<title>FXRates Board</title>
<style>
body {
	font-family: 'FoXE', Arial, Helvetica, sans-serif;
	background-color: #2E86C1;
	background-image:
		url("https://www.smbcgroup.com/SMBC/media/SMBC/SMBC-Global_Map_2.jpg");
}


table#table2 {
	width: 65%;
	border-collapse: collapse;
	border-color: rgba(46,134,193,0.5);
	margin-top:3em;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

table#table2 tr:nth-child(even) {
	background-color: #F0F0F0;
	border-bottom: 1px solid black;
	border-color: #d2d5db;
}


table#table2 tr:nth-child(odd) {
	background-color: #F0F0F0;
	border-bottom: 1px solid black;
	border-color: #d2d5db;
}


table#table2 th {
	background-color: #F0F0F0;
	color: #2E86C1;
	padding: 5px;
	width: 10%;
}

table#table2 td {
	padding: 5px;
	text-align: center;
	color: black;
	font-size: 14px;
}

#teamLogo img {
	max-width: 50px;
	position: absolute;
	right: 0px;
	bottom: 0px;
}

#selectedCurrency {
	position: absolute; 
	top: 10px; 
	left: 1098px;
	height:30px;
    line-height:30px;
    margin-left:auto;
}

#caption {
	color: black;
	text-align: left;
	word-spacing: 3px;
	font-family: 'FoXE', Arial, Helvetica, sans-serif;
	font-size: 17px;
}

#flags {
	width: 18.2px; 
	height: 14px;
	
}

</style>


</head>

<body>
	
	<p id="caption">FX Rates 2017/07/25</p>
	
	<table id="table2"></table>
	
	
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
	
	<div id="teamLogo">
		<img style=width: src="https://ih1.redbubble.net/image.42599949.8362/mp,550x550,gloss,ffffff,t.3u4.jpg" />
	</div>
	
</body>
<script type="text/javascript" src="table.js"></script>
<script type="text/javascript" src="loadDisplay.js"></script>
<script type="text/javascript" src="updateDisplay.js"></script>
</html>