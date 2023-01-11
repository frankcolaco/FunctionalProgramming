package org.practice.functionalprogramming.app.design.patterns;

import lombok.ToString;

import java.util.function.Consumer;

public class BuilderDesignPatterMain {

    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();
        Mobile myMobile = builder.with(myBuilder ->{
            myBuilder.ram = 4;
            myBuilder.storage=512;
            myBuilder.processor="A12 Bionic";
            myBuilder.camera = 10;
        }).createMobile();

        System.out.println(myMobile);

    }
}

@ToString
class Mobile{
    final int storage;
    final int ram;
    final int camera;
    final String processor;
    final double screenSize;

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public int getCamera() {
        return camera;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public Mobile(MobileBuilder builder){
        storage=builder.storage;
        ram = builder.ram;
        camera = builder.camera;
        processor = builder.processor;
        screenSize = builder.screenSize;
    }
}

class MobileBuilder{
    int storage;
    int ram;
    int camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> consumer){
        consumer.accept(this);
        return this;
    }

    public Mobile createMobile(){
        return new Mobile(this);
    }
}
