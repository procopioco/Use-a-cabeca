import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locatinCells;

    public void  setLocationCells(ArrayList<String> locs){
        locatinCells = locs;
    }
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locatinCells.indexOf(userInput);

        if(index >= 0){
            locatinCells.remove(index);

            if (locatinCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

