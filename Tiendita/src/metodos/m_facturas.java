package metodos;
import metodos.*;
import java.text.DateFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class m_facturas {
    /**
     * @attribute
     */
    public int id;
    public int correlativo;
    public int diaCreacion;
    public int mesCreacion;
    public int anioCreacion;
    public String idCliente;
    public List<detalleFacturaProducto> listaProductos;
    public float total;

    public static List<m_facturas> ListaFacturas = new ArrayList<m_facturas>();
    
    public Boolean anularFactura(Integer fid, Boolean anulada) {
        return null;
    }


    public Vector obtenerFacturasPorCliente(Integer cid) {
        return null;
    }

    public void agregarFactura(int diaCreacion, int mesCreacion, int anioCreacion, String idCliente, List<detalleFacturaProducto> listaProductos, float total) {
        m_facturas nuevaFactura = new m_facturas();
        nuevaFactura.diaCreacion = diaCreacion;
        nuevaFactura.mesCreacion = mesCreacion;
        nuevaFactura.anioCreacion = anioCreacion;
        nuevaFactura.idCliente = idCliente;
        nuevaFactura.listaProductos = listaProductos;
        nuevaFactura.total = total;
        ListaFacturas.add(nuevaFactura);
    }

    public Vector obtenerFactura(Integer fid) {
        return null;
    }

    public Vector obtenerFacturas(Vector fids) {
        return null;
    }
}
