package repository;

import dto.ProductCommentCountDTO;
import dto.ProductCommentDTO;
import entity.Comment;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository extends BaseRepository{
    public List<Comment> findAllCommentsByProductId(Long productId){
        Query query = getCurrentSession()
                .createQuery("from Comment comment where comment.product.id = :productId");

        query.setParameter("productId", productId);

        return query.list();
    }

    public List<ProductCommentCountDTO> findAllCommentCount(){
        String queryString = " Select " +
                " new dto.ProductCommentCountDTO(urun.id,urun.adi,urun.fiyat, count(comment.product.id)) " +
                " from Urun urun " +
                " left join Comment comment  on urun.id = comment.product.id " +
                " group by urun.id ";
        Query query = getCurrentSession()
                .createQuery(queryString);

        return query.list();
    }

    public List<Comment> findAllCommentsByUserId(Long userId) {
        Query query = getCurrentSession()
                .createQuery("from Comment comment where comment.user.id = :userId");

        query.setParameter("userId", userId);

        return query.list();
    }
}
