package mintic.misiontic.ciclo3.servicio;

import java.util.List;
import mintic.misiontic.ciclo3.modelo.Usuario;

public interface IUsuarioServicio {

    public List<Usuario> listarUsuarios();

    public void guardar(Usuario user);

    public void eliminar(Usuario user);

    public Usuario buscar(Usuario user);

}
