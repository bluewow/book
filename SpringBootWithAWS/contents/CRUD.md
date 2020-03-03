# Mustache 를 통한 화면 구성하기

## 템플릿엔진과 Mustache
템플릿 엔진이란? 

- 지정된 템플릿 양식(JSP, Freemarker, Mustache, React, Vue 등)과 데이터가 합쳐저 HTML 문서를 만들어 출력하는 포맷

이 책에서는 Mustache 를 다루며 아래의 장점을 가지고 있다

- 문법이 심플하다
- 로직 코드를 사용할 수 없어 View 의 역활과 서버의 역활을 명확하게 분리할 수 있다
- 클라이언트 / 서버 모두 지원한다

## Mustache 파일 생성

Spring boot 내의 Mustache 위치

![layout](../assets/crud_1.png)

## 기타
- Spring boot 는 기본적으로 src/main/resources/static 에 위치한 JS, CSS, Image 등 정적파일들은 URL 에서 /로 설정된다
- index.js 에서 변수의 속성에 function 을 추가한 이유는?
	- 브라우저의 스코프는 공용공간이기 때문에 덮어쓰일 수 















<!--stackedit_data:
eyJoaXN0b3J5IjpbLTYyNDYwOTUwOCwxOTk3NTQyOTIwXX0=
-->