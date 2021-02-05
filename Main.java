import java.util.Scanner;
/**
* @author Arturo Acosta / Fernando Arciga
* @brief clase main para implementar todas las demas clases del paquete
* @version 1.5
*/
class Main implements vi, cat, Tree, CrearDirectorio{
  public static void main(String[] args) {
    if(args.length == 0){
      System.out.println("Sin argumentos\n");
    }
    else if(args[0].equals("myCat")){
      if (args.length <= 1) {
        System.out.println("Faltan argumentos de lectura");
      }else{
        cat.my_cat( args );
      }
    }
    else if (args[0].equals("myMkdir")) {
      Scanner sa = new Scanner(System.in);
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
            CrearDirectorio.crearDirectorio();
            break;
          case 2:
            System.out.println("Crear carpeta.");
            CrearDirectorio.crearCarpeta(sa);
            break;
          case 3:
            System.out.println("Crear archivo");
            CrearDirectorio.crearArchivo(sa);
            break;
          case 4:
            String tree = Tree.printDirectoryTree(CrearDirectorio.directorio);
            System.out.print(tree);
            break;
          case 5:
            System.out.println("Saliendo...");
            sa.close();
            System.out.println("Adios :D");
            break;
        }
      } while (opcion != 5);
    }
    else if (args[0].equals("myVi")) {
      if (args.length <= 1) {
        System.out.println("Faltan argumentos de escritura\n");
      }else{
        vi.inConsola(args[1]);
      }
    }
  }
}
