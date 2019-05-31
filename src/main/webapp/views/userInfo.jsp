<%--
  Created by IntelliJ IDEA.
  User: Ilya
  Date: 30.05.2019
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/style/userstyle.css">
    <title>Информация об выручке</title>
</head>
<body>
    <header class="header-user">
        <h1>Все что тебе нужно знать!</h1>
    </header>
    <div class="container">
        <div class="container_div">
            <div class="news">
            <h2>Новости!</h2>
            </div>
        </div>
        <div class="container_div">
            <div class="login">
                <h2>Информация</h2>

                <div class="month_plan">
                    <p>План на этот месяц: <bold>100 000</bold> <!-- тут должно выводиться занчение плана на месяц, для главных придумаем куда вводить это значение --></p>
                </div>
                <div class="info">
                    <p><!-- Тут должны выводиться имя и фамилия users -->Иванов Иван</p>
                    <p>Твоя выручка: <!-- тут должна вставиться выручка user-а-->60 000</p>
                    <p>Тебе еще осталось до плана: <!-- тут вставляется остаток-->40 000</p>
                    <div class="skills"><div class="user-skills"><!-- тут должны вставлятья проценты в виде числа --> 60%</div></div>
                </div>
            </div>
        </div>
        <div class="container_div">
            <div class="message">
                <h2>Акции</h2>
            </div>
        </div>
    </div>
</body>
</html>
