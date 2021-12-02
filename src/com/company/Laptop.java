package com.company;

public class Laptop {
    HardDrive hardDrive;
    Memory memory;
    OperationSystem operationSystem;

    //    Processor processor;
    public Laptop() {

    }

    public Laptop(HardDrive hardDrive,
                  Memory memory,
                  OperationSystem operationSystem
    ) {//Processor processor
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.operationSystem = operationSystem;
//        this.processor = processor;
    }


    public void setHardDrive(HardDrive hardDrive) {
        hardDrive = this.hardDrive;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

//    public void setProcessor(Processor processor) {
//        this.processor = processor;
//    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Memory getMemory() {
        return memory;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

//    public Processor getProcessor() {
//        return processor;
//    }

    public void print() {
//        System.out.println(" " + hardDrive.type + " " + hardDrive.producer + " " + hardDrive.speed + " " + hardDrive.volume +
//                "\n" + memory.model + " " + memory.size +
//                "\n" + operationSystem.brand + " " + operationSystem.version + " " + operationSystem.yearOfRelease +
//                "\n" + processor.processorModel + " " + " Number of Cores" + processor.cores + " " + processor.Hz);
        hardDrive.print();
        memory.print();
        operationSystem.print();
//        processor.print();
    }

    public int[] storage(int[] laptopStorage, int random) {
        for (int i = 0; i < 100; i++) {
            for (int z = 0; z < 100; z++) {
                laptopStorage[i] = i + z + random;
            }
        }
        return laptopStorage;
    }
    @Override
    public String toString(){
        String message= "Your hard drive is " + hardDrive + "\nyour memory is " +memory + "\nyour operation system is "+ operationSystem;
        return message;
    }

}
