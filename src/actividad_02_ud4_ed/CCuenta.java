/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;

/**
 * @author Guillermo Dorado, Alumno 1ºDAW
 */

public class CCuenta {

  // Definición de variables
    
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * Constructor sin argumentos
   */
    
    public CCuenta ()
    {
    }
    
   /**
    * @param nom  Nombre del usuario
    * @param cue  Cuenta bancaria
    * @param sal  Saldo
    * @param tipo Tipo de interés
    */
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Nombre del usuario para asignarle a la cuenta
   */
    
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *
     * @return <code>nombre</code>Devuelve el nombre del usuario
     */
    
    public String obtenerNombre()
    {
        return nombre;
    }
    
/**
 * @return <code>saldo</code>Devuelve el saldo actual de la cuenta
 */
    
     public double estado ()
    {
        return saldo;
    }
     
/**
 * @param cantidad a ingresar en el movimiento
 * @throws Exception si se intenta ingresar una cantidad negativa
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }
/**
 * 
 * @param cantidad a retirar en el movimiento
 * @throws Exception Si no hay suficiente saldo a retirar o se está intentando 
 * retirar una cantidad negativa
 */
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * @return <code>cuenta</code> Número cuenta bancaria
     */
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * @param cuenta Cambiar el número de cuenta 
   */
    
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
/**
 * 
 * @param saldo Cambia el valor de saldo
 */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * @return <code>tipoInterés</code> Tipo de interés 
   */
 
  public double getTipoInterés() {
    return tipoInterés;
  }
/**
 * 
 * @param tipoInterés Cambia el tipo de interés
 */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
