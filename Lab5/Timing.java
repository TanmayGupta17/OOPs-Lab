import java.util.Scanner;

class Time {
   int hours;
   int min;
   int sec;

   Time() {
      this.hours = this.min = this.sec = 0;
   }

   Time(int var1, int var2, int var3) {
      this.hours = var1;
      this.min = var2;
      this.sec = var3;
   }

   void display() {
      System.out.println("Time " + this.hours + ":" + this.min + ":" + this.sec);
   }

   Time Add(Time var1, Time var2) {
      Time var3 = new Time();
      var3.sec = var1.sec + var2.sec;
      var3.min = var1.min + var2.min;
      var3.hours = var1.hours + var2.hours;
      if (this.sec > 60) {
         this.sec -= 60;
         ++this.min;
      }

      if (this.min > 60) {
         this.min -= 60;
         ++this.hours;
      }

      return var3;
   }
}
class Timing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time1:");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        Time T1 = new Time(h1,m1,s1);
        System.out.println("enter time2:");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        Time T2 = new Time (h2,m2,s2);
        System.out.println("addition of two times is");
        Time T3 = new Time();
        T3 = T3.Add(T1, T2);
        T3.display();
    }
}