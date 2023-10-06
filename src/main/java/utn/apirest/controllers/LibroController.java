package utn.apirest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.apirest.entities.Libro;
import utn.apirest.services.LibroServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
