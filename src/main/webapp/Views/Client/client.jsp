<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients</title>
</head>
<body>
<jsp:include page="../Includes/navbar.jsp"></jsp:include>
<div class="px-10 py-10  h-4/5">
    <div class="sm:flex sm:items-center">
        <div class="sm:flex-auto">
            <h1 class="text-xl font-semibold text-gray-900">Users</h1>
            <p class="mt-2 text-sm text-gray-700">A list of all the users in your account including their name, title,
                email and role.</p>
        </div>
        <div class="mt-4 sm:mt-0 sm:ml-16 sm:flex-none">
            <button type="button"
                    class="inline-flex items-center justify-center rounded-md border border-transparent bg-indigo-600 px-4 py-2 text-sm font-medium text-white shadow-sm hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:ring-offset-2 sm:w-auto">
                Add user
            </button>
        </div>
    </div>
    <div class="mt-8 flex flex-col">
        <div class="-my-2 -mx-4 overflow-x-auto sm:-mx-6 lg:-mx-8">
            <div class="inline-block min-w-full py-2 align-middle md:px-6 lg:px-8">
                <div class="overflow-hidden shadow ring-1 ring-black ring-opacity-5 md:rounded-lg">
                    <table class="min-w-full divide-y divide-gray-300">
                        <thead class="bg-gray-50">
                        <tr>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">Code</th>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">FirstName</th>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">LastName</th>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">BirthDate</th>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">Mobile</th>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">Address</th>
                            <th scope="col" class="px-3 py-3.5 text-left text-sm font-semibold text-gray-900">Actions</th>
                        </tr>
                        </thead>
                        <tbody class="divide-y divide-gray-200 bg-white">
                        <c:forEach var="client" items="${clients}">
                            <tr>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">${client.code}</td>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">${client.firstName}</td>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">${client.lastName}</td>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">${client.birthDate}</td>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">${client.mobile}</td>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">${client.address}</td>
                                <td class="whitespace-nowrap px-3 py-4 text-sm text-gray-500">
                                    <a href="#" class="text-indigo-600 hover:text-indigo-900">Edit</a>
                                    <a class="text-indigo-600">|</a>
                                    <a href="#" class="text-indigo-600 hover:text-indigo-900"> Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../Includes/footer.jsp"></jsp:include>
</body>
</html>
