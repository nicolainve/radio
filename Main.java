import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Radio r1 = new Radio();

    int choice;

    do {
      System.out.println("1. Accendi la radio");
      System.out.println("2. Spegni la radio");
      System.out.println("3. Imposta il volume");
      System.out.println("4. Cambia il volume");
      System.out.println("5. Seleziona il canale");
      System.out.println("6. Cambia il canale");
      System.out.println("7. Stato radio");
      System.out.println("0. Esci");
      System.out.print("\nScegli un'opzione: ");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          r1.powerOn();
          System.out.println("\nLa radio è accesa\n");
          break;
        case 2:
          r1.powerOff();
          System.out.println("\nLa radio è spenta\n");
          break;
        case 3:
          System.out.print("A che livello vuoi impostare il volume? ");
          r1.setVolume(scanner.nextInt());
          break;
        case 4:
          System.out.print("Quanto vuoi modificare il volume? ");
          r1.changeVolume(scanner.nextInt());
          break;
        case 5:
          System.out.print("Che canale vuoi impostare? ");
          r1.setChannel(scanner.nextFloat());
          break;
        case 6:
          System.out.print("Quanto vuoi modificare il canale? ");
          r1.changeChannel(scanner.nextFloat());
          break;
        case 7:
          System.out.println("\n" + r1 + "\n");
          break;
      }
    } while (choice != 0);

    scanner.close();
  }
}