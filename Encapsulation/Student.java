import java.util.Scanner;
class Data{
    private String name;
    private double marks;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    double getMarks(){
        return marks;
    }
    void setMarks(double marks){
        this.marks= marks;
    }
}
 class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Data d = new Data();
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        d.setName(name);
        System.out.println("Enter student marks: ");
        double marks =sc.nextDouble();
        d.setMarks(marks);
        System.out.println("----Student Record----");
        System.out.println("Name: "+d.getName());
        System.out.println("Marks: "+d.getMarks());
        sc.close();
    }
}