package kr.or.ddit.memo.service;

import java.util.List;

import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.memo.dao.MemoDAO;
import kr.or.ddit.memo.dao.MemoDAOImpl;
import kr.or.ddit.vo.MemoVO;

public class MemoServiceImpl implements MemoService {
	MemoDAO dao = new MemoDAOImpl();
	@Override
	public List<MemoVO> retrieveMemoList() {
		return dao.selectMemoList();
	}

	@Override
	public ServiceResult createMemo(MemoVO memoVO) {
		int rowcnt = dao.insertMemo(memoVO);
		return rowcnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}

	@Override
	public ServiceResult modifyMemo(MemoVO memoVO) {
		int rowcnt = dao.updateMemo(memoVO);
		return rowcnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}

	@Override
	public ServiceResult removeMemo(int code) {
		int rowcnt = dao.deleteMemo(code);
		return rowcnt > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}

}
