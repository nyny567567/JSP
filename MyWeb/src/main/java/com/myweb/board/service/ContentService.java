package com.myweb.board.service;

<<<<<<< HEAD
import javax.servlet.http.Cookie;
=======
<<<<<<< HEAD
import javax.servlet.http.Cookie;
=======
>>>>>>> 8cd00c04ab352c27dfee5da82073d9cfe5d9b15b
>>>>>>> 53e6a99af68d1867ed83f5e3c0733cb3e79dbc18
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		BoardDAO dao = BoardDAO.getInstance();
<<<<<<< HEAD
		
		/*
		 # 쿠키로 조회수를 컨트롤 해 보자.
		 1. 사용자가 글 제목을 눌러서 상세보기 요청을 보낼 때 
		 글 번호로 된 쿠키를 하나 만들어 줄 겁니다. (String)
		 쿠키 이름과 쿠키에 저장할 값을 모두 글 번호로 만들어 주겠습니다.
		 쿠키의 수명은 15초로 설정하겠습니다.
		 
		 2. 요청을 보낼 때 같이 넘어온 쿠키 중에, 
		  현재 글 번호와 일치하는 쿠키가 존재한다면 조회수를 올려주지 않을 겁니다.
		  현재 글 번호와 일치하는 쿠키가 없다면 조회수를 올려주도록 하겠습니다.  
		 */
		
		String bNum = request.getParameter("bId");
		
		boolean flag = false;
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
=======
		dao.upHit(bId);
<<<<<<< HEAD
		
		
		String bNum = String.valueOf(bId);
		
		boolean flag = false;
		Cookie[] cookies = request.getCookies();
		if(cookies !=null) {
>>>>>>> 53e6a99af68d1867ed83f5e3c0733cb3e79dbc18
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
<<<<<<< HEAD
		
		
		
=======
//		String bNum = request.getParameter("bId");
		
		
		
		
=======
>>>>>>> 8cd00c04ab352c27dfee5da82073d9cfe5d9b15b
>>>>>>> 53e6a99af68d1867ed83f5e3c0733cb3e79dbc18
		BoardVO vo = dao.contentBoard(bId);
		
		vo.setContent(vo.getContent().replace("\r\n", "<br>"));
		
		request.setAttribute("content", vo);
	}

}










