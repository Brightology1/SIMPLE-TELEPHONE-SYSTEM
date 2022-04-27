public class HandSet implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public HandSet(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("This Handset is On");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + " On Handset");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answre your call");
            isRinging = false;
        }else {

        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
         if(phoneNumber == myNumber){
             isRinging = true;
             System.out.println(" Phone is ringing");
         } else{
             System.out.println("Either wrong number entered or phone is off");
             isRinging = false;
         }
         return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
