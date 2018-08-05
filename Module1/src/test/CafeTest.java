package test;


import com.company.Cafe;
import com.company.Coffee;
import com.company.CoffeeType;
import org.junit.*;

// Tests the Cafe class
public class CafeTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    /**
     * A method to test if we can brew espresso or not
     */
    @Test
    public void canBrewEspresso(){
        /**
         * Given
         */
        Cafe cafe = new Cafe();
        // Add some beans in stock
        cafe.restockBeans(7);

        /**
         * When
         */
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        /**
         * Then
         */
        // Make sure that coffee is an espresso
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        // Make sure that there is no milk
        Assert.assertEquals(0, coffee.getMilk());
        // Make sure that it has enough beans
        Assert.assertEquals(7, coffee.getBeans());
    }

    @Test
    public void brewingEspressoConsumesBeans(){
        /**
         * Given
         */
        Cafe cafe = new Cafe();
        // Add some beans in stock
        cafe.restockBeans(7);

        /**
         * When
         */
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        /**
         * Then
         */
        Assert.assertEquals(0, cafe.getBeansInStock());
    }

    // Then
    @Test(expected = IllegalStateException.class)
    public void lattesRequiresMilk(){

        // Given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        // When
        cafe.brew(CoffeeType.Latte);
    }

}
