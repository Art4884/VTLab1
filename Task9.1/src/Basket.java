import java.util.ArrayList;

public class Basket {

    public ArrayList<Ball> balls = new ArrayList<>();

    public double getWeightOfAllBalls(){
        double weight = 0;
        for(Ball ball : balls){
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getQuantityOfBlueBalls(){
        int count = 0;
        for(Ball ball : balls){
            if(ball.getColor().equals("Blue")){
                count++;
            }
        }
        return count;
    }
}
