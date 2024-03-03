public class Student {
    private int rollno;
    private String name,branch,semester;
    public Student(int r,String n,String b,String s)
    {
        rollno=r;
        name=n;
        branch=b;
        semester=s;
    }
    public void showData()
    {
        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Branch:"+branch);
        System.out.println("Semester"+semester);
    }
    public int getRollno()
    {
        return rollno;
    }
}
