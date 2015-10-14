public class ArrayCopier {
	int[] copy(int[] srcArray, int[] dstArray) {
		int srcSize = srcArray.length;
		int dstSize = dstArray.length;
		if (srcSize>=dstSize) {
			for(int i=0;i<dstSize;i++) {
			dstArray[i]=srcArray[i];
			}
		}
		else {
				for(int i=0;i<dstSize;i++) {
					if (i<srcSize) {
					dstArray[i]=srcArray[i];
					} else {
						dstArray[i]=0;
					}
				}
		}
		return dstArray;
	}
}