package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
;;

@Controller //HelloController가 컨트롤러의 역할을 한다는 뜻
public class demo2controller {
    @GetMapping("/hello") //hello URL 요청이 발생시, hello method가 실행됨을 의미한다.
    @ResponseBody 
    public String hello() {
        return "웰컴투 스프링부트";
    }
}
//특정 URL 경로를 매서드와 연결하는 것을 Mapping 이라고한다.
