package egovframework.com.dev.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.dev.service.EDevUser;
import egovframework.com.dev.service.EDevUserManageService;

@Controller@SessionAttributes(types = ComDefaultVO.class)
public class EDevUserManageController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "EDevUserManageService")
    private EDevUserManageService userManageService;
	
	/**
	 * Dev 사용자 정보 등록
	 * @return 등록 성공 여부
	 * 
	 * @param request
	 * @param model
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/dev/user/userReg.do")
	public String exeDevUserReg(HttpServletRequest request, ModelMap model) throws Exception {
		
		EDevUser eDevUser = new EDevUser();
		String returnPage = "";
		
		log.info("Request regUserId : " + request.getParameter("regUserId"));
		log.info("Request regUserName : " + request.getParameter("regUserName"));
		log.info("Request regUserAge : " + request.getParameter("regUserAge"));
		
		try {
			if (request.getParameter("regUserId") != null) {
				eDevUser.setUserId(request.getParameter("regUserId"));
				eDevUser.setUserName(request.getParameter("regUserName"));
				eDevUser.setUserAge(Integer.parseInt(request.getParameter("regUserAge")));
				
				userManageService.putUserInfo(eDevUser);
			} else {
				log.info("[exeDevUserReg] Request Parameter regUserId is null !!!");
			}
		} catch (Exception e) {
			log.info(e);
		} finally {
			returnPage = "main/EDevMainView";
		}
		
		return returnPage;
	}
}