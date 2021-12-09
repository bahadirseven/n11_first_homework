package dto;

import entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCommentDTO {
    private Long userId;
    private String userName;
    private String productName;
    private String comment;
    private String commentDate;

    public static UserCommentDTO fromComment(Comment comment){
        return UserCommentDTO.builder()
                .userId(comment.getUser().getId())
                .userName(comment.getUser().getName())
                .productName(comment.getProduct().getAdi())
                .comment(comment.getComment())
                .commentDate(comment.getCommentDate().toString())
                .build();
    }
}
