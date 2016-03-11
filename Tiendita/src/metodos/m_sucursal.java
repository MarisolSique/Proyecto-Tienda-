package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class m_sucursal {
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
    String direccion;
    /**
     * @attribute
     */
    private static List<m_sucursal> listaSucursales = new ArrayList<m_sucursal>();


    public Boolean eliminarSucursal(Integer id) {
        m_sucursal miSucursalActual = (m_sucursal)listaSucursales.get(id);       
        return listaSucursales.remove(miSucursalActual);
    }
    

    public m_sucursal obtenerSucursal(Integer posicion) {
        return listaSucursales.get(posicion);
    }

    public Boolean editarSucursal(Integer posicion, String id, String nombre, String direccion) {
        
        m_sucursal miSucursalActual = new m_sucursal();
            miSucursalActual.id = id;
            miSucursalActual.nombre = nombre;
            miSucursalActual.direccion = direccion;
        
            listaSucursales.set(posicion, miSucursalActual);

        return true;
    }

    public Boolean agregarSucursal(String nombre, String direccion) {
        m_sucursal miSucursal = new m_sucursal();

        miSucursal.id = UUID.randomUUID().toString();
        miSucursal.nombre = nombre;
        miSucursal.direccion = direccion;

        return listaSucursales.add(miSucursal);
    }

    public static List getSucursales(){
        return listaSucursales;
        
    }
 
    public static String getSucursalID(Integer posicion){
        return listaSucursales.get(posicion).id;
    }
}
