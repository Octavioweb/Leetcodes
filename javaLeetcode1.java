class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int m;
        String morseCodes[] = new String[100];
        for (int l=0;l<100;l++) morseCodes[l] = "";
        String morseTemp;
        char arrTemp[];
       
        for (int ind = 0; ind<words.length; ind++){
            arrTemp = words[ind].toCharArray();
            for (m =0; m<arrTemp.length; m++){
                morseTemp = morse[arrTemp[m]-97];
                String stringTemp = morseCodes[ind] + morseTemp;
                morseCodes[ind] = stringTemp;
                
            }
           

        }
        for (int o=0; o<morseCodes.length; o++){
            char strTemp[] = new char[30];
            strTemp = morseCodes[o].toCharArray();
            for (int o2 = 0; o2<strTemp.length; o2++){
                
                System.out.print(strTemp[o2]);

            }
            
            System.out.println(words[o]);
        }
        return 0;
    }
}