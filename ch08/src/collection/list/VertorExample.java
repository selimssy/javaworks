package collection.list;

import java.util.List;
import java.util.Vector;

public class VertorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();
		
		// 게시글 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		
		
		//2번 인덱스 삭제
		list.remove(2);   // 그럼 제목3에 해당하는게 없어진다!  1 2 4 5 가 남는다
		list.remove(3);   // 1 2 4 5 중 5가 없어지고 1 2 4만 남는다!
		
		
		
		// 전체 출력
		for(int i = 0; i <list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		
	}

}
