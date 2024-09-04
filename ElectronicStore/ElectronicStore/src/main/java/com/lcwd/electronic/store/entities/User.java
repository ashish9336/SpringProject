package com.lcwd.electronic.store.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "user_id", updatable = false, nullable = false)
    private String userId;

    @PrePersist
    protected void onCreate() {
        if (this.userId == null) {
            this.userId = UUID.randomUUID().toString();
        }
    }


/*    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //(auto increment id)

    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.uuid.UuidGenerator")
    @Column(name = "user_id", updatable = false, nullable = false)
    private String userId;*/
    // @Column(unique = true)
    @Column(name = "user-email",unique = true)
    private String name;
    private String email;
    @Column(name = "user_password",length=10)
    private String password;
    private String gender;
    @Column(length = 1000)
    private String about;


    @Column(name="user_image_name")
    private String imageName;


}
