 class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){

    this.name=name;
    this.numSpeakers=numSpeakers;
    this.regionsSpoken=regionsSpoken;
    this.wordOrder=wordOrder;
  }

  public void getInfo(){
    System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+". The language follows the word order: "+this.wordOrder+".");
  }


  public static void main(String[] args){
    Language japanese = new Language("Japanese", 100000000, "Japan", "Subject-Object-Verb");
    japanese.getInfo();

    Mayan kichi = new Mayan("kichi",50000);
    kichi.getInfo();

    SinoTibetan chinese = new SinoTibetan("Chinese", 888888888);
    SinoTibetan thai = new SinoTibetan("Thai", 77777);
    chinese.getInfo();
    thai.getInfo();
  }
}
