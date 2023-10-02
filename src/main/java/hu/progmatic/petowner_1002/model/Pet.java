package hu.progmatic.petowner_1002.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @JsonBackReference
    private Person owner;
}
