	
package src;

class MM

{

        MM()

        {

                System.out.println("MM()");

        }

}

class NN extends MM

{

        NN()

        {

                System.out.println("NN()");

        }

}

class OO extends  NN

{

        public static void main(String[] args) 

        {

                MM m1 = new MM();

                System.out.println("---------");

                NN n1 = new NN();

                System.out.println("---------");

                OO o1 = new OO();

                System.out.println("---------");

        }

}

