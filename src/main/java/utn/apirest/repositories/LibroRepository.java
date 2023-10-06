package utn.apirest.repositories;

import org.springframework.stereotype.Repository;
import utn.apirest.entities.Libro;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
