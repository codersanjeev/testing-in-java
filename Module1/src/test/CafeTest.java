package test;


import com.company.Cafe;
import com.company.Coffee;
import com.company.CoffeeType;
import org.junit.Assert;
import org.junit.Test;

// Tests the Cafe class
public class CafeTest {

    /**
     * A method to test if we can brew espresso or not
     */
    @Test
    public void canBrewEspresso(){
        Cafe cafe = new Cafe();

        // Add some beans in stock
        cafe.restockBeans(7);

        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        // Make sure that coffee is an espresso
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());

        // Make sure that there is no milk
        Assert.assertEquals(0, coffee.getMilk());

        // Make sure that it has enough beans
        Assert.assertEquals(7, coffee.getBeans());
    }

}
