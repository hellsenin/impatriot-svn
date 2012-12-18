package egovframework.com.sds.acube.ep.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.sds.acube.ep.service.BoardBBSListService;
import egovframework.com.sds.acube.ep.service.BoardBBSListVO;

@Service("BoardBBSListService")
public class BoardBBSListServiceImpl implements BoardBBSListService {
	
	@Resource(name = "boardBBSListDAO")
    private BoardBBSListDAO boardBBSListDAO;

	public BoardBBSListVO getBoardBBSList(BoardBBSListVO boardListBBSVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
