'use strict';

angular.module('myApp').factory('BlogService',
		[ '$http', '$q', function($http, $q) {

			var REST_SERVICE_URI = 'http://localhost:9050/vanuchatserver/blog';

			var factory = {
				fetchAllBlog : fetchAllBlog,
				createBlog : createBlog,
				updateBlog : updateBlog,

			};
			return factory;
			function fetchAllBlog() {
				var deferred = $q.defer();
				$http.get(REST_SERVICE_URI).then(function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Error while fetching Blogs');
					deferred.reject(errResponse);
				});
				return deferred.promise;
			}
			function createBlog(Blog) {
				var deferred = $q.defer();
				$http.post(REST_SERVICE_URI, Blog).then(function(response) {
					deferred.resolve(response);
				}, function(errResponse) {
					console.error('Error while creating Blog');
					deferred.reject(errResponse);
				});
				return deferred.promise;
			}
			function updateBlog(Blog, id) {
				var deferred = $q.defer();
				$http.put(REST_SERVICE_URI + id, Blog).then(function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Error while updating Blog');
					deferred.reject(errResponse);
				});
				return deferred.promise;
			}
			function postblogComments(Blog, id) {
				var deferred = $q.defer();
				$http.put(REST_SERVICE_URI + id, Blog).then(function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Error while updating Blog');
					deferred.reject(errResponse);
				});
				return deferred.promise;
			}
		} ]);
