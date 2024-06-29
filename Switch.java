public class Switch {
    
    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Switch sw = new Switch();
        System.out.println(sw.isVowel('a')); 
        System.out.println(sw.isVowel('b')); 
        System.out.println(sw.isVowel('E')); 
        System.out.println(sw.isVowel('Z')); 
        
    }
}
