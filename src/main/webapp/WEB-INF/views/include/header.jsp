<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/collections">HOME</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
<%--            <li class="nav-item active">--%>
<%--                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>--%>
<%--            </li>--%>
            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/keywords"/>'>keywords</a>
            </li>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="#">Pricing</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link disabled" href="#">Disabled</a>--%>
<%--            </li>--%>
        </ul>
    </div>
</nav>