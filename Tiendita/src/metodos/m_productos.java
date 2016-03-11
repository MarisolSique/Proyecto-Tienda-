package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class m_productos {
    /**
     * @attribute
     */
    public String id;
    public int sid;
    public String codigo;
    public String nombre;
    public Float precio_unitario;

    private static List<m_productos> listaProductos = new ArrayList<m_productos>();

    public Boolean eliminarProducto(Integer id) {
        m_productos miProductoActual = (m_productos)listaProductos.get(id);
        return listaProductos.remove(miProductoActual);
    }


    public Boolean editarProducto(String id, Integer sid, String codigo, String nombre, Float precio_unitario) {
        for(int posicion = 0; posicion < listaProductos.size(); posicion++) {
            if(listaProductos.get(posicion).id == id)
            {
                listaProductos.get(posicion).sid = sid;
                listaProductos.get(posicion).codigo = codigo;
                listaProductos.get(posicion).nombre = nombre;
                listaProductos.get(posicion).precio_unitario = precio_unitario;    
            }
        }
        return true;
    }

    public m_productos obtenerProducto(String id) {
        m_productos productoEncontrado = new m_productos();
        for(int posicion = 0; posicion < listaProductos.size(); posicion++) {
            if(listaProductos.get(posicion).id == id)
            {
                productoEncontrado = listaProductos.get(posicion);
            }
        }
        return productoEncontrado;
    }

    public Boolean agregarProducto(Integer sid, String codigo, String nombre, Float precio_unitario) {
        m_productos miNuevoProducto = new m_productos();
        miNuevoProducto.id = UUID.randomUUID().toString();
        miNuevoProducto.sid = sid;
        miNuevoProducto.codigo = codigo;
        miNuevoProducto.nombre = nombre;
        miNuevoProducto.precio_unitario = precio_unitario;
        listaProductos.add(miNuevoProducto);
        return true;
    }
    
    public List<String> getNombresProductos() {
        m_productos miProducto = new m_productos();
        List<String> listaNombres = new ArrayList<String>();
        for(int posicion = 0; posicion <listaProductos.size(); posicion++) {
            listaNombres.add(listaProductos.get(posicion).nombre);
        }
        return listaNombres;
    }
    
    public m_productos getProducto(String nombre) {
        m_productos productoEncontrado = new m_productos();
        for(int posicion = 0; posicion < listaProductos.size(); posicion++) {
            if(nombre == listaProductos.get(posicion).nombre) {
                productoEncontrado  = listaProductos.get(posicion);
            }
        }
    return productoEncontrado;
    }
}