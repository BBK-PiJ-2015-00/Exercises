public class Matrix {
	private int[][] matrix;
	private final int a;
	private final int b;
	
	public Matrix(int a, int b) {
		this.matrix = new int[a][b];
		this.a = a;
		this.b = b;
		for(int i=0; i < a; i++) {
			for(int j=0; j < b; j++) {
				this.matrix[i][j] = 1;
			}
		}
	}
	
	public void setElement(int a, int b, int set) {
		if(a>this.a||b>this.b) {
			System.out.println ("invalid indices");
			return;
		}
		
		this.matrix[a][b] = set;
	}
	
	public void setRow(int a, String s) {
		String[] numList = s.split(",");
				
		if(a>this.a || numList.length>this.b) {
			System.out.println ("invalid indices");
			return;
		}
		
		for(int i = 0; i < numList.length; i++) {
			String num = numList[i];
			this.matrix[a][i] = Integer.parseInt(num);
		}
	}
	
	public void setColumn(int b, String s) {
		String[] numList = s.split(",");
				
		if(numList.length>this.a || b>this.b) {
			System.out.println ("invalid indices");
			return;
		}
		
		for(int i = 0; i < numList.length; i++) {
			String num = numList[i];
			this.matrix[i][b] = Integer.parseInt(num);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		for(int i = 0; i < this.a; i++) {
			for(int j = 0; j < this.b; j++) {
				sb.append(this.matrix[i][j]);
				if(i==this.a-1 && j==this.b-1)
					sb.append("]");
				else if (j < this.b-1)
					sb.append(",");
				else
					sb.append(";");
			}
		}
		
		return sb.toString();
	}
	
	public void prettyPrint() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < this.a; i++) {
			for(int j = 0; j < this.b; j++) {
				sb.append(this.matrix[i][j]);
				if (j < this.b-1)
					sb.append("\t");
				else
					sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}





















