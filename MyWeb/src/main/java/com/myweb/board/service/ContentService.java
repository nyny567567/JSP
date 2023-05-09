package com.myweb.board.service;

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
		BoardVO vo = dao.contentBoard(bId);
		
		vo.setContent(vo.getContent().replace("\r\n", "<br>"));
		
		request.setAttribute("content", vo);
	}

}
