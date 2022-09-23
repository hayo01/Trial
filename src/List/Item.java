package List;


public class Item {
    String data;
    Item preLink; //이전 Item을 가르키는 변수
    Item nextLink;   //다음 Item을 가르키는 변수

    public Item(String data){

        this.data = data;
        this.preLink = null;
        this.nextLink = null;
    }

    public Item(){

        this.data = null;
        this.preLink = null;
        this.nextLink = null;
    }

}
