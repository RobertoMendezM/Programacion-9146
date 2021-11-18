/**
 *  Programa que despliega la pantalla para buscar un archivo
 *
 *  Curso de Programación
 *
 *  Editor: roberto Méndez Méndez
 *  Fecha:  16-Nov-21
 */

import javax.swing.JFileChooser;
import java.io.File;


public class SelectorArchivo {

    public static File seleccionaArchivo1(){
        File archivo = null;
        JFileChooser archivoSel = new JFileChooser();
        int valor = archivoSel.showOpenDialog(archivoSel.getParent());
        if(valor == JFileChooser.APPROVE_OPTION)
        {
            try{
                File tmpArch = archivoSel.getSelectedFile();
                String ruta = tmpArch.getAbsolutePath();
                archivo = new File(ruta);
            }catch (SecurityException f){
                System.err.println("No se pudo accesar el archivo");
            }

        } else {
            System.out.println("No seleccionaste ningún archivo");
        }

        return archivo;

    }
}
