<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Secret Code</title>
</head>
<body>
    <h1>Introduce el codigo:</h1>
    <form action="/checkCode" method="post">
        <input type="text" name="code" minlength="7" maxlength="7">
        <button type="submit">Try code</button>
    </form>
    <c:if test="${param.error}">
        <p style="color: red;">Codigo incorrecto. Intentalo de nuevo</p>
    </c:if>
</body>
</html>