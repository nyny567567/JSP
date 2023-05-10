package com.myweb.board.service;

<<<<<<< HEAD
import javax.servlet.http.Cookie;
=======
>>>>>>> 8cd00c04ab352c27dfee5da82073d9cfe5d9b15b
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.upHit(bId);
<<<<<<< HEAD
		
		
		String bNum = String.valueOf(bId);
		
		boolean flag = false;
		Cookie[] cookies = request.getCookies();
		if(cookies !=null) {
			for(Cookie c : cookies) {
				if(c.getName().equals(bNum)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				Cookie hitCoo = new Cookie(bNum, bNum);
				hitCoo.setMaxAge(15);
				response.addCookie(hitCoo);
				dao.upHit(bId);
			}
		}
//		String bNum = request.getParameter("bId");
		
		
		
		
=======
>>>>>>> 8cd00c04ab352c27dfee5da82073d9cfe5d9b15b
		BoardVO vo = dao.contentBoard(bId);
		
		vo.setContent(vo.getContent().replace("\r\n", "<br>"));
		
		request.setAttribute("content", vo);
	}

}
