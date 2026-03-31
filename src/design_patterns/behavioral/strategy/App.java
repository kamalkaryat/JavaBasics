package design_patterns.behavioral.strategy;


public class App {
    public static void main(String[] args) {
        // Usage:
        CompressionContext context = new CompressionContext();
        context.setStrategy(new ZipCompression());      //using use ZipCompression Algo
        context.createArchive("document.txt");

        context.setStrategy(new RarCompression());      //can use RarCompression Algo
        context.createArchive("image.jpg");
    }
}

interface CompressionStrategy {
    void compress(String file);
}

class ZipCompression implements CompressionStrategy {
    public void compress(String file) {
        System.out.println("Compressing " + file + " using ZIP");
    }
}

class RarCompression implements CompressionStrategy {
    public void compress(String file) {
        System.out.println("Compressing " + file + " using RAR");
    }
}

class CompressionContext {
    private CompressionStrategy strategy;

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(String file) {
        strategy.compress(file);
    }
}
