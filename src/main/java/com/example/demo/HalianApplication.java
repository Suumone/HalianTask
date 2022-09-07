package com.example.demo;

import com.example.demo.writers.WriterFactory;
import com.example.demo.writers.WritersAbstract;

import java.io.IOException;

public class HalianApplication {

	public static void main(String[] args) throws IOException {
		WriterFactory writerFactory = new WriterFactory();
		WritersAbstract stringWriter = writerFactory.getWriter("String");
		stringWriter.write("This is is it");
		stringWriter.removeDuplicates();
		System.out.println(stringWriter.read());
		stringWriter.close();
		stringWriter.write("Closed string");
		System.out.println(stringWriter.read());
	}

}
