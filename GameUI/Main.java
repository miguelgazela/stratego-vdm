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
	}
}
