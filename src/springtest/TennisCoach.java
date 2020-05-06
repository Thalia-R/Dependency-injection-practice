package springtest;

import org.springframework.stereotype.Component;

@Component("theCoach")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
