package ch13;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
		
		// 결과: 제목1-내용1
		//     제목2-내용2  
		
		
	}

}
