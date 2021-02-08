import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
* @author Arturo Acosta / Fernando Arciga
* @version 1.5
*/
public class CrearDirectorio{
  /** Clase representa un directorio*/
  private File directorio = new File("DirectorioPrueba");

  public File get_file_en_memoria(){
    return directorio;
  }

  /**
  * @brief Método para crear el directorio principal a partir del cual * * Tree va a partir.
  * Revisa si el directorio está creado; si está creado entra el else y * sale del método, si no existe se crea el directorio.
  */
  public void crearDirectorio(){
    if(!directorio.exists()){
      try{
        directorio.mkdir();
        System.out.println("Directorio creado. :D");
      }catch(Exception e){
        System.out.println("Error al crear directorio."); //Excepcion personalizada aqui
      }
    }else{
      System.out.println("El directorio ya existe.");
    }
  }
  /**
  * @brief Método para crear subcarpetas
  * @param sc es el lector de consola para el nombre de la carpeta
  */
  public void crearCarpeta(Scanner sc){
    String name;
    System.out.println("Ingrese el nombre de la carpeta");
    name = sc.next();
    String direc = directorio.getAbsolutePath();
    File carpeta = new File(directorio.getAbsolutePath(), name);
    if(!carpeta.exists()){
      try{
        carpeta.mkdirs();
        System.out.println("Carpeta creada.");
      }catch(Exception e){
        System.out.println("Error al crear carpeta");
      }
    }else{
      System.out.println("La carpeta con este nombre ya existe");
    }
  }
  /**
  * @brief Método para crear archivos, dentro de la carpeta de trabajo
  * o en cualquier otra carpeta
  * @param recibe el escaner para leer desde consola
  */
  public void crearArchivo(Scanner sc){
    String name;
    System.out.println("Ingrese el nombre de la carpeta donde quiere crear el archivo:");
    System.out.println("Si quiere grardar en una subcarpeta ingrsar: DirectorioPrueba/nombreDeSubcarpeta");
    String padre = sc.next();
    System.out.println("Ingrese nombre del archivo:");
    name=sc.next();
    File f1 = new File( padre + "/" + name);
    if(!f1.exists()){
      try{
          f1.createNewFile();
          System.out.println("Archivo creado");
        }catch(IOException e){
          System.out.println("Problema al crear archivo: "+ e);
        }
    }
    else{
      System.out.println("El archivo ya existe en esta carpeta");
    }
  }
}
