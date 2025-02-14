public class LengthOfLastWord {
    public static void main(String[] args) {
            {
                int count=0;
                String s="Hello World";
                int i=s.length()-1;
                while(i>=0&&s.charAt(i)!=' ')
                {
                    count++;
                    i--;
                }
                System.out.println(" The Length of Last Word:"  + count);
            }
            
        }
    }

        