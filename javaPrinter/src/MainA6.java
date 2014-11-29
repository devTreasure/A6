//
// CS414: Use this class as the driver class for your Commenter visitor. 
// Note that this class creates an instance of Commenter and passes it to
// the root of the parse tree.
//

import syntaxtree.*;
import visitor.*;

public class MainA6 {
	
	/*
	public static void main(String args[]) 
	{
		JavaParser parser;
	   final TreeDumper dumper = new TreeDumper();
		if (args.length == 1)
		{
			System.err.println("JTB Pretty Printer 1.1:  Reading from file " +
					args[0] + " . . .");
			try 
			{ 
				parser = new JavaParser(new java.io.FileInputStream(args[0])); 
			}
			catch (java.io.FileNotFoundException e)
			{
				System.err.println("JTB Pretty Printer 1.1:  File " + args[0] +
						" not found."+e.getMessage());
				return;
			}
		}
		else {
			System.err.println("JTB Pretty Printer 1.1:  Cannot find file");
			return;
		}

		try {
			// Here's where the AST actions and visiting take place.
			Node root = parser.CompilationUnit();
			
			System.err.println("JTB Pretty Printer 1.1:  Java program parsed successfully.");
			
			final Commenter commenter = new Commenter();
			
		
			// Insert comments in  the source code, then dump it
			root.accept(new Commenter());
			
	         dumper.printSpecials(false);
	         
	         root.accept(new DepthFirstVisitor()
	         {
	            public void visit(MethodDeclaration n) {
	               dumper.startAtNextToken();
	               n.f0.accept(dumper);
	               n.f1.accept(dumper);
	               n.f2.accept(dumper);
	               n.f3.accept(dumper);             // skip n.f4, the method body
	               System.out.println();
	            }
	         });
			
			
		//	root.accept(new Commenter());
		}
		catch (ParseException e) 
		{
			System.err.println(e.getMessage());
			System.err.println("JTB Pretty Printer 1.1:  Encountered errors during parse.");
		}
	}*/
}
