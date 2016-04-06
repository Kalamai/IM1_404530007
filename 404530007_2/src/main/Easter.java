package main;

public class Easter {
	static String calculateEaster(int Y) {
		int Month, Day;

		// 以下演算法看起來不像是Gauss演算法喔, 等第從B開始.
		int C = (Y / 100) + 1;
		int G = (Y % 19) + 1;
		int X = (3 * C / 4) - 12;
		int Z = ((8 * C + 5) / 25) - 5;
		int D = ((5 * Y) / 4) - X - 10;
		int E = (11 * G + 20 + Z - X) % 30;

		if (E == 25 && G > 11) {
			E = 1 + E;
		}

		if (E == 24) {
			E = 1 + E;
		}

		int N = 44 - E;

		if (21 > N) {
			N = 30 + N;
		}

		int S = (N + 7) - ((D + N) % 7);

		if (S > 31) {
			Month = 4;
			Day = S - 31;
		}

		else {
			Month = 3;
			Day = S;
		}
		return "In" + Y + ", Easter Sunday is : month =" + Month + "and Day = " + Day;
	}

}
