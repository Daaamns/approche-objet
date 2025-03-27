package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maison {
  Piece[] pieces = new Piece[0];

  public void ajouterPiece(Piece piece) {
      if (piece == null) {
          throw new NullPointerException();
      } else {
          List<Piece> list = new ArrayList<>(Arrays.asList(pieces));


      list.add(piece);
      pieces = list.toArray(new Piece[list.size()]);
      System.out.println(Arrays.toString(pieces));
      }

  }

  public double afficherSuperficie() {
      double result = 0;
      for (Piece piece : pieces) {
          result += piece.superficie;
      }
      return result;
  }

  public double afficherSuperficieEtage(int etage) {
      double result = 0;
      for (Piece piece : pieces) {
          if (piece.etageNb == etage) {
              result += piece.superficie;
          }
      }
      return result;
  }

  public double afficherSuperficieParType(Class<?> typePiece) {
      double result = 0;
      for (Piece piece : pieces) {
          if (piece.getClass().equals(typePiece)) {
              result += piece.superficie;
          }
      }
          return result;
  }

    public int compterPiecesParType(Class<?> typePiece) {
        int count = 0;
        for (Piece piece : pieces) {
            if (piece.getClass().equals(typePiece)) {
                count++;
            }
        }
        return count;
    }
}
