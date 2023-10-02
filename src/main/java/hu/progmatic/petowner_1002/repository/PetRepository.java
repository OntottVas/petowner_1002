package hu.progmatic.petowner_1002.repository;

import hu.progmatic.petowner_1002.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
