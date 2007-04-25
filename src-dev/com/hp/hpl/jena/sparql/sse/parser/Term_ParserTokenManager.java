/* Generated By:JavaCC: Do not edit this line. Term_ParserTokenManager.java */
/*
 * (c) Copyright 2007 Hewlett-Packard Development Company, LP
 * All rights reserved.
 */

package com.hp.hpl.jena.sparql.sse.parser ;




public class Term_ParserTokenManager implements Term_ParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000000L) != 0L)
            return 17;
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 33;
            return 62;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 63:
         return jjStartNfaWithStates_0(0, 25, 17);
      case 91:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 94:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 93:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         break;
      case 94:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 62);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0xfffe7000fffffff6L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x7e00000000ffffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0x0L, 0xbfff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec6 = {
   0x3000L, 0xffff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec8 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffL
};
static final long[] jjbitVec9 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffffL
};
static final long[] jjbitVec10 = {
   0x0L, 0x0L, 0x80000000000000L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec11 = {
   0xffffffffffffffffL, 0xbfffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec12 = {
   0x8000000000003000L, 0xffff000000000001L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 86;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
                  if ((0xfffffcfeffffc9ffL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(62);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(18);
                  }
                  break;
               case 0:
                  if ((0xfffffcfeffffc9ffL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(62);
                  }
                  else if ((0x100003600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                     jjCheckNAddStates(0, 6);
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjCheckNAddStates(7, 10);
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(69, 82);
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 58;
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 47;
                  else if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 58)
                  {
                     if (kind > 3)
                        kind = 3;
                     jjstateSet[jjnewStateCnt++] = 8;
                  }
                  else if (curChar == 60)
                     jjCheckNAddTwoStates(2, 3);
                  else if (curChar == 63)
                     jjstateSet[jjnewStateCnt++] = 17;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(61);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(11, 13);
                  else if (curChar == 39)
                     jjCheckNAddStates(14, 16);
                  break;
               case 1:
                  if (curChar == 60)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 2:
                  if ((0xaffffffe00000000L & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 3:
                  if (curChar == 62 && kind > 2)
                     kind = 2;
                  break;
               case 5:
                  if ((0x3ff600000000000L & l) != 0L)
                     jjAddStates(17, 18);
                  break;
               case 6:
                  if ((0x3ff200000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if (curChar != 58)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if ((0x3ff600000000000L & l) != 0L)
                     jjAddStates(19, 20);
                  break;
               case 10:
                  if ((0x3ff200000000000L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 11:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 13:
                  if ((0x3ff600000000000L & l) != 0L)
                     jjAddStates(21, 22);
                  break;
               case 14:
                  if ((0x3ff200000000000L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 16:
                  if (curChar == 63)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(21);
                  break;
               case 24:
                  if (curChar == 45)
                     jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(24, 25);
                  break;
               case 27:
                  if ((0x8400000000L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 28:
                  if (curChar == 39)
                     jjCheckNAddStates(14, 16);
                  break;
               case 29:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(14, 16);
                  break;
               case 31:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(14, 16);
                  break;
               case 32:
                  if (curChar == 39 && kind > 18)
                     kind = 18;
                  break;
               case 33:
                  if (curChar == 34)
                     jjCheckNAddStates(11, 13);
                  break;
               case 34:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 36:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 37:
                  if (curChar == 34 && kind > 19)
                     kind = 19;
                  break;
               case 38:
                  if (curChar == 39)
                     jjCheckNAddStates(23, 26);
                  break;
               case 39:
               case 44:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 40:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 42:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 43:
                  if (curChar == 39)
                     jjAddStates(27, 28);
                  break;
               case 45:
                  if (curChar == 39 && kind > 20)
                     kind = 20;
                  break;
               case 46:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 48:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 34)
                     jjCheckNAddStates(29, 32);
                  break;
               case 50:
               case 55:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 51:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(29, 32);
                  break;
               case 53:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(29, 32);
                  break;
               case 54:
                  if (curChar == 34)
                     jjAddStates(33, 34);
                  break;
               case 56:
                  if (curChar == 34 && kind > 21)
                     kind = 21;
                  break;
               case 57:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 59:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
               case 61:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(61);
                  break;
               case 62:
                  if ((0xfffffcfeffffc9ffL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(62);
                  break;
               case 63:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAddStates(7, 10);
                  break;
               case 64:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(64);
                  break;
               case 65:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(65, 66);
                  break;
               case 66:
                  if (curChar != 46)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(67);
                  break;
               case 67:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(67);
                  break;
               case 68:
                  if (curChar == 46)
                     jjCheckNAdd(69);
                  break;
               case 69:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(69);
                  break;
               case 70:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(70, 71);
                  break;
               case 71:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(72, 73);
                  break;
               case 72:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(72, 73);
                  break;
               case 74:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(75);
                  break;
               case 75:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(75);
                  break;
               case 76:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(0, 6);
                  break;
               case 77:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(77, 78);
                  break;
               case 79:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(80);
                  break;
               case 80:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(80);
                  break;
               case 81:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(69, 82);
                  break;
               case 82:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(82, 83);
                  break;
               case 84:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(85);
                  break;
               case 85:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(85);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
                  if ((0xffffffffd7ffffffL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(62);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(18);
                  }
                  break;
               case 0:
                  if ((0xffffffffd7ffffffL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(62);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(61);
                  }
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 27;
                  else if (curChar == 64)
                     jjCheckNAdd(23);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddStates(35, 37);
                  else if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 2:
                  jjAddStates(38, 39);
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddStates(35, 37);
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 8:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 9:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 10:
                  if ((0x7fffffe87fffffeL & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAddTwoStates(13, 14);
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(13, 14);
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 15:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 18:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(18);
                  break;
               case 20:
               case 21:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(21);
                  break;
               case 22:
                  if (curChar == 64)
                     jjCheckNAdd(23);
                  break;
               case 23:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(23, 24);
                  break;
               case 25:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(24, 25);
                  break;
               case 26:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x14404410000000L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 29:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(14, 16);
                  break;
               case 30:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(14, 16);
                  break;
               case 34:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 35:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 36:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 40:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 41:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 42:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 51:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(29, 32);
                  break;
               case 52:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 53:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(29, 32);
                  break;
               case 60:
               case 61:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(61);
                  break;
               case 62:
                  if ((0xffffffffd7ffffffL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(62);
                  break;
               case 73:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(40, 41);
                  break;
               case 78:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(42, 43);
                  break;
               case 83:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(44, 45);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(18);
                  }
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(62);
                  }
                  break;
               case 0:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(35, 37);
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(61);
                  }
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(62);
                  }
                  break;
               case 2:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(38, 39);
                  break;
               case 4:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(35, 37);
                  break;
               case 5:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAdd(7);
                  break;
               case 8:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 9:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 10:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 3)
                     kind = 3;
                  break;
               case 12:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAddTwoStates(13, 14);
                  break;
               case 13:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(13, 14);
                  break;
               case 14:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 4)
                     kind = 4;
                  break;
               case 18:
                  if (!jjCanMove_2(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(18);
                  break;
               case 20:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(21);
                  break;
               case 21:
                  if (!jjCanMove_2(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(21);
                  break;
               case 29:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(14, 16);
                  break;
               case 34:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(11, 13);
                  break;
               case 40:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(23, 26);
                  break;
               case 51:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(29, 32);
                  break;
               case 60:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(61);
                  break;
               case 61:
                  if (!jjCanMove_2(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(61);
                  break;
               case 62:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(62);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 86 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   64, 65, 66, 70, 71, 77, 78, 64, 65, 68, 70, 34, 35, 37, 29, 30, 
   32, 5, 6, 9, 10, 13, 14, 39, 40, 41, 43, 44, 46, 50, 51, 52, 
   54, 55, 57, 5, 6, 7, 2, 3, 74, 75, 79, 80, 84, 85, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec9[i2] & l2) != 0L);
      default : 
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec10[i2] & l2) != 0L);
      case 3:
         return ((jjbitVec11[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec12[i2] & l2) != 0L);
      case 33:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 47:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec9[i2] & l2) != 0L);
      default : 
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\133\135", "\136\136", null, 
"\77", null, null, null, null, null, null, null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[86];
private final int[] jjstateSet = new int[172];
protected char curChar;
public Term_ParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public Term_ParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 86; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  //EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
         matchedToken = jjFillToken();
         return matchedToken;
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
