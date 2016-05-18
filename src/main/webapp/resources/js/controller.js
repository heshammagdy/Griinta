var controllersModule = angular.module("basApp.controllers", []);

controllersModule.controller("expenseCategoryController", function($scope, expenseCategoryService) {

    $scope.expenseCategories = expenseCategoryService.query();

    $scope.expenseCategory = new expenseCategoryService();

    $scope.addNewExpenseCategory = function () {

        $scope.expenseCategory.$save(function(){
            $scope.expenseCategories = expenseCategoryService.query();
            resetFormFields($scope);
        });
    }

    $scope.deleteExpenseCategory = function(expenseCategoryId) {

        $scope.expenseCategory.$delete({id:expenseCategoryId}, function(){
            $scope.expenseCategories = expenseCategoryService.query();
        });
    }

});

controllersModule.controller("expenseController", function($scope, expenseCategoryService, expenseService){

    $scope.expenseCategories = expenseCategoryService.query();

    $scope.newExpense = new expenseCategoryService();

    $scope.addNewExpense = function() {

        var isGstIncluded = $scope.newExpense.isGstIncluded;
        var amount = $scope.newExpense.amount;
        if (isGstIncluded) {
           $scope.newExpense.grossAmount = amount;
           $scope.newExpense.netAmount = amount/1.1;
        } else {
           $scope.newExpense.grossAmount = amount * 1.1
           $scope.newExpense.netAmount = amount;
        }

        $scope.newExpense.$save(function() {
            $scope.expenseCategories = expenseCategoryService.query();
        });


    };


});

function resetFormFields($scope) {
    $scope.expenseCategory.name = "";
    $scope.expenseCategory.description = "";
}


