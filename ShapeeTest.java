package com.bilgeadam.boost.maraton1;

import java.util.Scanner;

public class ShapeeTest {
	public static void main(String[] args) {
		
		ShapeeTest shapeeTest = new ShapeeTest();
		 shapeeTest.readInput();
		System.out.println("Bye..."); 
		}
	
	
	Scanner scanner=new Scanner(System.in);
	public void readInput() {
	
		int Shape = 0;
		boolean condation=true;
		if ( condation=true) {
			int ShapeLength[] = new int[6];
			System.out.println("\"Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) kenar sayisini giriniz. ( -1 ile cikis yapabilirsiniz ) \" :");
			int i= scanner.nextInt();
	scanner.nextLine();

			System.out.println("Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) kenar uzunluklarini giriniz. ( -1 ile cikis yapabilirsiniz ) ");
		//	scanner.nextLine();
			for ( i = 1; i <5 ; i++) {
				System.out.print("Lutfen " + i+ ". kenar uzunlugunu giriniz (0 ile sonlandir) :");
				
				
				ShapeLength[i] = scanner.nextInt();

				if (i == 2 && ShapeLength[i] == 0) {
					System.out.println("iki kenarli sekil olmaz.");
					break;

				} else if (i == 0 && ShapeLength[i] == 0) {
					System.out.println(" sonlandır.");
					break;
				} else if (i == 1 && ShapeLength[i] == 0) {
					System.out.println("bir kenarli sekil olamaz.");
					break;
				} else if (ShapeLength[i] == -1) {
					System.out.println("çıkış yapılıyor...");
					
					break;
				} else if (ShapeLength[i] < 0) {
					System.out.println("uzunluk negatif olamaz!");
					i--;
					break;
				} else if (i == 3) {

					Shape++;
					int area=(ShapeLength[i]*ShapeLength[i]);
					int perimeter=(ShapeLength[i]+ShapeLength[i]);
					System.out.println(Shape + ". seklin alani: " + area);
					System.out.println(Shape + ". seklin cevresi: " + perimeter);

					break;

				} else
					continue;
			}
		}}
	


	
	
	} 
	
