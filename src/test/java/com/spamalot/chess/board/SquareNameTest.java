package com.spamalot.chess.board;

import static org.junit.Assert.assertEquals;

import com.spamalot.chess.lib0x88.SquareName0x88;

import org.junit.Test;


@SuppressWarnings("static-method")
public class SquareNameTest {

  @Test
  public void testToName() {
    assertEquals("b2", SquareName0x88.toName(1, 1));
  }
}
