package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
//	@Setter(onMethod_= {@Autowired})
		@Autowired
		private BoardMapper boardMapper;
		
		@Test
		public void testGetTime() {
			log.info("testGetTime");
			log.info(boardMapper.getList());
		}
		@Test
		public void testInsert() {
			
			BoardVO board = new BoardVO();
			board.setTitle("새 제목");
			board.setContent("새 내용");
			board.setWriter("새 저자");
			boardMapper.insert(board);
			
			log.info(board);
		}
		
		@Test
		public void testInsertSelectKey() {
			
			BoardVO board = new BoardVO();
			board.setTitle("새로 작성하는글 selectKey");
			board.setContent("selectKey");
			board.setWriter("selectKey");
			boardMapper.insertSelectKey(board);
			
			log.info(board);
		}
		
		@Test
		public void testRead() {
			BoardVO board = boardMapper.read(5L);
			
			log.info(board);
		}
		
		@Test
		public void testDelete() {
			log.info("Delete count : " + boardMapper.delete(3L));
		}
		
		@Test
		public void teestUpdate() {
			BoardVO board = new BoardVO();
			board.setBno(5L);
			board.setTitle("수정된 제목");
			board.setContent("수정된 내용");
			board.setWriter("저자");
			
			int count = boardMapper.update(board);
			log.info("update count : " + count);
		}
}
