package com.yingcankeji.architect.iterator;

public class IteratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
			System.out.println("Name：" + iter.next());
		}
		
	}

}
