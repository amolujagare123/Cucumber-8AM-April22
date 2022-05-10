package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksSD {

    @Before ("@userReg")
    public void beforeMyScenario()
    {
        System.out.println("********** beforeMyScenario() **********");
    }

    @After ("@userReg")
    public void afterMyScenario()
    {
        System.out.println("********** afterMyScenario() **********");
    }


  /*  @Before ("@userReg")
    public void beforeMyScenario1()
    {
        System.out.println("********** beforeMyScenario() **********");
    }

    @After ("@userReg")
    public void afterMyScenario1()
    {
        System.out.println("********** afterMyScenario() **********");
    }*/

}
