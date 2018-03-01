package com.team5.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team5.po.User;
import com.team5.pojo.Loginjson;
import com.team5.pojo.UpdateUserResult;
import com.team5.service.UserService;

/**
 * 用户管理的控制器
 * 
 * @author Tangyu
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private UserService userService;
	

	@RequestMapping("updateUser.do")
	public @ResponseBody UpdateUserResult updateUser(User user) {
		System.out.println(user.getUserId()+" "+user.getPassword());
		UpdateUserResult updateUserResult = new UpdateUserResult();
		try {
			userService.updateUser(user);
			updateUserResult.setStatus("OK");
			updateUserResult.setMsg("成功");
		} catch (Exception e) {
			updateUserResult.setStatus("no") ;
			updateUserResult.setStatus("不成功");
		} finally {
			return updateUserResult;
		}
	}

	@RequestMapping("check.do")
	public @ResponseBody UpdateUserResult isCheck(User user) {
		User user2 = userService.selectUser(user);
		UpdateUserResult updateUserResult = new UpdateUserResult();
		if (user2 == null) {
			updateUserResult.setStatus("no");
			updateUserResult.setMsg("密码错误");
		} else {
			if (user.getPassword().equals(user2.getPassword())) {
				updateUserResult.setStatus("OK");
				updateUserResult.setMsg("密码正确");
			} else {
				updateUserResult.setStatus("no");
				updateUserResult.setMsg("密码错误");
			}
		}
		return updateUserResult;
	}
	
	@RequestMapping("checkinfo.do")
	public @ResponseBody UpdateUserResult checkInfo(User user){
		User user2=new User();
		UpdateUserResult updateUserResult = new UpdateUserResult();
		try {
			user2.setUserId(user.getUserId());
			user2.setAddress(user.getAddress());
			userService.updateUser(user2);
			user2=new User();
			user2.setUserId(user.getUserId());
			user2.setPhone(user.getPhone());
			userService.updateUser(user2);
			updateUserResult.setStatus("OK");
			updateUserResult.setMsg("更新地址和电话成功");
		} catch (Exception e) {
			updateUserResult.setStatus("no");
			updateUserResult.setStatus("不成功");
		} finally {
			return updateUserResult;
		}
	}
	
	@RequestMapping("info.do")
	public @ResponseBody User Info(User user){
		return userService.getUserById(user.getUserId());
	}
	
	
	@RequestMapping("getUserInfo.do")
	public @ResponseBody User getUserInfo(@RequestBody String id){
		 
		User user = new User();
		if(id.contains("@")){
    		user.setEmail(id);
    	}else if(id.length()==11){
    		user.setPhone(id);
    	}else if(id.length()==18){
    		user.setIdCard(id);
    	}else{
    		return null;
    	}
		try{
			return userService.selectUser(user);
		}catch (Exception e) {
			return null;
			// TODO: handle exception
		}
	
		
	}
	
}
