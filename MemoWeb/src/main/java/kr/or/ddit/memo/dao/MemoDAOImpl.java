package kr.or.ddit.memo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.CustomSqlSessionFactoryBuilder;
import kr.or.ddit.vo.MemoVO;

public class MemoDAOImpl implements MemoDAO {
	SqlSessionFactory sqlSessionFactory = CustomSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Override
	public List<MemoVO> selectMemoList() {
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			MemoDAO proxy = session.getMapper(MemoDAO.class);
			return proxy.selectMemoList();
		}
	}

	@Override
	public int insertMemo(MemoVO memoVO) {
		try(
			SqlSession session = sqlSessionFactory.openSession(true);
		){
			MemoDAO proxy = session.getMapper(MemoDAO.class);
			return proxy.insertMemo(memoVO);
		}
	}

	@Override
	public int updateMemo(MemoVO memoVO) {
		try(
			SqlSession session = sqlSessionFactory.openSession(true);
		){
			MemoDAO proxy = session.getMapper(MemoDAO.class);
			return proxy.updateMemo(memoVO);
		}
	}

	@Override
	public int deleteMemo(int code) {
		try(
			SqlSession session = sqlSessionFactory.openSession(true);
		){
			MemoDAO proxy = session.getMapper(MemoDAO.class);
			return proxy.deleteMemo(code);
		}
	}
}