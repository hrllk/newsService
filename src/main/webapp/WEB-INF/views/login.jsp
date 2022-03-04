<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/views/include/css.jsp"/>
    <title>Home</title>
</head>
<body>
<style>
    body {
        background: #f8f8f8;
        padding: 60px 0;
    }

    #login-form > div {
        margin: 15px 0;
    }

</style>

<div class="container">
    <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-success">
            <div class="panel-heading">
                <div class="panel-title">환영합니다!</div>
            </div>
            <div class="panel-body">
                <form id="login-form">
                    <div>
                        <input type="text" class="form-control" name="id" placeholder="ID" autofocus/>
                    </div>
                    <div>
                        <input type="password" class="form-control" name="password" placeholder="PW"/>
                    </div>
                    <div class="row">
                        <div class="col-6">

                            <button type="button" class="form-control btn btn-primary" onclick="login()">로그인</button>
                        </div>
                        <div class="col-6">

                            <button type="button"  onclick="signUp()" class="form-control btn btn-primary">회원가입</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/views/include/javascript.jsp"/>

<script type="text/javascript">

    let loginForm = $("#login-form");
    function signUp(){

        console.log("hi, signup");
        location.href = 'signup';
    }

    function login() {
        // alert("login !! this.serialize: " + loginForm.serialize());
        $.ajax({
            url: '<c:url value="/rest/v1/auth/login"/>',
            data: loginForm.serialize(),
            method: 'POST'
        }).done(function (res) {

            // console.log("res:", res);
            if (res === "success"){
                // alert("로그인! ");
                location.href = 'collections';
            }
        })

    }
    $(document).ready(function () {
    });
</script>

</body>
</html>
