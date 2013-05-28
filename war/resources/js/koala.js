angular.module('koala', ['ui.bootstrap']);

function navbarController($scope, $dialog) {

	var t = '<div class="modal-header">'+
          '<h1>Login</h1>'+
          '</div>'+
          '<div class="modal-body">'+
          '<label>UserId: </label><input ng-model="userid" required/>'+
          '<label>Password: </label><input ng-model="password" required/>'+
          '</div>'+
          '<div class="modal-footer">'+
          '<button ng-click="close(true)" class="btn btn-primary" >Login</button>'+
          '<button ng-click="close()" class="btn" >Close</button>'+
          '</div>';

  	$scope.opts = {
    	backdrop: false,
    	keyboard: false,
    	backdropClick: false,
    	template:  t, // OR: templateUrl: 'path/to/view.html',
    	controller: 'loginController'
  	};

	$scope.login = function() {
		var d = $dialog.dialog($scope.opts);
    	d.open().then(function(result){
      		if(result) {
        		alert('dialog closed with result: ' + result);
      		}
    	});
	};
} 

function loginController($scope, $http, dialog){
  $scope.userid = "";
  $scope.password = "";
  $scope.close = function(result){
  	if (result) {
  		alert("userid: " + $scope.userid + " password: " + $scope.password);
  		var data = {userid: $scope.userid, password: $scope.password};
  		$http.post('/login', data).success(function() {
  			alert("back");
  		});

  	} else {
    	dialog.close(false);
    }
  };
}