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
                <%--                <div class="panel-title">환영합니다!</div>--%>
                <h2>Keyword Detail</h2>
            </div>
            <%--            <div class="row">--%>
            <%--                <div class="col-12">--%>

            <%--                    <button type="button" class="btn btn-info float-right" onclick="detail()">등록</button>--%>
            <%--                </div>--%>
            <%--            </div>--%>
            <%--            <input type="hidden" id="userId" value="<c:out value='${userId}'/>"/>--%>
            <%--            <input type="hidden" id="userId" value='<c:out value="${userId}"/>'/>--%>
            <%--            <table id="newsTb" class="table table-striped table-bordered" style="width:100%">--%>
            <%--                <thead>--%>
            <%--                <tr>--%>
            <%--                    <th>keywordId</th>--%>
            <%--                    <th>keyword</th>--%>
            <%--                    <th>createdAt</th>--%>
            <%--                </tr>--%>
            <%--                </thead>--%>
            <%--            </table>--%>

            <div class="col-sm-12 col-md-offset-3">
                <form role="form" id="form">
                    <div class="form-group">
                        <label for="keyword">키워드</label>
                        <input type="text" class="form-control" id="keyword" placeholder="등록하실 키워드를 입력해주세요"
                               name="keyword" onkeyup="trim()">
                    </div>
                    <div class="form-group">

                        <input type="hidden" id="userId" name="userId" value="${userId}"/>
                    </div>
                    <%--                    <div class="form-group">--%>
                    <%--                        <label for="InputEmail">이메일 주소</label>--%>
                    <%--                        <input type="email" class="form-control" id="InputEmail" placeholder="이메일 주소를 입력해주세요" name="id">--%>
                    <%--                    </div>--%>
                    <%--                    <div class="form-group">--%>
                    <%--                        <label for="inputPassword">비밀번호</label>--%>
                    <%--                        <input type="password" class="form-control" id="inputPassword" placeholder="비밀번호를 입력해주세요" name="password">--%>
                    <%--                    </div>--%>
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
                        <button type="button" id="join-submit" class="btn btn-primary" onclick="register()">
                            등록<i class="fa fa-check spaceLeft"></i>
                        </button>
                        <button type="button" onclick="goback()" class="btn btn-warning">
                            취소<i class="fa fa-times spaceLeft"></i>
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/views/include/javascript.jsp"/>

<script type="text/javascript">

    let newsTb = $("#newsTb");
    let keywordListRESTURL = '<c:url value="/rest/v1/keywords"/>';
    let userId = $("#userId").val();
    let form = $("#form");
    let keyword = $("#keyword");

    function detail() {
        location.href = '<c:url value="/keywords/register"/>';
    }

    function goback() {
        location.href = '<c:url value="/keywords"/>';
    }

    function trim() {
        keyword.val(keyword.val().replace(" ", ","));
    }

    function register() {
        console.log("signup !! this.serialize: " + form.serialize());
        $.ajax({
            url: '<c:url value="/rest/v1/keywords"/>',
            data: form.serialize(),
            method: 'POST'
        }).done(function (res) {

            // console.log("res:", res);
            if (res === 1) {
                alert("키워드등록완료");
                location.href = '<c:url value="/keywords"/>';
            }
        })
    }

    function getCollectedNews() {


        // newsTb.DataTables({
        newsTb.DataTable({

            /* DataTable Ajax */
            "ajax": {
                "url": keywordListRESTURL + "/" + userId,
                "type": "GET",
                // "data": systemUserSendToServerDataForSearch,
                "dataSrc": function (res) {
                    return res.data;
                }
            },

            /* 컬럼 */
            "columns": [
                {data: 'newsId'},
                {data: 'subject'},
                {data: 'collectionTime'}

            ],


            /* 열 설정 */
            // "columnDefs": [{
            //     targets: 'systemUserCheckbox',
            //     render: function (data, type, row, meta) {
            //         return '<input type="checkbox" class="checkDelete" name="checkDeleteName"/>';
            //     }
            //
            // }, {
            //     targets: 'id',
            //     /* 유저정보수정 */
            //     render: function (data, type, row, meta) {
            //         return '<a id="searchId" href="#">' + data + '</a>';
            //     }
            // }, {
            //     targets: 'lastUpdateTime',
            //     render: function (data, type, row, meta) {
            //         data = getFormatDate(data);
            //         return data;
            //     }
            // }, {
            //     targets: 'gender',
            //     render: function (data, type, row, meta) {
            //         var gender;
            //         if (data === 1) {
            //             gender = "male";
            //         } else if (data === 2) {
            //             gender = "female";
            //         } else {
            //             return data;
            //         }
            //
            //         return gender;
            //     }
            // }, {
            //     targets: 'permission',
            //     render: function (data, type, row, meta) {
            //         var permission;
            //         if (data === 0) {
            //             permission = "R";
            //         } else if (data === 1) {
            //             permission = "M";
            //         } else {
            //             return data;
            //         }
            //
            //         return permission;
            //     }
            // }],


            /* 게시물수 */
            "length": 10,

            // "serverSide": true,

            /* 로딩(?) */
            "processing": true,

            /* 표시건수 */
            "lengthChange": true,

            /* 검색 */
            "searching": false,

            /* 정렬 */
            "ordering": false,

            /* 페이징 */
            "paging": true,

            /* 정보표시 */
            "info": false

        });

    }

    $(document).ready(function () {
        console.log("userId : ", userId);
        getCollectedNews();
    });
</script>

</body>

</html>
