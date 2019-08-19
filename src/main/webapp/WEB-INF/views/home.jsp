<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Músculo Total</title>

<style type="text/css"> 
	
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Open Sans;
}

html,body{
	height: 100%; 
}

/**Boot CSS**/

.center{
	max-width: 1280px;
	padding: 0 2%;
	margin:0 auto ;
}



.w50{
	width: 50%;
}

.w33{
	width: 33.3%;
}

.left{
	float: left;
}

.right{
	float: right;
}

.clear{
	clear: both;
}

/**Estilização do site**/

header{
	padding-left: 5px 0;
	height: 450px;
	background: #844892;
}

header .logo img{
	width:250px; 
	margin: 10px 0;
	
}

.logo a{
	text-decoration: none;
} 

nav.desktop ul{
	position: relative;
	top: 10px;
	list-style-type: none;
}

nav.desktop li{
	margin-top: 35px;
	font-size: 15px;
	padding:0 30px;
	font-weight: 300;
	text-transform: uppercase;
	display: inline-block;
}
nav.desktop a{
	cursor: pointer;
	color: white;
	text-decoration: none;
}

nav.desktop a:hover{
	text-decoration: underline;

}

</style>

</head>

<body >

<header>
		<div class="center">
			<div class="logo left"><a href="home"><img alt="" src="images/logoMuscle.png"></a></div>
			<nav class="desktop right">
				<ul>
					<li><a href="users/formUsers">Crie seu cadastro</a></li>
			
				</ul>
			</nav>


<div></div>

<br><br><br>
<a href="users/formUsers">Link</a>
<div></div>




<footer></footer>
</body>
</html>