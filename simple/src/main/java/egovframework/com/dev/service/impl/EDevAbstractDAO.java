package egovframework.com.dev.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

public class EDevAbstractDAO extends SqlMapClientDaoSupport {
	
	protected EDevAbstractDAO() {
		
    }
	
	/**
     * Annotation 형식으로 sqlMapClient 를 받아와 이를
     * super(SqlMapClientDaoSupport) 의 setSqlMapClient
     * 메서드를 호출하여 설정해 준다.
     * @param sqlMapClient
     *        - ibatis 의 SQL Map 과의 상호작용을 위한 기본 클래스로
     *        mapped statements(select, insert, update,
     *        delete 등) 의 실행을 지원함.
     */
    @Resource(name = "sqlMapClient")
    public void setSuperSqlMapClient(SqlMapClient sqlMapClient) {
        super.setSqlMapClient(sqlMapClient);
    }
	
	/**
     * 리스트 조회 처리 SQL mapping 을 실행한다.
     * @param queryId
     *        - 리스트 조회 처리 SQL mapping 쿼리 ID
     * @param parameterObject
     *        - 리스트 조회 처리 SQL mapping 입력 데이터(조회 조건)를
     *        세팅한 파라메터 객체(보통 VO 또는 Map)
     * @return 결과 List 객체 - SQL mapping 파일에서 지정한
     *         resultClass/resultMap 에 의한 결과 객체(보통 VO
     *         또는 Map)의 List
     */
    @SuppressWarnings("unchecked")
    public List list(String queryId, Object parameterObject) {
        return getSqlMapClientTemplate().queryForList(queryId, parameterObject);
    }
}