/*
 * [A]95
 * [TA's advise]
 * 1.程式碼可以寫得更精簡, 可以提供你在之後維護上或是修正更為簡便, 以下提供你作為參考.
 * 2.建構子提供物件初始化是否可以讓物件產生後, 無須額外賦值且保有它的安全性呢(若你宣告成private).
 * 3.若Area與Perimeter可以透過properties計算而產生, 那額外宣告出來存值是否有它的必須性呢?
 * 4.void是表是無回傳值, 撰寫return可以將它想成函式終止處, 這部分我覺得觀念沒有到清楚, 若你可以告訴我你為什麼會寫return且能說服我, 這部分的分數會還給你, 酌量扣1分.
 * 5.getWidth(),getHeight()沒有達成這兩個method本身的意義, 此部分扣2分.
 * 6.沒有overridding toString, 此部分扣2分.
 * */

//package main;

class Rect {
	int x, y, W, H;
	
	//請撰寫建構子提供物件初始化.
	
	/*
	 * Rect(){}
	 * Rect(int x, int y, int W, int H){....}
	 * */
	
	
	//以下兩個可以透過W與H計算產生, 那是否有必要額外宣告出來呢?
	double Area, Perimeter;

	
	//void是表示該method無回傳值, 或許改成double getWidth()會更好呢? 另這method應該是回傳Width, 怎麼變成了計算呢?
	void getWidth() {
		Area = W * H;
		return;
	}

	//同getWidth()的問題
	void getHeight() {
		Perimeter = (W + H) * 2;
		return;
	}

	//overridding public String toString(){} method.
	void Show() {
		System.out.println("java.Rectangle[X=" + x + ",y=" + y + ",width=" + W + ",height=" + H + "]");
		System.out.println("Area = " + Area);
		System.out.println("Perimeter =" + Perimeter);
		System.out.println("     ");
	}
}

public class RectangleTester {
	public static void main(String args[]) {

		//考慮使用物件初始化的方式讓程式碼更為精簡
		Rect Rect1 = new Rect();
		Rect Rect2 = new Rect();
		Rect1.x = 15;
		Rect1.y = 25;
		Rect1.W = 57;
		Rect1.H = 18;
		Rect2.x = 0;
		Rect2.y = 12;
		Rect2.W = 60;
		Rect2.H = 47;
		Rect1.getWidth();
		Rect1.getHeight();
		Rect2.getWidth();
		Rect2.getHeight();
		Rect1.Show();
		Rect2.Show();
		System.out.println("End of Output!");

	}
}
