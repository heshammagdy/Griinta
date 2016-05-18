angular.module("basApp", [
  "basApp.services",
  "basApp.controllers",
  "ngRoute",
  "ngResource"
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.
	when("/expensecategory", {templateUrl: "partials/createExpenseType.html", controller: "expenseCategoryController"}).
	when("/enterexpense", {templateUrl: "partials/enterExpense.html", controller: "expenseCategoryController"}).
    when("/enterincome", {templateUrl: "partials/enterIncome.html", controller: "expenseCategoryController"}).
    when("/incomeexpensereport", {templateUrl: "partials/incomeExpenseReport.html", controller: "expenseCategoryController"}).
	otherwise({redirectTo: '/enterexpense'});
}]);

