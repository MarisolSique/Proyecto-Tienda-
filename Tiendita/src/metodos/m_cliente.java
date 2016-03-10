package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class m_cliente {
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
    private static List<m_cliente> listaClientes = new ArrayList<m_cliente>();

    public Boolean eliminarCliente(Integer posicion) {
        m_cliente miClienteActual = (m_cliente)listaClientes.get(posicion);       
        return listaClientes.remove(miClienteActual);
    }


    public m_cliente obtenerCliente(Integer posicion) {
        return listaClientes.get(posicion);
    }

    public Boolean editarCliente(Integer posicion, String id, String nombre, String correo, String telefono, String direccion, String nit, Boolean usa_cheque, Boolean usa_credito, Vector credito) {

            m_cliente miClienteActual = new m_cliente();
                miClienteActual.id = id;
                miClienteActual.nombre = nombre;
                miClienteActual.correo = correo;
                miClienteActual.telefono = telefono;
                miClienteActual.direccion = direccion;
                miClienteActual.nit = nit;
                miClienteActual.usa_cheque = usa_cheque;
                miClienteActual.usa_credito = usa_credito;
            
                listaClientes.set(posicion,miClienteActual);

        return true;
    }
    public Boolean agregarCliente(String nombre, String correo, String telefono, String direccion, String nit, Boolean usa_cheque, Boolean usa_credito, Vector credito) {

        m_cliente micliente = new m_cliente();

        micliente.id = UUID.randomUUID().toString();
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

    public List getNombresClientes(){

        m_cliente micliente = new m_cliente();
        List<m_cliente> listaNombres = new ArrayList<m_cliente>();

        for(int posicion = 0; posicion < listaClientes.size(); posicion++) {
            micliente.nombre = listaClientes.get(posicion).nombre;
            listaNombres.add(micliente);
        }
        return listaNombres;
    }
}