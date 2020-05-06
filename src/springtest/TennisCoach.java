package springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    // define a default constructor for setter injection
    public TennisCoach() {
        System.out.println(" >> TennisCoach: inside default constructor");
    }

    // define a setter method for injection
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("TennisCoach: inside setFortuneService method");
        fortuneService = theFortuneService;
    }


    // constructor injection
    /*@Autowired
    public TennisCoach(FortuneService theFortuneservice){
        fortuneService = theFortuneservice;
    } */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
