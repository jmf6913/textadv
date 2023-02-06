public class Main {
    public static void main(String[] args) {
        //gold Bar, magicSword, softPillow, bigMace
        //Gold goldBar = new Gold(12);
        //Sword magicSword = new Sword();
        //Pillow softPillow = new Pillow();
        Weapon bigMace = new Weapon("Iron Mace", "Rough and Tough", 15, 20);
        //Gameboard gameboard = new Gameboard("Tic Tac Toe");
        //System.out.println(gameboard.name);

        //Player player1 = new Player("Josh", (short)100, (short)15, true);
        //System.out.println(player1.getLife());

        //Player player2 = new Player("Blake", (short)0, (short)0, true);
        //System.out.println(player2.getLife());

        //greenOgre, redOgre, slowZombie, fastZombie, spotDog, ancientOne
        Ogre greenOgre = new Ogre("Green Ogre", 45, 24);
        Ogre redOgre = new Ogre("Red Ogre", 50, 24);
        Zombie slowZombie = new Zombie("Stumbling Dead", 20, 100);
        Zombie fastZombie = new Zombie("World War Z Zombie", 5, 10);
        Dog spotDog = new Dog("Spot", 15, 2);
        Warlock ancientOne = new Warlock("The Ancient One", 250, 25, Spells.Fireball);
    }

}