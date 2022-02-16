'use strict'

function doLoginCheck(formTag) 
{
	if (user_id.value == "") 
	{
		alert("아이디를 입력해주세요.");
		formTag.user_id.focus();
		return false;
	}
	if (password.value == "") 
	{
		alert("비밀번호를 입력해주세요.");
		formTag.password.focus();
		return false;
	}
}