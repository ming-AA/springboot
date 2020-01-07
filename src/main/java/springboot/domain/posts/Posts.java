package springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springboot.domain.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor //파라미터 없는 기본 생성자 자동생성
@Entity //JPA 어노테이션, 테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id //해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼을 나타냄, 굳이 선언하지 않아도 됌, 옵션 변경이 필요할 경우 선언
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스 생성, 생성자 상단 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }


}
