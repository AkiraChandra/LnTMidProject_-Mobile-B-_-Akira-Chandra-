package Binus.BNCC.Project;

import java.util.Scanner;

public class midproject extends vehiechle{
    car mobil = new car();
    motor motor = new motor();
    
  Scanner scan = new Scanner(System.in);
  String type;
    public void input (){
        do {
            System.out.println("Masukan type");
            type = scan.nextLine();
        } while (!(type.contains("Car") || type.contains("Motorcycle")));
        if (type.contains("Car")) {
            
        } else {
            
        }


    }

    public midproject(){
        System.out.println("silahkan isi");
        System.out.println("1. input");
        System.out.println("2. view");
        System.out.println(">>");
    }
    public static void main(String[] args) {
        new midproject();
    }
}
