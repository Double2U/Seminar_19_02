import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      PhoneBook phoneBook = new PhoneBook();
  
      while (true) {
        System.out.println("\n1. Добавить запись;\n2. Найти запись;\n3. Вывести весь список;\n0. Выход.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите действие: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 0) {  
            break;
        }
        else if (number == 1) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите номер: ");
            Integer phoneNum = scanner.nextInt();
            phoneBook.addContact(name, phoneNum);
        }
        else if (number == 2) {
            System.out.print("Введите имя для поиска номера(ов): ");
            String name = scanner.nextLine();
            System.out.println(phoneBook.showPhoneNumber(name));
        }
        else if (number == 3) {
            phoneBook.printSortedPhoneBook();
        }
        
        else {
            System.out.print("Команда не распознана. Попробуйте еще раз.\n");
        }
    }
  }
}  