package main;

import java.util.ArrayList;

//統計每個Grade有多少筆資料

class Counter {
	int countG;
	String GradeN;

	// Counter(){

	// }

	Counter(String _GradeN, int _countG) {
		this.GradeN = _GradeN;
		this.countG = _countG;
	}

	public String toString() {
		return this.GradeN + " = " + this.countG;
	}
}

public class GradeAnalyzer {
	double AVG = 0, SD = 0, Sum = 0, Num = 0;
	int cntInput = 0;
	ArrayList<Double> ListOfScore = new ArrayList<Double>();
	Counter[] GradeL = new Counter[11];
	boolean start = true; // 只有在第一個迴圈時才產生新的Grade Counter

	// 我覺得這邊宣告為靜態有點多餘.
	// 判斷入值是否在0~110之間
	static boolean isValidGrade(double theGrade) {
		if (theGrade >= 0 && theGrade <= 100)
			return true;
		else
			return false;
	}

	// 若為新開始要先建立分級表
	void addGrade(double theGrade) {
		// Good, +2.
		if (start == true) {
			GradeL[0] = new Counter("A+", 0);
			GradeL[1] = new Counter("A", 0);
			GradeL[2] = new Counter("A-", 0);
			GradeL[3] = new Counter("B+", 0);
			GradeL[4] = new Counter("B", 0);
			GradeL[5] = new Counter("B-", 0);
			GradeL[6] = new Counter("C", 0);
			GradeL[7] = new Counter("C+", 0);
			GradeL[8] = new Counter("C-", 0);
			GradeL[9] = new Counter("D", 0);
			GradeL[10] = new Counter("F", 0);
			start = false;
		}

		if (isValidGrade(theGrade) == true) {

			ListOfScore.add(theGrade);// 把資料加入成績表中
			Sum = Sum + theGrade;// 成績的加總
			cntInput++;// 增加資料筆數

			// 先分出輸入的資料是屬於A~F的哪一級再作細分
			if (theGrade >= 90) {
				if (theGrade >= 90 && theGrade < 92)
					GradeL[2].countG++;
				if (theGrade >= 92 && theGrade < 98)
					GradeL[1].countG++;
				if (theGrade >= 98)
					GradeL[0].countG++;
			} else if (theGrade >= 80 && theGrade < 90) {
				if (theGrade >= 80 && theGrade < 82)
					GradeL[5].countG++;
				if (theGrade >= 82 && theGrade < 88)
					GradeL[4].countG++;
				if (theGrade >= 88)
					GradeL[3].countG++;
			} else if (theGrade >= 70 && theGrade < 80) {
				if (theGrade >= 70 && theGrade < 72)
					GradeL[8].countG++;
				if (theGrade >= 72 && theGrade < 78)
					GradeL[7].countG++;
				if (theGrade >= 78)
					GradeL[6].countG++;
			} else if (theGrade >= 60 && theGrade < 70) {
				GradeL[9].countG++;
			} else if (theGrade >= 0 && theGrade < 60) {
				GradeL[10].countG++;
			}
		}
	}

	void analyzeGrades() {
		// 計算平均分(四舍五入)
		AVG = Math.round(Sum / cntInput);
		// 計算標準差
		double SDsum = 0;
		int r, size = ListOfScore.size();
		for (r = 0; r < size; r++) {
			SDsum += Math.sqrt((ListOfScore.get(r) - AVG) * (ListOfScore.get(r) - AVG));
		}
		
		// 這邊應該是不用-1喔, -2.
		SD = Math.round(SDsum / (cntInput - 1));
	}

	// 輸出統計結果
	public String toString() {
		String st = "";
		int i, length = GradeL.length;
		for (i = 0; i < length; i++) {
			st += GradeL[i] + "\n";
		}
		return "The grade distribution is: \n" + st;
	}
}