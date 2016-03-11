package metodos;

import java.util.ArrayList;
import java.util.Collections;
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
    public String direccion;
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

    public static List getNombresSucursales(){
        ArrayList listaNombres = new ArrayList<String>();
        
        for(int posicion = 0; posicion < listaSucursales.size(); posicion++) {
            listaNombres.add(listaSucursales.get(posicion).nombre);
        }
        
        return listaNombres;
    }

    public static m_sucursal obtenerSucursalPorID(String id) {
        m_sucursal sucursal = new m_sucursal();
        for(m_sucursal s : listaSucursales) {
            if(s.id.equals(id)){
               sucursal = (m_sucursal) s;
            }
        }
        return sucursal;
    }
}
