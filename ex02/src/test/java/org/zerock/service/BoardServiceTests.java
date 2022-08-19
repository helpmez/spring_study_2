package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.TimeMapper;
import org.zerock.mapper.TimeMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Autowired
	private BoardService boardService;
	
	@Test
	public void testService() {
		
		
		log.info("testService");
		log.info(boardService);
		assertNotNull(boardService);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("새로작성");
		
		boardService.register(board);
		
		log.info("생성된 게시글의 번호:" + board.getBno());
	}
	
	@Test
	public void testGetList() {
		boardService.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		log.info(boardService.get(1L));
	}
}
