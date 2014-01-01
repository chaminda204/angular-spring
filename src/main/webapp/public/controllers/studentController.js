app.controller("StudentController", function($scope, $http){
	$scope.students = "";	
	$scope.init = function(){
		$http({method : "POST", url : "student/getAll"}).
		success(function(data, status){
			$scope.students = data.students;			
		}).
		error(function(data, status){
			alert(data)
		});				
	};
	$scope.loadData = function (){
		if ($scope.student){
			$http({method : "POST", url : "student/get/" + $scope.student.id}).
			success(function(data, status){
				//alert(JSON.stringify(data.schools));
				$scope.student = data.student;
			}).
			error(function(data, status){
				alert(data)
			});			
		}else {
			$scope.student = '';
		}
	};	
});