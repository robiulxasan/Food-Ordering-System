package foodorderingsystem;

import java.util.Scanner;

public class FoodOrderingSystem {

    int a, b, e, f;
    int eachcost = 0;
    int cost = 0;
    int price = 0;
    int again;
    String item;

    public FoodOrderingSystem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Table No: ");
        int Table_no = input.nextInt();

    }

    public void menu() {
        System.out.println(" ");
        System.out.println("\t\t Welcome to Rover's Cafe");
        System.out.println("\t......................................");
        System.out.println("\n");
        System.out.println("Our Menu Card\n");
        System.out.println("Item Name\t\t   " + "    " + "Price\t" + "Press To Order");
        System.out.println(" ");
        System.out.println("Chicken Burger  \t\t" + "120\t\t" + "1");
        System.out.println("Beef Burger     \t\t" + "160\t\t" + "2");
        System.out.println("Gril(Quater)    \t\t" + "90 \t\t" + "3");
        System.out.println("Nan             \t\t" + "20 \t\t" + "4");
        System.out.println("Chicken Biriyani\t\t" + "150\t\t" + "5");
        System.out.println("Beef Biriyani   \t\t" + "180\t\t" + "6");
        System.out.println(" ");
    }

    public void order() {

        Scanner input = new Scanner(System.in);
        System.out.print("Press To Order : ");
        a = input.nextInt();
        System.out.print("Enter the Number of Quantity : ");
        b = input.nextInt();

        System.out.println("\n ");
        if (a == 1) {
            item = "Ckicken Burger";
            price = 120;
            eachcost = price * b;
            cost = cost + eachcost;
            System.out.println("Item\t\t" + "   Quantity\t\t" + "Price");
            System.out.println(item + "\t\t" + b + "\t\t" + eachcost);
            System.out.println("\n\nDo You Want to Order More?");
            System.out.println("\nPress 1 for Yes or 2 for No");
            again = input.nextInt();

            if (again == 1) {
                order();
            }

        }
        if (a == 2) {
            item = "Beef Burger";
            price = 160;
            eachcost = price * b;
            cost = cost + eachcost;
            System.out.println("Item\t\t" + "   Quantity\t\t" + "Price");
            System.out.println(item + "\t\t" + b + "\t\t" + eachcost);
            System.out.println("\n\nDo You Want to Order More?");
            System.out.println("\nPress 1 for Yes or 2 for No");
            again = input.nextInt();

            if (again == 1) {
                order();
            }
        }
        if (a == 3) {
            item = "Gril(Quater)";
            price = 90;
            eachcost = price * b;
            cost = cost + eachcost;
            System.out.println("Item\t\t" + "   Quantity\t\t" + "Price");
            System.out.println(item + "\t\t" + b + "\t\t" + eachcost);
            System.out.println("\n\nDo You Want to Order More?");
            System.out.println("\nPress 1 for Yes or 2 for No");
            again = input.nextInt();

            if (again == 1) {
                order();
            }
        }
        if (a == 4) {
            item = "Nan";
            price = 20;
            eachcost = price * b;
            cost = cost + eachcost;
            System.out.println("Item\t\t" + "   Quantity\t\t" + "Price");
            System.out.println(item + "\t\t" + b + "\t\t" + eachcost);
            System.out.println("\n\nDo You Want to Order More?");
            System.out.println("\nPress 1 for Yes or 2 for No");
            again = input.nextInt();

            if (again == 1) {
                order();
            }
        }
        if (a == 5) {
            item = "Ckicken Biriyani";
            price = 150;
            eachcost = price * b;
            cost = cost + eachcost;
            System.out.println("Item\t\t" + "   Quantity\t\t" + "Price");
            System.out.println(item + "\t" + b + "\t\t" + eachcost);
            System.out.println("\n\nDo You Want to Order More?");
            System.out.println("\nPress 1 for Yes or 2 for No");
            again = input.nextInt();

            if (again == 1) {
                order();
            }
        }
         if (a == 6) {
            item = "Beef Biriyani";
            price = 180;
            eachcost = price * b;
            cost = cost + eachcost;
            System.out.println("Item\t\t" + "   Quantity\t\t" + "Price");
            System.out.println(item + " \t\t" + b + "\t\t" + eachcost);
            System.out.println("\n\nDo You Want to Order More?");
            System.out.println("\nPress 1 for Yes or 2 for No");
            again = input.nextInt();

            if (again == 1) {
                order();
            }
        }
        System.out.println("\nTotal Price   =    " + cost);
        System.out.println("\n\nPress 1 for Confirm or 0 for Cancel");
        e = input.nextInt();
        if (e == 0) {
            System.out.println("\t\t\t\t.................");
            System.out.println("\t\t\t\t.Order Cancelled.");
            System.out.println("\t\t\t\t.................");
            System.out.println("\n");
        } else if (e == 1) {
            System.out.println("\t\t\t\t.................");
            System.out.println("\t\t\t\t.Order Confirmed.");
            System.out.println("\t\t\t\t.................");
             System.out.println("\n");
        }
        System.out.println("\t\t\t\t\t\t\tThank You");
        System.out.println("\t\t\t\t\t\t.......................");
        System.out.println("\nPress 0 for Exit");
        f = input.nextInt();
        if (f == 0) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        FoodOrderingSystem food = new FoodOrderingSystem();
        food.menu();
        food.order();

    }

}
