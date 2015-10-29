import java.util.Scanner;

public class differ {

	public static void main(String[] args) {
		

		int n;

		System.out.print("Enter the number of coins:");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		int[] a = new int[n];
		int[] d = new int[0];

		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		int s;
		s = conditionOne(a, d, 0);
		System.out.println("Need " + s + " total weighings.");

		input.close();
	}

	public static int conditionOne(int[] a, int[] d, int depth) {

		int noa = a.length, nod = d.length, max = 0;

		if (noa <= 2) { // basic status
			if (noa == 1) {

				printSpace(depth);
				System.out.print("Put " + a[0] + " on the left side and "
						+ d[0] + " on the right side.\n");

				printSpace(depth);
				System.out.print("If right side is heavier.\n");

				printSpace(depth + 1);
				System.out.println(a[0]
						+ " is the \"different\" coin and lighter.");

				printSpace(depth);
				System.out.print("If balance.\n");

				printSpace(depth + 1);
				System.out.println("That could not happen.");

				printSpace(depth);
				System.out.print("If left side is heavier.\n");

				printSpace(depth + 1);
				System.out.println(a[0]
						+ " is the \"different\" coin and heavier.");

				return depth + 1;

			} else {

				printSpace(depth);
				System.out.print("Put " + a[0] + " on the left side and "
						+ d[0] + " on the right side.\n");

				printSpace(depth);
				System.out.print("If right side is heavier.\n");

				printSpace(depth + 1);
				System.out.println(a[0]
						+ " is the \"different\" coin and lighter.");

				printSpace(depth);
				System.out.print("If balance.\n");

				printSpace(depth + 1);
				System.out.print("Put " + a[1] + " on the left side and "
						+ d[0] + " on the right side.\n");

				printSpace(depth + 1);
				System.out.print("If right side is heavier.\n");

				printSpace(depth + 2);
				System.out.println(a[1]
						+ " is the \"different\" coin and lighter.");

				printSpace(depth + 1);
				System.out.print("If balance.\n");

				printSpace(depth + 2);
				System.out.println("That could not happen.");

				printSpace(depth + 1);
				System.out.print("If left side is heavier.\n");

				printSpace(depth + 2);
				System.out.println(a[1]
						+ " is the \"different\" coin and heavier.");
				
				printSpace(depth);
				System.out.print("If left side is heavier.\n");

				printSpace(depth + 1);
				System.out.println(a[0]
						+ " is the \"different\" coin and heavier.");

				return depth + 2;
			}

		}

		int temp;
		if (noa % 3 == 2) {
			temp = (noa / 3) * 2 + 1;
		} else {
			temp = (noa / 3) * 2 + noa % 3;
		}

		if (nod >= temp) { // ------------------------------------------------------------------

			int[] f = new int[temp];
			int[] s = new int[noa - temp];

			for (int i = 0; i < temp; i++) {
				f[i] = a[i];
			}

			for (int i = 0; i < noa - temp; i++) {
				s[i] = a[temp + i];
			}

			printSpace(depth);

			// print two sides' coins
			System.out.print("Put " + f[0]);

			for (int i = 1; i < temp; i++) {
				System.out.print("," + f[i]);

			}

			System.out.print(" on the left side and " + d[0]);

			for (int i = 1; i < temp; i++) {
				System.out.print("," + d[i]);
			}

			System.out.print(" on the right side.\n");

			// cases

			// right
			// heavier------------------------------------------------------------------

			if (true) {
				printSpace(depth);

				System.out.print("If right side is heavier.\n");

				int[] c = new int[0];
				int[] nd = new int[noa + nod - temp];

				for (int i = 0; i < nod; i++) {
					nd[i] = d[i];
				}
				for (int i = 0; i < noa - temp; i++) {
					nd[nod + i] = s[i];
				}

				max = conditionTwo(f, c, nd, depth + 1);

			}
			// balance------------------------------------------------------------------

			if (true) {
				printSpace(depth);

				System.out.print("If balance.\n");

				int[] nd = new int[temp + nod];
				for (int i = 0; i < nod; i++) {
					nd[i] = d[i];
				}
				for (int i = 0; i < temp; i++) {
					nd[nod + i] = f[i];
				}

				int m;
				m = conditionOne(s, nd, depth + 1);
				if (max < m) {
					max = m;
				}
			}
			// left
			// heavier------------------------------------------------------------------

			if (true) {

				printSpace(depth);
				System.out.print("If left side is heavier.\n");

				int[] b = new int[0];
				int[] nd = new int[noa + nod - temp];

				for (int i = 0; i < nod; i++) {
					nd[i] = d[i];
				}
				for (int i = 0; i < noa - temp; i++) {
					nd[nod + i] = s[i];
				}

				int m;
				m = conditionTwo(b, f, nd, depth + 1);
				if (max < m) {
					max = m;
				}

			}
			return max;

		} else { // ------------------------------------------------------------------

			int nof, nos, not;
			if (noa % 3 == 2) {
				nof = noa / 3 + 1;
				nos = noa / 3 + 1;
				not = noa / 3;
			} else {
				nof = noa / 3;
				nos = noa / 3;
				not = noa / 3 + noa % 3;
			}

			int[] f = new int[nof];
			int[] s = new int[nos];
			int[] t = new int[not];

			for (int i = 0; i < nof; i++) {
				f[i] = a[i];
			}
			for (int i = 0; i < nos; i++) {
				s[i] = a[nof + i];
			}
			for (int i = 0; i < not; i++) {
				t[i] = a[nof + nos + i];
			}

			printSpace(depth);

			// print two sides' coins
			System.out.print("Put " + f[0]);

			for (int i = 1; i < nof; i++) {
				System.out.print("," + f[i]);

			}

			System.out.print(" on the left side and " + s[0]);

			for (int i = 1; i < nos; i++) {
				System.out.print("," + s[i]);

			}

			System.out.print(" on the right side.\n");

			// cases

			// right
			// heavier------------------------------------------------------------------

			// print spaces
			if (true) {

				printSpace(depth);
				System.out.print("If right side is heavier.\n");

				int[] nd = new int[not + nod];

				for (int i = 0; i < nod; i++) {
					nd[i] = d[i];
				}
				for (int i = 0; i < not; i++) {
					nd[nod + i] = t[i];
				}

				max = conditionTwo(f, s, nd, depth + 1);
			}
			// balance------------------------------------------------------------------

			if (true) {

				printSpace(depth);
				System.out.print("If balance.\n");

				int[] nd = new int[nof + nos + nod];
				for (int i = 0; i < nod; i++) {
					nd[i] = d[i];
				}
				for (int i = 0; i < nof; i++) {
					nd[nod + i] = f[i];
				}
				for (int i = 0; i < nos; i++) {
					nd[nod + nof + i] = s[i];
				}

				int m;
				m = conditionOne(t, nd, depth + 1);
				if (max < m) {
					max = m;
				}
			}
			// left
			// heavier------------------------------------------------------------------

			if (true) {

				printSpace(depth);
				System.out.print("If left side is heavier.\n");

				int[] nd = new int[not + nod];

				for (int i = 0; i < nod; i++) {
					nd[i] = d[i];
				}
				for (int i = 0; i < not; i++) {
					nd[nod + i] = t[i];
				}

				int m;
				m = conditionTwo(s, f, nd, depth + 1);
				if (max < m) {
					max = m;
				}

			}
			return max;
		}

	}

