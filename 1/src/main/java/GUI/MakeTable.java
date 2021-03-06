package GUI;

import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;

import javax.swing.JTable;

import Model.Book;


public class MakeTable {
	public static JTable createTable(ArrayList<Object> books){
		Object o= books.get(0);
		Object[] headers= new Object[o.getClass().getDeclaredFields().length];
		int i =0;
		for (java.lang.reflect.Field field : o.getClass().getDeclaredFields()) {
			((AccessibleObject) field).setAccessible(true); // set modifier to public
			try {
				headers[i]=field.getName();
				i++;

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}

		Object[][] data= new Object[books.size()][headers.length];

		for(int j=0;j<books.size();j++){
			int k=0;
			for (java.lang.reflect.Field field : books.get(j).getClass().getDeclaredFields()) {
				field.setAccessible(true); // set modifier to public
				try {
					data[j][k] = field.get(books.get(j));
					k++;

				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		JTable table= new JTable(data,headers);

		return table;
	}
	
}