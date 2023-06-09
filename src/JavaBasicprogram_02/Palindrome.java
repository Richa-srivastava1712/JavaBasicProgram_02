package JavaBasicprogram_02;
 class Palindrome {

    public static boolean isPanlindrome(String str) {
        int length , i =0, j =0 ,count =0;
        length = str.length();
        //First apprach --using for loop
        for(i =0; i<length/2;i++){
            if(str.charAt(i) != str.charAt(length -1 -i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean panindrome = isPanlindrome("123321");
        if (panindrome == true)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}

