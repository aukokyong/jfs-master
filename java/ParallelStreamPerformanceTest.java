import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		serialStreamPerformance(100000);
		parallelStreamPerformance(100000);
	}

	private static void serialStreamPerformance(int count) {
		// Set up the collection with data
		List<Integer> productList = new ArrayList<Integer>();
		productList.add(1000);
		for (int i = 0; i < count ; i++) {
			int lastvalue = productList.get(i);
			productList.add(lastvalue + 1000);
		}

		System.out.println("Input List --> " + productList);
		long start = System.nanoTime();
		List serialProductList = new ArrayList();
		Stream<Integer> productListStream = productList.stream();
		Stream<Integer> productListFilteredStream = productListStream.filter(product -> product > 3000);
		productListFilteredStream.forEach((product) -> {
//			//System.out.println("Thread Name --> " + Thread.currentThread().getName());
			serialProductList.add(product);
		});
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println("Serial Performance " + timeElapsed);
		//System.out.println("Serial List " + serialProductList);
	}
	private static void parallelStreamPerformance(int count) {
		// Set up the collection with data
		List<Integer> productList = new ArrayList<Integer>();
		productList.add(1000);
		for (int i = 0; i < count; i++) {
			int lastvalue = productList.get(i);
			productList.add(lastvalue + 1000);
		}

		System.out.println("Input List --> " + productList);
		long start = System.nanoTime();
		List parallelProductList = new ArrayList();
		Stream<Integer> productListStream = productList.parallelStream();
		Stream<Integer> productListFilteredStream = productListStream.filter(product -> product > 3000);
		productListFilteredStream.forEach((product) -> {
//			//System.out.println("Thread Name --> " + Thread.currentThread().getName());
			parallelProductList .add(product);
		});
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println("Parallel Performance " + timeElapsed);
		//System.out.println("Parallel List " + serialProductList);
	}
}


