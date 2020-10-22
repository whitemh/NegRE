import java.util.regex.*;


public class pattern_NegRE {
    private String Pattern_NegRE;
    private String Sequence_NegRE;
    public String getPattern(){
        return this.Pattern_NegRE;
    }
    public String getSequence(){
        return this.Sequence_NegRE;
    }
    pattern_NegRE(String p,String s){
        Pattern_NegRE = p;
        Sequence_NegRE = s;
    }
    public String DelBlank_Pattern(){
        Pattern_NegRE = Pattern_NegRE.replaceAll("\\s*","");
        return Pattern_NegRE;
    }
    public String DelBlank_Sequence(){
        Sequence_NegRE = Sequence_NegRE.replaceAll("\\s*","");
        return Sequence_NegRE;
    }
     public static void main(String[] args){
         pattern_NegRE pattern = new pattern_NegRE("1 2 3 ","1 2 3 ");
         System.out.println(pattern.DelBlank_Pattern());
         System.out.println(pattern.DelBlank_Sequence());
         Pattern p = Pattern.compile("[b-z]*a[ad-z]*c[a-df-z]*e");
         String s = new String("abcbed");
         Matcher matcher = p.matcher(s);
         if (matcher.find())
         {
             System.out.println(matcher.group());
         }



     }
}
