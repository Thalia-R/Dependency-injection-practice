package springtest;

import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "do 5 exercises within an hour";
    }
}
