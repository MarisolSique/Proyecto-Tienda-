package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class m_usuario{
    /**
     * @attribute
     */
    String id;
     /**
      * @attribute
      */
     String nombre;
     /**
      * @attribute
      */
     String correo;
     /**
      * @attribute
      */
     String contrasena;
     /**
      * @attribute
      */
     Boolean activo;
     /**
      * @attribute
      */
     String id_sucursal;


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

    public Boolean editarUsuario(Integer posicion, String id, String nombre, String correo, String telefono, String direccion, String nit, Boolean usa_cheque, Boolean usa_credito, Vector credito) {

            m_usuario miUsuarioActual = new m_usuario();
                miUsuarioActual.id = id;
                miUsuarioActual.nombre = nombre;
                miUsuarioActual.correo = correo;
                miUsuarioActual.contrasena = contrasena;
                miUsuarioActual.activo = activo;
                miUsuarioActual.id_sucursal = id_sucursal;
            
                listaUsuarios.set(posicion,miUsuarioActual);

        return true;
    }
    public Boolean agregarUsuario(String nombre, String correo, String contrasena, Boolean activo, int pos_sucursal) {

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