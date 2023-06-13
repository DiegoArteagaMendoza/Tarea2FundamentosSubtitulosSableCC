/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.analysis;

import srt.node.*;

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
    void caseATextlistSubs(ATextlistSubs node);
    void caseAEffectSubs(AEffectSubs node);
    void caseATextTextlist(ATextTextlist node);
    void caseATextlistTextlist(ATextlistTextlist node);
    void caseATextEffect(ATextEffect node);
    void caseASlashEffect(ASlashEffect node);
    void caseAHours(AHours node);
    void caseAMinutes(AMinutes node);
    void caseASeconds(ASeconds node);
    void caseAMillisecons(AMillisecons node);

    void caseTNum(TNum node);
    void caseTNewline(TNewline node);
    void caseTBlank(TBlank node);
    void caseTArrow(TArrow node);
    void caseTComma(TComma node);
    void caseTTwopoint(TTwopoint node);
    void caseTDigit(TDigit node);
    void caseTText(TText node);
    void caseTPlus(TPlus node);
    void caseTSlash(TSlash node);
    void caseTMinus(TMinus node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}