package utn.apirest.repositories;

import org.springframework.stereotype.Repository;
import utn.apirest.entities.Persona;
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
