/*
 * [A]98
 * [TA's Advise]
 * 1. 建議不要省略{}, 等你們觀念更好更清楚的時候再去省.
 * 2. 有一些小錯誤寫在檔案中了, 請再次確認.
 * */

package main;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer T = new GradeAnalyzer();
		String Input = "";

		for (int i = 1; i < 50; i++) {
			Input = JOptionPane.showInputDialog(null, "Please enter the score");// 圖形化視窗

			// equalsIgnoreCase是不管大小寫的比對, 所以寫一個就好了
			if (Input.equalsIgnoreCase("Q") || Input.equalsIgnoreCase("q")) // 如果輪入Q/q便停止迴圈
				break;

			else
				// 有讓使用者輸入的話請作例外處理, -2
				T.addGrade(Double.parseDouble(Input));
		}

		// 如果輸入的資料小於2, 不會印結果
		if (T.cntInput < 2) {
			System.out.println(
					"You did not enter enough grades to analyze. Please enter at least 2 valid grades!!\n\n\n");
		} else {

			T.analyzeGrades();
			System.out.println(
					"You entered " + T.cntInput + " valid grades from 0 to 110. Invalid grades are ignored!\n");
			System.out.println("The average = " + (int) T.AVG + " with a standard deviation = " + (int) T.SD + "\n");
			System.out.println(T);
		}
	}
}