	public static int conditionTwo(int[] b, int[] c, int[] d, int depth) {

		int nob = b.length, noc = c.length, nod = d.length, max = 0;
		if (nob + noc <= 2) { // basic status

			if (nob + noc == 1) {

				printSpace(depth);
				if (nob == 1) {
					System.out.println(b[0]
							+ " is the \"different\" coin and lighter.");
					return depth;
				} else {
					System.out.println(c[0]
							+ " is the \"different\" coin and heavier.");
					return depth;
				}
			} else {

				if (nob == 0) {

					printSpace(depth);
					System.out.print("Put " + c[0] + " on the left side and "
							+ d[0] + " on the right side.\n");

					printSpace(depth);
					System.out.print("If right side is heavier.\n");

					printSpace(depth + 1);
					System.out.println("That could not happen.");

					printSpace(depth);
					System.out.print("If balance.\n");

					printSpace(depth + 1);
					System.out.println(c[1]
							+ " is the \"different\" coin and heavier.");

					printSpace(depth);
					System.out.print("If left side is heavier.\n");

					printSpace(depth + 1);
					System.out.println(c[0]
							+ " is the \"different\" coin and heavier.");

					return depth + 1;

				}
				if (nob == 1) {

					printSpace(depth);
					System.out.print("Put " + b[0] + " on the left side and "
							+ d[0] + " on the right side.\n");

					printSpace(depth);
					System.out.print("If right side is heavier.\n");

					printSpace(depth + 1);
					System.out.println(b[0]
							+ " is the \"different\" coin and lighter.");

					printSpace(depth);
					System.out.print("If balance.\n");

					printSpace(depth + 1);
					System.out.println(c[0]
							+ " is the \"different\" coin and heavier.");

					printSpace(depth);
					System.out.print("If left side is heavier.\n");

					printSpace(depth + 1);
					System.out.println("That could not happen.");

					return depth + 1;

				}
				if (nob == 2) {

					printSpace(depth);
					System.out.print("Put " + b[0] + " on the left side and "
							+ d[0] + " on the right side.\n");

					printSpace(depth);
					System.out.print("If right side is heavier.\n");

					printSpace(depth + 1);
					System.out.println(b[0]
							+ " is the \"different\" coin and lighter.");

					printSpace(depth);
					System.out.print("If balance.\n");

					printSpace(depth + 1);
					System.out.println(b[1]
							+ " is the \"different\" coin and lighter.");

					printSpace(depth);
					System.out.print("If left side is heavier.\n");

					printSpace(depth + 1);
					System.out.println("That could not happen.");

					return depth + 1;

				}
				return depth + 1;

			}
		}

		int n = nob + noc;
		int nof, nos, not;
		if (n % 3 == 2) {
			nof = n / 3 + 1;
			nos = n / 3 + 1;
			not = n / 3;
		} else {
			nof = n / 3;
			nos = n / 3;
			not = n / 3 + n % 3;
		}

		int[] f = new int[nof];
		int[] s = new int[nos];
		int[] t = new int[not];

		if (nob >= 2 * nof) { // larger than or equal to twice
			for (int i = 0; i < nof; i++) {
				f[i] = b[i];
			}
			for (int i = 0; i < nos; i++) {
				s[i] = b[nof + i];
			}
			if (nob == 2 * nof) { // equal to twice
				for (int i = 0; i < not; i++) {
					t[i] = c[i];
				}
			} else { // larger than twice
				for (int i = 0; i < nob - 2 * nof; i++) {
					t[i] = b[2 * nof + i];
				}
				for (int i = 0; i < noc; i++) {
					t[nob - 2 * nof + i] = c[i];
				}
			}
		} else { // less than twice
			if (nob % 2 == 0) { // even number
				if (nob == 0) { // 0
					for (int i = 0; i < nof; i++) {
						f[i] = c[i];
					}
					for (int i = 0; i < nos; i++) {
						s[i] = c[nof + i];
					}
					for (int i = 0; i < not; i++) {
						t[i] = c[nof + nos + i];
					}
				} else { // nonzero
					for (int i = 0; i < nob / 2; i++) {
						f[i] = b[i];
						s[i] = b[nob / 2 + i];
					}
					for (int i = 0; i < nof - nob / 2; i++) {
						f[nob / 2 + i] = c[i];
						s[nob / 2 + i] = c[nof - nob / 2 + i];
					}
					for (int i = 0; i < not; i++) {
						t[i] = c[2 * nof - nob + i];
					}
				}

			} else { // odd number
				for (int i = 0; i < nob / 2; i++) {
					f[i] = b[i];
					s[i] = b[nob / 2 + i];
				}
				for (int i = 0; i < nof - nob / 2; i++) {
					f[nob / 2 + i] = c[i];
					s[nob / 2 + i] = c[nof - nob / 2 + i];
				}
				t[0] = b[nob - 1];
				for (int i = 1; i < not; i++) {
					t[i] = c[2 * nof - nob + i];
				}
			}

		}
		// 分组结束------------------------------------------------------------------

		// 打印分组

		printSpace(depth);
		System.out.print("Put " + f[0]);

		for (int i = 1; i < nof; i++) {
			System.out.print("," + f[i]);
		}

		System.out.print(" on the left side and " + s[0]);

		for (int i = 1; i < nos; i++) {
			System.out.print("," + s[i]);
		}

		System.out.print(" on the right side.\n");

		// 情况分类

		// 右边重------------------------------------------------------------------

		if (true) {

			printSpace(depth);
			System.out.print("If right side is heavier.\n");

			int nonb = 0;
			for (int i = 0; i < nof; i++) {
				int state = 0;
				for (int j = 0; j < nob; j++) {
					if (f[i] == b[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nonb++;
				}
			}

			int[] nb = new int[nonb];
			int[] nc = new int[nof - nonb];
			int[] nd = new int[nof + not + nod];

			int index = 0;
			int indexnd = 0;
			for (int i = 0; i < nof; i++) {
				int state = 0;
				for (int j = 0; j < nob; j++) {
					if (f[i] == b[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nb[index] = f[i];
					index++;
				} else {
					nd[indexnd] = f[i];
					indexnd++;
				}
			}

			index = 0;
			for (int i = 0; i < nos; i++) {
				int state = 0;
				for (int j = 0; j < noc; j++) {
					if (s[i] == c[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nc[index] = s[i];
					index++;
				} else {
					nd[indexnd] = s[i];
					indexnd++;
				}
			}

			for (int i = 0; i < not; i++) {
				nd[indexnd] = t[i];
				indexnd++;
			}

			for (int i = 0; i < nod; i++) {
				nd[indexnd] = d[i];
				indexnd++;
			}

			max = conditionTwo(nb, nc, nd, depth + 1);
		}

		// balance------------------------------------------------------------------

		if (true) {

			printSpace(depth);
			System.out.print("If balance.\n");

			int nonb = 0;
			for (int i = 0; i < not; i++) {
				int state = 0;
				for (int j = 0; j < nob; j++) {
					if (t[i] == b[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nonb++;
				}
			}

			int[] nb = new int[nonb];
			int[] nc = new int[not - nonb];
			int[] nd = new int[nof + nos + nod];

			int indexnb = 0;
			int indexnc = 0;
			for (int i = 0; i < not; i++) {
				int state = 0;
				for (int j = 0; j < nob; j++) {
					if (t[i] == b[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nb[indexnb] = t[i];
					indexnb++;
				} else {
					nc[indexnc] = t[i];
					indexnc++;
				}
			}

			int indexnd = 0;
			for (int i = 0; i < nof; i++) {
				nd[indexnd] = f[i];
				indexnd++;
			}

			for (int i = 0; i < nos; i++) {
				nd[indexnd] = s[i];
				indexnd++;
			}

			for (int i = 0; i < nod; i++) {
				nd[indexnd] = d[i];
				indexnd++;
			}

			int m;
			m = conditionTwo(nb, nc, nd, depth + 1);
			if (max < m) {
				max = m;
			}
		}

		// left
		// heavier------------------------------------------------------------------

		if (true) {

			printSpace(depth);
			System.out.print("If left side is heavier.\n");

			int nonb = 0;
			for (int i = 0; i < nos; i++) {
				int state = 0;
				for (int j = 0; j < nob; j++) {
					if (s[i] == b[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nonb++;
				}
			}

			int[] nb = new int[nonb];
			int[] nc = new int[nof - nonb];
			int[] nd = new int[nof + not + nod];

			int index = 0;
			int indexnd = 0;
			for (int i = 0; i < nos; i++) {
				int state = 0;
				for (int j = 0; j < nob; j++) {
					if (s[i] == b[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nb[index] = s[i];
					index++;
				} else {
					nd[indexnd] = s[i];
					indexnd++;
				}
			}

			index = 0;
			for (int i = 0; i < nof; i++) {
				int state = 0;
				for (int j = 0; j < noc; j++) {
					if (f[i] == c[j]) {
						state = 1;
						break;
					}
				}
				if (state == 1) {
					nc[index] = f[i];
					index++;
				} else {
					nd[indexnd] = f[i];
					indexnd++;
				}
			}

			for (int i = 0; i < not; i++) {
				nd[indexnd] = t[i];
				indexnd++;
			}

			for (int i = 0; i < nod; i++) {
				nd[indexnd] = d[i];
				indexnd++;
			}

			int m;
			m = conditionTwo(nb, nc, nd, depth + 1);
			if (max < m) {
				max = m;
			}
		}

		return max;
	}

	public static void printSpace(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("  ");
		}
	}

}
