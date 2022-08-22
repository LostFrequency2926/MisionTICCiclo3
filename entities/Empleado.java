package entities;

public class Empleado {

/*
Comentario de prueba de Daniel Muñoz
*/
    //ATRIBUTOS
    String[] rol = {"administrador", "operativo"};
    String nombreEmpleado;
    String correoEmpleado;
    int empresaEmpleado;
    String rolEmpleado;

    //CONSTRUCTOR
    public Empleado(String nombreEmpleado, String correoEmpleado, int empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    //GETTERS Y SETTERS
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

    public int getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(int empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {this.rolEmpleado = rolEmpleado;
    }

    public static void main(String[] args){

        Empleado empleado1 = new Empleado("Daniel", "dafemure.180@gmail.com", 900326590,"operario");

        System.out.println(empleado1.getNombreEmpleado());
        empleado1.setNombreEmpleado("Felipe");
        System.out.println(empleado1.getNombreEmpleado());

        System.out.println(empleado1.getCorreoEmpleado());
        empleado1.setCorreoEmpleado("nn@gmail.com");
        System.out.println(empleado1.getCorreoEmpleado());

        System.out.println(empleado1.getEmpresaEmpleado());
        empleado1.setEmpresaEmpleado(5538888);
        System.out.println(empleado1.getEmpresaEmpleado());

        System.out.println(empleado1.getRolEmpleado());
        empleado1.setRolEmpleado("administrador");
        System.out.println(empleado1.getRolEmpleado());
    }
}



