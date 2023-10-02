package hu.progmatic.petowner_1002.service;

import hu.progmatic.petowner_1002.model.Person;
import hu.progmatic.petowner_1002.model.Pet;
import hu.progmatic.petowner_1002.repository.PersonRepository;
import hu.progmatic.petowner_1002.repository.PetRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    private PersonRepository personRepository;
    private PetRepository petRepository;

    public EntityService(PersonRepository personRepository, PetRepository petRepository) {
        this.personRepository = personRepository;
        this.petRepository = petRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
}
