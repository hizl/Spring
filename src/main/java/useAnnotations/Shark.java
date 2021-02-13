package useAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("sharkBean")
public class Shark implements Swimming {



    @Autowired
    public Shark(Ocean ocean) {
        System.out.println("this is constructor shark ");
        ocean.bigBlueOcean();
    }

    //double @Autowired
    public Shark() {
    }

    @Override
    public void sail() {
        System.out.println("shark just swims from interface");
    }
}
