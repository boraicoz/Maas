public class Employee {
        String name;
        int salary,workHours,hireYear;

        Employee(String name,int salary,int workHours,int hireYear)
        {
        this.name=name;
        this.hireYear=hireYear;
        this.salary=salary;
        this.workHours=workHours;
        this.print();
        }

        double tax(){
        double tax=0;
        if(this.salary>1000) {
        tax=this.salary*0.03;
        return tax;
        }
        return tax;
        }
        int bonus(){
        if(this.workHours>40) {
        return (this.workHours-40) * 30;
        }
        else
            return 0;
        }
        double raiseSalary(){
            double raise;
         int year=2021;
           if(year-this.hireYear<10)
           {
               raise=this.salary*0.5;
           }
           else if(year-this.hireYear>9&&year-this.hireYear<20)
             raise=this.salary*0.1;
           else
               raise=this.salary*0.15;

           return raise;
        }
         public void print(){
             System.out.println("Adi:"+this.name+"\n" +
                     "Maasi:"+this.salary+"\n" +
                     "Calisma Saati:"+this.workHours+"\n" +
                     "Baslangic Yili:"+this.hireYear+"\n" +
                     "Vergi:"+this.tax()+"\n" +
                     "Bonus:"+this.bonus()+"\n" +
                     "Maas Artisi:"+this.raiseSalary()+"\n" +
                     "Vergi ve Bonuslar ile Birlikte Maaş:"+(this.salary-this.tax()+this.bonus())+"\n" +
                     "Toplam Maas:"+(this.salary+this.raiseSalary()));
        }


    public static void main(String[] args) {
        Employee e1=new Employee("Bora",2000,45,1985);

    }

        }
