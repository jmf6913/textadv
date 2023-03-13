public class MapTile{
    public static int x;
    public static int y;

    public Method adjacent_positions;
    public MapTile(int x, int y) {
        Scanner scanner = new Scanner(System.in);
        int xCord = scanner.nextInt();
        int yCord = scanner.nextInt();
        this.x = x;
        this.y = y;
    }

}
