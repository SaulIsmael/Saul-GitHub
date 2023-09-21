package Entidad;

/**
 *
 * @author Saul Ismael Mansilla
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + '}';
    }
    
    
    
    
}    
    
    

