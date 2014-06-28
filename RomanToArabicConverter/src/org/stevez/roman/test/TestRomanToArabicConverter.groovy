package org.stevez.roman.test;

import org.stevez.roman.RomanConverter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import groovy.util.GroovyTestCase;

class TestRomanToArabicConverter extends GroovyTestCase {
	private RomanConverter roman

	@Before
	protected void setUp() throws Exception {
		roman = new RomanConverter()
	}

	@Test
	public void test_given_I_return_1() {
		assert roman.romanToArabic("I") == 1
		
	}
	
	@Test
	public void test_given_II_return_2() {
		assert roman.romanToArabic("II") == 2
		
	}
	
	@Test
	public void test_given_III_return_3() {
		assert roman.romanToArabic("III") == 3
		
	}
	
	@Test
	public void test_given_IV_return_4() {
		assert roman.romanToArabic("IV") == 4
		
	}
	
	@Test
	public void test_given_M_return_1000() {
		assert roman.romanToArabic("M") == 1000
		
	}
	
	@Test
	public void test_given_V_return_5() {
		assert roman.romanToArabic("V") == 5
		
	}
	
	@Test
	public void test_given_VI_return_6() {
		assert roman.romanToArabic("VI") == 6
		
	}
	
	@Test
	public void test_given_IX_return_9() {
		assert roman.romanToArabic("IX") == 9
		
	}
	
	@Test
	public void test_given_X_return_10() {
		assert roman.romanToArabic("X") == 10
		
	}
	
	@Test
	public void test_given_XIX_return_19() {
		assert roman.romanToArabic("XIX") == 19
		
	}
	
	@Test
	public void test_roman_pairs() {
		def pairs_array =  roman.get_roman_pairs()
		assert pairs_array.size() == 13
		assert pairs_array[0][0] == "CM"
		assert pairs_array[0][1] == 900
		
	}
	
	@Test
	public void test_all() {
		def pairs =	[
			[ 1, "I" ],
			[ 2, "II" ],
			[ 3, "III" ],
			[ 4, "IV" ],
			[ 5, "V" ],
			[ 6, "VI" ],
			[ 7, "VII" ],
			[ 8, "VIII" ],
			[ 9, "IX" ],
			[ 10, "X" ],
			[ 11, "XI" ],
			[ 12, "XII" ],
			[ 13, "XIII" ],
			[ 14, "XIV" ],
			[ 15, "XV" ],
			[ 16, "XVI" ],
			[ 17,  "XVII" ],
			[ 18,  "XVIII" ],
			[ 19,  "XIX" ],
			[ 20,  "XX" ],
			[ 30, "XXX"],
			[ 40, "XL"],
			[ 50, "L"],
			[ 60, "LX" ],
			[ 70, "LXX" ],
			[ 80, "LXXX" ],
			[ 90, "XC" ],
			[ 99, "XCIX" ],
			[100, "C"],
			[200, "CC"],
			[300, "CCC"],
			[400, "CD"],
			[500, "D"],
			[600, "DC"],
			[900, "CM"],
			[1000, "M"],
			[1116, "MCXVI"],
			[1984,"MCMLXXXIV"]
		]
		
		pairs.each { key, value -> 
			assert key == roman.romanToArabic(value)
		}
		
	 
	}

}
