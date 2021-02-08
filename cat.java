import java.io.*;
/**
* @author Arturo Acosta / Fernando Arciga
* @brief cat simula el comando de linux
* @version 1.5
*/
public class Cat{
  /**
  * @brief my_cat utilza el principio del comando linux para leer el
  * contenido de cada archivo en sus argumentos
  * @param args son los argumentos a leer
  */
  public void my_cat(String[] args){
    int argc = args.length;
    for(int i = 1; i < argc; i++){
      try{
        BufferedReader br = new BufferedReader(new FileReader(args[i]));
        String read;
        System.out.println("Archivo: " + args[i]);
        while((read = br.readLine())!=null){
          System.out.println(read);
        }
        br.close();
      }catch(IOException ex){
        System.out.println("Archivo no encontrado :c");
        return;
      }
    }
  }
}
