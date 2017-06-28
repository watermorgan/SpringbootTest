package com.yingcankeji.architect.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleFemale = new AndCriteria(single, female);
		Criteria singleOrMale = new OrCriteria(single, male);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Females: ");
		printPersons(singleFemale.meetCriteria(persons));

		System.out.println("\nSingle Or Males: ");
		List<Person> singleOrMaleList = singleOrMale.meetCriteria(persons);
//		printPersons(singleOrMale.meetCriteria(persons));
		printPersons(singleOrMaleList);

	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName()
					+ ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

}
