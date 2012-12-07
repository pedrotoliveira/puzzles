package puzzles.ocjp.flowcontrol;

public final class FlowControl {

    enum Colors {

        green("verde"), blue("azul"), red("vermelho");
        final String color;

        private Colors(String s) {
            color = s;
        }
    }

    public static void main(String args[]) {
        assigments();
        switchingInEnum(Colors.green);
        fallThrouthLogic(5);
        labeledWhileLoop(15);
        doLoopWhile();
    }

    private static void assigments() {
        boolean a = false;
        if (a = true) {
            System.out.println("A Assigment of a boolean in If Statment: " + a);
        }

    }

    private static void switchingInEnum(Colors c) {
        switch (c) {
            case green:
                System.out.println(c.color);
                break;
            case blue:
                System.out.println(c.color);
                break;
            case red:
                System.out.println(c.color);
                break;
            default:
                System.out.println("done");
        }

    }

    private static void fallThrouthLogic(int n) {
        if (n > 10) {
            System.out.println("Number higher than 10");
        } else {
            switch (n) {
                default:
                    System.out.println("Number is odd");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println("Number is even");
                    break;

            }
        }
    }

    /**
     * Try creating a labeled while loop. Make the label outer and provide a
     * condition to check whether a variable age is less than or equal to 21.
     * Within the loop, increment age by one. Every time the program goes
     * through the loop, check whether age is 16. If it is, print the message
     * "get your driver's license" and continue to the outer loop. If not, print
     * "Another year."
     *
     * @param age
     */
    private static void labeledWhileLoop(int age) {
        outer:
        while (age <= 21) {
            if (age == 16) {
                System.out.println("get your driver's license");
                age++;
                continue outer;
            }
            System.out.println("Another year.");
            age++;
        }
    }
    
    private static void doLoopWhile() {
        int i=7;
        do {
            //Always execute at least one time!
            System.out.print(i + " ");
            i++;
        } while(i != 10);
    }
}
