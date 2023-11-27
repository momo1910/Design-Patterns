package StructuralDesignPatterns.BridgePattern;

public class YouTubeVideo extends Video{
    public YouTubeVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void playFile(String File) {
        videoProcessor.process(File);
    }
}
