package metodos;

import java.util.Vector;

public class m_CreditoConfiguracion {
    /**
     * @attribute
     */
    private Float interes;

    /**
     * @attribute
     */
    private int id_cliente;

    /**
     * @attribute
     */
    private Float limite_asignado;

    /**
     * @attribute
     */
    private int plazo;

    public Boolean eliminarConfiguracion(Integer cliente_id) {
        return null;
    }


    public Boolean editarConfiguracion(Integer cliente_id, Float interes, Float limite, Integer plazo) {
        return null;
    }

    public Boolean agregarConfiguracion(Integer cliente_id, Float interes, Float limite, Integer plazo) {
        return null;
    }

    public Vector obtenerConfiguracion(Integer cliente_id) {
        return null;
    }
}
