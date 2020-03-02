# Mustache 를 통한 화면 구성하기

#### 템플릿엔진과 Mustache
템플릿 엔진이란? 

- 지정된 템플릿 양식(JSP, Freemarker, Mustache, React, Vue 등)과 데이터가 합쳐저 HTML 문서를 출력하는 소프트웨어

예제에서는 Mustache 를 사용하며 아래의 장점을 가지고 있다
- 문법이 심플하다
- 로직 코드를 사용할 수 없어 Vidw 의 역활과 서버의 역활을 명확하게 분리된다
- 클라이언트 / 서버 모두 지원한다

#### Mustache 파일 생성

Spring boot 내의 Mustache 위치

![layout](../assets/crud_1.png)


#### bootstrap 과 jQuery 사용

레이아웃 방식 추가 (공통역역을 별도의 파일로 분리하여 필요한 곳에 가져다 쓰는 방식)

header.mustache, footer.mustache 생성 후 css 는 header 에, js 는 footer 에 배치하여  페이지 로딩속도를 향상시킨다.

HTML 은 위에서 아래 즉 header 실행후 body 실행. js 는 화면생성후 호출하는 것이 좋음













<!--stackedit_data:
eyJoaXN0b3J5IjpbMTE5NTY1ODY0OCwzMzI4NjUyNDgsLTExNz
U5NTkxMDAsMTQ5NzA4NTIwOSwxNTQyNTYxMThdfQ==
-->