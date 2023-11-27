package StructuralDesignPatterns.BridgePattern;

public class HDProcessor implements VideoProcessor{
    @Override
    public void process(String file) {
        System.out.println("playing file in HD mode  " + file);
    }
}
