package com.spamalot.chess.fen.test;

import com.spamalot.chess.fen.FENUtil;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Test the FENUtil class.
 * 
 * @author gej
 *
 */
public final class FENUtilTest {
  /** Good FEN for testing. */
  private static final String GOODFEN = "rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2";

  /** For testing exceptions. */
  @Rule
  public final ExpectedException exception = ExpectedException.none();

  /**
   * Test what happens when a FEN String is missing.
   */
  @Test
  public void emptyFENString() {
    this.exception.expect(IllegalArgumentException.class);
    this.exception.expectMessage("Empty FEN String.");

    FENUtil.processFENString(null, null);
  }

  /**
   * Test what happens when a Board Object is null.
   */
  @Test
  public void nullBoardElement() {
    this.exception.expect(IllegalArgumentException.class);
    this.exception.expectMessage("Null Board object.");

    FENUtil.processFENString(null, GOODFEN);
  }
}
