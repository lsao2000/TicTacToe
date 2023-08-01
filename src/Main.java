import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] Row1 = {"-", "-", "-"};
        String[] Row2 = {"-", "-", "-"};
        String[] Row3 = {"-", "-", "-"};
        String[][] Square = {
                Row1,
                Row2,
                Row3
        };
        int ComputerColumn;
        int ComputerRow;
        int userColumn;
        int userRow;
        int count;
        boolean errorUser;
        boolean errorComputer;
        boolean condition = true;
        while(condition ){
            System.out.println("####################### The game is begin ############################");
            for (String[] i : Square){
                count = 0;
                for (String j : i){
                    count += 1;
                    if (count <3){
                        System.out.print(j + "  |  ");
                    }else{
                        System.out.print(j);
                    }
                }
                System.out.println("");
            }
            System.out.print("Enter your choisse for the Row (1, 2, 3) : ");
            userRow = input.nextInt();
            System.out.print("Enter your choisse for the Column (1, 2, 3) : ");
            userColumn = input.nextInt();
            if (Square[userRow-1][userColumn-1].equalsIgnoreCase("X") || Square[userRow-1][userColumn-1].equalsIgnoreCase("O")){
                errorUser = true;
                while (errorUser){
                    System.out.println("This is the last update of the game : ");
                    for (String[] i : Square){
                        count = 0;
                        for (String j : i){
                            count += 1;
                            if (count <3){
                                System.out.print(j + "  |  ");
                            }else{
                                System.out.print(j);
                            }
                        }
                        System.out.println("");
                    }
                    System.out.print("Enter your choisse for the Row (1, 2, 3) : ");
                    userRow = input.nextInt();
                    System.out.print("Enter your choisse for the Column (1, 2, 3) : ");
                    userColumn = input.nextInt();
                    if (Square[userRow-1][userColumn-1].equalsIgnoreCase("-")){
                        Square[userRow-1][userColumn-1] = "X";
                        errorUser = false;
                    }else{
                    }
                }
            }else{
                Square[userRow-1][userColumn-1] = "X";
            }

            ComputerColumn = random.nextInt(3);
            ComputerRow = random.nextInt(3);
            if (Square[ComputerRow][ComputerColumn].equalsIgnoreCase("X") || Square[ComputerRow][ComputerColumn].equalsIgnoreCase("O")){
                errorComputer = true;
                while (errorComputer){
                    ComputerColumn = random.nextInt(3);
                    ComputerRow = random.nextInt(3);
                    System.out.println("row" + ComputerRow + "column" + ComputerColumn );
                    if (Square[ComputerRow][ComputerColumn].equalsIgnoreCase("-")) {
                        errorComputer = false;
                    }
                }
            }else {
            }
            Square[ComputerRow][ComputerColumn] = "O";
            if(Square[0][0].equalsIgnoreCase("O") && Square[0][1].equalsIgnoreCase("O") && Square[0][2].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[0][0].equalsIgnoreCase("O") && Square[1][1].equalsIgnoreCase("O") && Square[2][2].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[0][1].equalsIgnoreCase("O") && Square[1][1].equalsIgnoreCase("O") && Square[2][1].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[0][2].equalsIgnoreCase("O") && Square[1][2].equalsIgnoreCase("O") && Square[2][2].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[0][2].equalsIgnoreCase("O") && Square[1][1].equalsIgnoreCase("O") && Square[2][0].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[1][0].equalsIgnoreCase("O") && Square[0][0].equalsIgnoreCase("O") && Square[2][0].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[1][0].equalsIgnoreCase("O") && Square[1][1].equalsIgnoreCase("O") && Square[1][2].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }else if (Square[2][0].equalsIgnoreCase("O") && Square[2][1].equalsIgnoreCase("O") && Square[2][2].equalsIgnoreCase("O")){
                System.out.println("######################### The game is end ##########################");
                System.out.println("You lose !!!😭😭😭'☠️☠️");
                condition = false;
            }

        }


    }
}