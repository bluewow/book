package com.khkim.book.spring.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
/*
* [정리]
* - ibatis 나 MyBatis 등에서 Dao 라고 불리는 DB Layer 접근자
* - interface 로 생성 후 JpaRepository<Entity class, PK Type> 을 상속하면 기본적인 CRUD 메소드가 생성된다
* - getOne, findById, findAll, save, delete 등의 함수가 정의되어 있다
*
* 주의할 점
* - Entity class 와 파일위치가 다르면 안된다
*
* */
