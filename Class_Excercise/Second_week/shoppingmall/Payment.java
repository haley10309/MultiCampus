package Second_week.shoppingmall;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Payment {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("VIP 회원이신가요? (y/n): ");
        char reply = br.readLine().charAt(0);
        while ((reply != 'y') && (reply != 'n')) {
            System.out.println("VIP 회원이신가요? (y/n): ");
            reply = br.readLine().charAt(0);
        }
        if (reply == 'y') {
            VIPCustomer Vcustomer = new VIPCustomer();
            Vcustomer.customerID = 1000;
            System.out.println("성함을 입력해주세요: ");
            String name = br.readLine();
            Vcustomer.customerName = name;
            System.out.println("구매할 물건의 가격을 입력해주세요: ");
            int product_price = Integer.parseInt(br.readLine());
            sb.append(Vcustomer.customerName + "님이 지불할 금액은 " + Vcustomer.calcPrice(product_price) + "입니다.")
                    .append("\n");
            Vcustomer.showInfo();
        } else if (reply == 'n') {
            Customer Rcustomer = new Customer();
            Rcustomer.customerID = 1001;
            System.out.println("성함을 입력해주세요: ");
            String name = br.readLine();
            Rcustomer.customerName = name;
            System.out.println("구매할 물건의 가격을 입력해주세요: ");
            int product_price = Integer.parseInt(br.readLine());
            sb.append(Rcustomer.customerName + "님이 지불할 금액은 " + Rcustomer.calcPrice(product_price) + "입니다.")
                    .append("\n");
            Rcustomer.showInfo();
        }

        System.out.println(sb);
    }
}
