import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gridint[][] = new int[5][5];
		
		//setup of vertices grid
		//first row
		gridint[0][0] = 2;
		gridint[0][1] = 3;
		gridint[0][2] = 3;
		gridint[0][3] = 3;
		gridint[0][4] = 2;
		
		//second row
		gridint[1][0] = 2;
		gridint[1][1] = 3;
		gridint[1][2] = 4;
		gridint[1][3] = 3;
		gridint[1][4] = 2;
		
		//third row
		gridint[2][0] = 2;
		gridint[2][1] = 3;
		gridint[2][2] = 4;
		gridint[2][3] = 3;
		gridint[2][4] = 2;
		
		//fourth row
		gridint[3][0] = 2;
		gridint[3][1] = 3;
		gridint[3][2] = 4;
		gridint[3][3] = 3;
		gridint[3][4] = 2;
		
		//fifth row
		gridint[4][0] = 2;
		gridint[4][1] = 3;
		gridint[4][2] = 3;
		gridint[4][3] = 3;
		gridint[4][4] = 2;
		
		
		System.out.print(Arrays.deepToString(gridint).replace("],","\n").replaceAll("[\\[\\]]", " "));
		System.out.print("\n \n");
		char grid[][] = new char[5][5];
		
		//setting up pieces
		grid[0][0] = 'X';
		grid[4][4] = 'O';
		System.out.print(Arrays.deepToString(grid).replace("],","]\n"));
		
		//setting movement variables
		int XmoveX = 0;
		int XmoveY = 0;
		int OmoveX = 4;
		int OmoveY = 4;
		int prevXmoveX = 0;
		int prevXmoveY = 0;
		int prevOmoveX = 4;
		int prevOmoveY = 4;
		
		int move1X = 4;
		int move1Y = 4;
		int move2X = 4;
		int move2Y = 4;
		int move3X = 4;
		int move3Y = 4;
		int move4X = 4;
		int move4Y = 4;
		int move5X = 4;
		int move5Y = 4;
		int move6X = 4;
		int move6Y = 4;
		int move7X = 4;
		int move7Y = 4;
		int move8X = 4;
		int move8Y = 4;
		boolean viable1 = true;
		boolean viable2 = true;
		boolean viable3 = true;
		boolean viable4 = true;
		boolean viable5 = true;
		boolean viable6 = true;
		boolean viable7 = true;
		boolean viable8 = true;
	
		int cmove1X = 0;
		int cmove1Y = 0;
		int cmove2X = 0;
		int cmove2Y = 0;
		int cmove3X = 0;
		int cmove3Y = 0;
		int cmove4X = 0;
		int cmove4Y = 0;
		int cmove5X = 0;
		int cmove5Y = 0;
		int cmove6X = 0;
		int cmove6Y = 0;
		int cmove7X = 0;
		int cmove7Y = 0;
		int cmove8X = 0;
		int cmove8Y = 0;
		boolean cviable1 = true;
		boolean cviable2 = true;
		boolean cviable3 = true;
		boolean cviable4 = true;
		boolean cviable5 = true;
		boolean cviable6 = true;
		boolean cviable7 = true;
		boolean cviable8 = true;
		
		boolean moved = false;
		boolean cdeath = false;
		boolean cmoved1 = false;
		boolean cmoved2 = false;
		boolean cmoved3 = false;
		boolean cmoved4 = false;
		boolean cmoved5 = false;
		boolean cmoved6 = false;
		boolean cmoved7 = false;
		boolean cmoved8 = false;
		
		boolean cshow1 = false;
		boolean cshow2 = false;
		boolean cshow3 = false;
		boolean cshow4 = false;
		boolean cshow5 = false;
		boolean cshow6 = false;
		boolean cshow7 = false;
		boolean cshow8 = false;
		
		
		boolean amoved = false;
		boolean amoved1 = false;
		boolean amoved2 = false;
		boolean amoved3 = false;
		boolean amoved4 = false;
		boolean amoved5 = false;
		boolean amoved6 = false;
		boolean amoved7 = false;
		boolean amoved8 = false;
		boolean ashow1 = false;
		boolean ashow2 = false;
		boolean ashow3 = false;
		boolean ashow4 = false;
		boolean ashow5 = false;
		boolean ashow6 = false;
		boolean ashow7 = false;
		boolean ashow8 = false;
		
		
		int stepcounter = 0;
		boolean gamestop = false;
		
		while(gamestop == false) {
			if (stepcounter > 40) {
				gamestop = true;
			}
			//setting up pieces
			//grid[XmoveY][XmoveX] = 'X';
			//grid[4][4] = 'O';
			System.out.print(Arrays.deepToString(grid).replace("],","]\n"));
			System.out.print("\n\n");
			stepcounter += 1;
			//if(stepcounter != 0 && stepcounter%2 == 1) {
				//grid[prevXmoveY][prevXmoveX] = 'B';
			//}
			if(stepcounter%2 == 1) {
				moved = false;
				cmoved1 = false;
				cmoved2 = false;
				cmoved3 = false;
				cmoved4 = false;
				cmoved5 = false;
				cmoved6 = false;
				cmoved7 = false;
				cmoved8 = false;
				cshow1 = false;
				cshow2 = false;
				cshow3 = false;
				cshow4 = false;
				cshow5 = false;
				cshow6 = false;
				cshow7 = false;
				cshow8 = false;
				System.out.print("\nCPU Turn\n");
				
				//SIDELEFT MOVE (1)
				cviable1 = true;
				cmove1X = XmoveX-2;
				cmove1Y = XmoveY-1;
				if (cmove1X < 0) {
					cviable1 = false;
				}
				if (cmove1Y < 0) {
					cviable1 = false;
				}
				if (cmove1X > 4) {
					cviable1 = false;
				}
				if (cmove1Y > 4) {
					cviable1 = false;
				}
				
				//TOPLEFT MOVE (2)
				cviable2 = true;
				cmove2X = XmoveX-1;
				cmove2Y = XmoveY-2;
				if (cmove2X < 0) {
					cviable2 = false;
				}
				if (cmove2Y < 0) {
					cviable2 = false;
				}
				if (cmove2X > 4) {
					cviable2 = false;
				}
				if (cmove2Y > 4) {
					cviable2 = false;
				}
				
				
				//TOPRIGHT MOVE (3)
				cviable3 = true;
				cmove3X = XmoveX+1;
				cmove3Y = XmoveY-2;
				if (cmove3X < 0) {
					cviable3 = false;
				}
				if (cmove3Y < 0) {
					cviable3 = false;
				}
				if (cmove3X > 4) {
					cviable3 = false;
				}
				if (cmove3Y > 4) {
					cviable3 = false;
				}
				
				//SIDERIGHT MOVE (4)
				cviable4 = true;
				cmove4X = XmoveX+2;
				cmove4Y = XmoveY-1;
				if (cmove4X < 0) {
					cviable4 = false;
				}
				if (cmove4Y < 0) {
					cviable4 = false;
				}
				if (cmove4X > 4) {
					cviable4 = false;
				}
				if (cmove4Y > 4) {
					cviable4 = false;
				}
				
				//SIDERIGHT BOTTOM MOVE (5)
				cviable5 = true;
				cmove5X = XmoveX +2;
				cmove5Y = XmoveY +1;
				if (cmove5X < 0) {
					cviable5 = false;
				}
				if (cmove5Y < 0) {
					cviable5 = false;
				}
				if (cmove5X > 4) {
					cviable5 = false;
				}
				if (cmove5Y > 4) {
					cviable5 = false;
				}
				
				
				//BOTTOMRIGHT MOVE (6)
				cviable6 = true;
				cmove6X = XmoveX +1;
				cmove6Y = XmoveY +2;
				if (cmove6X < 0) {
					cviable6 = false;
				}
				if (cmove6Y < 0) {
					cviable6 = false;
				}
				if (cmove6X > 4) {
					cviable6 = false;
				}
				if (cmove6Y > 4) {
					cviable6 = false;
				}
				
				
				//BOTTOMLEFT MOVE (7)
				cviable7 = true;
				cmove7X = XmoveX-1;
				cmove7Y = XmoveY +2;
				if (cmove7X < 0) {
					cviable7 = false;
				}
				if (cmove7Y < 0) {
					cviable7 = false;
				}
				if (cmove7X > 4) {
					cviable7 = false;
				}
				if (cmove7Y > 4) {
					cviable7 = false;
				}
				
				
				//SIDELEFT BOTTOM MOVE (8)
				cviable8 = true;
				cmove8X = XmoveX-2;
				cmove8Y = XmoveY+1;
				if (cmove8X < 0) {
					cviable8 = false;
				}
				if (cmove8Y < 0) {
					cviable8 = false;
				}
				if (cmove8X > 4) {
					cviable8 = false;
				}
				if (cmove8Y > 4) {
					cviable8 = false;
				}
				
				
				if(cviable1 == true && grid[cmove1Y][cmove1X] != 'B'){
					if (grid[cmove1Y][cmove1X] == 'O') {
					}
					else {
					grid[cmove1Y][cmove1X] = '1';
					cshow1 = true;
					}
					cmoved1 = true;
				}
				
				if(cviable2 == true && grid[cmove2Y][cmove2X] != 'B'){
					if (grid[cmove2Y][cmove2X] == 'O') {
					}
					else {
					grid[cmove2Y][cmove2X] = '2';
					cshow2 = true;
					}
					cmoved2 = true;
				}
				
				if(cviable3 == true && grid[cmove3Y][cmove3X] != 'B'){
					if (grid[cmove3Y][cmove3X] == 'O') {
					}
					else {
					grid[cmove3Y][cmove3X] = '3';
					cshow3 = true;
					}
					cmoved3 = true;
				}
				
				if(cviable4 == true && grid[cmove4Y][cmove4X] != 'B'){
					if (grid[cmove4Y][cmove4X] == 'O') {
					}
					else {
					grid[cmove4Y][cmove4X] = '4';
					cshow4 = true;
					}
					cmoved4 = true;
				}
				
				if(cviable5 == true && grid[cmove5Y][cmove5X] != 'B'){
					if (grid[cmove5Y][cmove5X] == 'O') {
					}
					else {
					grid[cmove5Y][cmove5X] = '5';
					cshow5 = true;
					}
					cmoved5 = true;
				}
				
				if(cviable6 == true && grid[cmove6Y][cmove6X] != 'B'){
					if (grid[cmove6Y][cmove6X] == 'O') {
					}
					else {
					grid[cmove6Y][cmove6X] = '6';
					cshow6 = true;
					}
					cmoved6 = true;
				}
				
				if(cviable7 == true && grid[cmove7Y][cmove7X] != 'B'){
					if (grid[cmove7Y][cmove7X] == 'O') {
					}
					else {
					grid[cmove7Y][cmove7X] = '7';
					cshow7 = true;
					}
					cmoved7 = true;
				}
				
				if(cviable8 == true && grid[cmove8Y][cmove8X] != 'B' ){
					if (grid[cmove8Y][cmove8X] == 'O') {
					}
					else {
					grid[cmove8Y][cmove8X] = '8';
					cshow8 = true;
					}
					cmoved8 = true;
				}
				System.out.print(Arrays.deepToString(grid).replace("],","]\n"));
				System.out.print("\n\n");
				grid[XmoveY][XmoveX] = 'B';
				
				if(cshow1 == true) {
					grid[cmove1Y][cmove1X] = ' ';
				}
				if(cshow2 == true) {
					grid[cmove2Y][cmove2X] = ' ';
				}
				if(cshow3 == true) {
					grid[cmove3Y][cmove3X] = ' ';
				}
				if(cshow4 == true) {
					grid[cmove4Y][cmove4X] = ' ';
				}
				if(cshow5 == true) {
					grid[cmove5Y][cmove5X] = ' ';
				}
				if(cshow6 == true) {
					grid[cmove6Y][cmove6X] = ' ';
				}
				if(cshow7 == true) {
					grid[cmove7Y][cmove7X] = ' ';
				}
				if(cshow8 == true) {
					grid[cmove8Y][cmove8X] = ' ';
				} 
				if(cmoved1 == true && grid[cmove1Y][cmove1X] != 'O') {
					grid[cmove1Y][cmove1X] = 'X';
					moved = true;
					XmoveX = cmove1X;
					XmoveY = cmove1Y;
				}
				if (cmoved1 == true && grid[cmove1Y][cmove1X] == 'O') {
					grid[cmove1Y][cmove1X] = 'X';
					gamestop = true;
				}
				if(moved != true) {
					if(cmoved2 == true && grid[cmove2Y][cmove2X] != 'O') {
						grid[cmove2Y][cmove2X] = 'X';
						moved = true;
						XmoveX = cmove2X;
						XmoveY = cmove2Y;
					}
					if (cmoved2 == true && grid[cmove2Y][cmove2X] == 'O') {
						grid[cmove2Y][cmove2X] = 'X';
						gamestop = true;
				}	
			}
				if(moved != true) {
					if(cmoved3 == true && grid[cmove3Y][cmove3X] != 'O') {
						grid[cmove3Y][cmove3X] = 'X';
						moved = true;
						XmoveX = cmove3X;
						XmoveY = cmove3Y;
					}
					if (cmoved3 == true && grid[cmove3Y][cmove3X] == 'O') {
						grid[cmove3Y][cmove3X] = 'X';
						gamestop = true;
				}	
		}
				if(moved != true) {
					if(cmoved4 == true && grid[cmove4Y][cmove4X] != 'O') {
						grid[cmove4Y][cmove4X] = 'X';
						moved = true;
						XmoveX = cmove4X;
						XmoveY = cmove4Y;
					}
					if (cmoved4 == true && grid[cmove4Y][cmove4X] == 'O') {
						grid[cmove4Y][cmove4X] = 'X';
						gamestop = true;
				}
				}
				if(moved != true) {
					if(cmoved5 == true && grid[cmove5Y][cmove5X] != 'O') {
						grid[cmove5Y][cmove5X] = 'X';
						moved = true;
						XmoveX = cmove5X;
						XmoveY = cmove5Y;
					}
					if (cmoved5 == true && grid[cmove5Y][cmove5X] == 'O') {
						grid[cmove5Y][cmove5X] = 'X';
						gamestop = true;
				}
				}
				if(moved != true) {
					if(cmoved6 == true && grid[cmove6Y][cmove6X] != 'O') {
						grid[cmove6Y][cmove6X] = 'X';
						moved = true;
						XmoveX = cmove6X;
						XmoveY = cmove6Y;
					}
					if (cmoved6 == true && grid[cmove6Y][cmove6X] == 'O') {
						grid[cmove6Y][cmove6X] = 'X';
						gamestop = true;
				}
				}
				if(moved != true) {
					if(cmoved7 == true && grid[cmove7Y][cmove7X] != 'O') {
						grid[cmove7Y][cmove7X] = 'X';
						moved = true;
						XmoveX = cmove7X;
						XmoveY = cmove7Y;
					}
					if (cmoved7 == true && grid[cmove7Y][cmove7X] == 'O') {
						grid[cmove7Y][cmove7X] = 'X';
						gamestop = true;
				}
				}
				if(moved != true) {
					if(cmoved8 == true && grid[cmove8Y][cmove8X] != 'O') {
						grid[cmove8Y][cmove8X] = 'X';
						moved = true;
						XmoveX = cmove8X;
						XmoveY = cmove8Y;
					}
					if (cmoved8 == true && grid[cmove8Y][cmove8X] == 'O') {
						grid[cmove8Y][cmove8X] = 'X';
						gamestop = true;
				}
				}
				
			}
			else {
				amoved = false;
				amoved1 = false;
				amoved2 = false;
				amoved3 = false;
				amoved4 = false;
				amoved5 = false;
				amoved6 = false;
				amoved7 = false;
				amoved8 = false;
				ashow1 = false;
				ashow2 = false;
				ashow3 = false;
				ashow4 = false;
				ashow5 = false;
				ashow6 = false;
				ashow7 = false;
				ashow8 = false;
				System.out.print("\nCPU2 Turn\n");
				
				//SIDELEFT MOVE (1)
				viable1 = true;
				move1X = OmoveX-2;
				move1Y = OmoveY-1;
				if (move1X < 0) {
					viable1 = false;
				}
				if (move1Y < 0) {
					viable1 = false;
				}
				if (move1X > 4) {
					viable1 = false;
				}
				if (move1Y > 4) {
					viable1 = false;
				}
				
				//TOPLEFT MOVE (2)
				viable2 = true;
				move2X = OmoveX-1;
				move2Y = OmoveY-2;
				if (move2X < 0) {
					viable2 = false;
				}
				if (move2Y < 0) {
					viable2 = false;
				}
				if (move2X > 4) {
					viable2 = false;
				}
				if (move2Y > 4) {
					viable2 = false;
				}
				
				
				//TOPRIGHT MOVE (3)
				viable3 = true;
				move3X = OmoveX+1;
				move3Y = OmoveY-2;
				if (move3X < 0) {
					viable3 = false;
				}
				if (move3Y < 0) {
					viable3 = false;
				}
				if (move3X > 4) {
					viable3 = false;
				}
				if (move3Y > 4) {
					viable3 = false;
				}
				
				//SIDERIGHT MOVE (4)
				viable4 = true;
				move4X = OmoveX+2;
				move4Y = OmoveY-1;
				if (move4X < 0) {
					viable4 = false;
				}
				if (move4Y < 0) {
					viable4 = false;
				}
				if (move4X > 4) {
					viable4 = false;
				}
				if (move4Y > 4) {
					viable4 = false;
				}
				
				//SIDERIGHT BOTTOM MOVE (5)
				viable5 = true;
				move5X = OmoveX +2;
				move5Y = OmoveY +1;
				if (move5X < 0) {
					viable5 = false;
				}
				if (move5Y < 0) {
					viable5 = false;
				}
				if (move5X > 4) {
					viable5 = false;
				}
				if (move5Y > 4) {
					viable5 = false;
				}
				
				
				//BOTTOMRIGHT MOVE (6)
				viable6 = true;
				move6X = OmoveX +1;
				move6Y = OmoveY +2;
				if (move6X < 0) {
					viable6 = false;
				}
				if (move6Y < 0) {
					viable6 = false;
				}
				if (move6X > 4) {
					viable6 = false;
				}
				if (move6Y > 4) {
					viable6 = false;
				}
				
				
				//BOTTOMLEFT MOVE (7)
				viable7 = true;
				move7X = OmoveX-1;
				move7Y = OmoveY +2;
				if (move7X < 0) {
					viable7 = false;
				}
				if (move7Y < 0) {
					viable7 = false;
				}
				if (move7X > 4) {
					viable7 = false;
				}
				if (move7Y > 4) {
					viable7 = false;
				}
				
				
				//SIDELEFT BOTTOM MOVE (8)
				viable8 = true;
				move8X = OmoveX-2;
				move8Y = OmoveY+1;
				if (move8X < 0) {
					viable8 = false;
				}
				if (move8Y < 0) {
					viable8 = false;
				}
				if (move8X > 4) {
					viable8 = false;
				}
				if (move8Y > 4) {
					viable8 = false;
				}
				
				if(viable1 == true && grid[move1Y][move1X] != 'B'){
					if (grid[move1Y][move1X] == 'X') {
					}
					else {
					grid[move1Y][move1X] = '1';
					ashow1 = true;
					}
					amoved1 = true;
				}
				
				if(viable2 == true && grid[move2Y][move2X] != 'B'){
					if (grid[move2Y][move2X] == 'X') {
					}
					else {
					grid[move2Y][move2X] = '2';
					ashow2 = true;
					}
					amoved2 = true;
				}
				
				if(viable3 == true && grid[move3Y][move3X] != 'B'){
					if (grid[move3Y][move3X] == 'X') {
					}
					else {
					grid[move3Y][move3X] = '3';
					ashow3 = true;
					}
					amoved3 = true;
				}
				
				if(viable4 == true && grid[move4Y][move4X] != 'B'){
					grid[move4Y][move4X] = '4';
					ashow4 = true;
					amoved4 = true;
				}
				
				if(viable5 == true && grid[move5Y][move5X] != 'B'){
					grid[move5Y][move5X] = '5';
					ashow5 = true;
					amoved5 = true;
				}
				
				if(viable6 == true && grid[move6Y][move6X] != 'B'){
					grid[move6Y][move6X] = '6';
					ashow6 = true;
					amoved6 = true;
				}
				
				if(viable7 == true && grid[move7Y][move7X] != 'B'){
					grid[move7Y][move7X] = '7';
					ashow7 = true;
					amoved7 = true;
				}
				
				if(viable8 == true && grid[move8Y][move8X] != 'B'){
					grid[move8Y][move8X] = '8';
					ashow8 = true;
					amoved8 = true;
				}
				
				System.out.print(Arrays.deepToString(grid).replace("],","]\n"));
				System.out.print("\n\n");
				grid[OmoveY][OmoveX] = 'B';
				
				if(ashow1 == true) {
					grid[move1Y][move1X] = ' ';
				}
				if(ashow2 == true) {
					grid[move2Y][move2X] = ' ';
				}
				if(ashow3 == true) {
					grid[move3Y][move3X] = ' ';
				}
				if(ashow4 == true) {
					grid[move4Y][move4X] = ' ';
				}
				if(ashow5 == true) {
					grid[move5Y][move5X] = ' ';
				}
				if(ashow6 == true) {
					grid[move6Y][move6X] = ' ';
				}
				if(ashow7 == true) {
					grid[move7Y][move7X] = ' ';
				}
				if(ashow8 == true) {
					grid[move8Y][move8X] = ' ';
				}
				if(amoved1 == true && grid[move1Y][move1X] != 'X') {
					grid[move1Y][move1X] = 'O';
					amoved = true;
					OmoveX = move1X;
					OmoveY = move1Y;
				}
				if (amoved1 == true && grid[move1Y][move1X] == 'X') {
					grid[move1Y][move1X] = 'O';
					gamestop = true;
				}
				if(amoved != true) {
					if(amoved2 == true && grid[move2Y][move2X] != 'X') {
						grid[move2Y][move2X] = 'O';
						amoved = true;
						OmoveX = move2X;
						OmoveY = move2Y;
					}
					if (amoved2 == true && grid[move2Y][move2X] == 'X') {
						grid[move2Y][move2X] = 'O';
						gamestop = true;
				}	
			}
				if(amoved != true) {
					if(amoved3 == true && grid[move3Y][move3X] != 'X') {
						grid[move3Y][move3X] = 'O';
						amoved = true;
						OmoveX = move3X;
						OmoveY = move3Y;
					}
					if (amoved3 == true && grid[move3Y][move3X] == 'X') {
						grid[move3Y][move3X] = 'O';
						gamestop = true;
				}	
		}		
				if(amoved != true) {
					if(amoved4 == true && grid[move4Y][move4X] != 'X') {
						grid[move4Y][move4X] = 'O';
						amoved = true;
						OmoveX = move4X;
						OmoveY = move4Y;
					}
					if (amoved4 == true && grid[move4Y][move4X] == 'X') {
						grid[move4Y][move4X] = 'O';
						gamestop = true;
				}
				}
				if(amoved != true) {
					if(amoved5 == true && grid[move5Y][move5X] != 'X') {
						grid[move5Y][move5X] = 'O';
						amoved = true;
						OmoveX = move5X;
						OmoveY = move5Y;
					}
					if (amoved5 == true && grid[move5Y][move5X] == 'X') {
						grid[move5Y][move5X] = 'O';
						gamestop = true;
				}
				}
				if(amoved != true) {
					if(amoved6 == true && grid[move6Y][move6X] != 'X') {
						grid[move6Y][move6X] = 'O';
						amoved = true;
						OmoveX = move6X;
						OmoveY = move6Y;
					}
					if (amoved6 == true && grid[move6Y][move6X] == 'X') {
						grid[move6Y][move6X] = 'O';
						gamestop = true;
				}
				}
				if(amoved != true) {
					if(amoved7 == true && grid[move7Y][move7X] != 'X') {
						grid[move7Y][move7X] = 'O';
						amoved = true;
						OmoveX = move7X;
						OmoveY = move7Y;
					}
					if (amoved7 == true && grid[move7Y][move7X] == 'X') {
						grid[move7Y][move7X] = 'O';
						gamestop = true;
				}
				}
				if(amoved != true) {
					if(amoved8 == true && grid[move8Y][move8X] != 'X') {
						grid[move8Y][move8X] = 'O';
						amoved = true;
						OmoveX = move8X;
						OmoveY = move8Y;
					}
					if (amoved8 == true && grid[move8Y][move8X] == 'X') {
						grid[move8Y][move8X] = 'O';
						gamestop = true;
				}
				}
				
			}
			
			
			

}
	}
}
