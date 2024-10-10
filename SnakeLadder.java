import java.util.*;
class SnakeLadder {

    static HashMap<Integer, Integer> snake = new HashMap<>();
    static HashMap<Integer, Integer> ladder = new HashMap<>();

    static {
        // Initialize snake positions
        snake.put(32, 10);
        snake.put(36, 6);
        snake.put(48, 26);
        snake.put(62, 18);
        snake.put(88, 24);
        snake.put(95, 56);
        snake.put(97, 78);

        // Initialize ladder positions
        ladder.put(1, 38);
        ladder.put(4, 14);
        ladder.put(8, 30);
        ladder.put(21, 42);
        ladder.put(28, 76);
        ladder.put(50, 68);
        ladder.put(71, 92);
        ladder.put(80, 99);
    }
        
    private static int rolldice(){
        Random rand=new Random();
        int dice=rand.nextInt(5)+1;
        return dice;
    }
    private static int playMove(int player, String name){
        
        int dice=rolldice();
        System.out.println("Dice: " + dice);
        player=player+dice;
        if(snake.containsKey(player)){
            System.out.println("It is snake bite at "+player+", " + name +" moves from "+player+" to "+ snake.get(player) );
            player=snake.get(player);
        }
        else if(ladder.containsKey(player)){
            System.out.println("Now you got ladder at "+player+"," +name+" moves from "+player+" to "+ ladder.get(player) );
            player=ladder.get(player);
        }
        else{
            player=player-dice;
            if(player+dice <=100){
                player=player+dice;
            }
        }
        System.out.println(name +" Score is "+ player);
        System.out.println("------------------------");
        return player;
        
    }
    public static void main(String[] args) {
        int player1=0;
        int player2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player 1 name: ");
        String name1=sc.nextLine();
        System.out.print("Enter Player 2 name: ");
        String name2=sc.nextLine();
        while(true){
            System.out.println("Its "+name1+ " chance: Enter 1 to roll dice!!! ");
            int play1=sc.nextInt();
            if(play1==1) {
                player1=playMove(player1,name1);
                if(player1==100){
                    System.out.println(name1 +" Won!!!");
                    break;
                }
            }else{
                System.out.println("invalid move!! Exit!!!");
                break;
            }
 
            
            System.out.println("Its "+name2+ " chance: Enter 1 to roll dice!!! ");
            int play2=sc.nextInt();
            if(play2==1){
                player2=playMove(player2,name2);
                if(player2==100){
                    System.out.println(name2 +" Won!!!");
                    break;
                }
            }else{
                System.out.println("invalid move!! Exit!!!");
                break;
            }
        }
    }
}
