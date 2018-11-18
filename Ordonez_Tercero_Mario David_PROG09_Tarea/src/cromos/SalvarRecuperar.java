package cromos;

import cromosUI.Principal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 * version 14/05/2017 
 * Clase para guardar cromos de un ArrayList en un fichero y recuperarlos 
 * cargándolos en un ArrayList
 */
public class SalvarRecuperar {

    /**
     * Método que permite recuperar los objetos guardados en un fichero
     * cargándolos en un ArrayList
     *
     * @param archivo Archivo donde están guardados los objetos
     * @return ArrayList de cromos
     */
    public static ArrayList<Cromo> recuperaDatos(String archivo) {

        FileInputStream fis;
        try {
            // Abrimos el fichero para lectura
            fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Leemos y recuperamos los datos en el mismo orden que se guardaron
            Principal.cromos = (ArrayList<Cromo>) ois.readObject();
            //Recuperamos el total de cromos
            Cromo.totalCromos = ois.readInt();
            //Recuperamos el código a partir del cual se volverá a asignar a los nuevos cromos que se creen
            Cromo.codigoSiguiente = ois.readInt();
            //Cerramos el fichero
            ois.close();

            Principal.cambiosEnArray = false;

            JOptionPane.showMessageDialog(null, "Se han cargado correctamente los datos en la aplicación", "Atención,", 1);

        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error, el fichero cromos.dat no existe(El sistema no puede encontrar el archivo especificado)", "Error", 2);
        }
        return Principal.cromos;
    }

    /**
     * Método que permite guardar los datos del ArrayList de cromos en el
     * fichero cromos.dat
     *
     */
    public static void guardaDatos() {
        try {
            //Abrimos el fichero para escribir y guardar en él
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("cromos.dat"));
            //Escribimos los objetos del arraylist en el fichero
            escribiendoFichero.writeObject(Principal.cromos);
            //Escribimos el total de cromos
            escribiendoFichero.writeInt(Cromo.totalCromos);
            /*Guardamos el último código para que cuando recuperemos
            los datos de los objetos cargándolos en el arraylist de cromos
            siga asignandose códigos a partir de él y no se repitan los ya usados*/
            escribiendoFichero.writeInt(Cromo.codigoSiguiente);
            //Cerramos el fichero
            escribiendoFichero.close();

            JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente en el fichero cromos.dat", "Atención", 1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error, no se han guardado los datos", "Atención", 1);
        }

    }

}
