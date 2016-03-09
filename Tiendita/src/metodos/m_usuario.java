package interfaz;


public class m_usuario extends m_persona {
    /**
     * @attribute
     */
    private Boolean activo;

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
    private int id_sucursal;

    /**
     * @attribute
     */
    private String contrasena;

    public Boolean eliminarUsuario(Integer pid) {
        return null;
    }

    public Boolean editarUsuario(Integer pid, Integer sid, Boolean activo, String contrasena) {
        return null;
    }

    public Boolean obtenerUsuario(Integer pid) {
        return null;
    }

    public Boolean agregarUsuario(Integer pid, Integer sid, Boolean activo, String contrasena) {
        return null;
    }
}
