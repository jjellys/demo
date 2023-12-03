<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인페이지</title>
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        $(function(){
            console.log("aaaa");
            $("#m_id").val("1234");
        });
    </script>
</head>
<body>
    메인페이지
    <input type="text" id="m_id" >
</body>
</html>