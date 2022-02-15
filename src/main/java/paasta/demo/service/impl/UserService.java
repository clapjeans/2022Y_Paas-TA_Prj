package paasta.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paasta.demo.dto.UserDTO;
import paasta.demo.persistance.mapper.UserMapper;
import paasta.demo.service.IUserInfoService;
import paasta.demo.service.comm.AbstractService;

@Service("UserService")
public class UserService extends AbstractService implements IUserInfoService {

	@Autowired
	private UserMapper userMapper;
	// => 유저 로그인을 위한 메서드
	@Override
	public int getUserInfo(String user_id, String password) {
		log.info(this.getClass().getName() + "getUserInfo Service Start");
		int res = 0;
		
		UserDTO pDTO = new UserDTO();
		pDTO.setUser_id(user_id);
		pDTO.setPassword(password);
		
		UserDTO uDTO = new UserDTO();
		uDTO = userMapper.getUserInfo(pDTO);
		
		if(uDTO != null) {
			res = 1;
			log.info("user_id : " + uDTO.getUser_id());
			log.info("user_name : " + uDTO.getUser_name());
		}
		log.info(this.getClass().getName() + "getUserInfo Service End");
		return res;
	}
	//=> 카카오 로그인 시도
	@Override
	public UserDTO kakaoLoginProc(UserDTO pDTO) {
		log.info(this.getClass().getName() + "카카오로그인 이메일 -> 서비스 로그인 시도");
		return userMapper.getUserInfoKakao(pDTO);
	}

}
