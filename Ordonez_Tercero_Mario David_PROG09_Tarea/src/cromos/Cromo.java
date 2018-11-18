package cromos;

import cromosUI.EditaCromo;
import java.io.Serializable;

/**
 *
 * @author Mario version 14/05/2017
 *
 * Clase Cromo que reúne todas las características de los cromos así como sus
 * respectivos getters y setters para poder operar con ellos, y un método
 * toString para poder visualizar sus datos en forma de cadena. Implementará la
 * interfaz Serializable puesto que se van a serializar objetos cromo de manera
 * que podamos tanto guardar como recuperar de fichero
 */
public class Cromo implements Serializable {

    protected int codigo;
    protected String descripcion;
    protected String bando;
    protected boolean raro;
    protected int defensa;
    protected int ataque;
    protected int anyoEmision;
    protected String rutaImagen;

    public static int totalCromos = 0;//Variable que almacena la cantidad total de cromos
    public static int codigoSiguiente = 1;

    private static final long serialVersionUID = 42L;

    public Cromo(int codigo, String descripcion, String bando, boolean raro, int defensa, int ataque, int anyoEmision, String rutaImagen) {
        this.setCodigo(codigo);
        this.setDescripcion(descripcion);
        this.setBando(bando);
        this.setRaro(raro);
        this.setDefensa(defensa);
        this.setAtaque(ataque);
        this.setAnyoEmision(anyoEmision);
        this.codigo = Cromo.codigoSiguiente;//Cada vez que se crea un nuevo cromo, el código aumentará en uno
        Cromo.codigoSiguiente++;
        Cromo.totalCromos++;


    }

    /**
     * Obtiene el código del cromo
     *
     * @return Código del cromo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del cromo
     *
     * @param codigo Código del cromo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la descripciñon de cromo
     *
     * @return Descripción del cromo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del cromo
     *
     * @param descripcion Descripción del cromo
     *
     */
    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }

    /**
     * Obtiene el bando del cromo
     *
     * @return Bando del cromo
     */
    public String getBando() {
        return bando;
    }

    /**
     * Establece el bando del cromo
     *
     * @param bando Bando del cromo
     */
    public void setBando(String bando) {
        this.bando = bando;
    }

    /**
     * Obtiene si es raro o no el cromo
     *
     * @return Si es raro o no el cromo
     */
    public boolean getRaro() {
        return raro;
    }

    /**
     * Establece si el cromo es raro o no
     *
     * @param raro Si el cromo es raro o no
     */
    public void setRaro(boolean raro) {
        this.raro = raro;
    }

    /**
     * Obtiene el valor de defensa del cromo
     *
     * @return Valor de defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Establece el valor de defensa del cromo
     *
     * @param defensa Valor de defensa del cromo
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Obtiene el valor de defensa del cromo
     *
     * @return Valor de defensa del cromo
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Establece el valor de ataque del cromo
     *
     * @param ataque Valor de ataque del cromo
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Obtiene el año de emisión del cromo
     *
     * @return Año de emisión del cromo
     */
    public int getAnyoEmision() {
        return anyoEmision;
    }

    /**
     * Establece el año de emisión del cromo
     *
     * @param anyoEmision Año de emisión del cromo
     */
    public void setAnyoEmision(int anyoEmision) {
        this.anyoEmision = anyoEmision;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

  

    /**
     * Muestra los datos del cromo en forma de cadena
     *
     * @return Datos del cromo
     */
    @Override
    public String toString() {
        return "Código del cromo: " + codigo + "\n" + descripcion + "\n" + "Bando: " + bando + "\n" + "Ataque:" + ataque + " Defensa: " + defensa + "\n" + "Año de emisión: " + anyoEmision;
    }

}
