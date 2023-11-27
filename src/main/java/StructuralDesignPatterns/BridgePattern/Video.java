package StructuralDesignPatterns.BridgePattern;

public abstract  class Video {
    VideoProcessor videoProcessor;

    public Video(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }
    public abstract void playFile(String File);

}
