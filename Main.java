import java.util.Scanner;
/**
* @author Arturo Acosta / Fernando Arciga
* @brief clase main para implementar todas las demas clases del paquete
* @version 1.5
*/
public class Main{
  public static void main(String[] args) {
    if(args.length == 0){
      System.out.println("Sin argumentos\n"+
      "\nalgunos ejemplos: "+
      "\n\tmyCat [argumento1 a leer] [argumento2 a leer...etc]"+
      "\n\tmyMkdir"
      "\n\tmyVi [nombre del archivo a escribir] (una vez terminada la edicion escribir 'EOF' sin comillas para salir)"+
      );
    }
    else if(args[0].equals("myCat")){
      if (args.length <= 1) {
        System.out.println("Faltan argumentos de lectura para cat");
      }else{
        Cat c = new Cat();
        c.my_cat( args );
      }
    }
    else if (args[0].equals("myMkdir")) {
      Scanner sa = new Scanner(System.in);
      CrearDirectorio cd = new CrearDirectorio();
      int opcion;
      do {
        System.out.println( "1) Crear directorio "+
        "\n2) Crear carpeta "+
        "\n3) Crear archivo \n"+
        "4) Tree de carpeta principal "+
        "\n5) Salir");
        System.out.println( "Eleccion: " );
        opcion = sa.nextInt();
        switch (opcion) {
          case 1:
            System.out.println("Crear directorio.");
            cd.crearDirectorio();
            break;
          case 2:
            System.out.println("Crear carpeta.");
            cd.crearCarpeta(sa);
            break;
          case 3:
            System.out.println("Crear archivo");
            cd.crearArchivo(sa);
            break;
          case 4:
            Tree t = new Tree();
            String tree = t.printDirectoryTree(cd.get_file_en_memoria());
            System.out.print(tree);
            break;
          case 5:
            System.out.println("Saliendo...");
            System.out.println("Adios :D");
            break;
        }
      } while (opcion != 5);
      sa.close();
    }
    else if (args[0].equals("myVi")) {
      if (args.length <= 1) {
        System.out.println("Faltan argumentos de escritura\n");
      }else{
        Vi v = new Vi();
        v.inConsola(args[1]);
      }
    }
  }
}
