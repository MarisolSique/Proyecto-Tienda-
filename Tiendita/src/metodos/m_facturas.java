package interfaz;

import java.text.DateFormat;
import java.util.Vector;

public class m_facturas {
    /**
     * @attribute
     */
    private int id;


    public Boolean anularFactura(Integer fid, Boolean anulada) {
        return null;
    }


    public Vector obtenerFacturasPorCliente(Integer cid) {
        return null;
    }

    public Integer agregarFactura(Integer cid, Integer correlativo, DateFormat fecha, Float total) {
        return null;
    }

    public Vector obtenerFactura(Integer fid) {
        return null;
    }

    public Vector obtenerFacturas(Vector fids) {
        return null;
    }
}
