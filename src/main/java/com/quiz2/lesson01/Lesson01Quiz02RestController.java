package com.quiz2.lesson01;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController // spring bean, @Controller + @ResponseBody
public class Lesson01Quiz02RestController {

	
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String,Object> map = new HashMap<String,Object>() {
			{put("rate",15); put("director", "봉준호"); put("time",131); put("title","기생충");}
		};
		list.add(map);
		map = new HashMap<String,Object>() {
			{put("rate",0); put("director", "로베르토 베니니"); put("time",116); put("title","인생은 아름다워");}
		};
		list.add(map);
		map = new HashMap<String,Object>() {
			{put("rate",19); put("director", "윤종빈"); put("time",133); put("title","범죄와의 전쟁 : 나쁜놈들 전성시대");}
		};
		list.add(map);
		
		map = new HashMap<String,Object>() {
			{put("rate",15); put("director", "프린시스 로렌스"); put("time",137); put("title","헝거게임");}
		};
		list.add(map);
		
		return list;
	}
	
	@RequestMapping("/2")
	public List<Board> quiz02_2(){
		
		// @ResponseBody + return String => HttpMessageConverter String(html) => Response body에 내려감
		// @ResponseBody + return 객체(List, Map, 클래스) => HttpMessageConverter jackson 라이브러리 => JSON이 response body에 내려감 => API
		List<Board> result = new ArrayList<>();
		Board board = new Board(); // 일반 자바 bean(객체)
		board.setTitle("안녕하세요 가입인사 드립니다");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요");
		result.add(board);
		
		board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다 222");
		board.setUser("hagulu 222");
		board.setContent("안녕하세요. 가입했어요 2222");
		result.add(board);
		
		board = new Board();
		board.setTitle("안녕하세요 가입인사 드립니다 3333");
		board.setUser("hagulu 333");
		board.setContent("안녕하세요. 가입했어요 3333");
		result.add(board);
		return result;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Board> quiz02_3(){
		Board board = new Board(); // 일반 자바 bean(객체)
		board.setTitle("안녕하세요 가입인사 드립니다");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요");
		
		
		return new ResponseEntity<>(board,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
		
	//	String 리턴 : 최종 응답 HTML
	// 객체 리턴(내가 만든 객체, Map, List): 최종 응답 JSON
	
	
}
