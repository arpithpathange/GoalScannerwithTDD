package com.test.goal;

import static org.junit.Assert.*;
import com.arpith.goal.*;

import org.junit.Before;
import org.junit.Test;

public class testGoalScanner {
	GoalScanner  gScanner;
	int forGoal[] = {5,3,32,50,25};
	int againstGoal[] = {23,11,8,40,25};


	@Before
	public void setUp() throws Exception {
		gScanner = new GoalScanner();
	}

	@Test
	public void testbasicgoalDiff() {

		assertEquals(gScanner.goalDiff(1,1),0);
	}

	@Test
	public void testPositivegoalDiff(){
		assertEquals(gScanner.goalDiff(5,0),5);
	}

	@Test
	public void testNegativegoalDiff(){
		assertEquals(gScanner.goalDiff(0,5),5);
	}

	@Test
	public void testMinNumber(){
		assertEquals(gScanner.getMin(5,9),5);

	}

	@Test
	public void testMinNumberNagativeTest(){
		assertEquals(gScanner.getMin(5,-9),9);

	}

	@Test
	public void testTwoMinNumberNagativeTest(){
		assertEquals(gScanner.getMin(-153,-9),153);

	}

	@Test
	public void testLengthofBothArray(){
		assertTrue(gScanner.checklength(forGoal,againstGoal));

	}

	@Test
	public void testthediffwitharrayinput(){
		assertEquals(gScanner.soccerTable(forGoal,againstGoal),0);
	}




}
