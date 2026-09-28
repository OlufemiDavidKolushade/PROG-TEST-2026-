public class Main {
    public static void main(String[] args) {
    String [] consoles = {"PS5", "XBOX", "SWITCH"};
    int [][] sales = {{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
    String [] place = {"Cape town","Port elizabeth", "Pretoria"};
    int tot = 0;

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("%-18s"," ");
        for(int i = 0; i< consoles.length; i++){
            System.out.printf("%-18s", consoles[i]);
        }

        System.out.println();

        for(int x = 0; x < place.length; x++){
            System.out.printf("%-18s", place[x]);

            for(int y = 0; y < sales[x].length; y++){
                System.out.printf("%-18d", sales[x][y]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------------------------------------");

        for(int a = 0; a < place.length; a++){
            tot = sales[a][0] + sales[a][1] + sales[a][2];

            System.out.printf("%-18s %6d", place[a] , tot);
            System.out.println();



        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: Port elizabeth");
        System.out.println("-------------------------------------------------------------------------------------------");

    }
}