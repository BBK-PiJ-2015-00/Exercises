Matrix matrix = new Matrix(4,5);

String s = matrix.toString();

println (s + "\n");

matrix.setElement(1,3,5);
matrix.setRow(0,"2,2,3,2,2");
matrix.setColumn(2,"4,4,4");

matrix.prettyPrint();