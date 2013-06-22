package com.mkyong.common;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppTest {
   @Test
   public void shouldGetMKyong(){
	   App app=new App();
	   assertThat(app.getInfoName(),is("Hello! Mkyong"));
	   assertThat(app.getInfoAge(),is("age:18"));
   }
}
