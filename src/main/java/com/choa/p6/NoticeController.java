package com.choa.p6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.choa.notice.NoticeDAO;
import com.choa.notice.NoticeDTO;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeDAO noticeDAO;
		
	@RequestMapping("/View")
	public String getView(@RequestParam int num, Model model){
		NoticeDTO ndto=null;
		try {
			ndto=noticeDAO.noticeView(num);
			
			System.out.println(ndto.getTitle());
			model.addAttribute("ndto",ndto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "notice/noticeView";
	}
	

}
