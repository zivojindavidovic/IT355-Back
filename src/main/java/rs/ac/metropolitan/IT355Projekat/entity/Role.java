package rs.ac.metropolitan.IT355Projekat.entity;

import jakarta.persistence.*;
import lombok.Data;
import rs.ac.metropolitan.IT355Projekat.entity.enums.RoleType;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private RoleType name;

}
