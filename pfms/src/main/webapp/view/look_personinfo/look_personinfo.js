/**
 * Created by 郑剑锋 on 2017/7/2.
 */

function getCookie(c_name)
{
    if (document.cookie.length>0)
    {
        c_start=document.cookie.indexOf(c_name + "=")
        if (c_start!=-1)
        {
            c_start=c_start + c_name.length+1
            c_end=document.cookie.indexOf(";",c_start)
            if (c_end==-1) c_end=document.cookie.length
            alert(unescape(document.cookie.substring(c_start,c_end)));
            return unescape(document.cookie.substring(c_start,c_end));
        }
    }
    alert("空");
    return "空";
}
function getInfo(){
	 alert("getinfo方法开始");
    var id=getCookie("user_id");
    var data='{"id":'+id+'}';
    $.post("pfms/user/getUserInfo.do",data,function(data){
    	console.log(data);
        if(data==null){
        	return;
        }else{
        	 var json = jQuery.parseJSON(data);
        	 alert(json.userId);
        	 $("#name").html(json.name);
        	 $("#birthday").html(json.birthday);
        	 $("#sex").html(json.sex);
        	 $("#phone").html(json.phone);
        	 $("#birthday").html(json.birthday);
        	 $("#idcard").html(json.idcard);
        }
    })
}
$().ready(function(){
	alert("a");
})
