package interfaz;

import java.util.Vector;

public class m_productos {
    /**
     * @attribute
     */
    private int id;

    public Boolean eliminarProducto(Integer id) {
        return true;
    }


    public Boolean editarProducto(Integer id, Integer sid, String codigo, String nombre, Float precio_unitario) {
        return null;
    }

    public Vector obtenerProducto(Integer id) {
        return null;
    }

    public Boolean agregarProducto(Integer sid, String codigo, String nombre, Float precio_unitario) {
        return null;
    }
}
