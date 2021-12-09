package applications;

import dto.ProductCommentDTO;
import service.CommentService;

import java.util.List;

public class ProductCommentsApplication {
    public static void main(String[] args) {
        CommentService commentService = new CommentService();
        List<ProductCommentDTO> commentDTOList = commentService.findAllCommentsByProductId(1L);

        for (ProductCommentDTO commentDTO : commentDTOList) {
            System.out.println(commentDTO.toString());
        }
    }
}
