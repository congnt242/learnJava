package test;

public class main {
	public static void main(String Args[]) {
	    Greeting user = new Greeting();
	    user.userGreeting();
	}
}

class second{
    public int roolAdice() {
        int firstDice = 0;
        int secondDice = 0;
        int totalRoll = 0;
        
        firstDice = (int)(Math.random()*6) + 1;
        secondDice = (int)(Math.random()*6) + 1;
        totalRoll = firstDice + secondDice;
        
        
        
        System.out.printf("The first dice comes up %d",firstDice);
        System.out.printf("\nThe second dice comes up %d",secondDice);
        System.out.printf("\nYour total roll is %d",totalRoll);
        return 1;
    }
}