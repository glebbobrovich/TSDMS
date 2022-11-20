import com.tsmds.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TestTriangle {

    @Test
    public void Test1(){
        Triangle triangle = new Triangle();
        double a = 10.0;
        double b = 4.0;
        double c = 5.0;
        boolean waitedResult = false;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test2(){
        Triangle triangle = new Triangle();
        double a = 10.0;
        double b = 4.0;
        double c = 7.0;
        boolean waitedResult = true;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test3(){
        Triangle triangle = new Triangle();
        double a = 100.0;
        double b = 1.0;
        double c = 1.0;
        boolean waitedResult = false;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test4(){
        Triangle triangle = new Triangle();
        double a = 4;
        double b = 3;
        double c = 5;
        boolean waitedResult = true;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test5(){
        Triangle triangle = new Triangle();
        double a = 16.4;
        double b = 21.8;
        double c = 9.99;
        boolean waitedResult = true;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test6(){
        Triangle triangle = new Triangle();
        double a = -196.4;
        double b = -211.8;
        double c = 1009.99;
        boolean waitedResult = false;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test7(){
        Triangle triangle = new Triangle();
        double a = 1;
        double b = 1;
        double c = 1;
        boolean waitedResult = true;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test8(){
        Triangle triangle = new Triangle();
        double a = 0;
        double b = 0;
        double c = 0;
        boolean waitedResult = false;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test9(){
        Triangle triangle = new Triangle();
        double a = 31;
        double b = 31;
        double c = 31;
        boolean waitedResult = true;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }

    @Test
    public void Test10(){
        Triangle triangle = new Triangle();
        double a = 6;
        double b = 8;
        double c = 10;
        boolean waitedResult = true;
        Assert.assertEquals(triangle.isExists(a, b, c), waitedResult);
    }
}