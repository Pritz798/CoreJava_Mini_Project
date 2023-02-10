class Employee{
    private int empno;
    private String ename;
    private int salary;
    private String designation;

    Employee(int empno, String ename, int salary, String designation){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmpno(){
    return empno;
    }

    public String getEname(){
        return ename;
    }

    public int getSalary(){
        return salary;
    }

    public String getDesignation(){
        return designation;
    }

    public String toString(){
        return empno+"       |  "+ename+"    | "+salary+"       | "+designation;
        
    }
    

   

}

