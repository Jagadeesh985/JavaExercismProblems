import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

class RnaTranscription {


    String transcribe(String dnaStrand) {
        if(Objects.equals(dnaStrand, "")){
            return "";
        }
        Map<Character, Character> transcriptionMap = new HashMap<>();
        transcriptionMap.put('G', 'C');
        transcriptionMap.put('C', 'G');
        transcriptionMap.put('T', 'A');
        transcriptionMap.put('A', 'U');
       StringBuilder rnaStrand = new StringBuilder();
        for(char nucleotide: dnaStrand.toCharArray()){
            rnaStrand.append(transcriptionMap.get(nucleotide));
        }
        return rnaStrand.toString();
    }


}
