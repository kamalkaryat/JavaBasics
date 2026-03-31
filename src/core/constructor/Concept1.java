package core.constructor;

public class Concept1 {
    public static void main(String[] args) {
        Box cuboid=new Box();
        System.out.println("Length: "+cuboid.getLen() +"Breadth: "+cuboid.getBred() +
                "Height: "+cuboid.getHght());
    }
}

class Box{
    private int len;
    private int bred;
    private int hght;

    public Box(){
        this.len= 10;
        this.bred= 20;
        this.hght= 30;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBred() {
        return bred;
    }

    public void setBred(int bred) {
        this.bred = bred;
    }

    public int getHght() {
        return hght;
    }

    public void setHght(int hght) {
        this.hght = hght;
    }
}