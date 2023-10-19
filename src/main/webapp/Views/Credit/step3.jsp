<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="w-2/5 bg-white mx-5 my-5">
    <form action="/credit/create/finish" method="post" class="flex items-center py-5 w-full flex-col ">
        <div class="w-3/4 py-2">
            <label for="firstName" class="block text-sm font-medium text-gray-700">First Name</label>
            <input disabled  value="${client.firstName}" type="text" id="firstName" name="firstName"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-2">
            <label for="lastName" class="block text-sm font-medium text-gray-700">Last Name</label>
            <input disabled  value="${client.lastName}" type="text" id="lastName" name="lastName"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-2">
            <label for="birthDate" class="block text-sm font-medium text-gray-700">Birthday</label>
            <input disabled  value="${client.birthDate}" type="date" id="birthDate" name="birthDate"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-2">
            <label for="mobile" class="block text-sm font-medium text-gray-700">Phone Number</label>
            <input disabled  value="${client.mobile}" type="text" id="mobile" name="mobile"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-2">
            <label for="address" class="block text-sm font-medium text-gray-700">address</label>
            <input disabled  value="${client.address}" type="text" id="address" name="address"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-2">
            <label for="code" class="block text-sm font-medium text-gray-700">Code</label>
            <input disabled  value="${client.code}" type="text" id="code" name="code"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm"/>
        </div>
        <div class="w-3/4 py-2">
            <button
                    onclick="calc()"
                    id="subMainForm"
                    class="border mt-1 block w-full rounded-md border-gray-300 py-2 pl-3 pr-10 text-base focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm">
                Continuer
            </button>
        </div>
    </form>
</div>