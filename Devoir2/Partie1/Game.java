package Devoir2.Partie1;

public class Game {
    
   /**
 * Le plateau du jeu, stock� sous forme de tableau 
 */
 private BoxSymbol[] board;


 /**
* round enregistre le nombre de tours qui ont �t�
* jou� jusqu'� pr�sent. Commence � 0.
*/
private int round;

 /**
* gameState enregistre l'�tat actuel du jeu.
*/
private GameState gameState;


 /**
* rows est le nombre de lignes dans la grille
*/
private final int rows;

 /**
* columns est le nombre de colonnes dans la grille
*/
private final int columns;


 /**
* numberWin est le nombre de cellules du m�me type
* qu'il faut aligner pour gagner la partie
*/
private final int numberWin;


 /**
* constructeur par d�faut, pour un jeu de 3x3, qui doit
* aligner 3 cellules
*/
public Game(){
this(3,3,3);
}


 /**
* constructeur permettant de pr�ciser le nombre de lignes
* et le nombre de colonnes pour le jeu, ainsi que
* le nombre de cellules qu'il faut aligner pour gagner.
  * @param rows
  *  the number of rows in the game
  * @param columns
  *  the number of columns in the game
  * @param numberWin
  *  the number of cells that must be aligned to win.
  */
public Game(int rows, int columns, int numberWin){
  this.rows = rows;
  this.columns = columns;
  this.numberWin = numberWin;
  this.board = new BoxSymbol[rows*columns];
  for(int i = 0; i < board.length; i++){
    board[i] = BoxSymbol.EMPTY;
  }
  this.round = 0;
  this.gameState = GameState.PLAYING;
}



 /**
* getter pour la variable rows
 * @return
 *  the value of rows
 */
public int getRows(){
return rows;
}

 /**
* getter pour la variable columns
 * @return
 *  the value of columns
 */
public int getColumns(){
return columns;
}

 /**
* getter pour la variable round
 * @return
 *  the value of roud
 */
public int getRound(){
return round;
}


 /**
* getter pour la variable gameState
 * @return
 *  the value of gameState
 */
public GameState getGameState(){
return gameState;
}

 /**
* getter pour la variable numberWin
 * @return
 *  the value of numberWin
 */
public int getNumberWin(){
return numberWin;
}

/**
*renvoie le prochain BoxSymbol prevu,
* Cette m�thode ne modifie pas l'�tat du jeu.
 * @return 
 *  the value of the enum BoxSymbol corresponding
 * to the next expected symbol.
 */
public BoxSymbol nextBoxSymbol(){
 if (round%2 == 0) return BoxSymbol.X;
 return BoxSymbol.O;
}


 /**
* renvoie la valeur de la case a l'index i.
* Si l'index n'est pas valide, un message d'erreur est
* imprim�. Le comportement est alors ind�termin�
  * @param i
  *  the index of the Box in the array board
  * @return 
  *  the value at index i in the variable board.
  */
public BoxSymbol boxSymbolAt(int i) {
  if(i < 0 || i >= board.length){
    System.out.println("Illegal position: " + i);
    return null;
  }
  return board[i];
}

/**
* Cette m�thode est appel�e par le prochain joueur � jouer
* � la case � l'index i.
* Si l'index n'est pas valide, un message d'erreur est
* imprim�. Le comportement est alors ind�termin�
* Si la case choisie n'est pas vide, un message d'erreur s'affiche.
* Le comportement est alors ind�termin�
* Si le coup est valide, le plateau (board) est �galement mis � jour
* ainsi que l'�tat du jeu. Doit appeler la m�thode update.
  * @param i
  *  the index of the box in the array board that has been 
  * selected by the next player
  */
public void play(int i) {

  if(i < 0 || i >= rows*columns){
    System.out.println("Illegal position: " + i);
    return;
  }
  if (board[i] != BoxSymbol.EMPTY) {
    System.out.println("This cell has already been played");
    return;
  }
  board[i] = nextBoxSymbol();
  round++;
  update(i);
}


 /**
* Une m�thode d'assistance qui met � jour la variable gameState
* correctement apr�s que la case � l'index i vient d'etre d�fini.
* La m�thode suppose qu'avant de param�trer la case
* � l'index i, la variable gameState a �t� correctement d�finie.
* cela suppose aussi qu'elle n'est appel�e que si le jeu n'a pas encore �t�
* �t� termin� lorsque la case � l'index i a �t� jou�e
* (le jeu en cours). Il suffit donc de
* V�rifiez si jouer � l'index i a termin� la partie.
  * @param i
  *  the index of the box in the array board that has just 
  * been set
 */

 private void update(int index) {
  // VOTRE CODE ICI
  int row = index / columns;
  int col = index % columns;
  BoxSymbol currentSymbol = board[index];

  // Check row
  int count = 0;
  for (int c = 0; c < columns; c++) {
      if (board[row * columns + c] == currentSymbol) {
          count++;
          if (count == numberWin) {
              gameState = (currentSymbol == BoxSymbol.X) ? GameState.XWIN : GameState.OWIN;
              return;
          }
      } else {
          count = 0;
      }
  }

  // Check column
  count = 0;
  for (int r = 0; r < rows; r++) {
      if (board[r * columns + col] == currentSymbol) {
          count++;
          if (count == numberWin) {
              gameState = (currentSymbol == BoxSymbol.X) ? GameState.XWIN : GameState.OWIN;
              return;
          }
      } else {
          count = 0;
      }
  }

  // Check diagonal (top-left to bottom-right)
  count = 0;
  int startRow = row - Math.min(row, col);
  int startCol = col - Math.min(row, col);
  while (startRow < rows && startCol < columns) {
      if (board[startRow * columns + startCol] == currentSymbol) {
          count++;
          if (count == numberWin) {
              gameState = (currentSymbol == BoxSymbol.X) ? GameState.XWIN : GameState.OWIN;
              return;
          }
      } else {
          count = 0;
      }
      startRow++;
      startCol++;
  }

  // Check diagonal (bottom-left to top-right)
  count = 0;
  startRow = row + Math.min(rows - 1 - row, col);
  startCol = col - Math.min(rows - 1 - row, col);
  while (startRow >= 0 && startCol < columns) {
      if (board[startRow * columns + startCol] == currentSymbol) {
          count++;
          if (count == numberWin) {
              gameState = (currentSymbol == BoxSymbol.X) ? GameState.XWIN : GameState.OWIN;
              return;
          }
      } else {
          count = 0;
      }
      startRow--;
      startCol++;
  }

  // Check for draw
  if (round == rows * columns) {
      gameState = GameState.DRAW;
  }
}



 /**
* Renvoie une repr�sentation sous forme de cha�ne du jeu correspondant
* � l'exemple fourni dans la description du devoir
  * @return
  *  String representation of the game
 */

 public String toString() {
  // VOTRE CODE ICI
  StringBuilder res = new StringBuilder();
  for (int r = 0; r < rows; r++) {
      for (int c = 0; c < columns; c++) {
          res.append("| ").append(board[r * columns + c]).append(" ");
      }
      res.append("|\n");
      if (r < rows - 1) {
          res.append("---".repeat(columns)).append("\n");
      }
  }
  return res.toString();
}
}

