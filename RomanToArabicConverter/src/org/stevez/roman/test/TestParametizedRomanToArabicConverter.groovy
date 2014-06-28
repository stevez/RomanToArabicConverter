package org.stevez.roman.test;

import static org.junit.Assert.*;

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.stevez.roman.RomanConverter;

@RunWith(Parameterized)
class TestParametizedRomanToArabicConverter {

	private def arabic
	
	private def romanNumeral
	
	private RomanConverter roman
	
	@Before
	public void setUp() throws Exception {
		roman = new RomanConverter()
	}

	
	@Parameters 
	static data() {
	 def pairs =	[
			 1: "I" ,
			 2: "II" ,
			 3: "III" ,
			 4: "IV" ,
			 5: "V" ,
			 6: "VI" ,
			 7: "VII" ,
			 8: "VIII" ,
			 9: "IX" ,
			 10: "X" ,
			 11: "XI" ,
			 12: "XII" ,
			 13: "XIII" ,
			 14: "XIV" ,
			 15: "XV" ,
			 16: "XVI" ,
			 17:  "XVII" ,
			 18:  "XVIII" ,
			 19:  "XIX" ,
			 20:  "XX" ,
			 30: "XXX",
			 40: "XL",
			 50: "L",
			 60: "LX" ,
			 70: "LXX" ,
			 80: "LXXX" ,
			 90: "XC" ,
			 99: "XCIX" ,
			100: "C",
			200: "CC",
			300: "CCC",
			400: "CD",
			500: "D",
			600: "DC",
			900: "CM",
		   1000: "M",
		   1116: "MCXVI",
		   1984: "MCMLXXXIV"
	    ]
	 
	   pairs.collect { key, value -> [key, value] as Object[] }
    }
	
	TestParametizedRomanToArabicConverter(arabic, roman) {
		this.arabic = arabic
		this.romanNumeral = roman
	}
	
	@Test
	public void test_roman_to_arabic() {
		assert arabic == roman.romanToArabic(romanNumeral)
	}

}
