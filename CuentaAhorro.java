/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SO-LAB1-PC13
 */
 public class CuentaAhorros extends CuentaBancaria {
    private boolean activa;

    
    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 10000;
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se puede consignar.");
        }
        actualizarEstado();
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se puede retirar.");
        }
        actualizarEstado();
    }

    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += 1000 * (numeroRetiros - 4);
        }
        super.extractoMensual();
        actualizarEstado();
    }

    private void actualizarEstado() {
        activa = saldo >= 10000;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
    {
        System.out.println("Marjorie");
    }
}
