package egovframework.com.dev.web;

import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.dev.service.EDevBBS;
import egovframework.com.dev.service.EDevBBSManageService;
import egovframework.com.dev.util.EDevBBSManageUtil;

@Controller@SessionAttributes(types = ComDefaultVO.class)
public class EDevBBSManageController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "EDevBBSManageService")
    private EDevBBSManageService bbsManageService;
	
	private Document result;
	
	/**
	 * 비동기 방식으로 게시판 종류 리스트를 가져온다.
	 * 
	 * @param request
	 * @param model
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/dev/getDevBoardName.do")
	public void getDevBoardName(HttpServletRequest request, HttpServletResponse reponse, ModelMap model) throws Exception {
		
		EDevBBS eDevBBS = new EDevBBS();
		reponse.setContentType("text/html; charset=UTF-8");
		reponse.setCharacterEncoding("UTF-8");
		PrintWriter out = reponse.getWriter();
		XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat().setEncoding("UTF-8"));
		String action = request.getParameter("action");
		
		try {
			if ("getDevBoardName".equals(action)) {
				//reponse.setContentType("text/html; charset=UTF-8");
				//reponse.setCharacterEncoding("UTF-8");
				result = bbsManageService.getBoardNmList(eDevBBS);
				
				log.info(result.toString());
				log.info(outputter.outputString(result));
				
				out.write(outputter.outputString(result));
				out.close();
			}
		} catch (Exception e) {
			log.info(e);
		} finally {
		}
	}
	
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
		
		log.info("Request regBoardId : " + request.getParameter("regBoardId"));
		log.info("Request regBoardName : " + request.getParameter("regBoardName"));
		log.info("Request regTitle : " + request.getParameter("regTitle"));
		log.info("Request regContent : " + request.getParameter("regContent"));
		log.info("Request regId : " + request.getParameter("regId"));
		log.info("Request regName : " + request.getParameter("regName"));
		log.info("Request regBullId : " + EDevBBSManageUtil.getBullId(request.getParameter("regBoardId")));
		
		try {
			if (request.getParameter("regBoardId") != null) {
				eDevBBS.setBoardId(request.getParameter("regBoardId"));
				eDevBBS.setBoardNm(request.getParameter("regBoardName"));
				eDevBBS.setBullId(EDevBBSManageUtil.getBullId(request.getParameter("regBoardId")));
				eDevBBS.setBullTitle(request.getParameter("regTitle"));
				eDevBBS.setBullContent(request.getParameter("regContent"));
				eDevBBS.setBullRegId(request.getParameter("regId"));
				eDevBBS.setBullRegNm(request.getParameter("regName"));
				
				bbsManageService.putNoticeBull(eDevBBS);
			} else {
				log.info("[exeDevBullReg] Request Parameter regBoardId is null !!!");
			}
		} catch (Exception e) {
			log.info(e);
		} finally {
			returnPage = "main/EDevMainView";
		}
		
		return returnPage;
	}
	
	/*
	@RequestMapping(value = "/dev/notice/bullReg.do")
	public String exeDevBullReg(@RequestParam(value="regTitle", required=false) String regTitle,
										@RequestParam(value="regContent", required=false) String regContent,
										@RequestParam(value="regId", required=false) String regId,
										@RequestParam(value="regName", required=false) String regName, ModelMap model) throws Exception {
		
		EDevBBS eDevBBS = new EDevBBS();
		
		String returnPage = "";
		
		log.info(regTitle);
		log.info(regContent);
		log.info(regId);
		log.info(regName);
		
		try {
			if (regTitle != null) {
				//eDevBBS.setBoardId(request.getParameter(""));
				//eDevBBS.setBoardNm(request.getParameter("regBoardName"));
				eDevBBS.setBullId("");
				eDevBBS.setBullTitle(regTitle);
				eDevBBS.setBullContent(regContent);
				eDevBBS.setBullRegId(regId);
				eDevBBS.setBullRegNm(regName);
				
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
	 * */
}