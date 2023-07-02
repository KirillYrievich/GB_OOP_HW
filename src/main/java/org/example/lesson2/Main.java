package org.example.lesson2;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Move[] arrAthletes = new Move[3];

        arrAthletes[0] = new Human("Роберт", 500, 3);
        arrAthletes[1] = new Robot("R2D2", 0, 0);
        arrAthletes[2] = new Cat("Барсик", 100, 5);

        Move[] arrLet = new Move[4];
        arrLet[0] = new RunningTrack(150);
        arrLet[1] = new Wall(1);
        arrLet[2] = new Wall(3);
        arrLet[3] = new RunningTrack(350);

        getInfoAboutPassingLet(arrAthletes, arrLet);
    }

    // методы

    public static void getInfoAboutPassingLet(Move[] arrAthletes, Move[] arrLet ) {
        boolean res = false;
        for (int i = 0; i < arrAthletes.length; i++) {
            System.out.println(arrAthletes[i] + " начинает забег!");
            for (int j = 0; j < arrLet.length; j++) {
                if (arrLet[j].getCodeOfLet() == 0) {
                    res = arrAthletes[i].moveRun(arrLet[j]);
                    if (res == false) {
                        System.out.println(arrAthletes[i] + " выбывает из соревнований!");
                        break;
                    }
                }
                if (arrLet[j].getCodeOfLet() == 1) {
                    res = arrAthletes[i].moveJump(arrLet[j]);
                    if (res == false) {
                        System.out.println(arrAthletes[i] + " выбывает из соревнований!");
                        break;
                    }
                }
            }
            if (res == true) {
                System.out.println(arrAthletes[i] + " прошел все препятствия!");
            }
            System.out.println("------------------------------------------------");
        }
    }
}