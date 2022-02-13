package kopo.notice.util.kakaoService.comm;
/* @Auth 최별규
 * @Version 1.0
 * Kakao API를 사용하기 위한 private한 정보를 담는 인터페이스
 *  ____________________________________________________________________________________
 * |   작성일     |   작성자    |                          내용                        |
 * |------------------------------------------------------------------------------------
 * | 2022.02.12 |  최별규     | 초안 작성
 * */
/* TIP !!
 * 추가 동의 받는 양식 아래 양식 지키기
 * https://kauth.kakao.com/oauth/authorize?client_id={REST_API_KEY}&redirect_uri={REDIRECT_URI}&response_type=code&scope=account_email 
 * */
public interface IKakaoInfo {
	//=====================================기본 정보 ==============================================================================
	// String Redirect_URI = "http://www.detectiongas.com/kakaoLogin.do"; // 리다이렉트 URI(Cloud Deploy)
	final String Redirect_URI = "http://localhost:8080/kakaoLogin.do"; // 리다이렉트 URI(local용)
	final String RESTAPI_KEY = "27c978dd34db046ade506b3d1fb46013"; // 키
	final String SampleRequest= "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="; // 카카오 접속 앤드포인트  url
	//==========================================================================================================================
	//=============================================요청 URL=======================================================================
	final String AccessTokenReqURL = "https://kauth.kakao.com/oauth/token";
	final String UserInfoReqURL = "https://kapi.kakao.com/v2/user/me";
	final String UserLogotReqURL = "https://kapi.kakao.com/v1/user/logout";
	//=============================================카카오 메시지 보내는 정보 설정=========================================================
	final String SEND_TALK_URL = "https://kapi.kakao.com/v2/api/talk/memo/default/send"; // 톡 보내는 URL
	//===========================================================================================================================
}
