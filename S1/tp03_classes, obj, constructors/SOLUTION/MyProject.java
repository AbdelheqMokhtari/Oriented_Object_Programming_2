

package test.myproject;
import java.util.Scanner;
     



class Point{
    private char nom;
    private double abs;
    public Point (char c, double x){
    nom=c;
    abs=x;}
    public void affiche()
    {
    System.out.println("The"+nom+" Point with abscissa= "+abs);}
  public void translate(double dx) {
      abs+=dx;
  } 
}
class Distance {
    public double x;
    public double y;
    Distance(double x, double y)

    {
        this.x = x;
        this.y = y;
    }
  
    public double getX()
    {
        return x;
    }
  
    public double getY()
    {
        return y;
    }
    
    public double distanceCalcule(Distance p)
    {
        double px = this.x - p.x;
        double py = this.y - p.y;
    
        return Math.sqrt(Math.pow(px,2)+ py * py);
    }
}
public class MyProject {
    static double n;
    static  double n1;
    static double n3;
    public static final int PASSWORD_LENGTH = 8;
    public static void lire(){
         Scanner sc= new Scanner(System.in);
         System.out.println("enter 3 doubles");
         n = sc.nextDouble();
         sc.nextLine(); // Consume the newline character
         n1 = sc.nextDouble();
         sc.nextLine(); // Consume the newline character
         n3 = sc.nextDouble();
         sc.nextLine(); 
     }
   public static double max(double one, double two, double three)
   {
       return Math.max(Math.max(one, two),three);
   }
   public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

      
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch) || is_Letter(ch)) ;
            else return false;
        }


        return true;
    }

    public static boolean is_Letter(char ch) {
       //ch = Character.toUpperCase(ch);
       
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    
    
    
     static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
    
    
    public static void main(String[] args) {
       
        int num = 0;
// Prompt the candidate to enter their name and a number
       Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your name: ");
        String name = sc.next();
        System.out.println("\nEnter the quiz number: ");
        num = sc.nextInt();
        Quiz Q = new Quiz(name, num);
        Q.calculScore(); 
     /*     Scanner input = new Scanner(System.in);
        System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }
        //lire();
       //  System.out.println("The maximum is "+ max(n,n1,n3));
        
       

        Tv tv1= new Tv();
        tv1.turnOff();
        tv1.setChanel(30);
        tv1.setVolume(3);
        Tv tv2= new Tv();
        tv2.turnOn();
        tv2.chanSup();
        tv2.chanSup();
        tv2.chanSup();
        tv2.volumeSup();
        System.out.println("tv1 is setted in the channel"+tv1.channel+" and its volume is"+ tv1.volume);
        System.out.println("tv2 is setted in the channel"+tv2.channel+" and its volume is"+ tv2.volume);
        Distance p1 = new Distance(5, 6);
     Distance p2 = new Distance(3, 2);
        
     System.out.println("P1 ("+ p1.x +","+ p1.y +")");
     System.out.println("P2 ("+ p2.x +","+ p2.y +")");
     System.out.println("The distance between P1 and P2 is : "+p1.distanceCalcule(p2));
        Point a =new Point('c',2.5); 
        a.affiche();
        a.translate(7);
        a.affiche();
//System.out.print("entrez un caractère : ");
//char caractere = scanner.next().charAt(0);
//System.out.println(caractere);
//scanner.nextLine();
//System.out.print("entrez une phrase (avec espaces) : ");
//String chaine1 = scanner.nextLine();
//System.out.println(chaine1);
//System.out.print("entrez une phrase (sans espaces) : ");
//String chaine = scanner.next();
//System.out.println(chaine);

// Ajoutez cette ligne pour consommer la nouvelle ligne restante dans le buffer


//int n;
/**do{
  System.out.println("enter a positive number");  
  n = scanner.nextInt();
}while(n<=0);

   System.out.println("Calculate"+n+"factorial:"); 
int counter =1;
 int result=1;
 while(counter <= n)
 { result= result * counter; 
counter = counter +1; } 
System.out.println(result);


Cercle c1=new Cercle();
System.out.println("The surface of the circle that has rayon  :"+c1.rayon+ " is "+c1.getSurface());
//calculate the surface of the circle with rayon=25
Cercle c2=new Cercle(25);
System.out.println("The surface of the circle that has rayon  :"+c2.rayon+ " is "+c2.getSurface());
//calculate the surface of the circle with rayon=125
Cercle c3=new Cercle(125);
System.out.println("The surface of the circle that has rayon  :"+c3.rayon+ " is "+c3.getSurface());
// Modify the rayon of the second object
  
 c2.setRayon(100);// c2. rayon = 100;
 System.out.println("The Perimeter of the circle that has rayon = "+ c2. rayon + "is" +c2.getPerimetre()) ;  **/


}
}
