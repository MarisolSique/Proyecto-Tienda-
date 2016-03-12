package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class m_producto {
    /**
     * @attribute
     */
    public String id;
     /**
      * @attribute
      */
     public String codigo;
     /**
      * @attribute
      */
     public String nombre;
     
     /**
      * @attribute
      */
     public Float precio_unitario;

    /**
     * @attribute
     */
    private static List<m_producto> listaProductos = new ArrayList<m_producto>();

    public Boolean eliminarProducto(Integer posicion) {
        m_producto miProductoActual = (m_producto)listaProductos.get(posicion);       
        return listaProductos.remove(miProductoActual);
    }


    public m_producto obtenerProducto(Integer posicion) {
        return listaProductos.get(posicion);
    }

    public Boolean editarProducto(Integer posicion, String id, String codigo, String nombre, Float precio_unitario) {

            m_producto miProductoActual = new m_producto();
                miProductoActual.id = id;
                miProductoActual.codigo = codigo;
                miProductoActual.nombre = nombre;
                miProductoActual.precio_unitario = precio_unitario;
            
                listaProductos.set(posicion,miProductoActual);

        return true;
    }

    public Boolean agregarProducto(String codigo, String nombre, Float precio_unitario) {

        m_producto miNuevoProducto = new m_producto();

        miNuevoProducto.id = UUID.randomUUID().toString();
        miNuevoProducto.codigo = codigo;
        miNuevoProducto.nombre = nombre;
        miNuevoProducto.precio_unitario = precio_unitario;

        return listaProductos.add(miNuevoProducto);
    }
    
    public static List getProductos(){
        return listaProductos;
    }

    public static List getNombresProductos(){
        ArrayList listaNombres = new ArrayList<String>();
        
        for(int posicion = 0; posicion < listaProductos.size(); posicion++) {
            listaNombres.add(listaProductos.get(posicion).nombre);
        }
        
        return listaNombres;
    }

    public static m_producto obtenerProductoPorID(String id) {
        m_producto producto = new m_producto();
        for(m_producto c : listaProductos) {
            if(c.id.equals(id)){
               producto = (m_producto) c;
            }
        }
        return producto;
    }

    public m_producto getProductoPorNombre(String nombre) {
        m_producto productoEncontrado = new m_producto();
        m_producto objProducto = new m_producto();
        for(int posicion = 0; posicion < listaProductos.size(); posicion++) {
            objProducto = listaProductos.get(posicion);
            if(nombre.equals(objProducto.nombre)) {
                productoEncontrado  = objProducto;
            }
        }
    return productoEncontrado;
    }
    
    public static m_producto obtenerProductoPorCodigo(String cod) {
        m_producto prod = null;
        for(m_producto c : listaProductos) {
            if(c.codigo.contentEquals(cod)){
               prod = (m_producto) c;
            }
        }
        return prod;
    }
}