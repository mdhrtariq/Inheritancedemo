package Inheritance;
class calculator // super
{
    public int add(int i, int j) {
        {
            return i + j;
        }
    }

    static class Advacalculator extends calculator // sub
    {
        public int sub(int i, int j) {
            {
                return i - j;
            }
        }

        static class SuperAdvCalc extends Advacalculator //multi inheritance
        {
            public int multi(int i, int j) {
                {
                    return i * j;
                }
            }

            public class Inheritancedemo {
                public static void main(String[] args) {
                    SuperAdvCalc c1 = new SuperAdvCalc();
                    int result = c1.add(4, 3);
                    int result1 = c1.sub(6, 3);
                    int result2 = c1.multi(5, 9);
                    System.out.println(result1);
                    System.out.println(result);
                    System.out.println(result2);

                }
            }
        }
    }
}
