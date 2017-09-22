<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Авторизация</title>
    <link rel = "stylesheet" type="text/css" href="css/style.css">
    <link href="http://fonts.googleapis.com/css?family=Lobster">
</head>
<body>
<div class="header-main">
    <div class="authorizationBox">
        <p class ="center"><img src="images/hospital-logo2.png" width="285" height="219"></p>
        <h2 class="center">Введите учетные данные</h2>
        <div class = "content">
            <input type="text center" placeholder="Логин" required id="login"></p>
            <input type="password" placeholder="Пароль" required id="password"></p>
        </div>
        <div class = "center">
            <input type="submit" class="authorizationBut" value="Вход"
                   onclick="window.location='main.jsp';" />
        </div>
    </div>
</div>
</body>
</html>