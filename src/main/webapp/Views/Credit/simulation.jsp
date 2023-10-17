<%@ page language="java" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Simulation</title>
</head>
<body>
<jsp:include page="../Includes/navbar.jsp" />
<div id="steps" class="w-full flex justify-around bg-gray-100">
    <c:if test="${step=1}">
        <jsp:include page="step1.jsp"/>
    </c:if>
    <c:if test="${step=2}">
        <jsp:include page="step2.jsp"/>
    </c:if>
    <c:if test="${step=3}">
        <jsp:include page="step3.jsp"/>
    </c:if>
    <div class="w-2/6 bg-white mx-5 my-5">
        <div class="px-5 py-1.5 border-b border border-gray-200 bg-white px-4 py-5 sm:px-6">
            <h3 class="text-lg font-medium leading-6 text-gray-900">Job Postings</h3>
        </div>
        <div class="px-5 py-1.5 border-b bg-gray-100 w-full">
            <h3 class="font-medium">Mon projet</h3>
        </div>
        <div class="px-5 py-1.5 border-b w-full">
            <h3 class="font-bold" id="project-text">
            </h3>
        </div>
        <div class="px-5 py-1.5 border-b bg-gray-100 w-full">
            <h3 class="font-medium">Détails de mon crédit</h3>
        </div>
        <div class="px-5 py-1.5 border-b w-full flex">
            <h3 class="font-bold w-64">Vous êtes:</h3>
            <span id="travail-text"></span>
        </div>
        <div class="px-5 py-1.5 border-b w-full flex">
            <h3 class="font-bold w-64">Montant: </h3>
            <span id="montant-text"></span>
        </div>
        <div class="px-5 py-1.5 border-b w-full flex">
            <h3 class="font-bold w-64">Durée: </h3>
            <span id="duree-text"></span>
        </div>
        <div class="px-5 py-1.5 border-b w-full flex">
            <h3 class="font-bold w-64">Mensualité: </h3>
            <span id="Mensualite-text"></span>
        </div>
        <div class="px-5 py-1.5 border-b w-full flex">
            <h3 class="font-bold w-64">Frais de dossier: </h3>
            <span>2 332,00 DH</span>
        </div>
    </div>
</div>
<jsp:include page="../Includes/footer.jsp" />
</body>
</html>
