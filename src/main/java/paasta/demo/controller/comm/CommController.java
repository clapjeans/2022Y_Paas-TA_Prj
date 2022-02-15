package paasta.demo.controller.comm;

import org.springframework.ui.ModelMap;

public class CommController extends AbstractController{
	
	// res 값으로 로그인 성공 유무 확인하는 메서드
	public String resLoginCheck(int res, ModelMap model) {
		String msg ="";
		String url ="";
		if(res == 1) {
			msg = "로그인 성공";
			url = "/index";
		} else {
			msg = "로그인 실패";
			url = "/";
		}
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		return "clear";
	}

}
