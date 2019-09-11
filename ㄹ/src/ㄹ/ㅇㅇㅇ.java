package ㄹ;

import java.math.BigDecimal;

public class ㅇㅇㅇ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i =102;
		
		String str = "187";
		System.out.printf(str+ 90);
		
		int su = Integer.parseInt(str);
		System.out.println(su+ 90);
		//문자열을 숫자로 변경할 때는 변경할 수 없는문자가 있거나 공백
		//이 있으면 NumberFormatException 이 발생
		
		su = Integer.parseInt("189");
		//double 소수 15ㄱ자리 까지만 인식
		// 아래의 경우는 2.0 이 나옴
		
		double d1 = 1.000000000000000000001;
		double d2 = 1.000000000000000000003;
		System.out.println(d1 + d2);
	
		//위 의 연산을 BigDecimal 로 해결
	 BigDecimal b1 = new BigDecimal(
			 "1.000000000000000000001");
	 BigDecimal b2 = new BigDecimal(
			 "1.000000000000000000003");
	 System.out.println(b1.add(b2));
	}
	

}
