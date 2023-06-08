package rs.ac.metropolitan.IT355Projekat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Destination {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "destination")
    private String destination;
    @Basic
    @Column(name = "image")
    private String image;
}
