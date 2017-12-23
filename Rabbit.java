import java.util.*;

public class Rabbit extends Animal
{
    public Rabbit(Cell myCell)
    {
        super(myCell);
        energy = 20;
        symbol = '!';
    }

    public Rabbit(Cell myCell, Cell parent1, Cell parent2)
    {
        super(myCell, parent1, parent2);
    }

    @Override
    public void filter(ArrayList<Cell> input)
    {
        filterRocks(input);
        filterMountains(input);
        filterOrganisms(input);
    }

    @Override
    public int getAverageLifeSpan()
    {
        return 40;
    }

    @Override
    public int getAverageEnergyToAct()
    {
        return 4;
    }

    @Override
    public int energyFromConsuming(Cell a)
    {
        if(a.getInhabitant() instanceof Plant)
        {
            return 20;
        }
        return 0;
    }

    @Override
    public Rabbit makeChild(Cell birthPlace, Cell parent1, Cell parent2)
    {
        return new Rabbit(birthPlace, parent1, parent2);
    }
}
