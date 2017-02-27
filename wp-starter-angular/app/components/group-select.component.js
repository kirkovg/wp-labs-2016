(function (angular) {
  angular.module('wp-angular-starter').component('groupSelect',{
    templateUrl: 'app/components/group-select.view.html',
    bindings: {
      wpModel: '='
    },
    controller: 'StudentController',
    controllerAs: 'vm'
  });
})(angular);
