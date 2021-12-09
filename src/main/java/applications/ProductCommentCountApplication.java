package applications;

import dto.ProductCommentCountDTO;
import dto.ProductCommentDTO;
import service.CommentService;

import java.util.List;

public class ProductCommentCountApplication {
    public static void main(String[] args) {
        CommentService commentService = new CommentService();

        List<ProductCommentCountDTO> productCommentCountDTOList = commentService.findAllCommentCountByProductId();

        for(ProductCommentCountDTO productCommentCountDTO : productCommentCountDTOList){
            System.out.println(productCommentCountDTO.toString());
        }
    }
}
