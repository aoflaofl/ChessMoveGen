package com.spamalot.chess.board;

import javax.annotation.Nullable;

/**
 * Utility functions for handling square names.
 * 
 * @author gej
 *
 */
public final class SquareName {
  /** Map file number to file letter. */
  private static final char[] FILE_LETTERS = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

  /** Cache square number to name. */
  private static String[] sqNames = new String[128];

  static {
    for (int i = 0; i < 128; i++) {
      sqNames[i] = SquareName.fromBoard0x88number(i);
    }
  }

  /**
   * Build the name string from the Board0x88 number.
   * 
   * @param s
   *            the Board0x88 square number
   * @return the square's name in algebraic notation.
   */
  @Nullable
  private static String fromBoard0x88number(final int s) {
    if (!Board0x88Util.isOnBoard(s)) {
      return null;
    }

    int file = Board0x88Util.fileFromSquare(s);
    int rank = Board0x88Util.rankFromSquare(s) + 1;
    return makeSquareName(file, rank);
  }

  /**
   * Make Square name.
   * 
   * @param file
   *               file
   * @param rank
   *               rank
   * @return string of square name.
   */
  private static String makeSquareName(final int file, final int rank) {
    StringBuilder n = new StringBuilder(2);

    return n.append(FILE_LETTERS[file]).append(rank).toString();
  }

  /**
   * Get the square's name from the Board0x88 square number.
   * 
   * @param file
   *               file
   * @param rank
   *               rank
   * @return the name of the square.
   */
  public static String toName(final int file, final int rank) {
    return sqNames[Board0x88Util.fileAndRankToSquare(file, rank)];
  }

  /** Private Constructor. */
  private SquareName() {
  }
}