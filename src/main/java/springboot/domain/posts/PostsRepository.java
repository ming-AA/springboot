package springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//<Entity 클래스, PK타입> 상속
public interface PostsRepository extends JpaRepository<Posts, Long>  {

}
