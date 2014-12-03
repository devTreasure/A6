package visitor;

import java.util.Enumeration;
import java.util.Vector;

import syntaxtree.*;
import visitor.*;

public class Commenter extends TreeDumper {

	@Override
	public void visit(MethodDeclaration n) {

		System.out.print("\n/*************");
		System.out.print("\nNew method " + n.f2.f0.tokenImage);
		System.out.print("\n*************/");
		super.visit(n);
	}

	@Override
	public void visit(FieldDeclaration n) {

		System.out.print("\n // Class variable definition begins");
		super.visit(n);
		System.out.print("\n // Class variable definition ends");
	}

	@Override
	public void visit(ConstructorDeclaration n) {

		System.out.print("\n/*************");
		System.out.print("\nNew constructor " + n.f1.tokenImage);
		System.out.print("\n*************/");

		super.visit(n);
	}

	@Override
	public void visit(ClassDeclaration n) {

		System.out.print("\n/*************");
		System.out.print("\nNew class " + n.f1.f1.tokenImage);
		System.out.print("\n*************\n/");

		super.visit(n);
	}

	@Override
	public void visit(NestedClassDeclaration n) {

		System.out.print("\n/*************");
		System.out.print("\nNew  nested class " + n.f1.f1.tokenImage);
		System.out.print("\n*************/");
		super.visit(n);
	}

}
