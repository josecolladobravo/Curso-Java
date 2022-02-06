package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;//tiene que estar definido aquí para poder usarla dentro del bloque try-catch
        try {
            conexion = Conexion.getConnection();//con esto ya tenemos la conexion pero fuera de la clase PersonaDAO
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);//necesitamos que la conexion no haga commit de manera automatica, lo haremos de formas manual
            }

            PersonaDAO personaDao = new PersonaDAO(conexion); //hay que proporcionarle la conexion para manejar bien los commits y aplicar el concepto transaccional
//            Persona cambioPersona = new Persona(6, "Jose", "Carpio", "mluque@mail.com", "2342354452");
//            personaDao.actualizar(cambioPersona);
//
//            //Persona aniadirPersona = new Persona("Jose", "Lopez11111111111111111111111111111111111111111", "jlopez@mail.com", "45365"); //este produciria rollback debido a que da fallo al insertar mas de 45 caracteres en el apellido
//            Persona aniadirPersona = new Persona("Jose", "Lopez", "jlopez@mail.com", "45365"); //este no daria fallo
//            personaDao.insertar(aniadirPersona);

//            Persona nuevaPersona = new Persona("Mara","Luque","mluque@gmail.com","2364364573");
//            personaDao.insertar(nuevaPersona);

//               Persona borrarPersona = new Persona(8);
//               personaDao.borrar(borrarPersona);
            
            

            conexion.commit(); //si todo va bien, se guardan los cambios
            System.out.println("Se ha hecho commit de la transaccion");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback(); //todas las sentencias que modifican la base de datos no se ejecutan debido a un error
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }

        }
    }
}
