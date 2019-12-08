package school;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Course course=new Course(1, "bengjing", "大兴",3,3);
		 Teacher teather=new Teacher(1, "张老师", "women",course);
		 Student student=new Student(1, "小陈", "men",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}
	

}
