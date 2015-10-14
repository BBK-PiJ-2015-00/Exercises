ArrayCopier AC = new ArrayCopier();

int x = 2;
int[] src = new int[4];
src[0] = 1;
src[1] = 2;
src[2] = 3;
src[3] = 4;
int[] dst = new int[x];

int[] newArray = AC.copy(src,dst);

for(int i = 0; i < newArray.length; i++) {
	println (newArray[i]);
}