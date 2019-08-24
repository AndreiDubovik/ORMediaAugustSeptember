package by.ormedia.lesson4;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		
		java.util.List<ILibraryItem>list = new ArrayList<>();
		list.add(new Magazine());
		java.lang.Object ob = list.get(0);
		System.out.println(ob instanceof Book);
		
		ILibraryItem item = new IArticleContained(){

			@Override
			public Article[] getArticles() {
				// TODO Auto-generated method stub
				return null;
			}};
		
	}

}
