package utn.apirest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.apirest.entities.Persona;
import utn.apirest.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
