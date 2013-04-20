/* The following code was generated by JFlex 1.4.3 on 03/05/12 11.52 */

package translator;

import java_cup.runtime.*;
import java.io.IOException;
import java.util.Stack;

import translator.TranslatorPy2JSym;
import static translator.TranslatorPy2JSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 03/05/12 11.52 from the specification file
 * <tt>/home/francesco/workspace/TraduttorePy2J/src/translator/TranslatorPy2J.lex</tt>
 */
public final class TranslatorPy2JLex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int linebegin = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\2\2\0\1\1\22\0\1\3\1\46\1\20\1\7"+
    "\1\0\1\42\1\74\1\17\1\76\1\77\1\40\1\37\1\75\1\34"+
    "\1\32\1\41\1\6\1\31\6\26\2\24\1\104\1\47\1\44\1\36"+
    "\1\45\1\0\1\105\1\30\1\16\2\30\1\33\1\30\3\22\1\35"+
    "\1\22\1\23\2\22\1\25\2\22\1\13\2\22\1\14\2\22\1\27"+
    "\2\22\1\100\1\21\1\101\1\43\1\5\1\0\1\50\1\15\1\57"+
    "\1\52\1\54\1\63\1\70\1\72\1\62\1\35\1\56\1\60\1\67"+
    "\1\51\1\61\1\65\1\22\1\11\1\53\1\55\1\12\1\22\1\71"+
    "\1\64\1\66\1\22\1\102\1\10\1\103\1\73\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\4\4\2\1\1\5\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\1\1\22\16\4"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\0\1\41"+
    "\3\0\1\42\1\0\1\43\1\44\2\0\3\4\1\0"+
    "\1\45\2\0\1\45\2\0\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
    "\1\62\1\63\1\4\1\64\10\4\1\65\1\66\1\67"+
    "\1\70\12\4\1\71\1\72\1\40\1\73\1\42\1\0"+
    "\4\4\1\45\2\0\1\74\1\75\1\76\1\77\1\4"+
    "\1\100\1\101\1\102\4\4\1\103\5\4\1\104\13\4"+
    "\4\0\1\4\1\105\1\106\1\107\5\4\1\110\2\4"+
    "\1\111\2\4\1\112\1\4\1\113\1\114\1\4\1\115"+
    "\2\0\2\4\1\116\4\4\1\117\1\120\1\4\1\121"+
    "\1\122\2\45\1\123\1\124\1\4\1\125\1\126\1\4"+
    "\1\127\1\4\1\130\1\131";

  private static int [] zzUnpackAction() {
    int [] result = new int[209];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\106\0\214\0\322\0\u0118\0\u015e\0\u01a4\0\u01ea"+
    "\0\u0230\0\u0276\0\u02bc\0\u0302\0\u0348\0\u038e\0\u03d4\0\u041a"+
    "\0\u0460\0\u04a6\0\u04ec\0\u0532\0\u0578\0\u05be\0\u0604\0\u064a"+
    "\0\u0690\0\u06d6\0\u071c\0\214\0\u0762\0\u07a8\0\u07ee\0\u0834"+
    "\0\u087a\0\u08c0\0\u0906\0\u094c\0\u0992\0\u09d8\0\u0a1e\0\u0a64"+
    "\0\u0aaa\0\u0af0\0\214\0\u0b36\0\214\0\214\0\214\0\214"+
    "\0\214\0\214\0\214\0\214\0\214\0\214\0\u0b7c\0\u0bc2"+
    "\0\u0c08\0\214\0\u0c4e\0\u0c94\0\u0cda\0\u0d20\0\u0d66\0\214"+
    "\0\214\0\u038e\0\u03d4\0\u0dac\0\u0df2\0\u0e38\0\u0e7e\0\u0ec4"+
    "\0\u0f0a\0\u0f50\0\u0f96\0\u0fdc\0\u1022\0\214\0\214\0\214"+
    "\0\214\0\u064a\0\214\0\214\0\214\0\214\0\214\0\u1068"+
    "\0\214\0\u10ae\0\214\0\u10f4\0\u113a\0\u1180\0\u11c6\0\u120c"+
    "\0\u1252\0\u1298\0\u12de\0\u1324\0\u136a\0\u015e\0\u015e\0\u015e"+
    "\0\u015e\0\u13b0\0\u13f6\0\u143c\0\u1482\0\u14c8\0\u150e\0\u1554"+
    "\0\u159a\0\u15e0\0\u1626\0\214\0\u166c\0\u16b2\0\u16f8\0\u173e"+
    "\0\u1784\0\u17ca\0\u1810\0\u1856\0\u189c\0\214\0\u18e2\0\u1928"+
    "\0\214\0\214\0\214\0\u015e\0\u196e\0\u015e\0\u015e\0\u015e"+
    "\0\u19b4\0\u19fa\0\u1a40\0\u1a86\0\u015e\0\u1acc\0\u1b12\0\u1b58"+
    "\0\u1b9e\0\u1be4\0\u015e\0\u1c2a\0\u1c70\0\u1cb6\0\u1cfc\0\u1d42"+
    "\0\u1d88\0\u1dce\0\u1e14\0\u1e5a\0\u1ea0\0\u1ee6\0\u1f2c\0\u1f72"+
    "\0\u1fb8\0\u1ffe\0\u2044\0\u015e\0\u015e\0\u015e\0\u208a\0\u20d0"+
    "\0\u2116\0\u215c\0\u21a2\0\u015e\0\u21e8\0\u222e\0\u015e\0\u2274"+
    "\0\u22ba\0\u015e\0\u2300\0\u015e\0\u015e\0\u2346\0\u015e\0\u238c"+
    "\0\u23d2\0\u2418\0\u245e\0\u015e\0\u24a4\0\u24ea\0\u2530\0\u2576"+
    "\0\u015e\0\u015e\0\u25bc\0\u015e\0\u015e\0\u238c\0\u23d2\0\u015e"+
    "\0\u015e\0\u2602\0\u015e\0\u015e\0\u2648\0\u015e\0\u268e\0\u015e"+
    "\0\u015e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[209];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\2\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\13\1\15\1\13\1\16\1\17\1\3"+
    "\2\6\1\20\1\6\1\20\2\6\1\20\1\21\1\6"+
    "\1\22\1\6\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\6"+
    "\1\40\1\41\1\6\1\42\1\43\1\44\1\45\1\46"+
    "\1\6\1\47\1\50\1\6\1\51\1\52\1\6\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\4\66\1\67\101\66\107\0\2\4\106\0"+
    "\2\5\106\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\23\6\21\0\1\70\6\0"+
    "\2\71\4\0\1\72\1\73\1\74\1\70\1\75\1\0"+
    "\1\70\1\76\1\77\1\0\1\100\16\0\1\77\3\0"+
    "\1\72\1\74\2\0\1\75\21\0\1\10\2\0\5\10"+
    "\1\0\75\10\36\0\1\101\54\0\2\6\2\0\6\6"+
    "\1\102\1\103\1\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\1\104\3\6\1\105\16\6\20\0\2\6\2\0"+
    "\1\14\1\6\1\14\3\6\1\102\1\103\1\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\23\6\20\0\2\6"+
    "\2\0\6\6\1\102\1\103\1\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\23\6\20\0\2\6\2\0\1\106"+
    "\1\6\1\14\3\6\1\102\1\103\1\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\23\6\13\0\2\107\1\0"+
    "\14\107\1\110\1\107\1\111\64\107\2\112\1\0\15\112"+
    "\1\113\1\114\64\112\6\0\1\20\14\0\1\72\1\20"+
    "\1\0\1\20\2\0\1\20\1\76\1\77\1\0\1\100"+
    "\16\0\1\77\3\0\1\72\33\0\1\76\15\0\1\76"+
    "\1\0\1\76\2\0\1\76\1\115\111\0\1\116\105\0"+
    "\1\117\105\0\1\120\105\0\1\121\1\0\1\122\103\0"+
    "\1\123\2\0\1\124\102\0\1\125\105\0\1\126\105\0"+
    "\1\127\5\0\1\130\77\0\1\131\6\0\1\132\76\0"+
    "\1\133\54\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\1\6\1\134\1\6\1\135"+
    "\17\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\11\6\1\136\11\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\4\6\1\137\16\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\10\6\1\140\3\6\1\141\6\6\20\0\2\6\2\0"+
    "\1\142\5\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\23\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\10\6\1\143\1\144"+
    "\11\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\1\145\22\6\20\0\2\6"+
    "\2\0\1\146\5\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\23\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\1\6\1\147"+
    "\1\6\1\150\7\6\1\151\3\6\1\152\3\6\20\0"+
    "\2\6\2\0\1\153\5\6\3\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\11\6\1\154\1\155\10\6\20\0"+
    "\2\6\2\0\1\156\5\6\3\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\1\157\22\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\12\6\1\160\10\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\10\6\1\161"+
    "\12\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\12\6\1\162\7\6\1\163"+
    "\51\0\1\164\53\0\1\67\107\0\1\70\14\0\1\72"+
    "\1\73\1\0\1\70\2\0\1\70\1\76\1\77\1\0"+
    "\1\100\16\0\1\77\3\0\1\72\33\0\1\165\22\0"+
    "\1\165\62\0\1\73\15\0\1\73\1\0\1\73\2\0"+
    "\1\73\1\76\1\77\1\0\1\100\16\0\1\77\37\0"+
    "\1\166\17\0\1\166\2\0\1\166\62\0\1\167\6\0"+
    "\2\167\5\0\1\167\1\0\1\167\1\0\2\167\1\0"+
    "\1\167\14\0\1\167\1\0\1\167\1\0\1\167\2\0"+
    "\1\167\3\0\1\167\30\0\1\76\15\0\1\76\1\0"+
    "\1\76\2\0\1\76\1\0\1\77\1\0\1\100\16\0"+
    "\1\77\37\0\1\170\15\0\1\170\1\0\1\170\2\0"+
    "\1\170\2\0\1\171\2\0\1\171\53\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\1\6\1\172\10\6\1\173\10\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\5\6\1\174\15\6\20\0\2\6\2\0\6\6\1\102"+
    "\1\103\1\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\4\6\1\175\16\6\13\0\2\107\1\0\14\107\1\176"+
    "\1\107\1\111\64\107\17\0\1\177\74\0\1\107\2\0"+
    "\10\107\1\0\10\107\1\0\1\107\1\0\1\107\12\0"+
    "\23\107\13\0\2\112\1\0\15\112\1\176\1\114\64\112"+
    "\20\0\1\200\73\0\1\112\2\0\10\112\1\0\10\112"+
    "\1\0\1\112\1\0\1\112\12\0\23\112\45\0\1\201"+
    "\111\0\1\202\105\0\1\203\54\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\2\6"+
    "\1\204\20\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\3\6\1\205\17\6"+
    "\20\0\2\6\2\0\6\6\3\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\5\6\1\206\15\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\10\6\1\207\2\6\1\210\7\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\3\6\1\211\6\6\1\212\10\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\4\6\1\213\2\6\1\214\13\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\16\6\1\215\4\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\1\216"+
    "\22\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\1\6\1\217\21\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\17\6\1\220\3\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\15\6\1\221\5\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\11\6\1\222"+
    "\11\6\20\0\2\6\2\0\1\223\5\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\23\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\1\6\1\224\21\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\12\6"+
    "\1\225\10\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\3\6\1\226\17\6"+
    "\20\0\2\6\2\0\6\6\3\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\4\6\1\227\16\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\11\6\1\230\11\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\5\6"+
    "\1\231\15\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\12\6\1\232\10\6"+
    "\21\0\1\165\14\0\1\72\5\0\1\165\26\0\1\72"+
    "\33\0\1\166\14\0\1\72\2\0\1\166\2\0\1\166"+
    "\26\0\1\72\33\0\1\167\6\0\2\167\4\0\1\72"+
    "\1\167\1\0\1\167\1\0\2\167\1\0\1\167\14\0"+
    "\1\167\1\0\1\167\1\0\1\167\2\0\1\167\1\72"+
    "\2\0\1\167\30\0\1\170\15\0\1\170\1\0\1\170"+
    "\2\0\1\170\3\0\1\100\56\0\1\170\15\0\1\170"+
    "\1\0\1\170\2\0\1\170\61\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\20\6"+
    "\1\233\2\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\3\6\1\234\17\6"+
    "\20\0\2\6\2\0\1\6\1\235\4\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\23\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\1\236\22\6\13\0\17\177\1\237\1\177\1\240"+
    "\64\177\20\200\1\241\1\242\64\200\5\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\4\6\1\243\16\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\4\6\1\244"+
    "\16\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\13\6\1\245\7\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\7\6\1\246\13\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\4\6\1\247\16\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\3\6\1\250"+
    "\17\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\5\6\1\251\15\6\20\0"+
    "\2\6\2\0\4\6\1\252\1\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\23\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\11\6\1\253\11\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\17\6\1\254"+
    "\3\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\1\255\22\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\1\6\1\256\21\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\3\6"+
    "\1\257\17\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\10\6\1\260\12\6"+
    "\20\0\2\6\2\0\4\6\1\261\1\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\23\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\22\6\1\262\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\10\6\1\263"+
    "\12\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\4\6\1\264\16\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\4\6\1\265\16\6\20\0\2\6\2\0"+
    "\1\266\5\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\23\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\6\6\1\267\14\6"+
    "\13\0\17\177\1\270\1\177\1\240\64\177\6\0\1\177"+
    "\2\0\10\177\1\0\10\177\1\0\1\177\1\0\1\177"+
    "\12\0\23\177\13\0\20\200\1\271\1\242\64\200\6\0"+
    "\1\200\2\0\10\200\1\0\10\200\1\0\1\200\1\0"+
    "\1\200\12\0\23\200\20\0\2\6\2\0\1\272\5\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\23\6"+
    "\20\0\2\6\2\0\6\6\3\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\15\6\1\273\5\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\3\6\1\274\17\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\12\6"+
    "\1\275\10\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\2\6\1\276\20\6"+
    "\20\0\2\6\2\0\1\277\5\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\23\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\10\6\1\300\12\6\20\0\2\6\2\0\6\6\3\0"+
    "\10\6\1\0\1\6\1\0\1\6\12\0\5\6\1\301"+
    "\15\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\2\6\1\302\20\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\1\303\22\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\4\6"+
    "\1\304\16\6\20\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\1\6\1\305\21\6"+
    "\13\0\17\177\1\306\1\177\1\240\64\177\20\200\1\307"+
    "\1\242\64\200\5\0\2\6\2\0\6\6\3\0\10\6"+
    "\1\0\1\6\1\0\1\6\12\0\5\6\1\310\15\6"+
    "\20\0\2\6\2\0\6\6\3\0\10\6\1\0\1\6"+
    "\1\0\1\6\12\0\5\6\1\311\15\6\20\0\2\6"+
    "\2\0\6\6\3\0\10\6\1\0\1\6\1\0\1\6"+
    "\12\0\1\6\1\312\21\6\20\0\2\6\2\0\6\6"+
    "\3\0\10\6\1\0\1\6\1\0\1\6\12\0\1\313"+
    "\22\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\5\6\1\314\15\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\10\6\1\315\12\6\20\0\2\6\2\0"+
    "\6\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\10\6\1\316\12\6\20\0\2\6\2\0\1\6\1\317"+
    "\4\6\3\0\10\6\1\0\1\6\1\0\1\6\12\0"+
    "\23\6\20\0\2\6\2\0\6\6\3\0\10\6\1\0"+
    "\1\6\1\0\1\6\12\0\16\6\1\320\4\6\20\0"+
    "\2\6\2\0\6\6\3\0\10\6\1\0\1\6\1\0"+
    "\1\6\12\0\4\6\1\321\16\6\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9940];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\30\1\1\11\16\1\1\11\1\1\12\11"+
    "\2\1\1\0\1\11\3\0\1\1\1\0\2\11\2\0"+
    "\3\1\1\0\1\1\2\0\1\1\2\0\4\11\1\1"+
    "\5\11\1\1\1\11\1\1\1\11\30\1\1\11\4\1"+
    "\1\0\4\1\1\11\2\0\3\11\33\1\4\0\25\1"+
    "\2\0\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[209];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

        private Stack<Integer> indentStack;
       
        public int stackLength()
        {
                return indentStack.size();
        }
       
        private Symbol sym(int type)
        {
                return sym(type, yytext());
        }

        private Symbol sym(int type, Object value){
        		return new Symbol(type, yyline, yycolumn, value);
        }

        private void error()
        throws IOException
        {
                throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
        }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public TranslatorPy2JLex(java.io.Reader in) {
          indentStack = new Stack<Integer>();
        indentStack.push(0);
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public TranslatorPy2JLex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL[zzMarkedPosL-1]) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 18: 
          { return sym(SEMI);
          }
        case 90: break;
        case 76: 
          { return sym(RAISE);
          }
        case 91: break;
        case 64: 
          { return sym(NOT);
          }
        case 92: break;
        case 81: 
          { return sym(WHILE);
          }
        case 93: break;
        case 83: 
          { return sym(ASSERT);
          }
        case 94: break;
        case 74: 
          { return sym(WITH);
          }
        case 95: break;
        case 41: 
          { return sym(MULTEQ);
          }
        case 96: break;
        case 4: 
          { return sym(NAME);
          }
        case 97: break;
        case 66: 
          { return sym(DEF);
          }
        case 98: break;
        case 21: 
          { return sym(COMMA);
          }
        case 99: break;
        case 20: 
          { return sym(ECOM);
          }
        case 100: break;
        case 11: 
          { return sym(PLUS);
          }
        case 101: break;
        case 13: 
          { return sym(DIVIDE);
          }
        case 102: break;
        case 73: 
          { return sym(PASS);
          }
        case 103: break;
        case 29: 
          { return sym(AT);
          }
        case 104: break;
        case 23: 
          { return sym(RPAREN);
          }
        case 105: break;
        case 49: 
          { return sym(MAIEQ);
          }
        case 106: break;
        case 50: 
          { return sym(RSHIFT);
          }
        case 107: break;
        case 52: 
          { return sym(AS);
          }
        case 108: break;
        case 71: 
          { return sym(EXEC);
          }
        case 109: break;
        case 15: 
          { return sym(EXPON);
          }
        case 110: break;
        case 10: 
          { return sym(ASSIGN);
          }
        case 111: break;
        case 57: 
          { return sym(ANDEQ);
          }
        case 112: break;
        case 45: 
          { return sym(MODEQ);
          }
        case 113: break;
        case 35: 
          { return sym(IMAGNUM);
          }
        case 114: break;
        case 85: 
          { return sym(LAMBDA);
          }
        case 115: break;
        case 58: 
          { return sym(BIN);
          }
        case 116: break;
        case 39: 
          { return sym(EQ);
          }
        case 117: break;
        case 22: 
          { return sym(LPAREN);
          }
        case 118: break;
        case 48: 
          { return sym(LSHIFT);
          }
        case 119: break;
        case 55: 
          { return sym(IS);
          }
        case 120: break;
        case 17: 
          { return sym(MAIOR);
          }
        case 121: break;
        case 27: 
          { return sym(RCURLY);
          }
        case 122: break;
        case 72: 
          { return sym(FROM);
          }
        case 123: break;
        case 36: 
          { return sym(OREQ);
          }
        case 124: break;
        case 70: 
          { return sym(ELIF);
          }
        case 125: break;
        case 79: 
          { return sym(PRINT);
          }
        case 126: break;
        case 78: 
          { return sym(CLASS);
          }
        case 127: break;
        case 6: 
          { return sym(COMMENT);
          }
        case 128: break;
        case 47: 
          { return sym(MINEQ);
          }
        case 129: break;
        case 25: 
          { return sym(RBRACK);
          }
        case 130: break;
        case 88: 
          { return sym(FINALLY);
          }
        case 131: break;
        case 84: 
          { return sym(EXCEPT);
          }
        case 132: break;
        case 86: 
          { return sym(IMPORT);
          }
        case 133: break;
        case 32: 
          { return sym(OCT);
          }
        case 134: break;
        case 54: 
          { return sym(IN);
          }
        case 135: break;
        case 77: 
          { return sym(BREAK);
          }
        case 136: break;
        case 53: 
          { return sym(OR);
          }
        case 137: break;
        case 68: 
          { return sym(FOR);
          }
        case 138: break;
        case 30: 
          { int indent = 0;
	        int level = indentStack.peek();
	        if (indent < level){
	                Integer inte = indentStack.pop();
		            yypushback(yytext().length());
			        yybegin(linebegin);
			        return sym(DEDENT);
	        }
	        yypushback(yytext().length());
	        yybegin(YYINITIAL);
          }
        case 139: break;
        case 43: 
          { return sym(DIVEQ);
          }
        case 140: break;
        case 80: 
          { return sym(YIELD);
          }
        case 141: break;
        case 26: 
          { return sym(LCURLY);
          }
        case 142: break;
        case 42: 
          { return sym(MULTMULT);
          }
        case 143: break;
        case 44: 
          { return sym(DIVDIV);
          }
        case 144: break;
        case 60: 
          { return sym(TRIDOT);
          }
        case 145: break;
        case 12: 
          { return sym(MULT);
          }
        case 146: break;
        case 3: 
          { ;
          }
        case 147: break;
        case 37: 
          { return sym(STRING);
          }
        case 148: break;
        case 38: 
          { return sym(MINUSEQ);
          }
        case 149: break;
        case 24: 
          { return sym(LBRACK);
          }
        case 150: break;
        case 16: 
          { return sym(MINOR);
          }
        case 151: break;
        case 14: 
          { return sym(MOD);
          }
        case 152: break;
        case 62: 
          { return sym(RSEQ);
          }
        case 153: break;
        case 69: 
          { return sym(ELSE);
          }
        case 154: break;
        case 75: 
          { return sym(RANGE);
          }
        case 155: break;
        case 59: 
          { return sym(HEX);
          }
        case 156: break;
        case 40: 
          { return sym(PLUSEQ);
          }
        case 157: break;
        case 61: 
          { return sym(LSEQ);
          }
        case 158: break;
        case 56: 
          { return sym(IF);
          }
        case 159: break;
        case 33: 
          { return sym(LONGINT);
          }
        case 160: break;
        case 67: 
          { return sym(TRY);
          }
        case 161: break;
        case 89: 
          { return sym(CONTINUE);
          }
        case 162: break;
        case 82: 
          { return sym(RETURN);
          }
        case 163: break;
        case 34: 
          { return sym(FLOAT);
          }
        case 164: break;
        case 5: 
          { return sym(DECIMAL);
          }
        case 165: break;
        case 9: 
          { return sym(MINUS);
          }
        case 166: break;
        case 87: 
          { return sym(GLOBAL);
          }
        case 167: break;
        case 46: 
          { return sym(EXPEQ);
          }
        case 168: break;
        case 51: 
          { return sym(NEQ);
          }
        case 169: break;
        case 31: 
          { int level  = indentStack.peek();
	        int indent = yytext().replace("\t", "        ").length();
	   
	        if (indent > level)
	        {                                      
	                indentStack.push(indent);
	                yybegin(YYINITIAL);
	                return sym(INDENT);
	        }
	        else if (indent < level)
	        {
			        Integer inte = indentStack.pop();     
			        yypushback(yytext().length());
			        
			        yybegin(linebegin);
			       	return sym(DEDENT);
	        }
	        yybegin(YYINITIAL);
          }
        case 170: break;
        case 65: 
          { return sym(DEL);
          }
        case 171: break;
        case 8: 
          { return sym(DOT);
          }
        case 172: break;
        case 1: 
          { System.out.println("SCANNER ERROR: "+yytext());
          }
        case 173: break;
        case 28: 
          { return sym(COLON);
          }
        case 174: break;
        case 19: 
          { return sym(TILDE);
          }
        case 175: break;
        case 63: 
          { return sym(AND);
          }
        case 176: break;
        case 2: 
          { yybegin(linebegin);
            return sym(NEWLINE);
          }
        case 177: break;
        case 7: 
          { return sym(PIPE);
          }
        case 178: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {                 if(indentStack.size()>1)
                {  
                        indentStack.pop();
                		return sym(DEDENT);
       			 }
                return sym(EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
