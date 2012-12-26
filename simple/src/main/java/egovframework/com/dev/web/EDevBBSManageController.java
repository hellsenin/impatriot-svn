package egovframework.com.dev.web;

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
public class EDevBBSManageController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "EDevBBSManageService")
    private EDevBBSManageService bbsManageService;
	
	/**
	 * 공지사항 등록
	 * 
	 * @param request
	 * @param model
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/dev/notice/bullReg.do")
	public String exeDevBullReg(HttpServletRequest request, ModelMap model) throws Exception {
		
		EDevBBS eDevBBS = new EDevBBS();
		
		String returnPage = "";
		
		log.info(request.getParameter("regBoardName"));
		log.info(request.getParameter("regTitle"));
		log.info(request.getParameter("regContent"));
		log.info(request.getParameter("regId"));
		log.info(request.getParameter("regName"));
		
		try {
			if (request.getParameter("boardId") != null) {
				eDevBBS.setBoardId(request.getParameter(""));
				eDevBBS.setBoardNm(request.getParameter("regBoardName"));
				eDevBBS.setBullId("");
				eDevBBS.setBullTitle(request.getParameter("regTitle"));
				eDevBBS.setBullContent(request.getParameter("regContent"));
				eDevBBS.setBullRegId(request.getParameter("regId"));
				eDevBBS.setBullRegNm(request.getParameter("regName"));
				
				//bbsManageService.putNoticeBull(eDevBBS);
			} else {
			}
		} catch (Exception e) {
			log.info(e);
		} finally {
			returnPage = "main/EDevMainView";
		}
		
		return returnPage;
	}
}