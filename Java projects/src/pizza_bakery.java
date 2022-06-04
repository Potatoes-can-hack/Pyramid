import java.util.Scanner;

public class pizza_bakery {

    public static void main(String[] args) {
        String orderdetails = "1. Margherita -> Rs.219\n2. Farmhouse -> Rs.419\n3.Cheese n corn -> Rs.319\nEnter 0 to quit";
        System.out.println("Order minimum 2 Pizzas :\n"+orderdetails);
        int margherita = 219;
        int farmhouse = 419;
        int cheesencorn = 319;
        int num  = 0;
        System.out.println("Enter an option");
        Scanner sc = new Scanner(System.in);
        int pizzaprice = sc.nextInt();
        do{
            switch (pizzaprice) {
                case 1:
                num = num + margherita;
                System.out.println(orderdetails+"\nThank you. Item has been added\n");
                pizzaprice = sc.nextInt();
                case 2:
                num = num + farmhouse;
                System.out.println(orderdetails+"\nThank you. Item has been added\n");
                pizzaprice = sc.nextInt();
                case 3:
                num = num + cheesencorn;
                System.out.println(orderdetails+"\nThank you. Item has been added\n");
                pizzaprice = sc.nextInt();
            }
            continue;
        }while(pizzaprice != 0);
        System.out.println("***************************************************************");
        System.out.println("                          The Pizza bill");
        System.out.println("The total amount(Gross amount) = "+num);
        float discount;
        if (num>600) {
            discount = (15/100) * num;
            System.out.println("The discount amount = Rs."+discount);
            System.out.println("Amount after discount = Rs."+(num - discount));
        }
        else if(num>800){
            discount = (20/100) * num;
            System.out.println("The discount amount = Rs."+discount);
            System.out.println("Amount after discount = Rs."+(num - discount));
        }
        else{
            for(int i = 0; i<1; i--){
                break;
            }
        }
    }
}