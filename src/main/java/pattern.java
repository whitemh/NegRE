public class pattern {
    private String Pattern;
    private String Sequence;
    public String getPattern(){
        return this.Pattern;
    }
    public String getSequence(){
        return this.Sequence;
    }
    pattern(String p,String s){
        Pattern = p;
        Sequence = s;
    }
    public String DelBlank_Pattern(){
        Pattern.replaceAll("\\s*","");
        return Pattern;
    }
    public String DelBlank_Sequence(){
        Sequence.replaceAll("\\s*","");
        return Sequence;
    }
     public static void main(String[] args){
         pattern pattern = new pattern("1 2 3 ","1 2 3 ");
        System.out.println(pattern.DelBlank_Pattern());
     }
}
