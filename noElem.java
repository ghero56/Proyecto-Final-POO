/**
* @author Arturo Acosta / Fernando Arciga
* @brief cat simula el comando de linux 
* @version 1.5
*/
public class noElem extends Exception {
  /**
  * cadena que guarda el mensaje al ser lanzada la excepcion
  */
   String nuevo_mensaje;
   /**
   * @brief constructor que recibe el nuevo mensaje a imprimir
   * @param nm es el nuevo mensaje
   */
   public noElem(String nm){
      nuevo_mensaje = nm;
   }

   public noElem(){
      nuevo_mensaje = "Error inesperado";
   }
   /**
   * @brief se sobreescribe el metodo toString de java.object para mandar
   * la cadena hecha en el constructor
   */
   public String toString() { 
      return ("Salida del error = " + nuevo_mensaje);
   }
}
