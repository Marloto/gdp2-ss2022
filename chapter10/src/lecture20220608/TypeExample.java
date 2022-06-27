package lecture20220608;

interface G<T, K> {
	K doThings(T a, T b);
}

public class TypeExample {
	public static void main(String[] args) {
		G<Integer, String> foo;
	}
}
