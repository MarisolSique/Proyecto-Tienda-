package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class m_productos {
    /**
     * @attribute
     */
    private String id;
    private int sid;
    private String codigo;
    private String nombre;
    private Float precio_unitario;

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
}