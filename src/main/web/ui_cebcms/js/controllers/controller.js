/**
 * Created by Administrator on 2015/10/22.
 */
'use strict'
var app = angular.module('index',[
    "ui.router",
    "ui.bootstrap",
    "oc.lazyLoad",
    "ngSanitize",
    "ngTouch",
    "ngResource",
    "ui.grid"
]);

app.controller('newsController',['$scope','$http',function($scope,$http){
    alert("1111111111");
    $http.get('/index/news').success(function(data) {
        $scope.datas= data;
    });
}
]);