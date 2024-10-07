class Mayan extends Language{
  public Mayan(String languageName, int numSpeakers){
    super(languageName, numSpeakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo(){
    System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+". The language follows the word order: "+this.wordOrder+" Fun fact: "+this.name+" is an ergative language.");
  }
}
