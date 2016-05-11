package com.choa.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeImpl implements NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String nameSpace="NoticeMapper";
	
	@Override
	public List<NoticeDTO> listAll(int startNum, int lastNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void noticeWrite(NoticeDTO noticeDTO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public NoticeDTO noticeView(int num) throws Exception {
		NoticeDTO ndto =sqlSession.selectOne(nameSpace+".noticeView", num);
		
		return ndto;
	}

	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
