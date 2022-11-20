import com.tsmds.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator
{
    @Test
    public void Test1(){
        double a = 1.0;
        double b = 1.0;
        char operation = '+';
        double waitedResult = 2.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test2(){
        double a = 324.0;
        double b = 400.0;
        char operation = '+';
        double waitedResult = 724.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test3(){
        double a = 1.0;
        double b = 1.0;
        char operation = '-';
        double waitedResult = 0.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test4(){
        double a = 11.0;
        double b = -11.0;
        char operation = '-';
        double waitedResult = 22.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test5(){
        double a = 12.0;
        double b = 10.0;
        char operation = '*';
        double waitedResult = 120.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test6(){
        double a = 75.0;
        double b = 11.0;
        char operation = '*';
        double waitedResult = 825.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test7(){
        double a = 12.0;
        double b = 10.0;
        char operation = '/';
        double waitedResult = 1.2;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test8(){
        double a = 100.0;
        double b = 5.0;
        char operation = '/';
        double waitedResult = 20;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test9(){
        double a = 11.0;
        double b = 7.0;
        char operation = '%';
        double waitedResult = 4.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test10(){
        double a = 999.0;
        double b = 100.0;
        char operation = '%';
        double waitedResult = 99.0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Test11(){
        double a = 14;
        double b = 77;
        char operation = '@';
        double waitedResult = 0;
        Calculator myCalculator = new Calculator();
        Assert.assertEquals(myCalculator.execute(a, b, operation), waitedResult,0);
    }
}
