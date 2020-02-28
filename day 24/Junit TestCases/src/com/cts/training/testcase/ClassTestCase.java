package com.cts.training.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.training.calculator.Calculator;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class ClassTestCase {

	private static Calculator calc;

	@BeforeClass
	public static void init() {
		calc = new Calculator();
		System.out.println("Object Created>>>");
	}

	@AfterClass
	public static void destroy() {
		calc = null;
		System.out.println("Object Destroyed>>>");
	}

	@Ignore
	@Test
	public void test_add_success() {
		// fail("Not yet implemented");
		assertEquals(17, calc.add(12, 5));
		System.out.println("inside  add test");
	}

	@Ignore
	@Test
	public void test_sub_success() {
		// fail("Not yet implemented");
		assertEquals(7, calc.sub(5, 12));
		System.out.println("inside subs test");
	}

	@Ignore
	@Test
	public void test_mul_success() {
		// fail("Not yet implemented");
		assertEquals(10, calc.mul(5, 2));
		System.out.println("inside mul test");
	}

	@Test
	public void test_div_success() {
		// fail("Not yet implemented");
		assertEquals(2, calc.div(12, 6));
		System.out.println("inside div test");
	}

	@Test
	public void test_prime_fail() {
		// fail("Not yet implemented");
		assertEquals(false, calc.isPrime(4));
		System.out.println("inside div test");
	}

}
