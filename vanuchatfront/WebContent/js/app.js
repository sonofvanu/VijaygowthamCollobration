'use strict';

var App = angular.module("myApp", ["ngRoute"]);

App.config(function($routeProvider,$locationProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "/index"
    })
    .when("/login", {
        templateUrl : "/login.jap"        
    })
    .when("/about", {
        templateUrl : "/aboutus.jsp"
    })
    .when("/userreg", {
        templateUrl : "/userreg.jsp"        
    });
    $locationProvider.html5Mode({
  	  enabled: true,
  	  requireBase: false
  	});
  //  $locationProvider.html5Mode(true);
});