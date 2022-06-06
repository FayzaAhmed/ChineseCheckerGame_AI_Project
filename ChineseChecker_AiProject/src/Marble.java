import javafx.util.Pair;
import java.util.ArrayList;

public class Marble
{
    public int currentPositionX;
    public int currentPositionY;
    public int distance;  // smallest distance among 10 marbles
    public char color;
    public ArrayList <Pair<Integer , Integer>> possibleMoves = new ArrayList<>(6);
    public ArrayList <Pair<Integer , Integer>> possibleHops = new ArrayList<>(6);

    public Marble (char color , int currentPositionX , int currentPositionY)
    {
        this.color = color;
        this.currentPositionX = currentPositionX;  // column in board
        this.currentPositionY = currentPositionY; // row in board
        getSmallestDistance();

    }

    public void getSmallestDistance()
    {
        int [][] redTriangle = {{13,9}, {13,11}, {13,13}, {13,15}, {14,10}, {14,12}, {14,14}, {15,11}, {15,13}, {16,12}};
        if(color == 'G')
        {
            int lastRowInGoal = 16;
            distance = lastRowInGoal - currentPositionY ;

            for(int i = 0; i < redTriangle.length; i++)
            {
                if(redTriangle[i][0] == currentPositionY && redTriangle[i][1] == currentPositionX)
                {
                    distance = 0;
                    break;
                }
            }
        }
        else if (color == 'R')
            distance = currentPositionY;
    }
}