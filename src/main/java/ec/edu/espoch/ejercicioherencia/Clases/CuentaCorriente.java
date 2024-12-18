/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejercicioherencia.Clases;

/**
 *
 * @author PERSONAL
 */
public class CuentaCorriente extends CuentaBancaria {
    private float sobregiro = 0;

    // Constructor
    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
    }


    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            sobregiro += (cantidad - saldo);
            saldo = 0;
        } else {
            saldo -= cantidad;
        }
        numeroRetiros++;
    }

  
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        super.consignar(cantidad);
    }


    public void extractoMensual() {
        super.extractoMensual();
        if (sobregiro > 0) {
            System.out.println("Sobregiro pendiente: " + sobregiro);
        }
    }

  
    public void imprimir() {
        int transaccionesTotales = numeroConsignaciones + numeroRetiros;
        super imprimir();
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Transacciones totales: " + transaccionesTotales);
    }

}
