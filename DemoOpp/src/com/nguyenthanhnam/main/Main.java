package com.nguyenthanhnam.main;

import com.nguyenthanhnam.person.Person;

public class Main {
	public static void main(String[] args) {
        Person hung=new Person("Nguyen Thanh Nam","Nam", 20,60,"hat ho","Gay,Thich The Thao");
        Person tuan=new Person("Nguyen Quang Tuan","Nam", 18,30,"choi game","Beo,an it,thich choi game ");
        Person quang=new Person("Nguyen Thi Hue","Nu", 23,56,"nhay","Gay,thich bong da");
        Person huy=new Person("Tran Manh Cuong","Nam", 60,60,"hat ho","Cao ,thich hat");
        hung.info();
        hung.sothich();
        System.out.println("----------------------------------------\n");
        tuan.info();
        tuan.sothich();
        System.out.println("----------------------------------------\n");
        quang.info();
        quang.sothich();
        System.out.println("----------------------------------------\n");
        huy.info();
        huy.sothich();
	 }
}
