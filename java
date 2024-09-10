public class App {
    public static void main(String[] args) throws Exception {
       String name = "Hello";
        String decrpyted = "";
        String encrpyted = "";
  
        System.out.println("Original: " + original);

        for (int i = 0; i < original.length(); i++) {
            char result = encrypt(original.charAt(i));
            encrpyted+= result;
        }
        System.out.println("Encrypted: " + encrpyted);

        for (int i = 0; i < encrpyted.length(); i++) {
            char result = decrypt(encrpyted.charAt(i))
            decrpyted+= result;
        }
        System.out.println("Decrypted: " + decrpyted);
    }
    public static char encrypt(char letter){
        try{
            int res = getNumber(letter);
            int number = encModNumber(res);
            char letter01 = getLetter(number);
            return letter01;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return '-';
        }
    }
    public static int encModNumber(int number) throws Exception{
        if (number > 25 || number < 0 ) {
            throw new Exception("The Nummber should be 0 to 25");
        }
        int res = (number + 3 ) % 26;
        return res;
    }
    public static int decModNumber(int number) throws Exception{
        if (number > 25 || number < 0 ) {
            throw new Exception("The number should be 0 to 25");
        }
        int res = (number - 3) % 26;
        return res;
    }
    public static char getLetter(int number) throws Exception{
        int[] numbers = (0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
        char[] letters = ('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
            }
        }
        if (index < 0 ) {
            throw new Exception("Index should be between 0 to 25 ");
        }
        return letters[index];
    }
    public static int getNumber(char letter) throws Exception{
        int[] numbers = (0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
        char[] letters = ('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        int index = -1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                index = i ;
            }
        }
        if (index < 0) {
            throw new Exception("Index should be > 0 ");
        }
}
}