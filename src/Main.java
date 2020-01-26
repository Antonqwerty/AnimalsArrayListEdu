import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Animal> list = new ArrayList<>();

    public static void main(String[] args) {
        int action = 0;
        Animal animal1 = new Animal();
        animal1.into();
        while (true) {
            action = s.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Введите животное: ");
                    s.nextLine();
                    String name = s.nextLine();
                    System.out.print("Введите продолжительность его жизни: ");
                    int lifeTime = s.nextInt();
                    Animal animal = new Animal(name, lifeTime);
                    list.add(animal);
                    break;
                case 2:
                    if (list.size() == 0) {
                        System.out.println("пусто");
                    }else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i).getName() + " " + list.get(i).getLifeTime());
                        }
                    }
            }
        }
    }
}