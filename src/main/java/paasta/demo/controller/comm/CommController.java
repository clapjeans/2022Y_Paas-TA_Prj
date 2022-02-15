package paasta.demo.controller.comm;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;

import paasta.demo.dto.UserDTO;

public class CommController extends AbstractController{
	
	// UserDTO null 체크 해서 리턴 주는 메서드
	public String userDTOCheck(UserDTO pDTO, String accessToken, HttpSession session, ModelMap model) {
		String user_name = "";
		String user_id = "";
		String msg = "카모마일 서비스에 회원가입 먼저 해주세요!";
		String url = "/loginPage";
		String res = "실패";
		
		if (pDTO != null) {
			user_id = pDTO.getUser_id();
			user_name = pDTO.getUser_name();
			log.info("유저 이름 : " + user_id);
			log.info("유저 아이디 : " + user_name);
			msg = "카카오 로그인 성공 되었습니다.";
			url = "/index";
			
			model.addAttribute("msg", msg);
			model.addAttribute("url", url);
			/* 로그아웃 처리 시, 사용할 토큰 값 */
			session.setAttribute("kakaoToken", accessToken); //세션 값으로 정보 유지
			session.setAttribute("user_id", user_id);
			session.setAttribute("user_name", user_name);
			res = "성공";
		} else {
			model.addAttribute("msg", msg);
			model.addAttribute("url", url);
		}

		return res;
	}
	
	// res 상수 값으로 로그인 성공 유무 확인하는 메서드
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
