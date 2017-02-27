(function (angular) {
  'use strict';

  angular.module('wp-angular-starter').component('groupSize',{
    templateUrl: 'app/components/group-size.view.html',
    bindings: {
      wpModel: '='
    },
    controller: 'GroupController',
    controllerAs: 'vm'
  });
})(angular);
