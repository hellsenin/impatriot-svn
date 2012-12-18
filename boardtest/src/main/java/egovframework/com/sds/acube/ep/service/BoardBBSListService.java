/**
 * 
 */
package egovframework.com.sds.acube.ep.service;

/**
 * @author Admin
 *
 */
public interface BoardBBSListService {
	
	/**
     * 공통코드를 조회한다.
     * 
     * @param vo
     * @return List(코드)
     * @throws Exception
     */
    public BoardBBSListVO getBoardBBSList(BoardBBSListVO boardListBBSVO) throws Exception;
}