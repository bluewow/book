# 스프링 시큐리티와 OAuth 2.0 으로 로그인 

로그인 기능을 id/password 방식보다는 구글, 페이스북, 네이버 로그인과 같은 로그인 기능을 사용하는 이유는 무엇일까?  
- 기능이 많다 (보안, 비밀번호 찾기, 변경, 인증 기타 등)

이번장에서는 Spring boot2 방식인 Spring Security Oauth2 Client 라이브러리를 사용해서 진행

1. 구글 서비스 등록
------------
step1. 구글서비스에서 신규서비스 생성(https://console.cloud.google.com)
