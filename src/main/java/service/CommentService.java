package service;

import dto.ProductCommentCountDTO;
import dto.ProductCommentDTO;
import dto.UserCommentDTO;
import entity.Comment;
import repository.CommentRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService() {
        commentRepository = new CommentRepository();
    }

    public List<ProductCommentDTO> findAllCommentsByProductId(Long productId){
        List<Comment> commentList = commentRepository.findAllCommentsByProductId(productId);

        return commentList.stream().map(ProductCommentDTO::fromComment).collect(Collectors.toList());
    }

    public List<ProductCommentCountDTO> findAllCommentCountByProductId(){
        return commentRepository.findAllCommentCount();
    }

    public List<UserCommentDTO> findAllCommentsByUserId(Long userId){
        List<Comment> commentList = commentRepository.findAllCommentsByUserId(userId);

        return commentList.stream().map(UserCommentDTO::fromComment).collect(Collectors.toList());
    }

}
