import java.io.*;
/**
* @author Arturo Acosta / Fernando Arciga
* @brief vi modela el editor de texto de linux
* @version 1.5
*/
public interface vi{
  /**
  * @brief el metodo inConsola utiliza la lectura del buffer
  * para despues escribirlo en un archivo mientras el usuario no meta 
  * el acronimo EOF, puede lanzar una excepcion de tipo entrada salida
  * al no encontrar el archivo a escribir
  * @param archivo es el nombre del nuevo archivo a desarrollar
  */
  public static void inConsola(String archivo){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
      String read = "";
      while(read.equals("EOF") != true){
        read = br.readLine();
        if(read.equals("EOF")){
          br.close();
          bw.close();
          break;
        }
        bw.write(read+"\n");
        bw.flush();
      }
    }catch(IOException ex){
      System.out.println("Problema encontrado: " + ex);
      return;
    }
  }
}