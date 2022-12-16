/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author dgonorm2803
 * 
 * @version 16/12/2022
 */
public class CCuenta {

    /**
     *
     */
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Identificación de la cuenta
    * @param sal Saldo que tiene la cuenta
    * @param tipo Tipo de interés que tiene la cuenta
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
   * @param nom Asigna un nombre
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     *
     * @return Te devuelve el nombre asignado
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return Te devuelve el estado actual
     */
    public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception Caso donde no es posible ingresar
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception Casos donde no es posible retirar
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
     *
     * @return Devuelve la identificación de la cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     *
     * @param cuenta Da un valor a la identificación de cuenta
     */
    public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo Da un valor al saldo
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

    /**
     *
     * @return Devuelve un tipo de interés
     */
    public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés Da un valor a tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
