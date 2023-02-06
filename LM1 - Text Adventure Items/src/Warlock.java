public class Warlock extends Enemy{
    private Spells spellType;
    public Warlock(String Name, int health, int damage, Spells spells)
    {
        super("The Ancient One", 250, 25);
        spellType = spells;
    }

}
