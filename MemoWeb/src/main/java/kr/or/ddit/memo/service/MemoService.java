package kr.or.ddit.memo.service;

import java.util.List;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.vo.MemoVO;

public interface MemoService {
	/**
	 * 메모 전체 목록 조회
	 * @return
	 */
	public List<MemoVO> retrieveMemoList();
	/**
	 * 메모 추가
	 * @param memoVO
	 * @return 성공시 OK, 실패시 FAIL
	 */
	public ServiceResult createMemo(MemoVO memoVO);
	/**
	 * 메모 수정
	 * @param memoVO
	 * @return 성공시 OK, 실패시 FAIL
	 */
	public ServiceResult modifyMemo(MemoVO memoVO);
	/**
	 * 메모 삭제
	 * @param code
	 * @return 성공시 OK, 실패시 FAIL
	 */
	public ServiceResult removeMemo(int code);
}
