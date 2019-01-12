package com.xkscience.FizzBuzz;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGameTest {
	@Test
	public void neitherMultipleOf3Nor5() {
		int number = 2;
		String result = FizzBuzzGame.fizzBuzz(number);
		Assert.assertThat(result, equalTo("2"));
	}

	@Test
	public void multipleOf3ButNot5() {
		int number = 21;
		String result = FizzBuzzGame.fizzBuzz(number);
		Assert.assertThat(result, equalTo("Fizz"));
	}

	@Test
	public void multipleOf5ButNot3() {
		int number = 25;
		String result = FizzBuzzGame.fizzBuzz(number);
		Assert.assertThat(result, equalTo("Buzz"));
	}

	@Test
	public void multipleOfBoth3And5() {
		int number = 60;
		String result = FizzBuzzGame.fizzBuzz(number);
		Assert.assertThat(result, equalTo("FizzBuzz"));
	}
	
	//below methods for Stage 2
	@Test
	public void neitherMultipleOf3Nor5AndHasNo3Or5(){
		int number = 11;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("11"));
	}
	
	@Test
	public void has3ButNot5(){
		int number = 13;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("Fizz"));
	}
	
	@Test
	public void has5ButNot3(){
		int number = 151;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("Buzz"));
	}
	
	@Test
	public void hasBoth3And5(){
		int number = 53;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("FizzBuzz"));
	}
	
	@Test
	public void multipleOf3And5ButHasNo3Or5(){
		int number = 60;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("FizzBuzz"));
	}
	
	@Test
	public void multipleOf5AndHas3(){
		int number = 35;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("FizzBuzz"));
	}
	
	@Test
	public void multipleOf3AndHas5(){
		int number = 51;
		String result = FizzBuzzGame.fizzBuzzEnhanced(number);
		Assert.assertThat(result, equalTo("FizzBuzz"));
	}
}
