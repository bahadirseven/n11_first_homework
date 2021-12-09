package dto;

import entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCommentDTO {
    private String productName;
    private String categoryName;
    private BigDecimal price;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPhone;
    private String comment;
    private String commentDate;

    public static ProductCommentDTO fromComment(Comment comment){
        return ProductCommentDTO.builder()
                .productName(comment.getProduct().getAdi())
                .categoryName(comment.getProduct().getKategori().getAdi())
                .price(comment.getProduct().getFiyat())
                .userName(comment.getUser().getName())
                .userSurname(comment.getUser().getSurname())
                .userEmail(comment.getUser().getEmail())
                .userPhone(comment.getUser().getPhone())
                .comment(comment.getComment())
                .commentDate(comment.getCommentDate().toString())
                .build();
    }
}
