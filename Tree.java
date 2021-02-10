import java.io.File;

public class Tree {

  /**
  * El método imprime el arbol con las carpetas y archivos que contiene.
  * @param folder debe ser una carpeta.
  */
  public String printDirectoryTree(File folder) {
      if (!folder.isDirectory()) {
          throw new IllegalArgumentException("folder is not a Directory");
      }
      int indent = 0;
      StringBuilder sb = new StringBuilder();
      printDirectoryTree(folder, indent, sb);
      return sb.toString();
  }

  /**
  * El método sirve para crear el string que se imprime en el método anterior.
  * @param folder debe ser una carpeta.
  * @param indent es para las filas que se terminaran imprimiendo
  * @param sb es el StringBuilder que maneja todo lo que se imprimirá
  */
  private void printDirectoryTree(File folder, int indent, StringBuilder sb) {
      if (!folder.isDirectory()) {
          throw new IllegalArgumentException("folder is not a Directory");
      }
      sb.append(getIndentString(indent));
      sb.append("+--");
      sb.append(folder.getName());
      sb.append("/");
      sb.append("\n");
      for (File file : folder.listFiles()) {
          if (file.isDirectory()) {
              printDirectoryTree(file, indent + 1, sb);
          } else {
              printFile(file, indent + 1, sb);
          }
      }

  }
  /**
  *El método agrega las partes necesarias para el formato de impresión y las agrega al *stringbuilder, llama al metodo getIndentSrting 
  * @param folder debe ser una carpeta.
  * @param indent es para las filas que se terminaran imprimiendo
  * @param sb es el StringBuilder que maneja todo lo que se imprimirá
  */
  private void printFile(File file, int indent, StringBuilder sb) {
      sb.append(getIndentString(indent));
      sb.append("+--");
      sb.append(file.getName());
      sb.append("\n");
  }

/**
*Elmetodo agrega agrega las filas necesarias para todos los archivos y carpetas. en el *directorio
* @param indent es para las filas que se terminaran imprimiendo
*/
  private String getIndentString(int indent) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < indent; i++) {
          sb.append("|  ");
      }
      return sb.toString();
  }
}
