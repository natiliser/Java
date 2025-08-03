
    public static int romanToInt(String str) {
        int sum = 0;
        int prev = 0;
        for (int i = str.length()-1; i >= 0 ; i--) {
            int current = check(str.charAt(i));
            if ( current==1 && prev==10 || current==1 && prev==5 || current==10 &&   prev==50 ||     current==10 && prev==100 || current==100 && prev==500 || current==100 && prev==1000 ) {
                sum-= current;
            }
            else {
                sum += current;
            }
            prev = current;
        }
        return sum;
    }

    public static int check(char ch){
        switch(ch){
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default :
                return 0;
        }
    }

