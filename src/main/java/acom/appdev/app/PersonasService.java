package acom.appdev.app;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasService {

    @Autowired
    private PersonasRepository personasRepository;

    @Transactional
    public List<Persona> listPersonas(){
        return personasRepository.listPersonasProcedure();
    }

    @Transactional
    public Persona getPersonaById(Integer id){
        return personasRepository.findPersonById(id);
    }


}
