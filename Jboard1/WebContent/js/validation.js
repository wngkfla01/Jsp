$(function() {

	var form = $('.register > form');

	// form의 전송버튼(submit)을 클릭하면
	form.submit(function() {

		if (isUidOk == false) {
			alert('아이디를 확인하세요.');
			return false;
		}

		if (isPassOk == false) {
			alert('비밀번호를 확인하세요.');
			return false;
		}

		if (isNameOk == false) {
			alert('이름을 확인하세요.');
			return false;
		}

		if (isNickOk == false) {
			alert('별명을 확인하세요.');
			return false;
		}

		/*
		if(){
			ala
		}
		if(){
			alert('휴대폰 번호를 확인하세요.')
			return false;
		}
		
		
		 */

		return false;
	})

})