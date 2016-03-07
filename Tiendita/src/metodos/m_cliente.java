package interfaz;

import java.util.Vector;

public class m_cliente extends persona {
    /**
     * @attribute
     */
    private Boolean usa_credito;

    /**
     * @attribute
     */
    private Boolean usa_cheque;

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
    private String nit;


    public Boolean eliminarCliente(Integer pid) {
        System.out.println("hola");
        return null;        
    }


    public Vector obtenerCliente(Integer pid) {
        return null;        
    }

    public Boolean editarCliente(Integer pid, Integer nit, Boolean cheque, Boolean credito, Vector datos_credito) {
        return null;        
    }

    public Boolean agregarCliente(Integer pid, Integer nit, Boolean cheque, Boolean credito, Vector datos_credito) {
        return null;
    }
}
