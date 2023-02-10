import java.util.Scanner;

public class CRUDDemo {
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int ch;
        String username, password;
        Operations op = new Operations();

        System.out.println("Enter Username: ");
        username = sc.next();

        System.out.println("Enter Password: ");
        password = sc.next();

        if(username.equals("admin") && password.equals("1234")){
        
            while(true)
            {
                System.out.println();
                System.out.println("------------------------------------------------------------");
                System.out.println("|         * WELCOME TO EMPLOYEE MANAGEMENT SYSTEM *        |");
                System.out.println("|----------------------------------------------------------|");
                System.out.println("|                     1.INSERT                             |");
                System.out.println("|                     2.DISPLAY                            |");
                System.out.println("|                     3.SEARCH                             |");
                System.out.println("|                     4.DELETE                             |");
                System.out.println("|                     5.UPDATE                             |");
                System.out.println("|                     6.EXIT                               |");
                System.out.println("------------------------------------------------------------");
                System.out.println();
                System.out.println("Enter your choice: ");
                ch = sc.nextInt();

                switch(ch){
                    case 1:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                  ADD EMPLOYEE DETAILS                   |");
                        System.out.println("-----------------------------------------------------------");
                        op.insertEmp();
                        System.out.println("-----------------------------------------------------------");
                        break;
                        
                    case 2:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                     EMPLOYEE DETAILS                    |");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("EMP_ID    | NAME       | SALARY      | DESIGNATION         ");
                        op.displayEmp();
                        
                       
                        break;
                    case 3:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                  SEARCH EMPLOYEE DETAILS                |");
                        System.out.println("-----------------------------------------------------------");
                        op.searchEmp();
                        System.out.println("-----------------------------------------------------------");
                        break;
                    case 4:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                  DELETE EMPLOYEE DETAILS                |");
                        System.out.println("-----------------------------------------------------------");
                        op.deleteEmp();
                        System.out.println("-----------------------------------------------------------");
                        break;
                    case 5:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|                  UPDATE EMPLOYEE DETAILS                |");
                        System.out.println("-----------------------------------------------------------");
                        op.updateEmp();
                        System.out.println("-----------------------------------------------------------");
                        break;
                    case 6:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|            YOU HAVE LOGGED OUT SUCCESFULLY !!           |");
                        System.out.println("-----------------------------------------------------------");
                        System.exit(0);
                    default:
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("|           OOPS!!! YOU HAVE MADE WRONG CHOICE            |");
                        System.out.println("-----------------------------------------------------------");
                }

                
            }
        }
        else{
            System.out.println("Incorrect Username or Password! Try Again");
        }
    }
   
    
}
