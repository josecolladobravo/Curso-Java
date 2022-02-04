package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO(); //creacion del usuarioDao
        //insertar un usuario nuevo a la BBDD
        Usuario usuario = new Usuario("Miguel", "psw3");
        usuarioDao.insertar(usuario);

        //actualizar un usuario de la BBDD
        Usuario usuarioActualizado = new Usuario(1, "Mara", "password2");
        //usuarioDao.actualizar(usuarioActualizado);

        //borrar un usuario de la BBDD
        Usuario usuarioBorrado = new Usuario(3);
        //usuarioDao.borrar(usuarioBorrado);

        //listar usuarios
        List<Usuario> usuarios1 = usuarioDao.seleccionar();
        usuarios1.forEach(listaUsuarios -> {
            System.out.println("listaUsuarios = " + listaUsuarios);
        });


    }

}
