package GameUI;

import java.util.List;
import java.util.Scanner;

import aurelienribon.slidinglayout.SLAnimator;
import GameLogic.*;

import jp.vdmtools.VDM.CGException;


public class Main {
	public static void main(String[] args) {
		System.out.println("Starting game!");
		SLAnimator.start();
		new UIGame();
		
//		Main self = new Main();
//		Scanner in = new Scanner(System.in);
//		int initialX, initialY, finalX, finalY;
//		
//		try {
//			Stratego stratego = new Stratego();
//			stratego.placeInitialPieces();
//			
//			while(true) {
//				System.out.println("Current player: "+stratego.getCurrentPlayer().getName());
//				self.printBoard(stratego.getBoard());
//				
//				System.out.println("Enter move coordinates <initialX> <initialY> <finalX> <finalY>");
//				initialX = in.nextInt();
//				initialY = in.nextInt();
//				finalX = in.nextInt();
//				finalY = in.nextInt();
//				
//				System.out.printf("Making move from (%d %d) to (%d %d)\n", initialX, initialY, finalX, finalY);
//				Number moveResult = stratego.makeMove(new Coord(initialX, initialY), new Coord(finalX, finalY));
//				
//				if(moveResult.intValue() == 0) {
//					if(stratego.isGameOver()) {
//						break;
//					} else {
//						stratego.updateTurn();
//					}
//				} else {
//					System.out.printf("Invalid Move: %d\n", moveResult.intValue());
//				}
//			}
//		} catch (CGException e) {
//			e.printStackTrace();
//		}
	}
	
	private void printBoard(Board b) throws CGException {
		List gameBoard = b.getBoard();
		
		System.out.printf("    %3d%3d%3d%3d%3d%3d%3d%3d%3d%3d\n", 1,2,3,4,5,6,7,8,9,10);
		System.out.println("------------------------------------");
		
		for(int rowIndex = 0; rowIndex < gameBoard.size(); rowIndex++) {
			List row = ((List)gameBoard.get(rowIndex));
			System.out.printf("%2d |", rowIndex+1);
			
			for(int i = 0; i < row.size(); i++) {
				Object piece = row.get(i);
				if(piece != null) {
					System.out.printf("%3d", ((Piece)piece).getRank());
				} else {
					System.out.printf("%3s", "X");
				}
			}
			System.out.println("");
		}
	}
}
