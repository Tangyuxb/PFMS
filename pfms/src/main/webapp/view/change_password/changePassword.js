/**
 * 修改密码
 */

function user() {
	var oldpwd = $("#pwd_old").val();
	$.get("/pfms/user/check.do",
			{
				userId:"13883485018",
				password:oldpwd
			},
		    function(data){
				console.log(data);
				var json = jQuery.parseJSON(data);
				console.log(json);
				if (json.status == "OK") {
					$("#span_old_password").html("*√");
				} else {
					$("#span_old_password").html("*输入密码错误");
				}
	});
};

function checkPassword() {
	var reg = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$/;// 6~12位数字字母组合
	var value = $('#pwd_new1').val();
	if (!reg.test(value)) {
		$("#span_new1_password").html("*错误，至少包含字母和数字，6~12位字符");
	} else {
		$("#span_new1_password").html("*√密码可用");
		;
	}
}

function isEqualPwd() {
	var value1 = $('#pwd_new1').val();
	var value2 = $('#pwd_new2').val();
	if (value1 != null && value2 != null) {
		if (value2 == value1) {
			$("#span_confirm_password").html("*");
		} else {

			$("#span_confirm_password").html("*与新密码不相同，请重新输入");
		}
	} else {
		if (value1 == null && value2 != null)
			$("#span_confirm_password").html("*与新密码不相同，请重新输入");
		else
			return;
	}

}

function update() {
	console.log("sd");
	$.post("/pfms/user/updateUser.do",
			{
				userId:"13883485018",
				password:$("#pwd_new2").val()
			},
			function(data){
				var json = jQuery.parseJSON(data);
				console.log(json);
				if (json.status == "OK") {
					$("#exampleModal").modal('show');
				} else {
					return ;
				}
			}
			);
}

