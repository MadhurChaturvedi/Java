package class11;

class Coumputer {
    public void playMusic() {
        System.out.println("Music Player");
    }

    public String getPen(int cost) {
        if (cost < 10 || cost == 0) {
            return "Pen can not be the less than 10";
        } else {
            return "Pen";
        }
    }
}

public class demo {
    public static void main(String[] args) {
        Coumputer obj = new Coumputer();
        obj.playMusic();
        String pen = obj.getPen(0);
        System.out.println(pen);
    }
}
