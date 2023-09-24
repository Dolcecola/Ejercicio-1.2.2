import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        int a = 0;
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Introduce un numero: ");
            Scanner entrada = new Scanner(System.in);
            try{
                a = Integer.parseInt(entrada.next());
            } catch (IllegalArgumentException e){
                break;
            }
            array[i] = a;

        }

        for(Integer vec: array)
        {
            System.out.print(vec + ", ");
        }
    }
}