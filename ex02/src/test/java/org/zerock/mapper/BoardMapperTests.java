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
		private BoardMapper mapper;
		
		@Test
		public void testGetTime() {
			log.info("testGetTime");
			log.info(mapper.getList());
		}
		@Test
		public void testInsert() {
			
			BoardVO board = new BoardVO();
			board.setTitle("�� ����");
			board.setContent("�� ����");
			board.setWriter("�� ����");
			mapper.insert(board);
			
			log.info(board);
		}
		
		@Test
		public void testInsertSelectKey() {
			
			BoardVO board = new BoardVO();
			board.setTitle("���� �ۼ��ϴ±� selectKey");
			board.setContent("selectKey");
			board.setWriter("selectKey");
			mapper.insertSelectKey(board);
			
			log.info(board);
		}
		
		@Test
		public void testRead() {
			BoardVO board = mapper.read(5L);
			
			log.info(board);
		}
		
		@Test
		public void testDelete() {
			log.info("Delete count : " + mapper.delete(3L));
		}
		
		@Test
		public void teestUpdate() {
			BoardVO board = new BoardVO();
			board.setBno(5L);
			board.setTitle("������ ����");
			board.setContent("������ ����");
			board.setWriter("����");
			
			int count = mapper.update(board);
			log.info("update count : " + count);
		}
}
