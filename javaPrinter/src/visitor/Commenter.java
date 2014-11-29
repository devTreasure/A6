package visitor;

import java.util.Enumeration;
import java.util.Vector;

import syntaxtree.MethodDeclarator;
import syntaxtree.Node;
import syntaxtree.NodeListInterface;





public class Commenter extends DepthFirstVisitor 
	{
	   private Vector cmdQueue = new Vector();

	   public void visit(MethodDeclarator n) {
		      n.f0.accept(this);
		      n.f1.accept(this);
		      if ( n.f2.present() ) {
		         processList(n.f2);
		      }
		   }
	   
	   
	   protected void processList(NodeListInterface n) {
		      processList(n, null);
		   }
	   
	   protected void processList(NodeListInterface n, FormatCommand cmd) {
		      for ( Enumeration e = n.elements(); e.hasMoreElements(); ) {
		         ((Node)e.nextElement()).accept(this);
		         if ( cmd != null && e.hasMoreElements() )
		            cmdQueue.addElement(cmd);
		      }
		   }
		
	}
/*

	public class commentHelper
	{
		
		 int  loopCounter=10;
		 int looper=0;
		 
		
		 public  void  createAsterics()
		 {
				for(int i=0;i<=loopCounter;i++)
				{
					
				}
		 }
		
	

	}

*/


