/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.analysis;

import subtitulo.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAFilesub(AFilesub node);
    void caseAItemItemlist(AItemItemlist node);
    void caseAItemlistItemlist(AItemlistItemlist node);
    void caseAItem(AItem node);
    void caseATime(ATime node);
    void caseATstart(ATstart node);
    void caseATend(ATend node);
    void caseATextSubs(ATextSubs node);
    void caseASubsSubs(ASubsSubs node);
    void caseAFontWriting(AFontWriting node);
    void caseATextWriting(ATextWriting node);
    void caseAColorWriting(AColorWriting node);
    void caseAHours(AHours node);
    void caseAMinutes(AMinutes node);
    void caseASeconds(ASeconds node);
    void caseAMillisecons(AMillisecons node);

    void caseTDigit(TDigit node);
    void caseTBlank(TBlank node);
    void caseTArrow(TArrow node);
    void caseTComma(TComma node);
    void caseTTwopoint(TTwopoint node);
    void caseTColor(TColor node);
    void caseTText(TText node);
    void caseTOpen(TOpen node);
    void caseTClose(TClose node);
    void caseTEnd(TEnd node);
    void caseTFont(TFont node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
