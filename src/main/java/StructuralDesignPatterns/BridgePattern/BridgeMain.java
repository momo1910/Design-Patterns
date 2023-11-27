package StructuralDesignPatterns.BridgePattern;

public class BridgeMain {
    public static void main (String args[]){
        YouTubeVideo youTubeVideo= new YouTubeVideo(new HDProcessor());
        youTubeVideo.playFile("abc.mp3");
        NetflixVideo netflixVideo= new NetflixVideo(new FourKProcessor());
        netflixVideo.playFile("social netwokrk");
    }
}
