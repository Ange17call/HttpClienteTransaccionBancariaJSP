package com.distribuida;

import java.io.Serializable;

public class CuentaBancaria implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public CuentaBancaria(){
		
	}
	
public CuentaBancaria(String cuenta,String nombre,float saldo){
		
		this.numeroCuenta=cuenta;
		this.nombreCliente=nombre;
		this.saldo=saldo;
		
	}

	private String numeroCuenta;
	private String nombreCliente;
	private	float saldo;
	
	
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(float cantidad){
		saldo=saldo+cantidad;
		
	}
	public void retiro(float cantidad){
		saldo=saldo-cantidad;
		
	}

}
