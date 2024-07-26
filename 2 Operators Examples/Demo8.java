// Basic Program on operator

class Demo8{
    public static void main(String args[]){
        int a = 012; // octal number system (0-7)
        System.out.println("a : "+a);

        int b = 0x12; // hexadecimal number system (0-15)
        System.out.println("b : "+b);

        int c = 0xA12; // hexadecimal number system (0-15)
        System.out.println("c : "+c);

    }
}

/*
    012 , here 0 represents octal number system
    1 x 8 ^ 1 + 2 x 8 ^ 0
    1 x 8 + 2 x 1
    8 + 2
    10

    0x12 , here 0x represents hexadecimal number system
    (0-15) 0    1   2   3   4   5   6   7   8   9   10  11  12  13  14  15
                                                    A   B   C   D   E   F
                                                    a   b   c   d   e   f    
    1 x 16 ^ 1 + 2 x 16 ^ 0
    1 x 16 + 2 x 1
    16 + 2
    18

*/