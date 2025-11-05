public class Die {
    private int sides;

    public Die(int sides){
        this.sides = sides;
    }

    public int rollDice(){
        return (int)(Math.random()*sides +1);
    }

    public String toString(){
        return "This is a die with " + sides + " sides ";
    } 

    public static void main(String[] args){
        Die d = new Die(6);
        System.out.println(d;
    }
}
