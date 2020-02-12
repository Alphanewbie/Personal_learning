package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.VisitorMybatisDAO;
import model.vo.VisitorVO;
@WebServlet("/visitormybatis")
public class VisitorServletDB2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keyword = request.getParameter("keyword");
		
		VisitorMybatisDAO dao = new VisitorMybatisDAO();
		if(keyword == null) {
			List<VisitorVO> list = dao.listAll();
			for(VisitorVO vo : list) {
				System.out.println(vo.getMemo());
			}
			request.setAttribute("list", list);
		} else {
			List<VisitorVO> list = dao.search(keyword);
			if(list.size() == 0) {
				request.setAttribute("msg", keyword+"를 담고있는 글이 없어용(mybatis)");
			} else {
				request.setAttribute("list", list);
			}
		}
		request.getRequestDispatcher("/jspexam/visitorView.jsp")
        .forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");		
		String name = request.getParameter("name");
		String memo = request.getParameter("content");
		VisitorMybatisDAO dao = new VisitorMybatisDAO();
		VisitorVO vo = new VisitorVO();
		vo.setName(name);
		vo.setMemo(memo);
		boolean result = dao.insert(vo);
		if(result) {
			request.setAttribute("msg", name+"님의 글이 성공적으로 입력되었어요!!..(mybatis)");
		} else {
			request.setAttribute("msg", name+"님의 글이 입력에 실패했어요!!(mybatis)");
		}
		request.getRequestDispatcher("/jspexam/visitorView.jsp")
		           .forward(request, response);
	}
}
