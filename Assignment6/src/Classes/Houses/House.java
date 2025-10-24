package Classes.Houses;

public class House {

    String basement;
    String structure;
    String walls;
    String roof;


    String GetBasement()
    {
        return basement;
    }
    String GetStructure()
    {
        return structure;
    }
    String GetWalls()
    {
        return walls;
    }
    String GetRoof()
    {
        return roof;
    }
    void SetBasement(String basement)
    {
        this.basement = basement;
    }
    void SetStructure(String structure)
    {
        this.structure = structure;
    }
    void SetWalls(String walls)
    {
        this.walls = walls;
    }
    void SetRoof(String roof)
    {
        this.roof = roof;
    }

    public void DisplayHouse()
    {
        System.out.println("House with:");
        System.out.println("Basement: " + GetBasement());
        System.out.println("Structure: " + GetStructure());
        System.out.println("Walls: " + GetWalls());
        System.out.println("Roof: " + GetRoof());
    }


}
