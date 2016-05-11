package com.choa.notice;

import java.util.List;

public interface NoticeDAO {
	
public List<NoticeDTO> listAll(int startNum, int lastNum) throws Exception;
	
	public void noticeWrite(NoticeDTO noticeDTO) throws Exception;
	
	public NoticeDTO noticeView(int num) throws Exception;
	
	public int getCount() throws Exception;

}
