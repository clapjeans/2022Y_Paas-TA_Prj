package paasta.demo.dto;

/**
 * @author 최별규
 * @version 1.1 로그인 DTO
 */
public class UserDTO {

	private String user_email; // 유저 이메일
	private String user_id; // 아이디
    private String password; // 비밀번호
    private String user_name; // 이름
    private String user_addr; //주소
    private String access_token; // 카카오 로그인 및 톡 발송용 토큰
    
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
    
    
}
