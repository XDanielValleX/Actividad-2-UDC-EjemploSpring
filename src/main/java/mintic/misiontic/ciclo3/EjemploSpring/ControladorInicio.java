package mintic.misiontic.ciclo3.EjemploSpring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import mintic.misiontic.ciclo3.modelo.Usuario;
import mintic.misiontic.ciclo3.servicio.IUsuarioServicio;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.mensaje}")
    String dato;

    @Autowired
    IUsuarioServicio userServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        String mensaje = "Saludos desde Spring MVC con paso de información";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);

        Usuario u = new Usuario();
        u.setCedula("1234");
        u.setClave("Abcd");
        u.setNombre("JOHN CARLOS ARRIETA ARRIETA");
        u.setEmail("jarrieta@hotmail.com");
        modelo.addAttribute("alguien", u);

        List<Usuario> listaUsuarios = userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuarios);

        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }
}
