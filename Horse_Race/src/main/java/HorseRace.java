import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HorseRace {
    public static void main(String[] args) {

        Scoreboard scoreboard = new Scoreboard();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 1; i < 11; i ++){
            Horse horse = new Horse(i, scoreboard);
            //scoreboard.listnames.add(i);
            executorService.execute(horse);
        }

        executorService.shutdown();
    }
}
