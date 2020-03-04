# 스프링 시큐리티와 OAuth 2.0 으로 로그인 

## WHY
로그인 기능을 id/password 방식보다는 구글, 페이스북, 네이버 로그인과 같은 로그인 기능을 사용하는 이유는 무엇일까?  
- 작업량이 많다  == (보안, 비밀번호 찾기, 변경, 인증 기타 등 기능이 많다)

## HOW
Spring boot2 방식인 Spring Security Oauth2 Client 라이브러리를 사용해서 진행

#### 1.구글 서비스 등록
구글서비스에서 신규서비스 생성(https://console.cloud.google.com)

## 2.Spring 설정
- application-oauth-properties 추가(client id,pw,scope 등록)
- application-properties 에서 oauth properties 등록

## 3.구글로그인 연동하기
User class 생성  (사용자 권한과 정보)
- domain/user  
	- Role
	- User
	- UserRepository

## 4.스프링 시큐리티 
- org.springframework.boot:spring-boot-starter-oauth2-client 의존성 추가
- config.auth (security 관련 클래스)
	- CustomOauth2UserService
	- SecurityConfig 
	- dto
		- OAuthAttributes  
		- SessionUser  
  
## 5.어노테이션 기반으로 개선하기
- 반복적호출을 어노테이션으로 대체한다
- LoginUser, LoginUserArgumentResolver, WebConfig 추가

## 6.세션 저장소로 데이터베이스 사용하기
- Why
  - Application 재시작시 로그인이 해제(Session 이 내장 톰캣의 메모리에 저장되기 때문이다)
  - 2대 이상의 서버에서 서비스하고 있다면 세션 동기화 과정이 필요하다 
- How (실무에서 아래 3가지중 하나를 선택한다)
  - 톰캣 세션 사용(2대 이상의 WAS 가 구동되는 환경에서는 톰캣간의 동기화 작업 필요)
  - DB 를 세션장소로 사용한다 (DB IO 가 발생하여 성능 이슈가 발생할 수 있다)  - 선택하여 진행
  - Redis, Memcached 와 같은 메모리 DB 를 사용한다 (B2C 서비스 에서 가장 많이 사용) 외부 메모리 서버가 필요
  
## 7.네이버  로그인하기
https://developers.naver.com/apps/#/register?api=nvlogin 등록

## 8.기존 테스트에 시큐리티 적용하기
- WebMvcTest
- MockMvc
  
 ## 요약
 - Spring Security 와 OAuth 2.0 사용법
 - 구글, 네이버 로그인
 - 


<!--stackedit_data:
eyJoaXN0b3J5IjpbMTc0MjE5Mzg4MiwtNzY4ODE3ODk4XX0=
-->