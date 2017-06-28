package com.yingcankeji.architect.mvc;

public class MVCPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 从数据可获取学生记录
		Student model = retriveStudentFromDatabase();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("Job");
		
		controller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
