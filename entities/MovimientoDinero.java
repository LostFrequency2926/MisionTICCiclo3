package entities;

public class MovimientoDinero {

    double montoMovimiento ;
    String conceptoMovimiento;
    String usuarioMovimiento;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, String usuarioMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public static void main(String[] args){

        MovimientoDinero movimiento1 = new MovimientoDinero(200000, "compra sillas", "Felipe");

        System.out.println(movimiento1.getMontoMovimiento());
        movimiento1.setMontoMovimiento(500000);
        System.out.println(movimiento1.getMontoMovimiento());

        System.out.println(movimiento1.getConceptoMovimiento());
        movimiento1.setConceptoMovimiento("Compra refrigerios");
        System.out.println(movimiento1.getConceptoMovimiento());

        System.out.println(movimiento1.getUsuarioMovimiento());
        movimiento1.setUsuarioMovimiento("Karen");
        System.out.println(movimiento1.getUsuarioMovimiento());
    }


}
