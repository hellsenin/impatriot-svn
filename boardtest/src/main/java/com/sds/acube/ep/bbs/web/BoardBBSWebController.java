package com.sds.acube.ep.bbs.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardBBSWebController {
	
	protected Log log = LogFactory.getLog(this.getClass());
	
	@RequestMapping(value="/bbs/login.do")
	public String getBoard(ModelMap model) {
		
		log.info("acube");
		
		return "bbs/BoardBBSWeb";
	}
}