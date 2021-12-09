package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * id
 * name
 * surname
 * email
 * phone
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "kullanici")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "surname" , length = 50)
    private String surname;

    @Column(name = "email" , length = 50)
    private String email;

    @Column(name = "phone" , length = 15)
    private String phone;
}
