package Devoir2.Partie1;

public class User extends Player {
 

    public  void play(Game game) {
      if(game.getRound() == game.getRows()*game.getColumns()){
        System.out.println("Game is finished already!");
      }
      int move;
        do {
            System.out.print(game.nextBoxSymbol() + " to play: ");
            move = Integer.parseInt(System.console().readLine()) - 1;
        } 
        while (move < 0 || move >= game.getRows() * game.getColumns() || game.boxSymbolAt(move) != BoxSymbol.EMPTY);
        game.play(move);
    }
}
