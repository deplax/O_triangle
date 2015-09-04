package triangleTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValueTest {
	@Test
	public void intToBinary() throws Exception {
		int intValue = -16777216;
		System.out.println(Integer.toBinaryString(intValue));
		
		int test = 0b11111111000000000000000000000000;
		System.out.println(test);
		System.out.println(Integer.toBinaryString(test));

	}
	
	@Test
	public void hexToInt(){
		int hexWhite = 0xffffffff;
		System.out.println(hexWhite);
		int hexBlack = 0x00000000;
		System.out.println(hexBlack);
	}
}