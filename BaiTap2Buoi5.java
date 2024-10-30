package buoi5;
public class BaiTap2Buoi5 {

    public static void viDu1() {
        int a = 3;
        System.out.println(a++);
        // In ra 3
        // Sau khi in, a = 4
        
        System.out.println(++a);
        // a = 5, in ra 5
        
        System.out.println(a+++1);
        // In ra 5, a = 6
        
        System.out.println(++a + 1);
        // a = 7, in ra 8
    }

    public static void viDu2() {
        int a = 0, b, c;
        a++;                     
        // a = 1
        
        b = a;                  
        // b = 1
        
        c = a++;                
        // c = 1, a = 2
        
        System.out.println(a);  
        // In ra 2
        
        System.out.println(b);  
        // In ra 1
        
        System.out.println(c);  
        // In ra 1
    }

    public static void viDu3() {
        int a = 0, b, c;
        ++a;                     
        // a = 1
        
        b = a;                  
        // b = 1
        
        c = ++a;                
        // a = 2, c = 2
        
        System.out.println(a);  
        // In ra 2
        
        System.out.println(b);  
        // In ra 1
        
        System.out.println(c);  
        // In ra 2
    }

    public static void viDu4() {
        int a = 0, b, c;
        ++a;                     
        // a = 1
        
        b = ++a;                
        // a = 2, b = 2
        
        c = a++;                
        // c = 2, a = 3
        
        System.out.println(a);  
        // In ra 3
        
        System.out.println(b);  
        // In ra 2
        
        System.out.println(c);  
        // In ra 2
    }

    public static void viDu5() {
        int a = 0, b, c;
        ++a;                     
        // a = 1
        
        b = ++a;                
        // a = 2, b = 2
        
        c = b++;                
        // c = 2, b = 3
        
        System.out.println(a);  
        // In ra 2
        
        System.out.println(b);  
        // In ra 3
        
        System.out.println(c);  
        // In ra 2
    }

    public static void viDu6() {
        int a = 0, b, c;
        ++a;                     
        // a = 1
        
        b = a++;                
        // b = 1, a = 2
        
        c = b++;                
        // c = 1, b = 2
        
        c += c;                 
        // c = 1 + 1 = 2
        
        System.out.println(a);  
        // In ra 2
        
        System.out.println(b);  
        // In ra 2
        
        System.out.println(c);  
        // In ra 2
    }

    public static void main(String[] args) {
        System.out.println("Ket Qua VD1:");
        viDu1();
        
        System.out.println("\nKet Qua VD2:");
        viDu2();
        
        System.out.println("\nKet Qua VD3:");
        viDu3();
        
        System.out.println("\nKet Qua VD4:");
        viDu4();
        
        System.out.println("\nKet Qua VD5:");
        viDu5();
        
        System.out.println("\nKet Qua VD6:");
        viDu6();
    }
}


    