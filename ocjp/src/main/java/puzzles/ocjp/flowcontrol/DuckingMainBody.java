/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzles.ocjp.flowcontrol;

/**
 *
 * @author cad_ptoliveira
 */
public class DuckingMainBody {

    final static short x = 2;
    final static int y = 0;

    public static void main(String[] args) {
        for (int z = 0; z < 10; z++) {
            switch (z) {
                case x: //2
                    System.out.print("0 ");
                default:
                    System.out.print("def ");
                case x - 1: //1
                    System.out.print("1 ");
                    break;
                case x - 2: //0
                    System.out.print("2 ");
            }
        }

        //System.out.println("Executed");
        //doStuff();
        //System.out.println("Not executed...interrupted by exception");
    }

    private static void doStuff() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
