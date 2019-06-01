class Sort {
	public static void main(String[] args) {
		Number[] array = {0, 0.5, 23, -8, 1.76, 45, -200, -0.35};
		
		//bubbleSort(array);
		selectionSort(array);
		
		for (Number n : array) System.out.print(n + " ");
	}
	
	public static <T extends Number> void bubbleSort(T[] arr) { // o(n ^ 2)
		T tmp;
		
		while (!isSorted(arr)) { // or we can do that just n-1 times instead of checking every time
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].doubleValue() < arr[i - 1].doubleValue()) {
					tmp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
	}
	
	public static <T extends Number> void selectionSort(T[] arr) { // o(n ^ 2)
		if ((arr == null) || (arr.length == 1)) return;
		T min;
		int n;
		
		for (int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			n = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].doubleValue() < min.doubleValue()) {
					min = arr[j];
					n = j;
				}
			}
			
			arr[n] = arr[i];
			arr[i] = min;
		}
	}

	public static <T extends Number> boolean isSorted(T[] arr) {
		if ((arr == null) || (arr.length == 1)) return true;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].doubleValue() < arr[i - 1].doubleValue()) return false;
		}
		
		return true;
	}
}