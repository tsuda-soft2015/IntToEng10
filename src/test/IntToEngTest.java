package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import englishtrans.IntToEng;

public class IntToEngTest {
	
    @Test
	public void いちをoneに変換() {
		
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, is(expected));
	}

	@Test
	public void にじゅういちをtwentyoneに変換() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void よんじゅうをfortyに変換(){
		String expected = "forty";
		String actual = IntToEng.translateEng(40);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ひゃくをonehundredに変換(){
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void よんじゅうきゅうをfortynineに変換(){
		String expected = "forty nine";
		String actual = IntToEng.translateEng(49);
		assertThat(actual,is(expected));
	}
	
	
}