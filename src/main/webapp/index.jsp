<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<jsp:include page="Views/Includes/navbar.jsp"></jsp:include>
<div class="bg-white">
    <main>
        <div class="overflow-hidden pt-8 sm:pt-12 lg:relative lg:py-48">
            <div class="mx-auto max-w-md px-6 sm:max-w-3xl lg:grid lg:max-w-7xl lg:grid-cols-2 lg:gap-24 lg:px-8">
                <div>
                    <div>
                        <img class="h-11 w-auto" src="https://tailwindui.com/img/logos/mark.svg?color=rose&shade=500"
                             alt="Your Company">
                    </div>
                    <div class="mt-20">
                        <div>
                            <a href="#" class="inline-flex space-x-4">
                                <span class="rounded bg-rose-50 px-2.5 py-1 text-sm font-semibold text-rose-500">What's new</span>
                                <span class="inline-flex items-center space-x-1 text-sm font-medium text-rose-500">
                  <span>Just shipped v0.1.0</span>
                                    <!-- Heroicon name: mini/chevron-right -->
                  <svg class="h-5 w-5" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor"
                       aria-hidden="true">
                    <path fill-rule="evenodd"
                          d="M7.21 14.77a.75.75 0 01.02-1.06L11.168 10 7.23 6.29a.75.75 0 111.04-1.08l4.5 4.25a.75.75 0 010 1.08l-4.5 4.25a.75.75 0 01-1.06-.02z"
                          clip-rule="evenodd"/>
                  </svg>
                </span>
                            </a>
                        </div>
                        <div class="mt-6 sm:max-w-xl">
                            <h1 class="text-4xl font-bold tracking-tight text-gray-900 sm:text-5xl">Issue management for
                                growing teams</h1>
                            <p class="mt-6 text-xl text-gray-500">Anim aute id magna aliqua ad ad non deserunt sunt. Qui
                                irure qui lorem cupidatat commodo.</p>
                        </div>
                        <form action="#" class="mt-12 sm:flex sm:w-full sm:max-w-lg">
                            <div class="min-w-0 flex-1">
                                <label for="hero-email" class="sr-only">Email address</label>
                                <input id="hero-email" type="email"
                                       class="block w-full rounded-md border border-gray-300 px-5 py-3 text-base text-gray-900 placeholder-gray-500 shadow-sm focus:border-rose-500 focus:ring-rose-500"
                                       placeholder="Enter your email">
                            </div>
                            <div class="mt-4 sm:mt-0 sm:ml-3">
                                <button type="submit"
                                        class="block w-full rounded-md border border-transparent bg-rose-500 px-5 py-3 text-base font-medium text-white shadow hover:bg-rose-600 focus:outline-none focus:ring-2 focus:ring-rose-500 focus:ring-offset-2 sm:px-10">
                                    Notify me
                                </button>
                            </div>
                        </form>
                        <div class="mt-6">
                            <div class="inline-flex items-center divide-x divide-gray-300">
                                <div class="flex flex-shrink-0 pr-5">
                                    <!-- Heroicon name: mini/star -->
                                    <svg class="h-5 w-5 text-yellow-400" xmlns="http://www.w3.org/2000/svg"
                                         viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                                        <path fill-rule="evenodd"
                                              d="M10.868 2.884c-.321-.772-1.415-.772-1.736 0l-1.83 4.401-4.753.381c-.833.067-1.171 1.107-.536 1.651l3.62 3.102-1.106 4.637c-.194.813.691 1.456 1.405 1.02L10 15.591l4.069 2.485c.713.436 1.598-.207 1.404-1.02l-1.106-4.637 3.62-3.102c.635-.544.297-1.584-.536-1.65l-4.752-.382-1.831-4.401z"
                                              clip-rule="evenodd"/>
                                    </svg>
                                    <!-- Heroicon name: mini/star -->
                                    <svg class="h-5 w-5 text-yellow-400" xmlns="http://www.w3.org/2000/svg"
                                         viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                                        <path fill-rule="evenodd"
                                              d="M10.868 2.884c-.321-.772-1.415-.772-1.736 0l-1.83 4.401-4.753.381c-.833.067-1.171 1.107-.536 1.651l3.62 3.102-1.106 4.637c-.194.813.691 1.456 1.405 1.02L10 15.591l4.069 2.485c.713.436 1.598-.207 1.404-1.02l-1.106-4.637 3.62-3.102c.635-.544.297-1.584-.536-1.65l-4.752-.382-1.831-4.401z"
                                              clip-rule="evenodd"/>
                                    </svg>
                                    <!-- Heroicon name: mini/star -->
                                    <svg class="h-5 w-5 text-yellow-400" xmlns="http://www.w3.org/2000/svg"
                                         viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                                        <path fill-rule="evenodd"
                                              d="M10.868 2.884c-.321-.772-1.415-.772-1.736 0l-1.83 4.401-4.753.381c-.833.067-1.171 1.107-.536 1.651l3.62 3.102-1.106 4.637c-.194.813.691 1.456 1.405 1.02L10 15.591l4.069 2.485c.713.436 1.598-.207 1.404-1.02l-1.106-4.637 3.62-3.102c.635-.544.297-1.584-.536-1.65l-4.752-.382-1.831-4.401z"
                                              clip-rule="evenodd"/>
                                    </svg>
                                    <!-- Heroicon name: mini/star -->
                                    <svg class="h-5 w-5 text-yellow-400" xmlns="http://www.w3.org/2000/svg"
                                         viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                                        <path fill-rule="evenodd"
                                              d="M10.868 2.884c-.321-.772-1.415-.772-1.736 0l-1.83 4.401-4.753.381c-.833.067-1.171 1.107-.536 1.651l3.62 3.102-1.106 4.637c-.194.813.691 1.456 1.405 1.02L10 15.591l4.069 2.485c.713.436 1.598-.207 1.404-1.02l-1.106-4.637 3.62-3.102c.635-.544.297-1.584-.536-1.65l-4.752-.382-1.831-4.401z"
                                              clip-rule="evenodd"/>
                                    </svg>
                                    <!-- Heroicon name: mini/star -->
                                    <svg class="h-5 w-5 text-yellow-400" xmlns="http://www.w3.org/2000/svg"
                                         viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                                        <path fill-rule="evenodd"
                                              d="M10.868 2.884c-.321-.772-1.415-.772-1.736 0l-1.83 4.401-4.753.381c-.833.067-1.171 1.107-.536 1.651l3.62 3.102-1.106 4.637c-.194.813.691 1.456 1.405 1.02L10 15.591l4.069 2.485c.713.436 1.598-.207 1.404-1.02l-1.106-4.637 3.62-3.102c.635-.544.297-1.584-.536-1.65l-4.752-.382-1.831-4.401z"
                                              clip-rule="evenodd"/>
                                    </svg>
                                </div>
                                <div class="min-w-0 flex-1 py-1 pl-5 text-sm text-gray-500 sm:py-3"><span
                                        class="font-medium text-gray-900">Rated 5 stars</span> by over <span
                                        class="font-medium text-rose-500">500 beta users</span></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="sm:mx-auto sm:max-w-3xl sm:px-6">
                <div class="py-12 sm:relative sm:mt-12 sm:py-16 lg:absolute lg:inset-y-0 lg:right-0 lg:w-1/2">
                    <div class="hidden sm:block">
                        <div class="absolute inset-y-0 left-1/2 w-screen rounded-l-3xl bg-gray-50 lg:left-80 lg:right-0 lg:w-full"></div>
                        <svg class="absolute top-8 right-1/2 -mr-3 lg:left-0 lg:m-0" width="404" height="392"
                             fill="none" viewBox="0 0 404 392">
                            <defs>
                                <pattern id="837c3e70-6c3a-44e6-8854-cc48c737b659" x="0" y="0" width="20" height="20"
                                         patternUnits="userSpaceOnUse">
                                    <rect x="0" y="0" width="4" height="4" class="text-gray-200" fill="currentColor"/>
                                </pattern>
                            </defs>
                            <rect width="404" height="392" fill="url(#837c3e70-6c3a-44e6-8854-cc48c737b659)"/>
                        </svg>
                    </div>
                    <div class="relative -mr-40 pl-6 sm:mx-auto sm:max-w-3xl sm:px-0 lg:h-full lg:max-w-none lg:pl-12">
                        <img class="w-full rounded-md shadow-xl ring-1 ring-black ring-opacity-5 lg:h-full lg:w-auto lg:max-w-none"
                             src="https://tailwindui.com/img/component-images/task-app-rose.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>
<jsp:include page="Views/Includes/footer.jsp"></jsp:include>
</body>
</html>