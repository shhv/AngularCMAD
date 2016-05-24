$(document).ready(function(){
$("#login-button").click(function(){
var email = $("#login-text").val();
var password = $("#login-pass").val();
alert("email :"+ email);
alert("password :"+ password);
// Checking for blank fields.
if( email =='' || password ==''){
alert("Please fill all fields...!!!!!!");
}else {
$.post("rest/user",
	{"id":201,"name":"abcd","emailId":email,"password":password,"joinDate":null,"age":45,"state":"AZ"},
	function(){
		alert("invoked");
	});
}
});
});