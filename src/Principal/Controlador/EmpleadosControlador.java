package Principal.Controlador;

/**
 *
 * @author yaxkin-pc
 */
public class EmpleadosControlador {

    public static String LISTAR_US = "SELECT * FROM empleados ORDER BY nombre";

    public static String REGISTRAR = "INSERT INTO empleados(RFC,nick,nombre,"
            + "apellidop,apellidom,sexo,direccion,contra,telefono,tipo_empleado) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE empleados SET "
            + "nick=?,"
            + "nombre=?,"
            + "apellidop=?,"
            + "apellidom=?,"
            + "sexo=?,"
            + "direccion=?,"
            + "contra=?,"
            + "telefono=?,"
            + "tipo_empleado=?"
            + "WHERE RFC=?";

    public static String ELIMINAR = "DELETE FROM empleados WHERE RFC = ?";

    public static String ELIMINAR_TODO = "DELETE FROM empleados";

    private String primaryKey;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String nick;
    private String sexo;
    private String direccion;
    private String telefono;
    private String tipoEmpleado;
    private String password;

    public EmpleadosControlador() {

    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoP) {
        this.apellidoM = apellidoP;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
