package br.com.emendes.problems;

/**
 * Restrições:<br>
 * 1 <= haystack.length, needle.length <= 10^4<br>
 * haystack e needle consistem apenas de letras inglêsas minúsculas.<br>
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

  // Solução um tanto complexa.
  // Complexidade de tempo = O(N)
  public int strStr(String haystack, String needle) {
    int haystackLength = haystack.length();
    int needleLength = needle.length();

    if (haystackLength < needleLength) return -1;

    int needleIndex = 0;
    int haystackIndex = 0;
    int lastIndex = haystackLength - needleLength;
    char firstChar = needle.charAt(0);
    int markedIndex = -1;

    while (haystackIndex <= lastIndex) {
      if (haystack.charAt(haystackIndex) != needle.charAt(needleIndex)) {
        haystackIndex += 1;
        continue;
      }

      haystackIndex += 1;
      needleIndex += 1;

      while (needleIndex < needleLength && haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
        if (haystack.charAt(haystackIndex) == firstChar && markedIndex == -1) {
          markedIndex = haystackIndex;
        }
        haystackIndex += 1;
        needleIndex += 1;
      }

      if (needleIndex == needleLength) return haystackIndex - needleIndex;

      if (markedIndex != -1) {
        haystackIndex = markedIndex;
        markedIndex = -1;
      }
      needleIndex = 0;
    }

    return -1;
  }

}
