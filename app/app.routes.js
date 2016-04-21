'use strict';

angular.module('Authentication', []);

angular.module('allura-library', [
    'Authentication',
    'ngRoute',
    'ngCookies'
])

.config(function ($routeProvider,  $locationProvider) {

    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });

    $routeProvider
        .when('/login', {
            controller: 'LoginController',
            templateUrl: 'partials/login.html',
            hideMenus: true
        })

        .when('/', {
            controller: 'HomeController',
            templateUrl: 'partials/home.html',
        })

        .otherwise({ redirectTo: '/login' });
});