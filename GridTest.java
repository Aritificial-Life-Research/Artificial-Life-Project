public class GridTest
{
    public static void main(String[] args)
    {
        Grid world = new Grid();
        for(int i = 0; i < 50; i++)
        {
            world.daytime();
            System.out.println(world.toString());
        }
    }
}