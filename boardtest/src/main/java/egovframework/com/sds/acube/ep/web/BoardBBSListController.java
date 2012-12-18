package egovframework.com.sds.acube.ep.web;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.com.sds.acube.ep.service.BoardBBSListService;
import egovframework.com.sds.acube.ep.service.BoardBBSListVO;
import egovframework.let.cop.bbs.service.EgovBBSAttributeManageService;
import egovframework.let.cop.bbs.service.EgovBBSManageService;
import egovframework.rte.fdl.property.EgovPropertyService;

@Controller
public class BoardBBSListController {
	
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name = "EgovBBSAttributeManageService")
    private EgovBBSAttributeManageService bbsAttrbService;
	
	@Resource(name = "propertiesService")
    protected EgovPropertyService propertyService;
	
	@Resource(name = "EgovBBSManageService")
    private EgovBBSManageService bbsMngService;
	
	@Resource(name = "BoardBBSListService")
    private BoardBBSListService boardBBSListService;
	
	@RequestMapping("/com/bbs/BoardBBSList.do")
	public String getBoardBBSList (@ModelAttribute("searchVO") BoardBBSListVO boardListBBSVO, ModelMap model) throws Exception {
		
		//LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();

		boardListBBSVO.setBoardId("TU_111");
		
		boardBBSListService.getBoardBBSList(boardListBBSVO);

		log.debug("acube");

		return "bbs/BoardBBSList";
	}
}