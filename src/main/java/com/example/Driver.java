package com.example;

public class Driver 
{
    public static void main( String[] args )
    {
        Persegi persegi = new Persegi();

		int sisi = 5;
		
		// Memanggil metode hitungLuasPersegi() dari objek fungsi
        int luasPersegi = persegi.hitungLuasPersegi(sisi);
	System.out.println("Hasil perhitungan");
        System.out.println("Luas persegi adalah: " + luasPersegi);
	    

        // Memanggil metode hitungKelilingPersegi() dari objek fungsi
        int kelilingPersegi = persegi.hitungKelilingPersegi(sisi);
	System.out.println("Hasil perhitungan");
        System.out.println("Keliling persegi adalah: " + kelilingPersegi);
    }
}
