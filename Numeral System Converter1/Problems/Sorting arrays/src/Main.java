class testFirst{

    String age(){
        return "32";
    }
}

class TestSecond extends  testFirst{

    testFirst first = new testFirst();

    public void test3(){
        first.age();
    }

}

class mains{
    public static void main(String[] args) {

        TestSecond sec = new TestSecond();
        sec.age();

    }
}