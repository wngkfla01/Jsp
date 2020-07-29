package kr.farmstory2.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.farmstory2.controller.CommonService;

public class LogoutService implements CommonService {

	@Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		HttpSession sess = req.getSession();
		sess.invalidate();
		
		return "redirect:/Farmstory2/index.do";
	}

}
