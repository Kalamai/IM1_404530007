/*
 * [A]98
 * [TA's Advise]
 * 1. ��ĳ���n�ٲ�{}, ���A���[����n��M�����ɭԦA�h��.
 * 2. ���@�Ǥp���~�g�b�ɮפ��F, �ЦA���T�{.
 * */

package main;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer T = new GradeAnalyzer();
		String Input = "";

		for (int i = 1; i < 50; i++) {
			Input = JOptionPane.showInputDialog(null, "Please enter the score");// �ϧΤƵ���

			// equalsIgnoreCase�O���ޤj�p�g�����, �ҥH�g�@�ӴN�n�F
			if (Input.equalsIgnoreCase("Q") || Input.equalsIgnoreCase("q")) // �p�G���JQ/q�K����j��
				break;

			else
				// �����ϥΪ̿�J���ܽЧ@�ҥ~�B�z, -2
				T.addGrade(Double.parseDouble(Input));
		}

		// �p�G��J����Ƥp��2, ���|�L���G
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
