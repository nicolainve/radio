import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Radio r1 = new Radio();
    Radio r2 = null;

    int choice;

    do {
      System.out.println("1. Accendi la radio");
      if (r1.getStatus()) {
        System.out.println("2. Spegni la radio");
        System.out.println("3. Imposta il volume");
        System.out.println("4. Cambia il volume");
        System.out.println("5. Seleziona il canale");
        System.out.println("6. Cambia il canale");
        System.out.println("7. Stato radio");
        System.out.println("8. Crea una copia");
        if (r2 != null) {
          System.out.println("9. Confronta le radio");
        }
      }
      System.out.println("0. Esci");
      System.out.print("\nScegli un'opzione: ");

      choice = scanner.nextInt();

      boolean oldStatus = r1.getStatus();
      int oldVolume = r1.getVolume();
      float oldChannel = r1.getChannel();

      switch (choice) {
        case 1:
          r1.powerOn();
          if (oldStatus != r1.getStatus()) {
            System.out.println("\nLa radio è accesa\n");
          } else {
            System.out.println("\nLa radio è già accesa\n");
          }
          break;

        case 2:
          r1.powerOff();
          System.out.println("\nLa radio è spenta\n");
          break;

        case 3:
          System.out.print("A che livello vuoi impostare il volume? ");
          r1.setVolume(scanner.nextInt());
          if (oldVolume != r1.getVolume()) {
            System.out.println("\nIl volume è al " + r1.getVolume() + "%\n");
          } else {
            System.out.println("\nImposta un volume tra 0 e 100%\n");
          }
          break;

        case 4:
          System.out.print("Quanto vuoi modificare il volume? ");
          r1.changeVolume(scanner.nextInt());
          if (oldVolume != r1.getVolume()) {
            System.out.println("\nIl volume è al " + r1.getVolume() + "%\n");
          } else {
            System.out.println("\nImposta un volume tra 0 e 100%\n");
          }
          break;

        case 5:
          System.out.print("Che canale vuoi impostare? ");
          r1.setChannel(scanner.nextFloat());
          if (oldChannel != r1.getChannel()) {
            System.out.println("\nIl canale è " + r1.getChannel() + "MHz\n");
          } else {
            System.out.println("\nImposta un canale tra 87.5Mhz e 100MHz\n");
          }
          break;

        case 6:
          System.out.print("Quanto vuoi modificare il canale? ");
          r1.changeChannel(scanner.nextFloat());
          if (oldChannel != r1.getChannel()) {
            System.out.println("\nIl canale è " + r1.getChannel() + "MHz\n");
          } else {
            System.out.println("\nImposta un canale tra 87.5Mhz e 100MHz\n");
          }
          break;

        case 7:
          System.out.println("\n" + r1 + "\n");
          break;

        case 8:
          r2 = new Radio(r1);
          System.out.println("\n" + r2 + "\n");

        case 9:
          if (r1.equals(r2)) {
            System.out.println("\nLe due radio sono uguali\n");
          } else {
            System.out.println("\nLe due radio sono diverse\n");
          }
      }
    } while (choice != 0);

    scanner.close();
  }
}