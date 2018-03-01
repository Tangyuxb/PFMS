/**
 * Created by ֣���� on 2017/6/28.
 */
var code ; //��ȫ�ֶ�����֤��
//������֤��
window.onload= createCode();

function createCode(){
    code = "";
    var codeLength = 5;//��֤��ĳ���
    var checkCode = document.getElementById("checkCode");
    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        'S','T','U','V','W','X','Y','Z');//�����
    for(var i = 0; i < codeLength; i++) {//ѭ������
        var index = Math.floor(Math.random()*36);//ȡ���������������0~35��
        code += random[index];//��������ȡ��������ӵ�code��
    }
    checkCode.innerHTML = code;//��codeֵ������֤��
}
//У����֤��
function validate(){
    var inputCode = document.getElementById("inputCode").value.toUpperCase(); //ȡ���������֤�벢ת��Ϊ��д
    if(inputCode.length <= 0) { //���������֤�볤��Ϊ0
        alert("请重新输入验证码！"); //�򵯳���������֤��
    }
    else if(inputCode != code ) { //���������֤�����������֤�벻һ��ʱ
        alert("验证码错误！"); //�򵯳���֤���������
        createCode();//ˢ����֤��
        document.getElementById("input").value = "";//����ı���
    }
    else { //������ȷʱ
        // alert("^-^"); //����^-^
       
    	login();
    }
}

function login(){
	var id=$("#id").val();
	var password=$("#password").val();
    $.ajax(
        {
            type:"post",
            
            url:"http://localhost:8080/pfms/user/login.do",
            contentType:"application/json;charset=utf-8",
            data:'{"name":'+id+',"password":'+password+'}',
            success:function(data){
            	console.log(data);
            	var json = jQuery.parseJSON(data);
            	if(json[0]=="0"){
            		 SetCookie('user_id', id, 7);
            		window.location='../look_personinfo/main.html';
            	}else{
            		$("#span_id").html(json[1]);
            	}
            
            	
            	
            	
            }
        }
    );
}

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
function SetCookie(cookieName,cookieValue,nDays) {
    /*当前日期*/
    var today = new Date();
    /*Cookie过期时间*/
    var expire = new Date();
    /*如果未设置nDays参数或者nDays为0，取默认值1*/
    if(nDays == null || nDays == 0) nDays = 1;
    /*计算Cookie过期时间*/
    expire.setTime(today.getTime() + 3600000 * 24 * nDays);
    /*设置Cookie值*/
    document.cookie = cookieName + "=" + escape(cookieValue)
        + ";path=/";
}



