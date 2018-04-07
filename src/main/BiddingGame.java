import java.io.*;
import java.util.*;

public class BiddingGame 
{
    static boolean isRep(int [] moves)
    {
        if(moves.length >= 2)
        {
            if (moves[moves.length - 1] == moves[moves.length - 2]) 
            {
                return true;
            }
        }
        return false;
    }

    static int calculate_bid(int player, int pos, int[] first_moves, int[] second_moves) {

        int first_bal = 100, second_bal = 100;

        for (int i = 0; i < second_moves.length; i++) //finding the balance each player has
        {
            if (first_moves[i] > second_moves[i]) {
                first_bal -= first_moves[i];
            } else {
                second_bal -= second_moves[i];
            }
        }
        
        if (player == 1) 
        {
            if(pos == 1)
                return first_bal;
            else if(pos == 5)
                return 14;
            else if(isRep(second_moves) )
                return (second_moves[second_moves.length-1] + 1);
            else
                return ((first_bal / pos));                
        }
        else if (player == 2) 
        {
            if((10-pos) == 1)
                return second_bal;
            else if(pos == 5)
                return 14;
            else if(isRep(first_moves))
            {
                return (first_moves[first_moves.length-1] + 1);
            }
            else
                return ((second_bal / (10 - pos)));
        }
        return -99;
    }

    public static void main(String[] args) 
    {
        /*Scanner in = new Scanner(System.in);
        int player = in.nextInt();                     //1 if first player 2 if second
        int scotch_pos = in.nextInt();                 //position of the scotch
        int bid = 0;                                   //Amount bid by the player
        in.useDelimiter("\n");
        String first_move = in.next();
        String[] move_1 = first_move.split(" ");
        String second_move = in.next();
        String[] move_2 = second_move.split(" ");
        int[] first_moves = new int[move_1.length];
        int[] second_moves = new int[move_2.length];
        if (first_move.equals("") == false) {
            for (int i = 0; i < move_1.length; i++) {
                first_moves[i] = Integer.parseInt(move_1[i]);
                second_moves[i] = Integer.parseInt(move_2[i]);
            }
        }
        bid = calculate_bid(player, scotch_pos, first_moves, second_moves);
        System.out.print(bid);*/
        
        int player = 1;
        int scotch_pos = 6;
        int first_moves[] = {14,14};
        int second_moves[] = {16,16};
        
        int bid = calculate_bid(player, scotch_pos, first_moves, second_moves);
        System.out.println(bid);
    }
}
