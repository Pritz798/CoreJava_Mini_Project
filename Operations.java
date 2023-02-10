import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

public class Operations implements EmployeeInterface{

    List<Employee> c = new ArrayList<Employee>();
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    Iterator<Employee> i ;
    boolean found = false;

    public void insertEmp(){
        System.out.println("Enter Employee No.: ");
        int eno = s.nextInt();
        //s.nextLine();
        System.out.println("Enter Employee name: ");
        String ename = s1.nextLine();
        System.out.println("Enter Employee salary: ");
        int salary = s.nextInt();
        System.out.println("Enter Employee designation: ");
        String designation = s1.nextLine();
        System.out.println("***********************************************************");           
        c.add(new Employee(eno, ename, salary, designation));
        System.out.println("Record(s) added successfully...!!");
    }

    public void displayEmp(){
        i = c.iterator();
        while(i.hasNext()){
            Employee e = i.next();
            System.out.println(e);
        }
    }

    public void searchEmp(){
        found = false;
        System.out.println("Enter Empno to search: ");
        int empno = s.nextInt();
        System.out.println("*********************Employee Details**********************");
        System.out.println();
        i = c.iterator();
        while(i.hasNext()){
            Employee e = i.next();
            if(e.getEmpno() == empno){
                System.out.println("EMP_ID    | NAME       | SALARY      | DESIGNATION         ");
                System.out.println(e);
                found = true;
            }
        }
        if(!found){
            System.out.println("Record Not Found"); 
        }
        
    }

    public void deleteEmp(){
        found = false;
        System.out.println("Enter Empno to delete: ");
        int empno = s.nextInt();
        System.out.println("***********************************************************");
        i = c.iterator();
        while(i.hasNext()){
            Employee e = i.next();
            if(e.getEmpno() == empno){
                i.remove();
                    found = true;
            }
        }
        if(!found){
            System.out.println("Record Not Found"); 
        }else{
            System.out.println("Record deleted successfully...!!");
        }

    }

    public void updateEmp(){
        found = false;
        System.out.println("Enter Empno to update: ");
        int empno = s.nextInt();
        System.out.println("***********************************************************");
        ListIterator<Employee> li = c.listIterator();
        while(li.hasNext()){
            Employee e = li.next();
            if(e.getEmpno() == empno){
                System.out.println("Enter new name: ");
                String ename = s1.nextLine();
                System.out.println("Enter new salary: ");
                int salary = s.nextInt();
                System.out.println("Enter new designation: ");
                String designation = s1.nextLine();
                li.set(new Employee(empno, ename, salary, designation));
                found = true;
            }
        }
        if(!found){
            System.out.println("Record Not Found"); 
        }else{
            System.out.println("Record updated successfully...!!");
        }

    }

    

}
