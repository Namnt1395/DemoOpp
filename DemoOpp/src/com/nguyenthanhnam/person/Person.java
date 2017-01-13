package com.nguyenthanhnam.person;

public class Person {
	private String hoTen;
	private String gioiTinh;
	private int tuoi;
	private float canNang;
	private String soThich;
	private String description;

	public Person(String hoTen, String gioiTinh, int tuoi, float canNang,
			String soThich, String description) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.canNang = canNang;
		this.soThich = soThich;
		this.description = description;
	}

	public void info() {
		System.out.print("Ho Ten:" + hoTen + "\n" + "Gioi Tinh:" + gioiTinh
				+ "\n" + "Tuoi:" + tuoi + "\n" + "Can Nang:" + canNang + "\n"
				+ "So Thich:" + soThich + "\n");
		
	}

	public void sothich() {
		System.out.println("Mo Ta:" + description);
	}

}
