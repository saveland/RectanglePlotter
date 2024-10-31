import GridWorld.Grid;;

public class RectanglePlotter {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        Grid paper = Grid.create(4, 10, '.');
        paper.mark(2, 3, 'b');
        paper.dump();
    }
}
