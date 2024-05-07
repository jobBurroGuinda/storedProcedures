package acom.appdev.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonasRepository extends JpaRepository<Persona, Integer> {

    @Procedure(value = "SelectAllFromPersona")
    List<Persona> listPersonasProcedure();

    @Procedure(value = "SelectPersonaById")
    Persona findPersonById(Integer id);

}
