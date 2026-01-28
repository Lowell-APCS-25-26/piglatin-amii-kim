package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	     for(int i = 0; i < sWord.length(); i++) {
       if(sWord.charAt(i) == 'a' || sWord.charAt(i) == 'e' || 
          sWord.charAt(i) == 'i' || sWord.charAt(i) == 'o' || sWord.charAt(i) == 'u')
      return i;
  }
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
       if (findFirstVowel (sWord) == -1)
        return sWord + "ay";
       else if (findFirstVowel(sWord.substring(0,1)) == i )
       return sWord + "way";
       else if ( sWord.substring(0,2)== "qu")
       return sWord.substring(2) + "quay"; 
       else if (findFirstVowel (sWord.substring(0,1))!=i)
       return sWord.substring(i) + sWord.substring(0,1) + "ay";
        return null;
    }
}
