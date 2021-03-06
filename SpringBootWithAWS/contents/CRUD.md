# Mustache 를 통한 화면 구성하기

## 템플릿엔진과 Mustache
템플릿 엔진이란? 

- 지정된 템플릿 양식(JSP, Freemarker, Mustache, React, Vue 등)과 데이터가 합쳐저 HTML 문서를 만들어 출력하는 포맷

이 책에서는 Mustache 를 다루며 아래의 장점을 가지고 있다

- 문법이 심플하다
- 로직 코드를 사용할 수 없어 View 의 역활과 서버의 역활을 명확하게 분리할 수 있다
- 클라이언트 / 서버 모두 지원한다

## 사용 라이브러리
- bootstrap
- jQuery

## Mustache 파일 생성

Spring boot 내의 Mustache 위치

![layout](../assets/crud_1.png)

## 구성도

![layout](../assets/crud_2.png)

## 정리
- Spring boot 에서 Front 관련 코드는 어디서 관리될까?
	- Spring boot 는 기본적으로 src/main/resources 에 위치하며 자동으로 인식된다
- index.js 에서 변수의 속성에 function 을 추가한 이유는?
	- 브라우저의 스코프는 공용공간이기 때문에 덮어쓰일 수 있다 (중복 회피)
- 페이지 로딩속도를 높이는 방법은?
	- css 는 header 에 js 는 footer 에 배치. HTML 의 로딩순서는 위에서부터 아래이다. 즉 js 의 용량이 클수록 실행이 느려지면 css 를 먼저 호출한다
- 레이아웃 방식이란?
	- 공통영역(header, footer, side) 를 별도의 파일로 분리하여 React 의 component 처럼 가져다 쓰는 방식
- REST 에서 CRUD 는 다음과 같이 HTTP Method 에 매핑된다
	- Create - POST
	- Read - GET
	- Update - PUT
	- Delete - DELETE
	
# 요약
- 웹 요청에서의 테스트 코드 작성방법
- 서버 템플릿 엔진과 클라이언트 템플릿 엔진의 차이
- 머스테치 기본 사용방법
- 화면처리 방식

















<!--stackedit_data:
eyJoaXN0b3J5IjpbNTc5NzAxNDkyLDQ1Mjk4NzUyLDI2NTQ0Mj
AyNiwyMDU5NzY5MDMyLC0xNTc1Mzc5ODksMTY2OTE1MTkzMiwt
MTEzMzgxMTk2MSwxOTk3NTQyOTIwXX0=
-->