(function (angular) {
  'use strict';



  angular.module('wp-angular-starter').directive('focusMe', function () {
    return {
      restrict: 'A',
      scope: {
        focusMe: '='
      },
      link: function (scope, elt) {
        scope.$watch('focusMe', function (val) {
          if (val) {
            elt[0].focus();
          }
        });
      }
    };
  });

  angular.module('wp-angular-starter').component('wpInput', {
    templateUrl: 'app/components/wp-input.view.html',
    bindings: {
      wpLabel: '@',
      wpModel: '=',
      wpType: '<',
      wpFocus: '='
    },
    controller: 'GroupController',
    controllerAs: 'vm'
  });



})(angular);
