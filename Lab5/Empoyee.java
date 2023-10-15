import java.util.Scanner;

class Data{
     String name;
     String city;
     float basic_salary;
     float Dearness_Allowance;
     float House_Rent;
    Data(String n, String c, float bs, float DA, float HR){
        name = n;
        city = c;
        basic_salary = bs;
        Dearness_Allowance = DA;
        House_Rent = HR;
        System.out.println("Enployee data created");
    }
    float calculate(){
        float total = basic_salary + basic_salary*Dearness_Allowance/100+basic_salary*House_Rent/100;
        return total;
    }
    void display(){
        System.out.println(this.calculate());
    }


}

public class Empoyee {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String city = sc.nextLine();
        int basic_salary = sc.nextInt();
        int Dearness_Allowance = sc.nextInt();
        int House_Rent = sc.nextInt();
        Data E1 = new Data(name, city, basic_salary, Dearness_Allowance, House_Rent);
        E1.display();
    }

}
