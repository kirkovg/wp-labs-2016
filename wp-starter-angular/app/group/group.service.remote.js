/**
 * Created by Win 8 on 29.11.2016.
 */

(function (angular) {
  'use strict';

  angular
    .module('wp-angular-starter')
    .factory('GroupService', GroupServiceFn);

  GroupServiceFn.$inject = ['$log', '$resource'];

  /* @ngInject */
  function GroupServiceFn($log, $resource) {

    var resource = $resource('/api/groups/:id',{id: '@id'},{
      'update': {
        method: 'PUT',
        isArray: false,
        params: {
          id: "@id"
        }
      }
    });

    var service = {
      save: saveFn,
      update: updateFn,
      getById: getByIdFn,
      getAll: getAllFn,
      remove: removeFn
    };


    return service;


    function saveFn(groupEntity) {
      if (groupEntity.id == null || groupEntity.id == undefined) {
        return resource.save(groupEntity).$promise;
      } else {
        return updateFn(groupEntity);     // must *return* promise to the calling function (saveFn)
      }
    }

    function updateFn(groupEntity) {
      return resource.update(groupEntity).$promise;
    }

    function getByIdFn(groupId) {
      return resource.get({id: groupId}).$promise;
    }

    function getAllFn() {
      return resource.query().$promise;
    }

    function removeFn(groupEntity) {
      return resource.remove(groupEntity).$promise;
    }

  }
})(angular);
