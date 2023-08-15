package br.com.vinicius.api.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name="`User`")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;
}
