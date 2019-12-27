package Main;

import DTO.Car;
import DTO.MotorBike;
import DTO.Van;
import DTO.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         String id;
         String type;
         String brand;
         String entryTime;
         Date date;
         int numberOfDoors;
         String color;
        float cargoVol;
        float engineCapacity;
        int cr=0,vn=0,bi=0;
        ArrayList<Object> vehicals=new ArrayList<>();
        Vehicle vehical[]=new Vehicle[20];
        Car car=new Car();
        Van van=new Van();
        MotorBike bike=new MotorBike();
        int i=0;
        for(int l=0;l<20;l++){
            car=new Car("No Vehicle","","","",new Date(),0,"");
            vehical[l]=car;
        }
        Scanner input=new Scanner(System.in);
        while (i>=0) {
            System.out.println("=======Car Park Management System=======");
            System.out.println("Enter the Operation what do you want.");
            System.out.println("1-Enter a vehicle");
            System.out.println("2-Remove a vehicle");
            System.out.println("3-Get the vehicle list");
            System.out.println("4-Get the percentage of vehicles");
            System.out.println("5-Get the last vehicle and longest time");
            System.out.println("-1-Exit");
            int opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("What is the vehicle type");
                    System.out.println("1-Car");
                    System.out.println("2-Van");
                    System.out.println("3-MotorBike");
                    int typ = input.nextInt();
                    switch (typ) {
                        case 1:
                            type="Car";
                            System.out.println("Vehicle Id:");
                            id = input.next();
                            System.out.println("Vehicle Brand:");
                            brand = input.next();
                            System.out.println("Parking date:");
                            date = new Date();
                            System.out.println("Parking date:");
                            entryTime = input.next();
                            System.out.println("Number of doors:");
                            numberOfDoors = input.nextInt();
                            System.out.println("Vehicle colour:");
                            color = input.next();
                            car = new Car(id,type, brand, entryTime, date, numberOfDoors, color);
                            vehical[i]=car;
                            i++;
                            break;
                        case 2:
                            type="Van";
                            System.out.println("Vehicle Id:");
                            id = input.next();
                            System.out.println("Vehicle Brand:");
                            brand = input.next();
                            System.out.println("Parking date:");
                            date = new Date();
                            System.out.println("Parking time:");
                            entryTime = input.next();
                            System.out.println("Vehicle cargo capacity:");
                            cargoVol=input.nextFloat();
                            van=new Van(id,type,brand,entryTime,date,cargoVol);
                            vehical[i]=van;
                            i++;
                            vehical[i]=van;
                            i++;
                            break;
                        case 3:
                            type="MotorBike";
                            System.out.println("Vehicle Id:");
                            id = input.next();
                            System.out.println("Vehicle Brand:");
                            brand = input.next();
                            System.out.println("Parking date:");
                            date = new Date();
                            System.out.println("Parking time:");
                            entryTime = input.next();
                            System.out.println("Vehicle engine capacity:");
                            engineCapacity=input.nextFloat();
                            bike=new MotorBike(id,type,brand,entryTime,date,engineCapacity);
                            vehical[i]=bike;
                            i++;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---Remove Vehicle---");
                    System.out.println("Vehicle ID:");
                    String idPlt=input.next();
                    String temp="";
                    try {
                        for (int t = 0; t < 20; t++) {
                            temp=vehical[t].getId();
                            if(temp.equals(idPlt)){
                                vehical[t].setId("No Vehicle");
                                vehical[t].setBrand("");
                                vehical[t].setDate(null);
                                vehical[t].setEntryTime("");
                                vehical[t].setType("");
                            }
                        }
                    }catch (NullPointerException e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        int slt=20;
                        for (int t = 0; t < 20; t++) {
                            System.out.println("-----------------------------------------");
                            System.out.println("Parking slot:" + (t + 1));
                            System.out.println("Vehicle Id:" + vehical[t].getId());
                            System.out.println("Vehicle Type:" + vehical[t].getType());
                            System.out.println("Vehicle Brand:" + vehical[t].getBrand());
                            System.out.println("Vehicle entry time:" + vehical[t].getEntryTime());
                        }
                    }catch (NullPointerException e){
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    for(int x=0;x<20;x++) {
                        if (vehical[x].getType().equals("Car")) {
                            cr++;
                        }
                        if (vehical[x].getType().equals("Van")) {
                            vn++;
                        }
                        if (vehical[x].getType().equals("MotorBike")) {
                            bi++;
                        }
                    }
                    System.out.println("Percentage of Cars:");
                    float prc=(cr/20)*100;
                    System.out.println(prc+"%");
                    System.out.println("Percentage of Vans:");
                    float prv=(vn/20)*100;
                    System.out.println(prv+"%");
                    System.out.println("Percentage of MotorBikes:");
                    float prb=(bi/20)*100;
                    System.out.println(prb+"%");
                    break;
                case 5:
                    break;
                case -1:
                    break;
            }
        }







    }
}
