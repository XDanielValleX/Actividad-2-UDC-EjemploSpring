package mintic.misiontic.ciclo3.EjemploSpring.dao;

import org.springframework.data.repository.CrudRepository;
import mintic.misiontic.ciclo3.modelo.Usuario;

public interface IUsuarioCrud extends CrudRepository<Usuario, String> {

}
