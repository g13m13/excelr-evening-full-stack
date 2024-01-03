class A

{

        A(int i)

        {

                System.out.println("A(int)");

        }

}

class TT extends A

{

        TT(int i)

        {
				super(i);
                System.out.println("T(int)");

        }

        public static void main(String[] args) 

        {

                TT t1 = new T(90);

                System.out.println("done");

        }

}

