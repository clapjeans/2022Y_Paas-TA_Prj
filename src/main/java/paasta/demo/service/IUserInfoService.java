package paasta.demo.service;

import paasta.demo.dto.UserDTO;

public interface IUserInfoService {

	int getUserInfo(String user_id, String password); // => 로그인을 위한 메서드

	UserDTO kakaoLoginProc(UserDTO pDTO); // => 엑세스토큰으로 받은 이메일로 로그인 시도하는 메세드

	
}
