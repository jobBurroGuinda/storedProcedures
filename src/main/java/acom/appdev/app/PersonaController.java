package acom.appdev.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PersonaController {

    @Autowired
    private PersonasService personasService;

    @GetMapping
    public List<Persona> getPersonas(){
        return personasService.listPersonas();
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable(name = "id") Integer id){
        return personasService.getPersonaById(id);
    }

}
