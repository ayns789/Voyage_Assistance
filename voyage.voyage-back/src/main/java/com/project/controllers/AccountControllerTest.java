package com.project.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.services.CalculationServiceTest;

@RunWith(JUnitPlatform.class)
@SpringBootTest
//@WebMvcTest
class AccountControllerTest {
	
	public CalculationServiceTest calcul;
	
	
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("Executing a new test");  
    }  
    
    
    // call and testing method cube of CalculationServiceTest
    @Test
    public void testCube() {
    	System.out.println("test base cube executed");
    	assertEquals(27,CalculationServiceTest.cube(3));
    }
   
    // call and testing method findMax of CalculationServiceTest
    @Test
    public void testFindMax() {
    	System.out.println("test case find max executed");
    	assertEquals(15 ,CalculationServiceTest.findMax(new int [] {2,15,7,9}) );
    }
    
    @After  
    public void tearDown() throws Exception {  
        System.out.println("Execution done");  
    }  
  
    @AfterAll  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
//	    @MockBean
//	    private AccountDetailsService service;
//	    
//	    @Autowired
//	    private MockMvc mockMvc;
//	 
	   
	
//	@Test
//    public void testDeleteExample() throws Exception {
//        Mockito.when(service.deleteTest(ArgumentMatchers.anyString())).thenReturn("Account is deleted");
//     
//        MvcResult requestResult = mockMvc.perform(delete("/deleteMapping").param("id", "5"))
//                .andExpect(status().isOk()).andExpect(status().isOk()).andReturn();
//        String result = requestResult.getResponse().getContentAsString();
//        assertEquals(result, "Account is deleted");
//    }
	

}

