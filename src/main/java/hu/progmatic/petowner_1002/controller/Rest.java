package hu.progmatic.petowner_1002.controller;

import hu.progmatic.petowner_1002.model.Person;
import hu.progmatic.petowner_1002.model.Pet;
import hu.progmatic.petowner_1002.service.EntityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Rest {
    private EntityService entityService;
    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return entityService.getAllPersons();
    }

    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return entityService.getAllPets();
    }
}
