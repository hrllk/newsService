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
    <jsp:include page="/WEB-INF/views/include/header.jsp"/>

    <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-success">
            <div class="panel-heading">
<%--                <div class="panel-title">환영합니다!</div>--%>
                <h2>News</h2>
            </div>
            <div class="col-sm-6 col-md-offset-3">
                <form role="form" id="signupForm">
                    <div class="form-group">
                        <label for="inputName">제목</label>
<%--                        <input type="text" class="form-control" id="inputName" placeholder="이름을 입력해 주세요" name="name" value="${news.subject}"readonly >--%>
<%--                        <input type="text" class="form-control" id="inputName" placeholder="이름을 입력해 주세요" name="name" value="${news.subject}"readonly >--%>
                        <label>${news.subject}</label>
                    </div>
                    <div class="form-group">
                        <label>내용</label>
<%--                        <input type="email" class="form-control" id="InputEmail" placeholder="이메일 주소를 입력해주세요" name="id">--%>
                        <label>${news.contents}</label>
                    </div>
                    <div class="form-group">
                                                <label>출처</label>
                        <%--                        <input type="email" class="form-control" id="InputEmail" placeholder="이메일 주소를 입력해주세요" name="id">--%>
                        <label>${news.link}</label>
                    </div>
<%--                    <div class="form-group">--%>
<%--                                                <label>originallink</label>--%>
<%--                        &lt;%&ndash;                        <input type="email" class="form-control" id="InputEmail" placeholder="이메일 주소를 입력해주세요" name="id">&ndash;%&gt;--%>
<%--                        <label>${news.originallink}</label>--%>
<%--                    </div>--%>

<%--                    <div class="form-group">--%>
<%--                        <label for="inputPassword">비밀번호</label>--%>
<%--                        <input type="password" class="form-control" id="inputPassword" placeholder="비밀번호를 입력해주세요" name="password">--%>
<%--                    </div>--%>
                </form>
            </div>

                <%--            <div class="row">--%>
<%--                <div class="col-12">--%>

<%--                    <button type="button" class="btn btn-info float-right" onclick="setup()">키워드설정</button>--%>
<%--                </div>--%>
<%--            </div>--%>



<%--            <input type="hidden" id="userId" value="<c:out value='${userId}'/>"/>--%>
<%--            <input type="hidden" id="userId" value='<c:out value="${userId}"/>'/>--%>
<%--            <input type="hidden" id="userId" value="${userId}"/>--%>
<%--            <table id="newsTb" class="table table-striped table-bordered" style="width:100%">--%>
<%--                <thead>--%>
<%--                <tr>--%>
<%--                    <th>newsId</th>--%>
<%--                    <th>provider</th>--%>
<%--                    <th class="subject">subject</th>--%>
<%--                    <th>pubAt</th>--%>
<%--                </tr>--%>
<%--                </thead>--%>
<%--            </table>--%>

        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/views/include/javascript.jsp"/>

<script type="text/javascript">

    let newsTb = $("#newsTb");
    let boardListRESTURL = '<c:url value="/rest/v1/news"/>';
    let userId = $("#userId").val();

    function setup(){
        location.href = 'keywords';
    }

    function detail(rowNum) {

        let row = newsTb.DataTable().row(rowNum).data();

        let newsId = row.newsId;
        // console.log("newsId:", newsId);
        // console.log("row:", row);
        // console.log("click!!");
        location.href = '<c:url value="/news/detail"/>' + '/' + newsId;
    }
    function getCollectedNews(){

        newsTb.DataTable({

            /* DataTable Ajax */
            "ajax": {
                "url": boardListRESTURL + "/" + userId,
                "type": "GET",
                // "data": systemUserSendToServerDataForSearch,
                "dataSrc": function (res) {
                    return res.data;
                }
            },

            /* 컬럼 */
            "columns": [
                {data: 'newsId'},
                {data: 'provider'},
                {data: 'subject'},
                {data: 'pubAt'}

            ],


            /* 열 설정 */
            "columnDefs": [{
                targets: 'subject',
                render: function (data, type, row, meta) {
                    // return '<input type="checkbox" class="checkDelete" name="checkDeleteName"/>';
                    // return '<a href="#">' + data + '</a>';
                    return '<a href="#" onclick="detail('+ meta.row +')">' + data + '</a>';
                    // return '<a href="#" onclick="detail()">' + data + '</a>';
                    <%--return '<a href="<c:url value='/news/   detail?id=" '"'"' + meta.row/>">' + data + '</a>';--%>
                }
            }],

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
