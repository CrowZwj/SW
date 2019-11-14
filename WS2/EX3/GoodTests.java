import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/** 
 *  Public tests for the Good class.
 * @author Weijin Zhang
 * @version 2019-10-20
 */
public class GoodTests {
	
	private Good pen;
	private Good book;
	
	@BeforeEach
	public void setup() {
		book = new Good("Book", 1.00);
		pen = new Good("Pen", 0.50);
	}

	// testing  public access of VAT_RATE
	@Test
	public void test1() {
		double expectedVATRate1 = 20;
		double actualVATRate1 = pen.VAT_RATE;
		double expectedVATRate2 = 20;
		double actualVATRate2 = book.VAT_RATE;
		
		assertEquals(expectedVATRate1, actualVATRate1,
				"failure in test1: " + "" + " expected VATRate not approximately equal to actual VATRate");
		assertEquals(expectedVATRate2, actualVATRate2,
				"failure in test1: " + "" + " expected VATRate not approximately equal to actual VATRate");
	}

	// testing setters and getters of pen
	@Test
	public void test2() {
		pen.setName("Parker milk");
		pen.setNetPrice(25.00);
		String expectedName = "Parker milk";
		double expectedNetPrice = 25.00;

		String actualName = pen.getName();
		double actualNetPrice = pen.getNetPrice();

		assertEquals(expectedName, actualName, "failure in test3: " + " expected name does not match the actual name");
		assertEquals(expectedNetPrice, actualNetPrice,
				"failure in test3: " + " expected net price not approximately equal to computed net price");

	}

	// testing setters and getters of book
	@Test
	public void test3() {
		book.setName("Painting book");
		book.setNetPrice(1.25);
		String expectedName = "Painting book";
		double expectedNetPrice = 1.25;

		String actualName = book.getName();
		double actualNetPrice = book.getNetPrice();

		assertEquals(expectedName, actualName, "failure in test4: " + " expected name does not match the actual name");
		assertEquals(expectedNetPrice, actualNetPrice,
				"failure in test4: " + " expected net price not approximately equal to computed net price");

	}

	// testing grossPrice method of pen
	@Test
	public void test4() {
		double expectedGrossPrice = 0.60;
		double actualGrossPrice = pen.grossPrice();

		assertEquals(expectedGrossPrice, actualGrossPrice,
				"failure in test5: " + " expected gross price not approximately equal to computed gross price");

	}
	
	// testing grossPrice method of book
	@Test
	public void test5() {
		double expectedGrossPrice = 1.20;
		double actualGrossPrice = book.grossPrice();

		assertEquals(expectedGrossPrice, actualGrossPrice,
				"failure in test6: " + " expected gross price not approximately equal to computed gross price");

	}
	
	// testing toString method of pen
	@Test
	public void test6() {
		pen.setName("Parker pen");
		pen.setNetPrice(20.00);
		String expectedString = "The Parker pen has a gross price of \u00A324.00.";
		String actualString = pen.toString();
		assertEquals(expectedString, actualString,
				"failure in test7: " + " expected toString output does not match the actual one");

	}
	
	// testing toString method of book
	@Test
	public void test7() {
		book.setName("Painting book");
		book.setNetPrice(1.25);
		String expectedString = "The Painting book has a gross price of \u00A31.50.";
		String actualString = book.toString();
		assertEquals(expectedString, actualString,
				"failure in test8: " + " expected toString output does not match the actual one");

	}
	
	// testing the discount method
	@Test
	public void test8() {
		book.discount(20);
		String expectedString = "The Book has a gross price of \u00A30.96.";
		String actualString = book.toString();
		assertEquals(expectedString, actualString,
				"failure in test10: " + " expected toString output does not match the actual one");
	}
	
	// testing the discount method
	@Test
	public void test9() {
		pen.discount(0);
		String expectedString = "The Pen has a gross price of \u00A30.60.";
		String actualString = pen.toString();
		assertEquals(expectedString, actualString,
				"failure in test11: " + " expected toString output does not match the actual one");
	}
	
	// testing the discount method
	@Test
	public void test10() {
		book.discount(25.345);
		String expectedString = "The Book has a gross price of \u00A30.90.";
		String actualString = book.toString();
		assertEquals(expectedString, actualString,
				"failure in test12: " + " expected toString output does not match the actual one");
	}
	
	// testing the discount method
	@Test
	public void test11() {
		book.setNetPrice(10.00);
		book.discount(-20.2598);
		String expectedString = "The Book has a gross price of \u00A314.43.";
		String actualString = book.toString();
		assertEquals(expectedString, actualString,
				"failure in test13: " + " expected toString output does not match the actual one");
	}
}
