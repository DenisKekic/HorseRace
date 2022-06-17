import com.sun.jdi.Value;

import java.util.*;

public class Scoreboard{

    List<Horse> horseList = new ArrayList();

    //List ergebnisliste = new ArrayList();

    //HashMap<Integer, Integer> score = new HashMap<Integer, Integer>();

    public void ausgabe (){
        Collections.sort(horseList);
        //System.out.println("Scoreboard:");

        for (Horse horse : horseList) {
            System.out.println("Pferd: " + horse.getName() + " Zeit: " + horse.zeit);
        }
        horseList.clear();
    }
}

