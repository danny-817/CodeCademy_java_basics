public class Droid{

  String name;
  int batteryLevel;

  public Droid(String droidName){
    name=droidName;
    batteryLevel=100;
  }
  
class RepairBot extends Droid{

  public RepairBot(String droidName){
    super(droidName);
  }

  public String toString(){
    return "Hello, I'm the repair bot: "+name;
  }

  public void recharge(Droid targetDroid){
    int missingBattery = 100-targetDroid.batteryLevel;
    targetDroid.batteryLevel+=missingBattery;
    batteryLevel-=missingBattery/2;
    System.out.println("Recharging....");
    System.out.println(targetDroid.name +" is back up to "+ targetDroid.batteryLevel+"%");
    System.out.println(name+" is down to "+batteryLevel+"%");
  }
}


  public String toString(){
    return "Hello, I'm the droid: "+name;
  }

  public void performTask(String task){
    System.out.println(name+" is performing task: "+ task);
    if(task=="power up"){
      return;
    }else{
    batteryLevel-=10;
    }
  }

  public void energyReport(){
    System.out.println("Battery levels are currently at "+batteryLevel+"%");
  }


  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    RepairBot jim = codey.new RepairBot("Jim");
    System.out.println(codey);
    codey.energyReport();
    codey.performTask("mop the floor");
    codey.performTask("brushing cats");
    codey.performTask("sorting recycling");
    jim.performTask("power up");
    codey.energyReport();
    jim.recharge(codey);


    
  }





}
