package newScriptsPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScenario_002
{

    @BeforeClass
    public void BeforeClass_002()
    {
        System.out.println("this is BeforeClass under TestScenario_002");
    }
    @Test(groups={"regression"})
    public void TC001_Scenario002()
    {
        System.out.println("this is TC001 under TestScenario_002");
    }
    @Test(groups={"e2e", "smoke"})
    public void TC002_Scenario002()
    {
        System.out.println("this is TC002 under TestScenario_002");
    }
    @Test(groups={"e2e", "regression"})
    public void TC003_Scenario002()
    {
        System.out.println("this is TC003 under TestScenario_002");
    }
    @Test(groups={"smoke", "regression"})
    public void TC004_Scenario002()
    {
        System.out.println("this is TC004 under TestScenario_002");
    }
    @Test(groups={"prod"})
    public void TC005_Scenario002()
    {
        System.out.println("this is TC005 under TestScenario_002");
    }
    @Test
    public void TC006_Scenario002()
    {
        System.out.println("this is TC006 under TestScenario_002");
    }
    @Test
    public void TC007_Scenario002()
    {
        System.out.println("this is TC007 under TestScenario_002");
    }
    @Test
    public void TC008_Scenario002()
    {
        System.out.println("this is TC008 under TestScenario_002");
    }
    @Test
    public void TC009_Scenario002()
    {
        System.out.println("this is TC009 under TestScenario_002");
    }
    @Test
    public void TC010_Scenario002()
    {
        System.out.println("this is TC010 under TestScenario_002");
    }

}
