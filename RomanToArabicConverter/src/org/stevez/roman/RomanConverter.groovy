package org.stevez.roman

class RomanConverter {
   
	private def remaining
	
	private def roman_arabic_pairs = [
		         ["CM",900],
				 ["M",1000],
				 ["CD", 400],
				 ["D", 500],
				 ["XC",90],
				 ["C", 100],
				 ["XL", 40],
				 ["L", 50],
				 ["IX",9],
				 ["X", 10],
				 ["IV", 4],
				 ["V", 5],
				 ["I", 1]
				 
		]
	
	def get_roman_pairs() {
		roman_arabic_pairs
	}
	
 def romanToArabic(def roman) {
	 def result = 0
	 
	  remaining = roman
	 
	
	 result = roman_arabic_pairs.inject(0) { sum, obj -> 
		    sum +  build_arabic(obj[0],obj[1])
	 } 
	 
	
	 result
 }

	def build_arabic(def base, def arabic_base) {
		def result = 0
		
		while(remaining.contains(base)) {
			result += arabic_base
			remaining -= base
		}
		
		result
	}
 
 

}
