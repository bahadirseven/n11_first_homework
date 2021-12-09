package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
/**
 * id
 * comment
 * commentDate
 * product
 * user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "yorum")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comment", nullable = false, length = 500)
    private String comment;

    @Column(name = "comment_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",
            foreignKey = @ForeignKey(name = "fk_comment_product_id")
    )
    private Urun product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "fk_comment_user_id")
    )
    private User user;
}
