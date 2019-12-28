package Main;

import Custom.CarParkManager;
import DTO.Car;
import DTO.MotorBike;
import DTO.Van;
import DTO.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WestministerCarParkManager implements CarParkManager {

    public static void main(String[] args) {

         String id;
         String type;
         String brand;
         String entryTime;
         Date date;
         String edate;
         int numberOfDoors;
         String color;
        float cargoVol;
        float engineCapacity;
        int cr=0;
        int vn=0;
        int bi=0;
        float price;
        int count=0;
        ArrayList<Object> vehicals=new ArrayList<>();
        Vehicle vehical[]=new Vehicle[20];
        Car car=new Car();
        Van van=new Van();
        MotorBike bike=new MotorBike();
        int i=0;
        for(int l=0;l<20;l++){
            car=new Car("No Vehicle","","","","",0,"");
            vehical[l]=car;
        }
        Scanner input=new Scanner(System.in);
        SimpleDateFormat tformatter=new SimpleDateFormat("HH:mm");
        SimpleDateFormat ptformatter=new SimpleDateFormat("HH");
        SimpleDateFormat dateFormatter=new SimpleDateFormat("yyyy/MM/dd");
        while (i>=0) {
            System.out.println("=======Car Park Management System=======");
            System.out.println("Enter the Operation what do you want.");
            System.out.println("1-Enter a vehicle");
            System.out.println("2-Remove a vehicle");
            System.out.println("3-Get the vehicle list");
            System.out.println("4-Get the percentage of vehicles");
            System.out.println("5-Get the last vehicle and longest time");
            System.out.println("6-Get vehicle list grouped by date");
            System.out.println("7-Get parking fee");
            System.out.println("-1-Exit");
            int opt = input.nextInt();
            switch (opt) {
                case 1:
                    for(int y=0;y<20;y++){
                        String tpm=vehical[y].getId();
                        if(tpm.equals("No Vehicle")){
                            count++;
                        }
                    }
                    if(count>0){
                    System.out.println("What is the vehicle type");
                    System.out.println("1-Car");
                    System.out.println("2-Van");
                    System.out.println("3-MotorBike");
                    int typ = input.nextInt();
                    switch (typ) {
                        case 1:
                            type = "Car";
                            System.out.println("Vehicle Id:");
                            id = input.next();
                            System.out.println("Vehicle Brand:");
                            brand = input.next();
                            System.out.println("Parking date:");
                            date = new Date();
                            edate = dateFormatter.format(date);
                            System.out.println(edate);
                            System.out.println("Parking time:");
                            //entryTime =tformatter.format(date);
                            entryTime = input.next();
                            System.out.println(entryTime);
                            System.out.println("Number of doors:");
                            numberOfDoors = input.nextInt();
                            System.out.println("Vehicle colour:");
                            color = input.next();
                            car = new Car(id, type, brand, entryTime, edate, numberOfDoors, color);
                            vehical[i] = car;
                            i++;
                            break;
                        case 2:
                            type = "Van";
                            System.out.println("Vehicle Id:");
                            id = input.next();
                            System.out.println("Vehicle Brand:");
                            brand = input.next();
                            System.out.println("Parking date:");
                            date = new Date();
                            edate = dateFormatter.format(date);
                            System.out.println(edate);
                            System.out.println("Parking time:");
                            //entryTime =tformatter.format(date);
                            entryTime = input.next();
                            System.out.println(entryTime);
                            System.out.println("Vehicle cargo capacity:");
                            cargoVol = input.nextFloat();
                            van = new Van(id, type, brand, entryTime, edate, cargoVol);
                            vehical[i] = van;
                            i++;
                            vehical[i] = van;
                            i++;
                            break;
                        case 3:
                            type = "MotorBike";
                            System.out.println("Vehicle Id:");
                            id = input.next();
                            System.out.println("Vehicle Brand:");
                            brand = input.next();
                            System.out.println("Parking date:");
                            date = new Date();
                            edate = dateFormatter.format(date);
                            System.out.println(edate);
                            System.out.println("Parking time:");
                            //entryTime =tformatter.format(date);
                            entryTime = input.next();
                            System.out.println(entryTime);
                            System.out.println("Vehicle engine capacity:");
                            engineCapacity = input.nextFloat();
                            bike = new MotorBike(id, type, brand, entryTime, edate, engineCapacity);
                            vehical[i] = bike;
                            i++;
                            break;
                        default:
                            break;
                    }
                    }else {
                        System.out.println("Car park is full");
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
                    String tp="";
                    for(int x=0;x<20;x++) {
                        tp=vehical[x].getType();
                        if (tp.equals("Car")) {
                            cr++;
                        }
                        if (tp.equals("Van")) {
                            vn++;
                        }
                        if (tp.equals("MotorBike")) {
                            bi++;
                        }
                    }
                    System.out.println("Percentage of Cars:");
                    float prc=((cr/20)*100);
                    System.out.println(prc+"%");
                    System.out.println("Percentage of Vans:");
                    float prv=((vn/20)*100);
                    System.out.println(prv+"%");
                    System.out.println("Percentage of MotorBikes:");
                    float prb=((bi/20)*100);
                    System.out.println(cr);
                    System.out.println(vn);
                    System.out.println(bi);
                    System.out.println(prb+"%");
                    break;
                case 5:
                    break;
                case 6:
                    String ed="";
                    String ued=input.next();
                    for(int r=0;i<20;i++){
                        ed=vehical[r].getDate();
                        if(ed.equals(ued)){
                            System.out.println("-----------------------------------------");
                            System.out.println("Parking slot:" + (r + 1));
                            System.out.println("Vehicle Id:" + vehical[r].getId());
                            System.out.println("Vehicle Type:" + vehical[r].getType());
                            System.out.println("Vehicle Brand:" + vehical[r].getBrand());
                            System.out.println("Vehicle entry time:" + vehical[r].getEntryTime());
                        }
                    }
                    break;
                case 7:
                    System.out.println("---------------Parking Payment----------------------");
                    System.out.println("Enter vehicle Id Plate number:");
                    String idplt=input.next();
                    Date ctime=new Date();
                    String curtm=tformatter.format(ctime);
                    System.out.println("Enter current time");
                    System.out.println(curtm);
                    String curTim=ptformatter.format(ctime);
                    String tmpid;
                    for(int q=0;q<20;q++){
                        tmpid=vehical[q].getId();
                        if(tmpid.equals(idplt)){
                            System.out.println("-----------------------------------------");
                            try {
                                Date etime=ptformatter.parse(vehical[q].getEntryTime());
                                Date ctim=ptformatter.parse(curtm);
                                long timeDif=((Math.abs(etime.getTime()-ctim.getTime()))/1000)/3600;
                                System.out.println(etime.getTime()+""+ctim.getTime());
                                System.out.println(timeDif);
                                if(timeDif>3){
                                    long pt1=timeDif*3;
                                    long pt2=(timeDif-3)*1;
                                    price=pt1+pt2;
                                }else {
                                    long pt=timeDif*3;
                                    price=pt;
                                }
                                System.out.println("Parking fee:Rs"+price);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                    break;
                case -1:
                    System.exit(1);
                    break;
            }
        }







    }
}
