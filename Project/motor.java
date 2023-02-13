package Binus.BNCC.Project;

import java.util.Scanner;

public class motor extends vehiechle {
    Scanner scan = new Scanner(System.in);
    @Override
    public String brand(String brand) {
        do {
            brand = scan.nextLine();
        } while (brand.length() < 5);
        // TODO Auto-generated method stub
        super.brand(brand);
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
        } while (wheel != 2 || wheel != 3);
        // TODO Auto-generated method stub
        super.wheel(wheel);
    }
    public void helm(int helm){
        do {
            helm = scan.nextInt(); scan.nextLine();
        } while (helm < 1);
    }
    @Override
    public void entertaiment(int entertaiment) {
        entertaiment = scan.nextInt();
        // TODO Auto-generated method stub
        super.entertaiment(entertaiment);
    }
}
