<%--
  Created by IntelliJ IDEA.
  User: Ilya
  Date: 30.05.2019
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Администратор</title>
    <link rel="stylesheet" href="style/adminstyle.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body class="w3-light-grey">
<header class="header_wind">
    <h1> Самый главный - самый выжный </h1>
</header>
<div class="container">
    <nav class="nav">
        <div id="nav">
            <h2>Меню</h2>
            <p><a href="#add">Добавить нового работника</a></p>
            <p><a href="#list">Просмотреть список всех работников</a></p>
            <p><a href="#file">Загруить выручку</a></p>
            <p><a href="#new">Добавить новость</a></p>
        </div>
    </nav>

    <div class="cross">
        <div class="add_user" id="add">
            <h2>Добавление нового работника</h2>
            <form method="post">
                <div class="new_user">
                    <div class="field">
                        <label for="fio">Введите фамилию и имя:</label>
                        <input type="text" id="fio" placeholder="Фамилия Имя" name="fio"><br />
                        <p>пример ввода: Иванов Иван</p>
                    </div>
                    <div class="field">
                        <label for="login">Придумайте логин:</label>
                        <input type="text" id="login" placeholder="Логин" name="login"><br/>
                        <p>пример ввода: ivanov.ivan</p>
                    </div>
                    <div class="field">
                        <label for="password">Придумайте пароль:</label>
                        <input type="text" id="password" placeholder="Пароль" name="password"><br />
                        <p>пример ввода: ggQ1qwa</p>
                    </div>
                    <div class="field">
                        <button type="submit" class="createpassword">Придумать пароль</button>
                    </div>
                </div>

                <button type="submit" class="btn_add">Добавить</button>
            </form>
        </div>
        <div class="list" id="list">
            <h2>Список всех работников</h2>
            <div class="myTable">
            <table>
                <tr>
                    <th>Фамилия Имя</th>
                    <th>Логин</th>
                    <th>Пароль</th>
                    <th class="del"></th>
                </tr>
                <tr>
                    <td class="cellfio">Админ</td>
                    <td class="celllogin">admin</td>
                    <td class="cellpassword">admin</td>
                    <td class="del"><a href="#">X</a></td>
                </tr>
                <tr>
                    <td class="cellfio">Иванов Иван</td>
                    <td class="celllogin">User</td>
                    <td class="cellpassword">User</td>
                    <td class="del"><a href="#">X</a></td>
                </tr>
                <tr>
                    <td class="cellfio">Иванов Иван</td>
                    <td class="celllogin">User</td>
                    <td class="cellpassword">User</td>
                    <td class="del"><a href="#">X</a></td>
                </tr>
                <tr>
                    <td class="cellfio">Иванов Иван</td>
                    <td class="celllogin">User</td>
                    <td class="cellpassword">User</td>
                    <td class="del"><a href="#">X</a></td>
                </tr>
                <tr>
                    <td class="cellfio">Иванов Иван</td>
                    <td class="celllogin">User</td>
                    <td class="cellpassword">User</td>
                    <td class="del"><a href="#">X</a></td>
                </tr>

            </table>
            </div>
        </div>
        <div class="file" id="file">
            <h2>Пожалуйста загрузите файл с выручкой</h2>
            <div class="example-1">
                <div class="form-group">
                    <label class="label">
                        <i class="material-icons">attach_file</i>
                        <span class="title">Добавить файл</span>
                        <input type="file">
                    </label>
                </div>
            </div>
        </div>
        <div class="news" id="new">
            <h2>Добавление свежих новостей</h2>
        </div>
    </div>
</div>

</body>
</html>