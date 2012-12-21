package egovframework.com.dev.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.dev.service.EDevBBSManageService;
import egovframework.let.cop.bbs.service.EgovBBSAttributeManageService;

@Controller@SessionAttributes(types = ComDefaultVO.class)
public class EDevMainController {
	
	@Resource(name = "EDevBBSManageService")
    private EDevBBSManageService bbsManageService;
	
	/**
	 * Dev 메인 페이지 조회
	 * @return 메인페이지 정보 Map [key : 항목명]
	 * 
	 * @param request
	 * @param model
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/dev/main/mainPage.do")
	public String getDevMainPage(HttpServletRequest request, ModelMap model) throws Exception {
		
		model.addAttribute("resultList", resultList);
    	model.addAttribute("bull", bull);
		
		return "main/EDevMainView";
	}
	
	/**
	 * Dev 메인 페이지 조회
	 * @return 메인페이지 정보 Map [key : 항목명]
	 * 
	 * @param request
	 * @param model
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/dev/navi/mainPage.do")
	public String getDevNaviPage(HttpServletRequest request, ModelMap model) throws Exception {
		
		// 공지사항 메인 컨텐츠 조회 시작 ---------------------------------
		
		
		// 공지사항 메인컨텐츠 조회 끝 -----------------------------------
		
		return "dev/EDevNavi";
	}
}