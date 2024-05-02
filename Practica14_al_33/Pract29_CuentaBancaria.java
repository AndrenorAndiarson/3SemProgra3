package Practica14_al_33;

public class Pract29_CuentaBancaria {
int cuenta;
    int [] saldos;

    public Pract29_CuentaBancaria(int cuenta, int[] saldos) {
        this.cuenta = cuenta;
        this.saldos = saldos;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int[] getSaldos() {
        return saldos;
    }

    public void setSaldos(int[] saldos) {
        this.saldos = saldos;
    }

    public double sumaSaldos(){
        int sum=0;
        for (int suma: saldos){
            sum += suma;
        }
        return sum;
    }
}
