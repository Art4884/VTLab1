public class Main {

    public static void main(String[] args) {
        Ball blueBall = new Ball("Blue", 0.75);
        Ball redBall = new Ball("Red", 0.70);
        Basket basket = new Basket();
        basket.balls.add(blueBall);
        basket.balls.add(redBall);
        basket.balls.add(blueBall);
        System.out.println("Weight of all balls: " + basket.getWeightOfAllBalls());
        System.out.println("Quantity of blue balls: " + basket.getQuantityOfBlueBalls());
    }
}
