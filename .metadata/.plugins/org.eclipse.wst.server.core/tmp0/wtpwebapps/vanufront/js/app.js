'use strict';

var App = angular.module("myApp", ["ngRoute"]);
App.config(function($routeProvider,$locationProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "index.html"
    })
    .when("/login", {
        templateUrl : "login.html"        
    })
    .when("/about", {
        templateUrl : "about.html"
    })
     .when("/contact", {
        templateUrl : "contact.html"
    })
    .when("/userreg", {
        templateUrl : "userreg.html"        
    })
    .when("/vanuhome", {
        templateUrl : "vanuchathome.html"        
    });

    
});