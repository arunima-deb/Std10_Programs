package com.arunima;

import static com.arunima.util.IOUtil.* ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SoutReplacer {
	
	private static File SRC_DIR = new File( "/Users/arunima/Projects/Std10_Programs/src/com/arunima/stdx" ) ;

	public static void main(String[] args) throws Exception {
		
		SoutReplacer app = new SoutReplacer() ;
		app.execute() ;
		
	}
	
	public void execute() throws Exception {
		
		List<File> javaFiles = new ArrayList<File>() ;
		getJavaFiles( SRC_DIR, javaFiles ) ;
		
		for( File f : javaFiles ) {
			replaceSout( f ) ;
		}
	}
	
	private void getJavaFiles( File file, List<File> javaFiles ) {
		
		if( file.isDirectory() ) {
			File[] files = file.listFiles() ;
			for( File f : files ) {
				getJavaFiles( f, javaFiles ) ;
			}
		}
		else if( file.getName().endsWith( ".java" )  ) {
			javaFiles.add(file ) ;
		}
	}
	
	private void replaceSout( File javaFile ) throws Exception {
		
		println( "Replacing SOut in source " + javaFile.getAbsolutePath() ) ;
		
		ArrayList<String> lines = new ArrayList<String>() ;
		ArrayList<String> changedLines = new ArrayList<String>() ;
		String line = null ;

		BufferedReader reader = new BufferedReader( new FileReader( javaFile ) ) ;
		while( ( line = reader.readLine() ) != null ) {
			lines.add( line ) ;
		}
		reader.close() ;
		
		lines.add( 2, "import static com.arunima.util.IOUtil.* ;" ) ;
		for( String l : lines ) {
			l = l.replace( "System.out.", "" ) ;
			changedLines.add( l ) ;
		}
		
		FileWriter writer = new FileWriter( javaFile ) ;
		for( String l : changedLines ) {
			writer.append( l + "\n" ) ;
		}
		writer.flush() ;
		writer.close() ;
	}
}









