package Binus.BNCC.Project;

import java.util.Scanner;

public class car extends vehiechle{
    Scanner scan = new Scanner(System.in);
    @Override
    public String brand(String brand) {
        

        // TODO Auto-generated method stub
        super.brand(brand);
        do {
            brand = scan.nextLine();
        } while (brand.length() < 5);
        return brand;
        
    }
    @Override
    public void name(String name) {
        do {
            name = scan.nextLine();
        } while (name.length() < 5);
        // TODO Auto-generated method stub
        super.name(name);
    }
    @Override
    public void license(String license) {

        // TODO Auto-generated method stub
        super.license(license);
    }
    @Override
    public void speed(int speed) {
        do {
            speed = scan.nextInt(); scan.nextLine();
        } while (speed < 100  || speed > 250);
        // TODO Auto-generated method stub
        super.speed(speed);
    }
    @Override
    public void gas(int gas) {
        do {
            gas = scan.nextInt(); scan.nextLine();
        } while (gas < 30 || gas > 60);
        // TODO Auto-generated method stub
        super.gas(gas);
    }
    @Override
    public void wheel(int wheel) {
        do {
            wheel = scan.nextInt(); scan.nextLine();
        } while (wheel <4 || wheel >6);
        // TODO Auto-generated method stub
        super.wheel(wheel);
    }
    @Override
    public void type(String type) {
        do {
            type = scan.nextLine();
        } while (!(type.contains("SUV") ||type.contains("Supercar") || type.contains("Minivan")));
        // TODO Auto-generated method stub
        super.type(type);
    }
    @Override
    public void entertaiment(int entertaiment) {
        do {
            entertaiment = scan.nextInt(); scan.nextLine();
        } while (entertaiment < 1 );
        // TODO Auto-generated method stub
        super.entertaiment(entertaiment);
    }
}
