import java.util.Scanner;

public class PlandeRépartition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer le nombre d’étudiants : ");
        int N = scanner.nextInt();
        System.out.println("Entrer le nombre de bancs : ");
        int M = scanner.nextInt();
int count = 1;
int plusbank = 0;
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j < N/2; j++) {
                System.out.println("Banc "+ i +" : Étudiant "+ count++ +", Étudiant "+ count++);
                break;
            }
            plusbank = i+1;
            if(count == N) { break;}

            }

        if( N % 2 == 1 && M > N/2) {
            System.out.println("Banc "+ plusbank +" : Étudiant "+ count);
        } else if (N % 2 == 1 ){
            System.out.println("Étudiant "+ count +" ne trouve pas de place");
        }
    }

    }
