'use strict';

angular.module('Authentication', []);

angular.module('allura-library', [
    'Authentication',
    'ngRoute',
    'ngCookies'
])

.controller('MainCtrl', ['$scope', '$location', function($scope, $location) {

}])

.config(function ($routeProvider,  $locationProvider) {

    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });

    $routeProvider
        .when('/login', {
            url: '/login',
            controller: 'LoginCtrl',
            templateUrl: 'partials/login.html',
            hideMenus: true
        })

        .when('/', {
            url: '/',
            controller: 'HomeCtrl',
            templateUrl: 'partials/home.html',
        })

        .when('/profile', {
            controller: 'ProfileCtrl',
            templateUrl: 'partials/profile.html',
        })

        .when('/books', {
            controller: 'BooksCtrl',
            templateUrl: 'partials/books.html',
        })

        .otherwise({ redirectTo: '/' });
})
.controller('LoginCtrl', ['$scope', '$location', function($scope, $location) {
    $scope.activetab = $location.path();
}])

.controller('HomeCtrl', ['$scope', '$location', function($scope, $location) {
    $scope.activetab = $location.path();
}])

.controller('BooksCtrl', ['$scope', '$location', function($scope, $location) {
    $scope.activetab = $location.path();
}])

.controller('ProfileCtrl', ['$scope', '$location', function($scope, $location) {
    $scope.activetab = $location.path();
}])