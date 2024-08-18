package newScriptsPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScenario_003

{


    @BeforeClass
    public void BeforeClass_003()
    {
        System.out.println("this is BeforeClass under TestScenario_003");
    }
    @Test(groups={"e2e", "smoke"})
    public void TC001_Scenario003()
    {
        System.out.println("this is TC001 under TestScenario_003");
    }
    @Test(groups={"regression", "smoke"})
    public void TC002_Scenario003()
    {
        System.out.println("this is TC002 under TestScenario_003");
    }
    @Test(groups={"regression", "e2e"})
    public void TC003_Scenario003()
    {
        System.out.println("this is TC003 under TestScenario_003");
    }
    @Test(groups={"smoke"})
    public void TC004_Scenario003()
    {
        System.out.println("this is TC004 under TestScenario_003");
    }
    @Test(groups={"prod"})
    public void TC005_Scenario003()
    {
        System.out.println("this is TC005 under TestScenario_003");
    }
    @Test
    public void TC006_Scenario003()
    {
        System.out.println("this is TC006 under TestScenario_003");
    }
    @Test
    public void TC007_Scenario003()
    {
        System.out.println("this is TC007 under TestScenario_003");
    }
    @Test
    public void TC008_Scenario003()
    {
        System.out.println("this is TC008 under TestScenario_003");
    }
    @Test
    public void TC009_Scenario003()
    {
        System.out.println("this is TC009 under TestScenario_003");
    }
    @Test
    public void TC010_Scenario003()
    {
        System.out.println("this is TC010 under TestScenario_003");
    }
}
