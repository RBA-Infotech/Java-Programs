package ProgramOutputs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List l=new ArrayList();
        l.add("Pasta");
        l.add(12);
        l.add('A');
        List<Object> l1=new ArrayList<Object>();
        for (Iterator iterator = l.iterator(); iterator.hasNext();) {
             l1.add(iterator.next());
        }
        System.out.println(l1);
    }
}
	
