package collection;

//컬렉션(Collection) 프레임워크란 무엇인지 개념을 설명해보시오.

//[0] : 컬렉션 선수학습 --> OOP, 추상 클래스, 상속, 인터페이스, 제네릭 등에 대한 학습
//본 과정은 컬렉션에 대한 개념과 ArrayList 클래스 위주로 진행.

//[1] : Collection Framework란?
//"수집품"이라는 사전적 의미에서 유추할 수 있듯이 "데이터 값들을 담는 여러 그릇" 정도로 이해
//어떤 자료구조 데이터를 저장하고 관리할 것인지에 따라서 컬렉션내 맞는 클래스를 활용 필요. => 파이썬에서도 마찬가지 
//컬렉션 프레임워크는 크게 봤을 때 Collection과 Map으로 나뉨 : 모두 인터페이스(Interface)로 되어 있다.  
// 1. Collection : 상속받아 다양한 형태의 배열(클래스)로 사용 
// 		1.1 List(Interface)
//		1.2 Set(Interface)
// 2. Map


//[2] : Collection
//Collection(인터페이스) --> 상속 --> List와 Set으로 구분(인터페이스) --> 상속 --> List 계열 구현 클래스 vs Set 계열 구현 클래스
//List 계열 구현 클래스 	--> ArrayList, LinkedList, Vector, Stack
//Set 계열 구현 클래스 	--> HashSet, SortedSet, TreeSet


//[3] List vs Set
//컬렉션 프레임워크의 핵심 인터페이스들.
//List 인터페이스를 상속하는 클래스들 특징 --> (1)인덱스가 있고, (2)그래서 저장 순서가 유지되고, (3)데이터 중복이 허용.
//Set 인터페이스를 상속하는 클래스들 특징 	--> (1)데이터 중복이 허용 안됨. ex) 로또 추첨 프로그램

public class FrameworkBasic {
	public static void main(String[] args) {
		
	}
}
