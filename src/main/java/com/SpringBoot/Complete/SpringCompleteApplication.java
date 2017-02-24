package com.SpringBoot.Complete;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.StringUtils;

@SpringBootApplication
@EnableScheduling
public class SpringCompleteApplication {

	public static void main(String[] args) {

		if (StringUtils.isEmpty(System.getProperty("system.error.file"))) {
			System.out.println(System.getProperty("system.error.file"));
		}

		SpringApplication.run(SpringCompleteApplication.class, args);
		System.out.println("Hello");

		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		arrlist.add(10);
		arrlist.add(12);
		arrlist.add(31);
		arrlist.add(49);

		System.out.println("Printing elements of array1");

		// let us print all the elements available in list
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}

		// toArray copies content into other array
		Integer list2[] = new Integer[arrlist.size()];
		arrlist.toArray(list2);

		System.out.println("Printing elements of array2");

		// let us print all the elements available in list
		for (Integer number : list2) {
			System.out.println("Number = " + number);
		}

	}

}
