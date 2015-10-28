/**
 * Created by Administrator on 2015/10/19.
 */
'use strict'

var app = angular.module("app", [
    "ui.router",
    "ui.bootstrap",
    "oc.lazyLoad",
    "ngSanitize",
    "ngTouch",
    "ngResource",
    "ui.grid"


]);

app.config(['$stateProvider', '$urlRouterProvider',function($stateProvider,$urlRouterProvider){
    $stateProvider
        //首页部分
        .state('index', {
            url: "/index.html",
            templateUrl: "/ui_cebcms/view/index/index.html",
            //data: {pageTitle: 'Dashboard', pageSubTitle: 'statistics & reports'},
            controller:"newsController",
            resolve: {
                deps: ['$ocLazyLoad', function($ocLazyLoad) {
                    return $ocLazyLoad.load({
                        name: 'app',
                        //insertBefore: '#ng_load_plugins_before', // load the above css files before '#ng_load_plugins_before'
                        files: [
                            '/ui_cebcms/js/scripts/index.js',
                            '/ui_cebcms/js/filters/subFilter.js',

                            '/ui_cebcms/js/controllers/controller.js'

                        ]
                    });
                }]
            }
        })

}
]);
