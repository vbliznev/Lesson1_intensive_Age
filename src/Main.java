import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) {
        int age =127;
        int lastNumberFromAge = age % 10;
        String year ="";

        if (age==0){
            System.out.println("Вы ещё не родились");
        }
        else {
            if (age == 11 || age == 12 || age ==13 || age ==14){
                year="лет";
            }
            else {
                if (lastNumberFromAge == 1) {
                    year="год";
                } else {
                    if (lastNumberFromAge == 2 || lastNumberFromAge == 3 || lastNumberFromAge == 4) {
                        year="года";
                    } else {
                        year="лет";
                    }
                }
            }
        }
        System.out.println("Вам " + age + " " + year);
    }
}