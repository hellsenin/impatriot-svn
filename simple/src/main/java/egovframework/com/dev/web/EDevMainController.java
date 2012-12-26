package egovframework.com.dev.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.dev.service.EDevBBS;
import egovframework.com.dev.service.EDevBBSManageService;

@Controller@SessionAttributes(types = ComDefaultVO.class)
public class EDevMainController {
	
	Logger log = Logger.getLogger(this.getClass());
	
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
		
		EDevBBS eDevBBS = new EDevBBS();
		
		List<EDevBBS> resultList = new ArrayList<EDevBBS>();
		
		try {
			if (request.getParameter("boardId") != null) {
				eDevBBS.setBoardId(request.getParameter("boardId"));
				resultList = bbsManageService.getBullList(eDevBBS);
			} else {
				eDevBBS.setBoardId("TU_111");
				resultList = bbsManageService.getBullList(eDevBBS);
			}
		} catch (Exception e) {
			log.info(e);
		} finally {
			model.addAttribute("resultList", resultList);
		}
		
		return "main/EDevMainView";
	}
	
	/**
	 * Dev 지도 페이지 조회
	 * @return 지도페이지 정보 Map [key : 항목명]
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