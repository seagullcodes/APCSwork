import java.util.*;


public class AcadClass
{
    
    public AcadClass(){
        students = new ArrayList<Student>();
    }
    
    public void addStudent(String name, int favNumber)
    {
        Student student = new Student(name, favNumber);
        students.add(student);
    }
    
    public void addTeacher(String name, String subject)
    {
        teacher = new Teacher(name, subject);
        
    }
    public void classInfo()
    {
        for(Student s : students)
        {
            System.out.println(s.getName());
        }
        
        System.out.println("teacher's name" + teacher.getName());
        System.out.println("subject" + teacher.getSubject());
    }
    
    public ArrayList<String> isIt(int n)
    {
        ArrayList<String> studentsLike = new ArrayList<String>();
       
        for(Student s : students)
        {
            if(s.getFavNumber() == n)
            {
                studentsLike.add(s.getName());
            }
        }
        
        return studentsLike;
    }
    
    public ArrayList<String> favOdd()
    {
        ArrayList<String> oddLike = new ArrayList<String>();
        for(Student s : students)
        {
            if(s.getFavNumber()%2 == 0)
            {
                System.out.println("woohoo");
            }
            else{
                oddLike.add(s.getName());
            }
        }
        return oddLike;
    }
                                           
                                
    
    
    private ArrayList<Student> students;
    private Teacher teacher;

    //////////
    
    public static void main(String[] args)
    {
        AcadClass classA = new AcadClass();
        
        classA.addStudent("Alene", 21);
        classA.addStudent("Sarah", 5);
        classA.addStudent("Logan", 2);
        classA.addStudent("Madeleine", 4);
        
        classA.addTeacher("Mr. Witman", "robotics"); 
        
        //teachera = new Teacher("Mr. Witman", "robotics");
        
        classA.classInfo();
        
        System.out.println("favorite is n?" + classA.isIt(5));
        System.out.println("odd number" + classA.favOdd());

        
    }
}

