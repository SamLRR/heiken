<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Heiken. Updating ARM data</title>
</head>

<body onload="GettingInfoAboutComputer()">

<h1><div class="panel-body" id="login"></div></h1>
<table>
    <tr>
        <td>Наименование АРМа:</td>
        <td><input type="text" id="armName" onchange="OnChange()"></td>
    </tr>
    <tr>
        <td>Описание АРМа(IP; название узла; предприятие):</td>
        <td><input type="text" id="description" onchange="OnChange()"></td>
    </tr>
    <tr>
        <td>Доменное имя:</td>
        <td><input type="text" id="domainName" onchange="OnChange()"></td>
    </tr>
    <tr>
        <td>Наименование отдела:</td>
        <td><input type="text" id="name" onchange="OnChange()"></td>
    </tr>
    <tr>
        <td>Телефон:</td>
        <td><input type="text" id="phone" onchange="OnChange()"></td>
    </tr>
    <tr>
        <td>Описание пользователя:</td>
        <td><input type="text" id="userDescription" onchange="OnChange()"></td>
    </tr>

    <tr>
        <td></td>
        <td>
            <button type="button" id = "updateButton" onclick="UpdateComputer($('#armName').val(), $('#description').val(),
                                                                $('#domainName').val(), $('#name').val(), $('#phone').val(),
                                                                $('#userDescription').val())">update!
            </button>
        </td>
    </tr>
</table>

--------------------------------------------
<div class="panel-body" id="response"></div>

<script src="../../js/registration.js" type="text/javascript"></script>
<script src="../../js/updating_user.js" type="text/javascript"></script>
<script src="../../js/jquery.min.js" type="text/javascript"></script>

</body>
</html>
