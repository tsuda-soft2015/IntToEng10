package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import englishtrans.IntToEng;

public class IntToEngTest {
	
    @Test
	public void one() {
		
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, is(expected));
	}

	@Test
	public void twentyone() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void forty(){
		String expected = "forty";
		String actual = IntToEng.translateEng(40);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void onehundred(){
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	@Test
	public void fortynine(){
		String expected = "forty nine";
		String actual = IntToEng.translateEng(49);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void onehundredtwentysix(){
		String expected = "two hundred twenty six";
		String actual = IntToEng.translateEng(226);
		assertThat(actual,is(expected));
	}
	@Test
	public void onethousand(){
		String expected = "one thousand";
		String actual = IntToEng.translateEng(1000);
		assertThat(actual,is(expected));
	}
	
}