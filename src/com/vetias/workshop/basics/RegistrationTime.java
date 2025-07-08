import java.time.LocalTime;

public class RegistrationTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime RegistrationEndingTime = LocalTime.of(17,59,59);
        int Hoursleft = RegistrationEndingTime.getHour()-currentTime.getHour();
        int MinutesLeft = RegistrationEndingTime.getMinute()-currentTime.getMinute();
        int SecondsLeft = RegistrationEndingTime.getSecond()-currentTime.getSecond();
        System.out.println("Registration will end in: " + Hoursleft + " hours, " + MinutesLeft + " minutes, and " + SecondsLeft + " seconds left.");
    }
}
