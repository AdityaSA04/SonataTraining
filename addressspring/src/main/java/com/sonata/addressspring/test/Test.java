package com.sonata.addressspring.test;
import com.sonata.addressspring.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
				Address ad=ctx.getBean("address", Address.class);
				System.out.println(ad);
				
				

			}

	}


