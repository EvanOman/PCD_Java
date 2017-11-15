package com.evanoman.coursework.pcd.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest
{
	@Test
	public void addTest() throws Exception
	{
		assertTrue(Main.add(2,2) == 4);
	}
}