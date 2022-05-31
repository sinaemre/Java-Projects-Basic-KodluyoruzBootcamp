import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password,originalUserName = "Patika" ,orginalPassword = "java123", secim, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals(originalUserName) && password.equals(orginalPassword) )
            System.out.println("Giriş yaptınız");
        else
        {

            System.out.println("Bilgileriniz yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misini?\nEvet \nHayır");
            secim = input.nextLine();
            if (secim.equals("Evet"))
            {
                System.out.println("Yeni şifrenizi giriniz : ");
                newPassword = input.nextLine();
                if (newPassword == password)
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz");
                else
                {
                    orginalPassword = newPassword;
                    System.out.println("Şifreniz başarılı bir şekilde değiştirildi.");
                }
            }
        }

    }
}
