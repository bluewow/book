package com.khkim.book.spring.service.posts;

import com.khkim.book.spring.domain.posts.Posts;
import com.khkim.book.spring.domain.posts.PostsRepository;
import com.khkim.book.spring.web.dto.PostsResponseDto;
import com.khkim.book.spring.web.dto.PostsSaveRequestDto;
import com.khkim.book.spring.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor    //final 이 선언된 모든 필드를 인자값으로하는 생성자를 생성
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {

        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        // JPA 의 영속성 컨텍스트. 트랜젝션안에서 DB 데이터를 가져오면 영속성 컨텍스트가 유지된다
        // 이 상태에서 데이터를 변경하면, 트랜젝션 끝나는 시점에 변경분을 반영한다.
        // 즉, Entity 값만 변경하면 된다(dirty checking)
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }
}

/*
* [정리]
* Service 에선 Transaction 과 domain 순서를 설정한다
*
* @Transactional
*   - 단일 쿼리로는 해결할 수 없는 로직을 처리할 때 필요한 개념인 트랜잭션
*   - 2개 이상의 쿼리를 하나의 커넥션으로 묶어 DB 에 전송하고, 이 과정에서 에러 발생시 모든 과정을 Rollback 하는 기술
*
* Programmatic Transaction
* Declarative Transaction
*   - Spring 에서 주로 사용
*   - 어노테이션 or 설정파일을 이용해서 rule 을 정함
*
*
*
*
* */