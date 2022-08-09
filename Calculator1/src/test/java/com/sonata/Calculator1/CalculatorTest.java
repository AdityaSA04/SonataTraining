package com.sonata.Calculator1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculatorTest {
	Calculator c = null;
@Mock
CalculatorService service;
	
@Before
public void setup() {
	MockitoAnnotations.initMocks(this);
	c= new Calculator(service);
}
@Test
 public void testPerform() {
	 when(service.add(2, 3)).thenReturn(5);
	 assertEquals(5, c.perform(2, 3));
	 verify(service).add(2, 3);
	 
 }
 

	
	
}
