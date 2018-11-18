
package cromos;

import java.util.Comparator;

/**
 *
 * @author Mario
 * version 14/05/2017
 * Clase que implementa la interfaz Comparator para ordenar descendentemente
 * los cromos en función de su descripción
 */
public class ComparadorDescripcionDescendente implements Comparator<Cromo> {

    /**
     * Método que va a permitir establecer un orden ascendente en función de la
     * descripción del cromo.
     * @param c1 Primer cromo para ser comparado
     * @param c2 Segundo cromo para ser comparado
     * @return 0 si la descripción es la misma, un número negativo si c1 va antes
     * alfabéticamente, o un número positivo en caso contrario
     */
    @Override
    public int compare(Cromo c1, Cromo c2) {
        int resultado = c1.getDescripcion().compareToIgnoreCase(c2.getDescripcion());
        resultado *= (-1); //cambiamos el signo del resultado ya que queremos que ordene de forma inversa
        return resultado;
    }

}
