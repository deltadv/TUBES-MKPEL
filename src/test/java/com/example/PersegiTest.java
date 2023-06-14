package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersegiTest 
{
    @Test
    public void testHitungLuasPersegi() {
        Persegi persegi = new Persegi();
        int sisi = 5;
        int luasPersegi = persegi.hitungLuasPersegi(sisi);
        assertEquals(25, luasPersegi);
    }

    @Test
    public void testHitungKelilingPersegi() {
        Persegi persegi = new Persegi();
        int sisi = 5;
        int kelilingPersegi = persegi.hitungKelilingPersegi(sisi);
        assertEquals(20, kelilingPersegi);
    }
}
