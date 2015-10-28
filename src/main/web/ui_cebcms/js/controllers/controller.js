/**
 * Created by Administrator on 2015/10/22.
 */
'use strict'

app.controller('newsController',['$scope','$http',function($scope,$http){
    $http.get('/platform/index/news').success(function(data) {
        $scope.datas= data;
    });

    //$http({
    //    method:'get',
    //    url:'/index/news',
    //    params: {title:"123131"}
    //}).success(function(data, status, headers, config){
    //    //$scope.datas = data;
    //});

}
]);