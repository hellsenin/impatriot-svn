package egovframework.let.cop.bbs.web;

import java.util.List;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.cop.bbs.service.Bull;
import egovframework.let.cop.bbs.service.BullVO;
import egovframework.let.cop.bbs.service.EgovBBSAttributeManageService;

@Controller
public class EgovBBSGetBullListController {
	
    @Resource(name = "EgovBBSAttributeManageService")
    private EgovBBSAttributeManageService bbsAttrbService;
	
	Logger log = Logger.getLogger(this.getClass());
	
	/**
     * 게시물에 대한 목록을 조회한다.
     * 
     * @param boardVO
     * @param sessionVO
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/cop/bbs/getBullList.do")
    public String getBullList(@ModelAttribute("searchVO") BullVO bullVO, ModelMap model) throws Exception {
    	
    	//model.addAttribute("resultList", map.get("resultList"));
    	//model.addAttribute("resultCnt", map.get("resultCnt"));
    	//model.addAttribute("boardVO", boardVO);
    	//model.addAttribute("brdMstrVO", master);
    	//model.addAttribute("paginationInfo", paginationInfo);
    	
    	return "cop/bbs/EgovBoardBullView";
    }
    
    /**
     * 게시물에 대한 목록을 조회한다.
     * 
     * @param boardVO
     * @param sessionVO
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/cop/bbs/getBullList.do")
    public String selectBoardArticles(@ModelAttribute("searchVO") Bull bull, ModelMap model) throws Exception {
    	
    	//LoginVO user = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
    	
    	List<BullVO> bullList = bbsAttrbService.getBullList(bull);

    	model.addAttribute("resultList", bullList);
    	model.addAttribute("resultCnt", bullList.size());
    	model.addAttribute("bull", bull);
    	
    	return "cop/bbs/EgovBoardBullListView";
    }
}