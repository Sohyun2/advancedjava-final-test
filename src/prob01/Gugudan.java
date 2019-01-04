package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		// 두 수의 랜던 값 구하기
		int l = randomize( 1, 9 ); // 6
		int r = randomize( 1, 9 ); // 9
		
		resultNumber = l * r; // 랜덤 값의 정답

		int[] answerNumbers = randomizeAnswers(); //{81, 12, 32, 18, 54, 4, 32, 6, 32}
		int loc = randomize( 0, 8 ); // 정답을 배열 인덱스 중 어디에 넣을 것인지 랜덤하게 구함.
		answerNumbers[ loc ] = resultNumber;
		
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}

		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in );
		//
		//  이 부분에 적당한 코드를 작성합니다.  
		//
		
		int answer = s.nextInt();
		
		if(resultNumber == answer) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
	}

	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	// 9개의 정답을 랜덤하게 구하는 함수
	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81; // 랜덤 값의 최대 범위
		
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ]; //9개의 랜덤값을 저장하기 위한 배열 생성
		int occupied = 0; 
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false; // 배열에 담긴 값 중 random값과 같은 값이 있는지 확인하는 flag
	        
	        // 랜덤값 중에서 중복된 값이 있으면 다시 돌림
	        for( int i = 0; i < occupied; i++ ) {
	        	if( resultNumber == boardNumbers[i] ) {
	        		evaluted = true;
	        		break;
	        	}
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	
}
