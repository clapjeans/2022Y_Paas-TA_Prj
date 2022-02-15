package paasta.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import paasta.demo.controller.comm.AbstractController;
import paasta.demo.service.IUserInfoService;
import paasta.demo.util.CmmUtil;

@Controller
public class UserLoginController extends AbstractController{
	
	@Resource(name = "UserService")
	private IUserInfoService userSevice;
	
	//=> 로그인 페이지 리턴
	@GetMapping(value = "loginPage/")
	public String loginPage() {
		log.info(this.getClass().getName() + ".Logim Page load Start");
		log.info(this.getClass().getName() + ".Logim Page load End");
		return "/user/UserLoginPage";
	}
	//=> 로그인 처리 프로세스 POST
	@PostMapping(value = "loginPage/loginProc")
	public String loginProc(HttpServletRequest request) throws Exception{
		log.info(this.getClass().getName() + ".Logim Process Start");
		
		String user_id = CmmUtil.nvl(request.getParameter("user_id"));
		log.info("user_id : " + user_id);
		
		String password = CmmUtil.nvl(request.getParameter("password"));;
		log.info("password : " + password);
		
		int res = userSevice.getUserInfo(user_id, password);
		log.info("Login Sucess ? : " + res);
		
		String msg = "";
		String url = "";
		if(res == 1) {
			msg = "로그인 성공";
			url = "";
		} else {
			msg = "로그인 실패";
			url = "";
		}

		log.info(this.getClass().getName() + ".Logim Process End");
		return "/redirect";
	}
	

}
