import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] mas = {8, 3, -2, -4, 6};

        boolean isSorted = false;
        int name;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    name = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = name;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}