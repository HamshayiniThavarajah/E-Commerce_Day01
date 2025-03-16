class Student{
	
		String name;
		int mark;
		
		
		public Student(String name,int mark){
				this.name=name;
				this.mark=mark;
				
				
		}
		public int getMark(){
			return mark;
		}
		
		
	}
 class Main{	
	public static void main(String args[]){
		Student s1=new Student("Hamsi",100);
		Student s2=new Student("Vije",95);
		Student s3=new Student("minha",90);
		Student s4=new Student("Pavi",85);
		Student s5=new Student("Abi",80);
		
		Student [] students={s1,s2,s3,s4,s5};
		
		int totalMarks=0;
		
		for(Student student:students){
			totalMarks += student.getMark();
		}
		double averageMark= totalMarks/(double)students.length;
		System.out.println("The Average marks of students:"+averageMark);
		
		
		
	}
}

/*
@HamshayiniThavarajah ➜ /workspaces/E-Commerce_Day01 (main) $ javac Student.java
@HamshayiniThavarajah ➜ /workspaces/E-Commerce_Day01 (main) $ java Main
The Average marks of students:90.0
*/