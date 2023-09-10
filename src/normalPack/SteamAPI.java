package normalPack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamAPI {
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList (4,5,6,7) ; 
		Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer n ) {
				System.out.println(n);
			}
		} ; 
		
		Consumer<Integer> con1 = (Integer n ) ->
				System.out.print(n + " ");
			
		Consumer<Integer> con2 =  n  -> System.out.println(n);
			
		list.forEach(x -> System.out.println(x) ) ; 
		list.forEach(con);
		list.forEach(con1);
		System.out.println();
		System.out.println("Streams ");
		
		//Stream 
		List <Integer> list1 = Arrays.asList (4,5,6,7,2,9) ; 
		Stream <Integer>s1 = list1.stream() ; 
		
		Stream s2 = list1.stream() ; 		///compiletime error because we can not use streamfor double 
		System.out.println(s1 ); 
		//System.out.println(s2);				///compiletime error because we can not use streamfor double
		s1.forEach(x -> System.out.print( x +" "));
		//s1.forEach(x -> System.out.print( x +" "));		//runtime error because we can not use streamfor double
			
		
		Stream<Integer> s3 = list1.stream() ; 
		//filters 
		 
		Stream <Integer> s4 = s3.filter(j -> j%2 ==0) ; 
		//s4.forEach(x -> System.out.print(x + " "));
		
		//map 
		Stream<Integer> s5 = s4.map(x -> x*2) ; 
		int result = s5.reduce(0 , (c,e) ->c+e) ; 
		
		System.out.println("result "+ result);
		
		//direct 
		int result1 = list1.stream().filter(n-> n%2==0 )
				.map(n -> n*2)
				.reduce(0, (b,e) -> b+e) ;
		System.out.println(result1);
		

	}
}
