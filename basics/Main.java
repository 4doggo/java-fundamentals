java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(10);

    System.out.println(LocalDateTime);
  }

  public static String pluralize(String animal, int count) {
    if (count != 1) {
      return animal + "s";
    } else {
      return animal;
    }
  }

  public static double getRandomDouble() {
    return Math.random();
  };

  public static void flipNHeads(int n) {
    int headCount = 0;
    int flipCount = 0;

    while (flipCount < n) {
      if (headCount == 2) {
        break;
      } else {

        double coinFlip = getRandomDouble();

        if (coinFlip > 0.5) {
          headCount++;
          flipCount++;
          System.out.println("heads");
        }

        else {
          flipCount++;
          headCount = 0;
          System.out.println("tails");
        }
      }
    }
    System.out.println("It " + "took " + flipCount + "flips " + "to " + "flip " + headCount + "heads" + "in a row.");
  }


  public static void LocalDateTime(int n) {

    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
  }

  
}
