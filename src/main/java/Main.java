public class Main {
    public static void main(String[] args) {

//        HandSet myPhone = new HandSet("08037235301");
//        myPhone.powerOn();
//        myPhone.callPhone("08037235301");
//        myPhone.answer();
        DeskPhone myPhone = new DeskPhone("08037235301");
          myPhone.powerOn();
          myPhone.callPhone("08037235301");
          myPhone.answer();
    }
}
