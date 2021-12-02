package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Memory memory = new Memory("dsdf", 163.2);
        HardDrive hardDrive=new HardDrive("fcgh",12.3,1234.5,"Samsung");
        System.out.println(memory.getModel());
        memory.setModel("x-60");
        System.out.println(memory.getModel());
        System.out.println(hardDrive);
        OperationSystem operationSystem = new OperationSystem("DDR3"," vs5",2018);
        System.out.println(operationSystem);
        Laptop laptop = new Laptop(hardDrive,memory,operationSystem);
        System.out.println(laptop);

////        System.out.println("Enter HardDrive properties type, speed, volume, producer: ");
//        HardDrive hardDrive = new HardDrive("HDD", 123, 124, "Samsung");
//        String[] hardDriveArray = new String[1];
//
//        hardDriveArray[0]=hardDrive.hardForArray();
//        System.out.println("This is what I have in hardDriveArray: " + hardDriveArray[0]);
//
//        Memory memory = new Memory("Asus JP123/3.15", 10124);
//        String[] memoryArray = new String[1];
//        memoryArray[0] = memory.memoryForArray();
//        System.out.println("This is what I have in memoryArray: " + memoryArray[0]);
//
//        OperationSystem operationSystem = new OperationSystem("Windows", "7 Ultimate", 2012);
//        String[] operationSystemArray = new String[1];
//        operationSystemArray[0] = operationSystem.operationSystemForArray();
//        System.out.println("This is what I have in operationSystemArray: " + operationSystemArray[0]);
//
////
////        Processor processor = new Processor("QuadCore Pentium 4", 4, 3.15);
//        Laptop laptop = new Laptop(hardDrive, memory, operationSystem);
//
//        int[] laptops = new int[100];
//        laptops = laptop.storage(laptops, 10);
//        System.out.println(Arrays.toString(laptops));
//
//        System.out.println("\n\n\n");
//
//        hardDrive.print();
//        memory.print();
//        operationSystem.print();
////        processor.print();
    }
}