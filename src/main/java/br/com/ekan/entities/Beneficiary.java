package br.com.ekan.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;


@Table(name = "beneficiary")
@Entity(name = "Beneficiary")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter

public class  Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;

    private String name;

    private String phone;

    private Date birthDate;

    @Setter
    private LocalDateTime createAt;

    @Setter
    private LocalDateTime updateAt;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="beneficiary_id")
    private List<Document> documents;
}
