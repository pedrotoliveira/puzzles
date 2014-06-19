/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzles.ocjp.io;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author cad_ptoliveira
 */
public class CreateFile {

    public static void main(String[] args) {

        try {
            File f = new File("/tmp/meuArquivo");
            if (!f.exists() && f.createNewFile()) {
                FileOutputStream fo = new FileOutputStream(f);
                fo.write("bla bla bla".getBytes());
                fo.flush();
                fo.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Criou?");
    }
}
