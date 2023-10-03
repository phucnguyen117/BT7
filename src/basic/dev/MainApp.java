package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("thongtin");
		System.out.println("Ho va ten:");
		String Name = sc.next();
		System.out.println("MaSv:");
		int maSinhVien = sc.nextInt();
		System.out.println("CMND:");
		long cmnd = sc.nextLong();
		System.out.println("DTB:");
		float dtb = sc.nextFloat();
		System.out.println("diaChi:");
		String diaChi = sc.next();
		System.out.println("SDT:");
		long sdt = sc.nextLong();
		System.out.println("Hesoluong:");
		float hsl = sc.nextFloat();
		System.out.println("Tenxe:");
		String nameCar = sc.next();
		System.out.println("hang:");
		String hang = sc.next();
		System.out.println("gia:");
		float gia = sc.nextFloat();
		System.out.println("Mau:");
		String color = sc.next();
	}

}
