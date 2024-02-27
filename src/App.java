import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        String[] arr = new String[a];

        for(int i = 0; i < a; i++){
            int altura = sc.nextInt();
            int diametro = sc.nextInt();
            int galhos = sc.nextInt();

            if(altura >= 200 && altura<= 300 && diametro >= 50 && galhos >= 150){
                arr[i] = "Sim";
            }else{
                arr[i] = "Nao";
            }
        }

        for(String p : arr){
            System.out.println(p);
        }

        sc.close();
    }
}
