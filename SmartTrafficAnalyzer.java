import java.util.Scanner;

public class SmartTrafficAnalyzer {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Vehicle Number: ");
      String vehicleNumber = sc.nextLine();
      System.out.print("Enter Speed: ");
      int speed = sc.nextInt();
      System.out.print("Enter Speed Limit: ");
      int speedLimit = sc.nextInt();
      System.out.print("Enter Driver Age: ");
      int age = sc.nextInt();
      System.out.print("Helmet Status (1 = Valid, 0 = Violation): ");
      int helmet = sc.nextInt();
      System.out.print("Seat Belt Status (1 = Valid, 0 = Violation): ");
      int seatBelt = sc.nextInt();
      System.out.print("License Status (1 = Valid, 0 = Violation): ");
      int license = sc.nextInt();
      System.out.print("Emergency Vehicle (1 = Yes, 0 = No): ");
      int emergency = sc.nextInt();
      int excessSpeed = speed - speedLimit;
      int violationFlag = 0;
      int totalFine = 0;
      boolean overSpeed = speed > speedLimit && emergency == 0;
      if (overSpeed) {
        violationFlag |= 1;
        totalFine += 2000;
      }
      boolean helmetViolation = helmet == 0;
      if (helmetViolation) {
        violationFlag |= 2;
        totalFine += 500;
      }
      boolean seatBeltViolation = seatBelt == 0;
      if (seatBeltViolation) {
         violationFlag |= 4;
         totalFine += 500;
      }
      boolean licenseViolation = license == 0;
      if (licenseViolation) {
        violationFlag |= 8;
        totalFine += 2000;
      }
      boolean underAge = age < 18;
      if (underAge) {
        violationFlag |= 16;
        totalFine += 3000;
        }
      String riskLevel;
      if (violationFlag == 0) {
        riskLevel = "LOW";
        } 
      else if (violationFlag == 1 || violationFlag == 4) {
        riskLevel = "MEDIUM";
        } 
      else {
        riskLevel = "HIGH";
        }
      System.out.println("SMART TRAFFIC ANALYZER");
      System.out.println("Vehicle Number   : " + vehicleNumber);
      System.out.println("Speed            : " + speed + " km/h");
      System.out.println("Speed Limit      : " + speedLimit + " km/h");
      System.out.println("Excess Speed     : " +
                         (overSpeed ? excessSpeed : 0) + " km/h");
      System.out.println("Speed Status     : " +
                         (overSpeed ? "OVER SPEED" : "NORMAL"));
      System.out.println("Helmet Status    : " +
                         (helmet == 1 ? "VALID" : "VIOLATION"));

      System.out.println("Seat Belt Status : " +
                         (seatBelt == 1 ? "VALID" : "VIOLATION"));

      System.out.println("License Status   : " +
                         (license == 1 ? "VALID" : "VIOLATION"));
      System.out.println("Total Fine       : ₹" + totalFine);
      System.out.println("Risk Level       : " + riskLevel);
      System.out.println("Violation Flags  : " + violationFlag);
    }
}
