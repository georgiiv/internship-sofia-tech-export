package blog.repository;

import blog.entity.Article;
import blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findAllByArticleOrderByIdDesc(Article article);
}
