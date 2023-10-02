package hu.progmatic.petowner_1002.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private Integer id;
    private String name;
    private Integer age;

    @OneToMany(mappedBy = "owner")
    @JsonManagedReference
    private List<Pet> pets;
}
