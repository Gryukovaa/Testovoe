package jm;


public class Convert {

    public static final String arabToRome(int number) {
        StringBuilder romeNumber = new StringBuilder("");
        if(number < 0) {
            throw new IllegalArgumentException("Калькулятор не работает с отрицательными числами");
        }
        while(true) {
            while(true) {
                if ((number - 100) >= 0) {
                    romeNumber.append("C");
                    number -= 100;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            while(true) {
                if ((number - 90) >= 0) {
                    romeNumber.append("XC");
                    number -= 90;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            while(true) {
                if ((number - 50) >= 0) {
                    romeNumber.append("L");
                    number -= 50;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            while(true) {
                if ((number - 40) >= 0) {
                    romeNumber.append("XL");
                    number -= 40;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            while(true) {
                if ((number - 10) >= 0) {
                    romeNumber.append("X");
                    number -= 10;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            while(true) {
                if ((number - 9) >= 0) {
                    romeNumber.append("IX");
                    number -= 9;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            while(true) {
                if ((number - 5) >= 0) {
                    romeNumber.append("V");
                    number -= 5;
                    if (number == 0) {
                        break;
                    }
                } else
                {
                    break;
                }
            }
            while(true) {
                if ((number - 4) >= 0) {
                    romeNumber.append("IV");
                    number -= 4;
                    if (number == 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            while(true) {
                if ((number - 1) >= 0) {
                    romeNumber.append("I");
                    number -= 1;
                    if (number == 0) {
                        break;
                    }
                }else {
                    break;
                }
            }
            break;
        }
        return romeNumber.toString();
    }

    public static final int romeToArab(String number) throws ConvertExceptions {
        int x = switch (number) {
            case "I" -> x = 1;
            case "II" -> x = 2;
            case "III" -> x = 3;
            case "IV" -> x = 4;
            case "V" -> x = 5;
            case "VI" -> x = 6;
            case "VII" -> x = 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new ConvertExceptions("Нечитабельные символы");
        };
        return x;
    }


}
// X + X
// XX

// 7 + 5
// 12

// X + 5
// error
















