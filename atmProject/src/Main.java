import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance =11402;
        int select;

        while (right>0) {
            System.out.print("Kullanıcı Adınız :");
            userName = in.nextLine();
            System.out.print("Parolanız : ");
            password = in.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                right=0;
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = in.nextInt();

                switch (select){
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = in.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        int checkPrice = in.nextInt();
                        if (checkPrice > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= checkPrice;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                }
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}