package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class m_usuario{
    /**
     * @attribute
     */
    public String id;
     /**
      * @attribute
      */
     public String nombre;
     /**
      * @attribute
      */
     public String correo;
     /**
      * @attribute
      */
     public char[] contrasena;
     /**
      * @attribute
      */
     public Boolean activo;
     /**
      * @attribute
      */
     public String id_sucursal;


    /**
     * @attribute
     */
    private static List<m_usuario> listaUsuarios = new ArrayList<m_usuario>();

    public Boolean eliminarUsuario(Integer posicion) {
        m_usuario miUsuarioActual = (m_usuario)listaUsuarios.get(posicion);       
        return listaUsuarios.remove(miUsuarioActual);
    }


    public m_usuario obtenerUsuario(Integer posicion) {
        return listaUsuarios.get(posicion);
    }

    public Boolean editarUsuario(Integer posicion, String id, String nombre, String correo, char[] contrasena, Boolean activo, int pos_sucursal){

            m_usuario miUsuarioActual = new m_usuario();
                miUsuarioActual.id = id;
                miUsuarioActual.nombre = nombre;
                miUsuarioActual.correo = correo;
                miUsuarioActual.contrasena = contrasena;
                miUsuarioActual.activo = activo;
                miUsuarioActual.id_sucursal = m_sucursal.getSucursalID(pos_sucursal);
            
                listaUsuarios.set(posicion,miUsuarioActual);

        return true;
    }
    public Boolean agregarUsuario(String nombre, String correo, char[] contrasena, Boolean activo, int pos_sucursal) {

        m_usuario miUsuario = new m_usuario();

        miUsuario.id = UUID.randomUUID().toString();
        miUsuario.nombre = nombre;
        miUsuario.correo = correo;
        miUsuario.contrasena = contrasena;
        miUsuario.activo = activo;
        miUsuario.id_sucursal = m_sucursal.getSucursalID(pos_sucursal);
        return listaUsuarios.add(miUsuario);
    }
    
    public static List getUsuarios(){
        return listaUsuarios;
    }
}