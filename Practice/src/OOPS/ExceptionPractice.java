package OOPS;

public class ExceptionPractice {
    public static void main(String[] args) {

        int a = 0;
        for(int i=0; i<5; i++){
            System.out.println(i);
            if(i==3){
                throw  new RuntimeException("newsadksadsa");
            }
        }
    }
}

//    interface A {
//        void m1() throws Exception;
//    }
//
//    class BC implements A {
//        public void m1() throws IOException {
//
//        }
//    }