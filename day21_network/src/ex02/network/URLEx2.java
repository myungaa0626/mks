package ex02.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {

	public static void main(String[] args)
				throws MalformedURLException {
		
//		URL url = new URL("https://www.google.com/search?q=kim+yuna&source=hp&ei=8hFGZMesIqHm2roPlM-6cA&iflsig=AOEireoAAAAAZEYgAtm83L6h4D2YewRI7bzb6HsihQBI&ved=0ahUKEwjH7e364sH-AhUhs1YBHZSnDg4Q4dUDCAk&uact=5&oq=kim+yuna&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEIAEMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCC4QgAQyBQgAEIAEOgsILhCABBDHARDRAzoICC4QgAQQ1AI6CwguEK8BEMcBEIAEOgcIABCABBAKUJHoBFiT9ARgqfUEaAJwAHgAgAFniAHSBZIBAzcuMZgBAKABAbABAA&sclient=gws-wiz"); // 예외 발생
		URL url = new URL("https://search.daum.net/search?nil_suggest=sugsch&w=tot&DA=GIQ&sq=kim+yuna&o=1&sugo=2&q=kim+yuna");
	//	https://www.google.com/
	//  search?
	//  q=kim+yuna    // 속성=값&속성=값2&속성=값3,...
	//	&source=hp&ei=8hFGZMesIqHm2roPlM-6cA&iflsig=AOEireoAAAAAZEYgAtm83L6h4D2YewRI7bzb6HsihQBI
	//	&ved=0ahUKEwjH7e364sH-AhUhs1YBHZSnDg4Q4dUDCAk
	//	&uact=5
	//	&oq=kim+yuna
	//	&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEIAEMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCC4QgAQyBQgAEIAEOgsILhCABBDHARDRAzoICC4QgAQQ1AI6CwguEK8BEMcBEIAEOgcIABCABBAKUJHoBFiT9ARgqfUEaAJwAHgAgAFniAHSBZIBAzcuMZgBAKABAbABAA
	//	&sclient=gws-wiz
		
	// URL이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : "+ url.getProtocol());
		System.out.println("호스트와 포트 : "+ url.getAuthority());
		System.out.println("호스트 : "+ url.getHost());
		System.out.println("포트  : "+ url.getPort());
		System.out.println("경로 : "+ url.getPath());
		System.out.println("질의 : "+ url.getQuery());
		System.out.println("파일명 : "+ url.getFile());
		System.out.println("참조 : "+ url.getRef());
	}
}
