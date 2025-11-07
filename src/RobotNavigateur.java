import java.util.ArrayList;
import java.util.Scanner;

public class RobotNavigateur {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> position = new ArrayList<>();
        int x = 0;
        int y = 0;

        System.out.println("Entrer une série de commandes : ");
        String commande = scanner.nextLine();
        String[] myArray = commande.split(" ");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals("up")) {
                y = y + 1;
            }else if (myArray[i].equals("down")) {
                y = y - 1;
            }else if (myArray[i].equals("left")) {
                x = x - 1;
            }else if (myArray[i].equals("right")) {
                x = x + 1;
            }
        }
        position.add(x);
        position.add(y);
        System.out.println("Position finale :"+ position);

    }
    }