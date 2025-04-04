package com.mysite.sbb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa(){

		Optional<Question> oq = this.questionRepository.findById(2);
		Assertions.assertTrue(oq.isPresent());
		Question q = oq.get();

		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);

		/*assertEquals(7, this.questionRepository.count());
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		this.questionRepository.delete(q);
		assertEquals(7, this.questionRepository.count());*/

		/*List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		Question q = qList.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());*/
		// 이제 qList를 사용하여 목록에 있는 Question 객체들을 처리합니다.
		// 예를 들어, 목록이 비어있는지 확인하거나, 반복문을 통해 각 질문에 접근할 수 있습니다.
		/*if (qList.isEmpty()) {
			System.out.println("해당 제목의 질문을 찾을 수 없습니다.");
		} else {
			System.out.println("찾은 질문 개수: " + qList.size());
			for (Question question : qList) {
				System.out.println("질문 ID: " + question.getId() + ", 내용: " + question.getContent());
			}
		}*/



		/*Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()){
			Question q = oq.get();
			assertEquals("sbb가 무엇인가요?", q.getSubject());
		}*/
	}

}
