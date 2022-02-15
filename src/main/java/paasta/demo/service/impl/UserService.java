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
		UserDTO uDTO = new UserDTO();
		uDTO.setUser_id(user_id);
		uDTO.setPassword(password);
		userMapper.getUserInfo(uDTO);
		log.info(this.getClass().getName() + "getUserInfo Service End");
		return 0;
	}

}
