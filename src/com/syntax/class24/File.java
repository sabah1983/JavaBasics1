package com.syntax.class24;

public abstract class File {
	
	public void edit() {
		System.out.println("We can edit files");
	}
	
	public void close() {
		System.out.println("We can close files");
	}
	
	public abstract void open();
}

class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java file we need sublime text");
	}
	
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open .doc we need Microsoft word to be installed");
	}
	
class PdfFile extends File{

	@Override
	public void open() {
		System.out.println("To open pdf file we need pdf reader");
		
	}
	
}
	
}
	
}
