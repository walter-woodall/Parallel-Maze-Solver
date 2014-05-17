package cmsc433.p3;

public class Move
{
    public Position from;
    public Direction to;
    public Move previous;
    
    public Move() { } 
    
    public Move(Position from, Direction to, Move previous)
    {
        this.from = from;
        this.to = to;
        this.previous = previous;
    }
}
