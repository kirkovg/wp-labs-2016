(function (angular) {
  'use strict';

  angular
    .module('wp-angular-starter')
    .controller('StudentController', StudentController);

  StudentController.$inject = ['$log', 'StudentService','GroupService'];

  /* @ngInject */
  function StudentController($log, StudentService, GroupService) {
    var vm = this;
    vm.title = 'Student';
    vm.save = save;
    vm.clear = clear;
    vm.edit = edit;
    vm.remove = remove;
    vm.entity = {};
    vm.entities = [];
    vm.groups = [];
    vm.saveOkMsg = null;
    vm.saveErrMsg = null;
    vm.itemsByPage = 2;
    vm.numDisplayedPages = 3;


    //loadStudents();
    loadGroups();

    function loadGroups() {
      GroupService.getAll().then(function (data) {
        vm.groups = data;
      });
    }

    function loadStudents() {
      StudentService.getAll().then(function (data) {
        vm.entities = data;
      })
    }

    function save() {
      vm.saveOkMsg = null;
      vm.saveErrMsg = null;

      var promise = StudentService.save(vm.entity);
      promise.then(successCallback, errorCallback);
      function successCallback(data) {
        loadStudents();
        vm.saveOkMsg = "Student with id " + data.id + " is saved";
        clear();
      }

      function errorCallback(data) {
        vm.saveErrMsg = "Saving error occurred: " + data.message;
      }
    }

    function clear() {
      vm.entity = {};
    }

    function edit(entity) {
      vm.entity = {};
      angular.extend(vm.entity, entity);
    }

    function remove(entity) {
      StudentService
        .remove(entity)
        .then(function () {
          loadStudents();
        });
    }
  }

})(angular);

