package buoi5;

import java.util.Scanner;

public class BaiTap1Buoi5 {
    
    public static void viDu1() {
        System.out.println("\nVí dụ 1");
    }
    
    
    public static int timGiaTriLonNhat(int a, int b) {
        return a > b ? a : b;
    }

    public static int timGiaTriNhoNhat(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên 
        System.out.print("Nhap So Nguyen Thu Nhat: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhap So Nguyen Thu Hai: ");
        int num2 = scanner.nextInt();
        
        // Tính toán
        int max = timGiaTriLonNhat(num1, num2);
        int min = timGiaTriNhoNhat(num1, num2);
    
        
        // in kết quả
        System.out.println("Gia Tri Lon Nhat La: " + max);
        System.out.println("Gia Tri Nho Nhat La: " + min);
      
        
    
        scanner.close();
    }
}