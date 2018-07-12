public class addtwostringnumbers {
    public static void main(String[] args) {
        String n1 = "15";
        String n2 = "15";

        System.out.println(n1+" + "+n2+" = "+addTwoString(n1, n2));
    }

    private static int addTwoString(String n1, String n2) {
        int no1 = Integer.parseInt(n1);
        int no2 = Integer.parseInt(n2);

        return (no1 + no2);
    }
}
