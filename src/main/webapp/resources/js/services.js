var servicesModule = angular.module("basApp.services", []);

servicesModule.factory('expenseCategoryService', function($resource) {

    return $resource('/bas/services/expenseCategory/:id',{}, {});
});

servicesModule.factory('expenseService', function($resource) {

    return $resource('/bas/services/expense/:id');

});

servicesModule.factory('incomeService', function($resource) {

    return $resource('/bas/services/income/:id');

});


