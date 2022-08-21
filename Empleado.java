public class Empleado {

    /*
    Comentario de prueba de Daniel Muñoz
     */

    String[ ] rol = {"administrador", "operativo"};

    String nombreEmpleado;
    String correoEmpleado;
    String empresaEmpleado;
    String rolEmpleado;
    int salarioEmpleado;

    public int getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(int salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
