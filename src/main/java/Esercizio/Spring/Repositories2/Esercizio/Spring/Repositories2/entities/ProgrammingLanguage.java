package Esercizio.Spring.Repositories2.Esercizio.Spring.Repositories2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private OffsetDateTime firstAppearance;

    @Column(nullable = false)
    private String inventor;
}
