/**
 * Created by Administrator on 2015/10/19.
 */
var app = angular.module("app", [
    "ui.router",
    "ui.bootstrap",
    "oc.lazyLoad",
    "ngSanitize",
    "ngTouch",
    "ngResource",
    "ui.grid"
]);
//
//app.config(['$stateProvider', '$urlRouterProvider',function($stateProvider,$urlRouterProvider){
//    $routeProvider
//        .when('/welcome', {templateUrl:'views/foregroundModule/index/welcome.html',controller: 'welcomeCtrl'})
//        .when('/allnews', {templateUrl:'views/foregroundModule/news/allnews.html',controller: 'allNewsCtrl'})
//        .when('/newsdetail', {templateUrl:'views/foregroundModule/news/newsdetail.html',controller: 'newsdetailCtrl'})
//        .when('/productdetail', {templateUrl:'views/foregroundModule/product/productdetail.html',controller: 'productdetailCtrl'})
//        .when('/allpartner', {templateUrl:'views/foregroundModule/partner/allpartner.html',controller: 'allpartnerCtrl'})
//        .when('/allrecruitment', {templateUrl:'views/foregroundModule/recruitment/allrecruitment.html',controller: 'allrecruitmentCtrl'})
//        .when('/recruitmentdetail', {templateUrl:'views/foregroundModule/recruitment/recruitmentdetail.html',controller: 'recruitmentdetailCtrl'})
//        .when('/allproduct', {templateUrl:'views/foregroundModule/product/allproduct.html',controller: 'allproductCtrl'})
//        .when('/companyprofile', {templateUrl:'views/foregroundModule/companyprofile/companyprofiles.html',controller: 'companyprofilesCtrl'})
//        .when('/enterpriseculture', {templateUrl:'views/foregroundModule/enterpriseculture/enterprisecultures.html',controller: 'enterpriseculturesCtrl'})
//        .when('/development', {templateUrl:'views/foregroundModule/development/developments.html',controller: 'developmentsCtrl'})
//        .when('/honor', {templateUrl:'views/foregroundModule/honor/honors.html',controller: 'honorsCtrl'})
//        .when('/contactus', {templateUrl:'views/foregroundModule/contactus/contactus.html',controller: 'contactusCtrl'})
//
//}
//]);
