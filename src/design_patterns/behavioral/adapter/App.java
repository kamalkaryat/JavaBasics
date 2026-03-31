package design_patterns.behavioral.adapter;

public class App {
    public static void main(String[] args) {
        // Usage:
        MediaPlayer player = new MediaAdapter("vlc");
        player.play("vlc", "movie.vlc");
    }
}

// Existing interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Advanced interface
interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

// Concrete advanced player
class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    public void playMp4(String fileName) {
        // Do nothing
    }
}

// Adapter
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer = new VlcPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        }
    }
}
