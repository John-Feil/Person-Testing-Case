import org.junit.Test;
import org.junit.Assert;


public class PersonTest {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDateOfBirth(){
        //Given
        Person person = new Person();
        String expected = "November 30th";

        //When
        person.setDateOfBirth(expected);

        //Then
        String actual = person.getDateOfBirth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCareer(){
        //Given
        Person person = new Person();
        String expected = "Software developer";
        //When
        person.setCareer(expected);
        //Then
        String actual = person.getCareer();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetFavoriteColor(){
        //Given
        Person person = new Person();
        String expected = "Yellow";
        //When
        person.setFavoriteColor(expected);
        //Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFavoriteNumber(){
        //Given
        Person person = new Person();
        Integer expected = 11;
        //When
        person.setFavoriteNumber(expected);
        //Then
        Integer actual = person.getFavoriteNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIsHappy(){
        //Given
        Person person = new Person();
        boolean expected = true;
        //When
        person.setHappy(expected);
        //Then
        boolean actual = person.isHappy();
        Assert.assertEquals(expected, actual);
    }
}
