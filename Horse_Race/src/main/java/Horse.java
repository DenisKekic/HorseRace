import java.util.Random;

public class Horse implements Runnable, Comparable<Horse>{
    private int name;
    private Scoreboard scoreboard;

    Random random = new Random();
    int zeit;

    public int getZeit() {
        return zeit;
    }

    public int getName() {
        return name;
    }

    public Horse(int name, Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
        this.name = name;
        this.zeit = random.nextInt(500, 1501);
    }

    @Override
    public void run() {

        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(zeit);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            scoreboard.horseList.add(this);
            //scoreboard.ergebnisliste.add(zeit);
            //scoreboard.score.put(name, zeit);
            Thread.currentThread().interrupt();
        }
        scoreboard.ausgabe();
    }

    @Override
    public int compareTo(Horse o) {
        return Integer.compare(this.getZeit(), o.getZeit());
    }
}
