package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class m_cliente extends m_persona {
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
     String telefono;
     /**
      * @attribute
      */
     String direccion;
     /**
      * @attribute
      */
     String nit;
     /**
      * @attribute
      */
     Boolean usa_cheque;
     /**
      * @attribute
      */
     Boolean usa_credito;
    /**
     * @attribute
     */
    private Vector credito;

    /**
     * @attribute
     */
    private int id_persona;

    /**
     * @attribute
     */
    private int id;

    /**
     * @attribute
     */    
    public List<m_cliente> misClientes;

    /**
     * @attribute
     */
    public static List<m_cliente> listaClientes = new ArrayList<m_cliente>();

    public Boolean eliminarCliente(Integer pid) {
        Boolean respuesta = false;
        for(int posicion = 0; posicion <= misClientes.size(); posicion++) {
            m_cliente miClienteActual = (m_cliente)misClientes.get(posicion);
            if(miClienteActual.id == pid) {
                respuesta = misClientes.remove(miClienteActual);
            }
        }
        return respuesta;
    }


    public m_cliente obtenerCliente(Integer pid) {
        m_cliente datos;
        datos = null;
        for(int posicion = 0; posicion <= misClientes.size(); posicion++) {
            m_cliente miClienteActual = (m_cliente)misClientes.get(posicion);
            if(miClienteActual.id == pid) {
                datos = miClienteActual;
            }
        }
        return datos;
    }

    public Boolean editarCliente(Integer pid, Integer nit, Boolean cheque, Boolean credito, Vector datos_credito) {
        /*for(int posicion = 0; posicion <= misClientes.size(); posicion++) {
            m_cliente miClienteActual = (m_cliente)misClientes.get(posicion);
            if(miClienteActual.id == pid) 
            {
                miClienteActual.usa_cheque = cheque;
                miClienteActual.usa_credito = credito;
            }
        }*/
        return null;
    }
    public Boolean agregarCliente(String nombre, String correo, String telefono, String direccion, String nit, Boolean usa_cheque, Boolean usa_credito, Vector credito) {

        m_cliente micliente = new m_cliente();
        
        //micliente.id = pid;
        micliente.nombre = nombre;
        micliente.correo = correo;
        micliente.telefono = telefono;
        micliente.direccion = direccion;
        micliente.nit = nit;
        micliente.usa_cheque = usa_cheque;
        micliente.usa_credito = usa_credito;

        return listaClientes.add(micliente);
    }
    
    public static List getClientes(){
        return listaClientes;
    }
}
