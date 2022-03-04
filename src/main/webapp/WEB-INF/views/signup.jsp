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
    <div class="page-header">
        <div class="col-md-6 col-md-offset-3">
            <h3>SIGNUP</h3>
        </div>
    </div>
    <div class="col-sm-6 col-md-offset-3">
        <form role="form" id="signupForm">
            <div class="form-group">
                <label for="inputName">성명</label>
                <input type="text" class="form-control" id="inputName" placeholder="이름을 입력해 주세요" name="name">
            </div>
            <div class="form-group">
                <label for="InputEmail">이메일 주소</label>
                <input type="email" class="form-control" id="InputEmail" placeholder="이메일 주소를 입력해주세요" name="id">
            </div>
            <div class="form-group">
                <label for="inputPassword">비밀번호</label>
                <input type="password" class="form-control" id="inputPassword" placeholder="비밀번호를 입력해주세요" name="password">
            </div>
            <div class="form-group">
                <label <%--for="inputPasswordCheck"--%>>뉴스수집처</label><br>
<%--                <input type="checkbox" class="form-control" id="inputPasswordCheck" placeholder="비밀번호 확인을 위해 다시한번 입력 해 주세요">--%>
<%--                <input type="checkbox" class="form-control" id="inputPasswordCheck" placeholder="비밀번호 확인을 위해 다시한번 입력 해 주세요">--%>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="isUseNaver" name="isUseNaver" checked>
                    <label class="form-check-label" for="isUseNaver">네이버</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="isUseDaum" name="isUseDaum" checked>
                    <label class="form-check-label" for="isUseDaum">다음</label>
                </div>
<%--                <div class="form-check form-check-inline">--%>
<%--                    <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option3" disabled>--%>
<%--                    <label class="form-check-label" for="inlineCheckbox3">3 (disabled)</label>--%>
<%--                </div>--%>
            </div>

        <%--            <div class="form-group">--%>
<%--                <label for="inputPasswordCheck">비밀번호 확인</label>--%>
<%--                <input type="password" class="form-control" id="inputPasswordCheck"--%>
<%--                       placeholder="비밀번호 확인을 위해 다시한번 입력 해 주세요">--%>
<%--            </div>--%>
<%--            <div class="form-group">--%>
<%--                <label for="inputMobile">휴대폰 번호</label>--%>
<%--                <input type="tel" class="form-control" id="inputMobile" placeholder="휴대폰번호를 입력해 주세요">--%>
<%--            </div>--%>
<%--            <div class="form-group">--%>
<%--                <label for="inputtelNO">사무실 번호</label>--%>
<%--                <input type="tel" class="form-control" id="inputtelNO" placeholder="사무실번호를 입력해 주세요">--%>
<%--            </div>--%>

<%--            <div class="form-group">--%>
<%--                <label>약관 동의</label>--%>
<%--                <div data-toggle="buttons">--%>
<%--                    <label class="btn btn-primary active">--%>
<%--                        <span class="fa fa-check"></span>--%>
<%--                        <input id="agree" type="checkbox" autocomplete="off" checked>--%>
<%--                    </label>--%>
<%--                    <a href="#">이용약관</a>에 동의합니다.--%>
<%--                </div>--%>
<%--            </div>--%>

            <div class="form-group text-center" style="margin-top: 20px">
                <button type="button" id="join-submit" class="btn btn-primary" onclick="signUp()">
                    회원가입<i class="fa fa-check spaceLeft"></i>
                </button>
                <button type="button" onclick="goback()" class="btn btn-warning">
                    가입취소<i class="fa fa-times spaceLeft"></i>
                </button>
            </div>
        </form>
    </div>

    <jsp:include page="/WEB-INF/views/include/javascript.jsp"/>


    <script type="text/javascript">
        let signupForm = $("#signupForm");

        let isUseNaver = $("#isUseNaver");
        let isUseDaum= $("#isUseDaum");



        function goback() {
            location.href = 'login'
        }
        function signUp() {
            // isUseNaver.is(':checked') ? isUseNaver.val("1") : isUseNaver.val("0");
            // isUseDaum.is(':checked') ? isUseDaum.val("1") : isUseDaum.val("0");

            isUseNaver.val(isUseNaver.is(':checked') ? "1" : "0");
            isUseDaum.val(isUseDaum.is(':checked') ? "1" : "0");
            console.log("signup !! this.serialize: " + signupForm.serialize());
            $.ajax({
                url: '<c:url value="/rest/v1/auth/signup"/>',
                data: signupForm.serialize(),
                method: 'POST'
            }).done(function (res) {

                // console.log("res:", res);
                if (res === "success"){
                    alert("회원가입성공");
                    location.href = 'login';
                }
            })
        }

        $(document).ready(function () {

        });
    </script>

</body>
</html>
