package StructuralDesignPatterns.BridgePattern;

public class NetflixVideo extends Video{
    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void playFile(String File) {
        videoProcessor.process(File);
    }

}
