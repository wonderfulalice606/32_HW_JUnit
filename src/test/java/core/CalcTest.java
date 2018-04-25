package core;

import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {

	static double divide(double a, double b) {
		return a / b;
	}

	static double divide(double a, double b, double c) {
		return a / b / c;
	}

	static double divide(double a, double b, double c, double d) {
		return a / b / c / d;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static double subtract(double a, double b, double c) {
		return a - b - c;
	}

	static double subtract(double a, double b, double c, double d) {
		return a - b - c - d;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	static double multiply(double a, double b, double c, double d) {
		return a * b * c * d;
	}

	@Test // Ignore
	public void test_01_01_01() {
		assertEquals("Equation is correct", divide(90.0, 7.0), 12.9, 0.09);
	}

	@Test // Ignore
	public void test_01_01_02() {
		Boolean t = Double.isInfinite(divide(90.0, 0.0));
		assertTrue("Equation returns Positive Infinity", t);
	}

	@Test // Ignore
	public void test_01_01_03() {
		assertEquals("Equation returns Positive Zero", divide(0.0, 7.0), 0.0, 0.09);
	}

	@Test // Ignore
	public void test_01_01_04() {
		assertTrue("Equation returns Not a Number", Double.isNaN(divide(0.0, 0.0)));
	}

	@Test // Ignore
	public void test_01_01_05() {
		assertEquals("Equation returns Negative Infinity", divide(-90.0, 0.0), Double.NEGATIVE_INFINITY, 0.09);
	}

	@Test // Ignore
	public void test_01_01_06() {
		assertEquals("Equation returns a Negative Value", divide(-90.0, 7.0), -12.9, 0.09);
	}

	@Test // Ignore
	public void test_01_01_07() {
		assertEquals("Equation returns a Negative Value", divide(90.0, -7.0), -12.9, 0.09);
	}

	@Test // Ignore
	public void test_01_01_08() {
		assertEquals("Equation is correct", divide(90.0, 9000.0), 0.01, 0.09);
	}

	@Test // Ignore
	public void test_01_01_09() {
		assertEquals("Equation is correct", divide(90.0, 90.0), 1.0, 0.09);
	}

	@Test // Ignore
	public void test_01_01_10() {
		assertEquals("Equation returns Negative Zero", divide(-0, 90.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_01_02_01() {
		assertEquals("Equation is correct", divide(90.0, 2.3, 4.6), 8.51, 0.09);
	}

	@Test // Ignore
	public void test_01_02_02() {
		Boolean t = Double.isInfinite(divide(90.0, 2.3, 0.0));
		assertTrue("Equation returns Positive Infinity", t);
	}

	@Test // Ignore
	public void test_01_02_03() {
		assertEquals("Equation returns Positive Zero", divide(0.0, 2.3, 4.6), 0.0, 0.09);
	}

	@Test // Ignore
	public void test_01_02_04() {
		assertTrue("Equation returns Not a Number", Double.isNaN(divide(0.0, 0.0, 0.0)));
	}

	@Test // Ignore
	public void test_01_02_05() {
		assertEquals("Equation returns Negative Infinity", divide(-90.0, 0.0, 4.6), Double.NEGATIVE_INFINITY, 0.09);
	}

	@Test // Ignore
	public void test_01_02_06() {
		assertEquals("Equation returns a Positive Value", divide(-90.0, 2.3, -4.6), 8.56, 0.09);
	}

	@Test // Ignore
	public void test_01_02_07() {
		assertEquals("Equation returns a Negative Value", divide(90.0, 2.3, -4.6), -8.56, 0.09);
	}

	@Test // Ignore
	public void test_01_02_08() {
		assertEquals("Equation is correct", divide(90.0, 90.0, 9000.0), 0.0001, 0.09);
	}

	@Test // Ignore
	public void test_01_02_09() {
		assertEquals("Equation is correct", divide(4.9E-324, 2.3E-129, 1.4E-154), Double.MIN_VALUE, 0.09);
	}

	@Test // Ignore
	public void test_01_02_10() {
		assertEquals("Equation returns Negative Zero", divide(-0, 90.0, 2.3), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_01_03_01() {
		assertEquals("Equation is correct", divide(90.0, 2.3, 4.6, 1.5), 5.67, 0.09);
	}

	@Test // Ignore
	public void test_01_03_02() {
		Boolean t = Double.isInfinite(divide(90.0, 2.3, 0.0, 1.5));
		assertTrue("Equation returns Positive Infinity", t);
	}

	@Test // Ignore
	public void test_01_03_03() {
		assertEquals("Equation returns Positive Zero", divide(0.0, 2.3, 4.6, 1.5), 0.0, 0.09);
	}

	@Test // Ignore
	public void test_01_03_04() {
		assertTrue("Equation returns Not a Number", Double.isNaN(divide(0.0, 0.0, 0.0, 0.0)));
	}

	@Test // Ignore
	public void test_01_03_05() {
		assertEquals("Equation returns Negative Infinity", divide(-90.0, 0.0, 4.6, 1.5), Double.NEGATIVE_INFINITY,
				0.09);
	}

	@Test // Ignore
	public void test_01_03_06() {
		assertEquals("Equation returns a Negative Value", divide(-90.0, 2.3, -4.6, -1.5), -5.67, 0.09);
	}

	@Test // Ignore
	public void test_01_03_07() {
		assertEquals("Equation returns a Negative Value", divide(90.0, 2.3, -4.6, 1.5), -5.67, 0.09);
	}

	@Test // Ignore
	public void test_01_03_08() {
		assertEquals("Equation is correct", divide(90.0, 90.0, 9000.0, 0.01), 0.0001, 0.09);
	}

	@Test // Ignore
	public void test_01_03_09() {
		assertEquals("Equation is correct", divide(4.9E-324, 2.3E-129, 1.4E-154, 3.5E-035), Double.MIN_VALUE, 0.09);
	}

	@Test // Ignore
	public void test_01_03_10() {
		assertEquals("Equation returns Negative Zero", divide(-0, 90.0, 2.3, 1.5), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_02_01_01() {
		assertEquals("Equation is correct", add(60.0, 5.0), 65.0, 0.09);
	}

	@Test // Ignore
	public void test_02_01_02() {
		assertEquals("Equation returns Same Value", add(60.0, 0.0), 60.0, 0.09);
	}

	@Test // Ignore
	public void test_02_01_03() {
		assertEquals("Equation returns a Negative Value", add(-60.0, 5.0), -55.0, 0.09);
	}

	@Test // Ignore
	public void test_02_01_04() {
		assertEquals("Equation returns Negative Zero", add(-0.0, 0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_02_01_05() {
		assertEquals("Equation returns Double Value", add(60.0, 5.0), Double.valueOf(65.0), 0.09);
	}

	@Test // Ignore
	public void test_02_02_01() {
		assertEquals("Equation is correct", add(60.0, 5.0, 7.0), 72.0, 0.09);
	}

	@Test // Ignore
	public void test_02_02_02() {
		assertEquals("Equation returns Same Value", add(60.0, 0.0, 0.0), 60.0, 0.09);
	}

	@Test // Ignore
	public void test_02_02_03() {
		assertEquals("Equation returns a Negative Value", add(-60.0, 5.0, 7.0), -48.0, 0.09);
	}

	@Test // Ignore
	public void test_02_02_04() {
		assertEquals("Equation returns Positive Zero", add(-0.0, 0.0, -0.0), 0.0, 0.09);
	}

	@Test // Ignore
	public void test_02_02_05() {
		assertEquals("Equation returns Double Value", add(60.0, 5.0, 7.0), Double.valueOf(72.0), 0.09);
	}

	@Test // Ignore
	public void test_02_03_01() {
		assertEquals("Equation is correct", add(60.0, 5.0, 7.0, 3.0), 75.0, 0.09);
	}

	@Test // Ignore
	public void test_02_03_02() {
		assertEquals("Equation returns Same Value", add(60.0, 0.0, 0.0, 0.0), 60.0, 0.09);
	}

	@Test // Ignore
	public void test_02_03_03() {
		assertEquals("Equation returns a Negative Value", add(-60.0, 5.0, 7.0, 3.0), -45.0, 0.09);
	}

	@Test // Ignore
	public void test_02_03_04() {
		assertEquals("Equation returns Negative Zero", add(-0.0, 0.0, -0.0, -0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_02_03_05() {
		assertEquals("Equation returns Double Value", add(60.0, 5.0, 7.0, 3.0), Double.valueOf(75.0), 0.09);
	}

	@Test // Ignore
	public void test_03_01_01() {
		assertEquals("Equation is correct", subtract(100.0, 22.0), 78.0, 0.09);
	}

	@Test // Ignore
	public void test_03_01_02() {
		assertEquals("Equation returns Same Value", subtract(100.0, 0.0), 100.0, 0.09);
	}

	@Test // Ignore
	public void test_03_01_03() {
		assertEquals("Equation returns a Negative Value", subtract(-100.0, 22.0), -122.0, 0.09);
	}

	@Test // Ignore
	public void test_03_01_04() {
		assertEquals("Equation returns Negative Zero", subtract(-0.0, 0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_03_01_05() {
		assertEquals("Equation returns Double Value", subtract(100.0, 22.0), Double.valueOf(78.0), 0.09);
	}

	@Test // Ignore
	public void test_03_02_01() {
		assertEquals("Equation is correct", subtract(100.0, 22.0, 18), 60.0, 0.09);
	}

	@Test // Ignore
	public void test_03_02_02() {
		assertEquals("Equation returns Same Value", subtract(100.0, 0.0, 0.0), 100.0, 0.09);
	}

	@Test // Ignore
	public void test_03_02_03() {
		assertEquals("Equation returns a Negative Value", subtract(-100.0, 22.0, 18.5), -140.5, 0.09);
	}

	@Test // Ignore
	public void test_03_02_04() {
		assertEquals("Equation returns Negative Zero", subtract(-0.0, -0.0, -0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_03_02_05() {
		assertEquals("Equation returns Double Value", subtract(100.0, 22.0, 18.5), Double.valueOf(59.5), 0.09);
	}

	@Test // Ignore
	public void test_03_03_01() {
		assertEquals("Equation is correct", subtract(100.0, 22.0, 18.4, 12.3), 47.3, 0.09);
	}

	@Test // Ignore
	public void test_03_03_02() {
		assertEquals("Equation returns Same Value", subtract(100.0, 0.0, 0.0, 0.0), 100.0, 0.09);
	}

	@Test // Ignore
	public void test_03_03_03() {
		assertEquals("Equation returns a Negative Value", subtract(-100.0, 22.0, -18.7, 12.3), -115.6, 0.09);
	}

	@Test // Ignore
	public void test_03_03_04() {
		assertEquals("Equation returns Negative Zero", subtract(-0.0, 0.0, -0.0, 0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_03_03_05() {
		assertEquals("Equation returns Double Value", subtract(100.0, 22.0, 18.4, 12.3), Double.valueOf(47.3), 0.09);
	}

	@Test // Ignore
	public void test_04_01_01() {
		assertEquals("Equation is correct", multiply(9.0, 5.0), 45.0, 0.09);
	}

	@Test // Ignore
	public void test_04_01_02() {
		assertEquals("Equation returns Same Value", multiply(9.3, 1.0), 9.3, 0.09);
	}

	@Test // Ignore
	public void test_04_01_03() {
		assertEquals("Equation returns a Negative Value", multiply(-9.3, 4.7), -43.71, 0.09);
	}

	@Test // Ignore
	public void test_04_01_04() {
		assertEquals("Equation returns Negative Zero", multiply(-0.0, 0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_04_01_05() {
		assertEquals("Equation returns Double Value", multiply(9.3, 4.7), Double.valueOf(43.71), 0.09);
	}

	@Test // Ignore
	public void test_04_02_01() {
		assertEquals("Equation is correct", multiply(9.0, 5.0, 1.1), 49.5, 0.09);
	}

	@Test // Ignore
	public void test_04_02_02() {
		assertEquals("Equation returns Same Value", multiply(9.3, 1.0, 1.0), 9.3, 0.09);
	}

	@Test // Ignore
	public void test_04_02_03() {
		assertEquals("Equation returns a Negative Value", multiply(-9.3, -4.7, -1.1), -48.08, 0.09);
	}

	@Test // Ignore
	public void test_04_02_04() {
		assertEquals("Equation returns Negative Zero", multiply(-0.0, 0.0, 0.0), -0.0, 0.09);
	}

	@Test // Ignore
	public void test_04_02_05() {
		assertEquals("Equation returns Double Value", multiply(9.3, 4.7, 1.1), Double.valueOf(48.08), 0.09);
	}

	@Test // Ignore
	public void test_04_03_01() {
		assertEquals("Equation is correct", multiply(9.0, 5.0, 1.1, 2.7), 133.65, 0.09);
	}

	@Test // Ignore
	public void test_04_03_02() {
		assertEquals("Equation returns Same Value", multiply(1.0, 1.0, 1.0, 1.0), 1.0, 0.09);
	}

	@Test // Ignore
	public void test_04_03_03() {
		assertEquals("Equation returns a Negative Value", multiply(-9.3, 4.7, -1.1, -2.4), -115.39, 0.09);
	}

	@Test // Ignore
	public void test_04_03_04() {
		assertEquals("Equation returns Positive Zero", multiply(-0.0, -0.0, -0.0, -0.0), 0.0, 0.09);
	}

	@Test // Ignore
	public void test_04_03_05() {
		assertEquals("Equation returns Double Value", multiply(9.3, 4.7, 1.1, 2.4), Double.valueOf(115.39), 0.09);
	}

}
