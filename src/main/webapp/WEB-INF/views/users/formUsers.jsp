<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro das Categorias</title>

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

.title{
	
	text-align: center;
	color: black;
/*	color: #844892;*/
	margin-bottom: 30px;
	font-weight: 700;
	font-size: 30px;



} 


.contato-container input[type=text]{
	margin:8px 0;
	width: 100%;
	height: 40px;
	border:1px solid #ccc;
	padding-left: 8px;
	font-size: 16px;
	max-width: 800px;
	color: #444;
}

.contato-container input[type=password]{
	margin:8px 0;
	width: 100%;
	height: 40px;
	border:1px solid #ccc;
	padding-left: 8px;
	font-size: 16px;
	max-width: 800px;
	color: #444;
}

.contato-container input[type=name]{
	margin:8px 0;
	width: 100%;
	height: 40px;
	border:1px solid #ccc;
	padding-left: 8px;
	font-size: 16px;
	max-width: 800px;
	color: #444;
}


.contato-container input[type=email]{
	margin:8px 0;
	width: 100%;
	height: 40px;
	border:1px solid #ccc;
	padding-left: 8px;
	font-size: 16px;
	max-width: 800px;
	color: #444;
}



.contato-container textarea{
	padding: 8px;
	margin:8px 0;
	width: 100%;
	height: 120px;
	border:1px solid #ccc;
	padding-left: 8px;
	font-size: 16px;
	max-width: 800px;
	resize: vertical;
	color: #444;
}

.contato-container input[type=submit]{
	background: #00C59E;
	width: 140px;
	height: 40px;
	color: white;
	cursor: pointer;
}



</style>
</head>
<body>

	<form class="contato-container"action="confirm"  method="post">
		<div>
			<label class="title" for="title">Cadastro de usuários</label>
			<br>
		<label for="name">Nome Completo</label> 
		<input type="text" name="name" id="name">
		</div>
		<div>
		<label for="senha">Senha</label>
		<input type="password" name="senha" id="senha" >
		</div>
		<label for="nascimento">Data de nascimento</label>
		 <input type="date" name="nascimento" id="nascimento" >
		
		<div>
		<label for="peso">Peso</label>
		 <input  type="text" name="peso" id="peso" >
		</div>
		<div>
		<label for="altura">Altura</label>
		 <input type="text" name="altura" id="altura" />
		</div>
		<div>
		<label for="privilegios">	Selecione o tipo de cadastro:</label>
	  <input  list="privilegios" name="privilegios">
   <datalist id="privilegios">
    <option value="Aluno">
    <option value="Professor">
    <option value="Administrador">
  </datalist>
		</div>
		
			<input type="submit" value="Enviar"/>
	</form>

</body>
</html>