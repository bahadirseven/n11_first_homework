package applications;

import dto.ProductCommentDTO;
import dto.UserCommentDTO;
import service.CommentService;

import java.util.List;

public class UserCommentsApplication {
    public static void main(String[] args) {
        CommentService commentService = new CommentService();
        List<UserCommentDTO> userCommentDTOList = commentService.findAllCommentsByUserId(1L);

        for (UserCommentDTO userCommentDTO : userCommentDTOList) {
            System.out.println(userCommentDTO.toString());
        }
    }
}
